import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";

function ChampDetail() {
    const {id} = useParams();
    const [champion, setChampion] = useState(null);

    useEffect(() => {
        fetch(`https://ddragon.leagueoflegends.com/cdn/13.18.1/data/ko_KR/champion/${id}.json`)
        .then(response => response.json())
        .then(data => setChampion(data.data[id]));
    }, [id]);

    if(!champion) {
        return <div> Loading... </div>
    }

    return (
        <>
            <h1> {champion.name} </h1>
            <h2> {champion.title} </h2>
            <p> {champion.blurb} </p>
        </>
    )

}

export default ChampDetail;