import React, {useState} from "react";

const ListItem = ({id, text, input}) => {
    return (
        <p>
            <li key={id}> 
                <input type="checkbox" value={input} /> {text}
            </li> 
        </p>
    )
};

const ListSet = ({data}) => {
    return (
        <ul style={{listStyle:'none'}}>
            {data.map((item) => (
                <ListItem key={item.id} id={item.id} text={item.text}  />
                ))}
            
        </ul>
    );
};

const Cart = () => {

    const [items, setItem] = useState([]);
    const [input, inputValue] = useState('');

    const handleChange = (event) => {
        inputValue(event.target.value);
    };

    const handleAdd = () => {
        const newItem = {id: items.length+1, text: input};
        setItem([...items, {text: input, completed: false}]);
        inputValue('');
    };

    return (
        <>
            <h2> [장바구니] </h2>
            <input type="text" value={input} onChange={handleChange} />
            <button onClick={handleAdd}> add! </button>
            <ListSet data ={items} />
        </>
    )
}

export default Cart; 