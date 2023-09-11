import React from "react";

class Decrease extends React.Component {

    constructor(props) {
        super(props);
        this.state = { count : 0 };
    }
    
    render() {
        
        return (
            <div>
                <h2> [엥?] </h2>
                <p> {this.state.count} 번 클릭했어용 </p>
                <button onClick={() => this.setState({count : this.state.count +1})}>
                    add!
                </button>
                <button onClick={() => this.setState({count : this.state.count -1})}>
                    delete!
                </button>
            </div>
        )

    }
}

export default Decrease;