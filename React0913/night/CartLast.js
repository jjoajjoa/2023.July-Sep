import React, {useState} from "react";

function CartLast() {
    const [cart, setCart] = useState([]);
    const [input, inputValue] = useState('');

    const addCart = () => {
         setCart([...cart,{text : input, completed : false}]);
         inputValue('');
    };

    const checkCart = (index) => {
        const checkList = [...cart];
        checkList[index].completed = !checkList[index].completed;
        setCart(checkList);
    };

    const deleteCart = () => {
        const newCart = cart.filter((cart) => !cart.completed);
        setCart(newCart);
    };

    return (
        <>
        <h2> [장바구니 ver.2] </h2>
            <input type="text" value={input} onChange={(e) => inputValue(e.target.value)}/>
            <button onClick={addCart}> 추가 </button>
            <ul style={{listStyle: 'none'}}>
                {cart.map((item, index)=>(
                    <li key = {index}>
                        <label style={{textDecoration: item.completed ? 'line-through' : 'none'}}>
                            <input type="checkbox" checked={item.completed} onChange={() => checkCart(index)}/>
                            {item.text}
                        </label>
                    </li>
                ))}
            </ul>
            <button onClick={deleteCart}> delete! </button>
        </>
    )
};

export default CartLast;