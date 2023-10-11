import React, {useState} from 'react';

export function Ccycle() {
    //count:현재값  setCount:업데이트
    const [count, setCount] = useState(0);

    return (
        <div>
            <p> {count} 번 클릭했어용 </p>
            <button onClick={() => setCount(count + 1)}>
                Click!
            </button>
        </div>
    );
}
