import React, { useState } from "react";

const [number, setNumber]  = useState([
    {id:1, text: Math.floor(Math.random()*45+1)}, 
    {id:2, text: Math.floor(Math.random()*45+1)},
    {id:3, text: Math.floor(Math.random()*45+1)},
    {id:4, text: Math.floor(Math.random()*45+1)},
    {id:5, text: Math.floor(Math.random()*45+1)},
    {id:6, text: Math.floor(Math.random()*45+1)}
]);

class LottoLotto extends React.Component {

    constructor(props) {
        super(props);
        this.state = { number1: 0, number2: 0, number3: 0, number4: 0, number5: 0, number6: 0};
        this.randNum = this.randNum.bind(this);
        this.state = { value: '' };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    randNum() {        
        this.setState({number1: Math.floor(Math.random()*45+1)});   
        this.setState({number2: Math.floor(Math.random()*45+1)});
        this.setState({number3: Math.floor(Math.random()*45+1)});
        this.setState({number4: Math.floor(Math.random()*45+1)});
        this.setState({number5: Math.floor(Math.random()*45+1)});
        this.setState({number6: Math.floor(Math.random()*45+1)});    
    }
    
    sortNum() {
        Math.sort(this.randNum());    
    }

    handleChange(event) {
        this.setState({value: event.target.value});
    }

    handleSubmit(event) {
        if (this.state.value) {
            alert('이미 적은 숫자임')
        } else {

        }
    }

    render() {
        return (
            <div>
                <h2> [로또 번호 자동 뽑기] </h2>
                <button onClick={this.randNum}> Click! </button>
                <table>
                    <tread>
                        <tr>
                            <th>{this.state.number1}</th>
                            <th>{this.state.number2}</th>
                            <th>{this.state.number3}</th>
                            <th>{this.state.number4}</th>
                            <th>{this.state.number5}</th>
                            <th>{this.state.number6}</th>
                        </tr>
                    </tread>
                </table> 


                <h2> [로또 번호 수동 뽑기] </h2>
                    <form onSubmit={this.handleSubmit}>
                        <label> 번호쓰기 : 
                            <input type="text" value={this.state.value} onChange={this.handleChange} />
                        </label>
                        <input type="submit" value="submit" />
                    </form>
                    <table>
                        <tread>
                            <tr>
                                <th>{this.state.value}</th>
                                <th>{this.state.value}</th>
                                <th>{this.state.value}</th>
                                <th>{this.state.value}</th>
                                <th>{this.state.value}</th>
                                <th>{this.state.value}</th>
                            </tr>
                        </tread>
                    </table>
            </div>
        )

    }

}

export default LottoLotto;