import React from 'react';
import {Outlet} from 'react-router-dom';

function Video() {
    return (
        <div>
            <h2>Video</h2>
            <Outlet />
        </div>
    )
}

export default Video;