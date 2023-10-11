import React, {useState} from "react";


const ListItem = ({id, text}) => {
    return <li key={id}> {text} </li>
};

const ListSet = ({data}) => {
    return (
        <ul>
            {data.map((item) => (
                <ListItem key={item.id} id={item.id} text={item.text} />
            ))}
        </ul>
    );
};

const List = () => {

    const [items, setItem]  = useState([
        {id:1, text:'hi'}, 
        {id:2, text:'bye'}
    ]);
    
    const [input, inputValue] = useState('');

    const handleChange = (event) => {
        inputValue(event.target.value);
    };
    const handleAdd = () => {
        const newItem = {id: items.length+1, text:input};
        setItem([...items, newItem]);
        inputValue("");
    };

    return (
        <div>
            <h2>[리스트]</h2>
            <input type="text" value={input} onChange={handleChange}/>
            <button onClick={handleAdd}> add! </button>
            <ListSet data={items} />
        </div>
    )
}


export default List;