import React from 'react';
import {Outlet} from 'react-router-dom';

function Chat() {
    return (
        <div>
            <h2>Chat</h2>
            <Outlet />
        </div>
    )
}

export default Chat;