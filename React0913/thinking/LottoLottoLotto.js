import React from "react";

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

const LottoLottoLotto = () => {
    const items = [
        {id:1, text:Math.floor(Math.random()*45+1)},
        {id:2, text:Math.floor(Math.random()*45+1)},
        {id:3, text:Math.floor(Math.random()*45+1)},
        {id:4, text:Math.floor(Math.random()*45+1)},
        {id:5, text:Math.floor(Math.random()*45+1)},
        {id:6, text:Math.floor(Math.random()*45+1)}
    ];
    return (
        <>
            <h2> [로또 자동] </h2>
            <ListSet data={items} />
        </>
    )
}

export default LottoLottoLotto;