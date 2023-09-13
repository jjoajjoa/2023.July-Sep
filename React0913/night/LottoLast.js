import React, { useState } from "react";

const LottoLast = () => {
    const [mode,setMode] = useState("self");
    const [numbers, setNumbers] = useState([]); 
    const [isDuplicate, setIsDuplicate] = useState(false); //중복검사를 위한
    
    //수동
    const handleChange = (event, index) => {
        const newNumbers = [...numbers];
        const inputValue = Number(event.target.value);

        if (inputValue >= 1 && inputValue <= 45) {
            newNumbers[index] = inputValue;
            setNumbers(newNumbers);
        } else {
            alert("1부터 45 사이 숫자 넣어주세용")
        }
    };

    const handleSubmitLotto = () => { //중복 빈값 검사 // set: 같은 값 저장할 수 없음
        if (numbers.length === new Set(numbers).size) { //중복안되는
            setIsDuplicate(false);
            const sortedNumbers = numbers.sort((a,b) => a-b);
            if (sortedNumbers.some(numbers => !numbers)) { 
                //썸: 배열안에있는일부분이 괄호속에있는걸만족하는지안하는지 확인해줌
                //화살표함수 안에 느낌표 뒤집개
                //어떤값이 0 또는 false인지 확인해주는거
                // ![0,1,2,3,4] <- false // ![T,F,T,null,undef] <- ture
                // 숫자가 하나라도 들어있으면 false
                alert("숫자를 모두 입력해주세용")
            } else {
                alert("수동뽑기: " + sortedNumbers.join(", "));
            }
        } else { //중복되어버린
            setIsDuplicate(true);
            alert("중복된 숫자가 있어버리네용")
        }
    };

    //자동
    const createRandomNumber = () => {
        const randomNumber = [];

        while(randomNumber.length <6) {
            const number = Math.floor(Math.random()*45)+1;
            if(!randomNumber.includes(number)) {
                randomNumber.push(number); //데이터가 명확하게 해당 부분에서만 사용됨 (... 쓰기를 권장)
            }
        }
        const sortedNumbers = randomNumber.sort((a,b) => a-b);
        setNumbers(sortedNumbers);
    };

    //라디오버튼 온체인지함수
    const handleModeChange = (event) => {
        setMode(event.target.value);
        setNumbers([]);
        setIsDuplicate(false);
    };

    return (
        <>
        <div>
            <h2> [로또!] </h2>
            <label><input type="radio" value="self" onChange={handleModeChange} checked={mode === "self"}/> 수동 </label>
            <label><input type="radio" value="auto" onChange={handleModeChange} checked={mode === "auto"}/> 자동 </label>
        </div>
        <div>
            { mode === "self" && (
                <>
                <p> [수동] 숫자 입력하숑: </p> 
                {[0,1,2,3,4,5].map((index) => (
                    <input key={index} type="number" min="1" max="45" value={numbers[index] || ""}
                    onChange={(event) => handleChange(event, index)}></input>
                ))}
                <button onClick={handleSubmitLotto}> 제출! </button>

                {isDuplicate && (
                    <p> 중복된 숫자가 있어용 </p>
                )}
                </>
            )}
            { mode === "auto" && (
                <>
                <p> [자동생성] </p> 
                <button onClick={createRandomNumber}> Click! </button>
                {numbers.length > 0 && (
                    <>
                        <p> 뽑힌 숫자: </p>
                        {numbers.map((number) => (
                            <span key={number}> {number} </span>
                        ))}
                    </>
                )}
                </>
            )}
        </div>
        </>
    )

};

export default LottoLast;