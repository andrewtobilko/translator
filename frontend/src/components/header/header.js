import React, {Component} from 'react';
import './header.css'
import {Link} from "react-router-dom";

class Header extends Component {
    render() {
        return (
            <div className="header">
                <div>LOGO</div>
                <nav>
                    <Link to="/">Home</Link>
                    <Link to="/account">Account</Link>
                    <Link to={{pathname: "/request", state: {type: "translate"}}}>Translate</Link>
                    <Link to={{pathname: "/request", state: {type: "improve"}}}>Improve</Link>
                </nav>
            </div>
        );
    }
}

export default Header;