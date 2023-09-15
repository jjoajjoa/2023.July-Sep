import React from "react";
import myStyle from "./Button.module.css";

const Button = () => {
    return (
        <button className={myStyle.button}> Click! </button>
    );
}

export default Button;