import React, {Component} from 'react';
import './header.css'

class Header extends Component {
    render() {
        return (
            <div className="header">
                <div>LOGO</div>
                <nav>
                    <a href="/">Home</a>
                    <a href="/request/translate">Translate</a>
                    <a href="/request/improve">Improve</a>
                </nav>
            </div>
        );
    }
}

export default Header;