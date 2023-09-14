import React from 'react';
import { useState, useEffect } from 'react'; 
import { useLocation, Link } from 'react-router-dom';

function ProductList({data}) {
    
    const location = useLocation();
    const queryParams = new URLSearchParams(location.search);
    const searchQuery = queryParams.get('name');
    const [searchLst, setSearchList] = useState([]);
    
    useEffect(() => {
        if(searchQuery) {
            const filtered = data.filter((product) => product.name.includes(searchQuery));
            
            setSearchList(filtered);
        } else { //상품이 없는 경우
            setSearchList(data);
        }
    }, [data, searchQuery])

    return (
        <>
        <h2> [Product List] </h2>
            <ul>
                {searchLst.map((product) => (
                    <li key={product.id}>
                        <Link to={`/product/${product.id}`}> 상품명: {product.name} </Link>
                        <p> 가격: {product.price} </p>
                    </li>
                ))}
            </ul>
        </>
    );
}

export default ProductList;