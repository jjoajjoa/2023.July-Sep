import React from "react";

class Lotto extends React.Component {

    constructor(props) {
        super(props);
        this.state = { number1: 0, number2: 0 };
        this.randNum1 = this.randNum1.bind(this);
        this.randNum2 = this.randNum2.bind(this);
    }

    randNum1() {        
        this.setState({number1: Math.floor(Math.random()*45+1)});   
    }
    
    randNum2() {
        this.setState({number2: Math.floor(Math.random()*45+1)});    
    }

    render() {
        return (
            <div>
                <h2> [로또 번호 자동 뽑기] </h2>
                <button onClick={this.randNum1}>
                    {this.state.number1}
                </button>
                <button onClick={this.randNum2}>
                    {this.state.number2}
                </button>

                <h2> [로또 번호 수동 뽑기] </h2>
                
            </div>
        )

    }

}

export default Lotto;