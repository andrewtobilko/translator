import React, {Component} from 'react';
import Header from './header/header';
import Footer from "./footer/footer";

class Application extends Component {
    render() {
        return (
            <div className="application">
                <Header/>
                <div>Request type: translation or improvement</div>
                <div>
                    Language: (try to figure out before it is shown)
                </div>
                <div>
                    Request:
                    <input type="text"/>
                </div>
                <div>
                    <button>Submit</button>
                </div>
                <Footer/>
            </div>
        );
    }
}

export default Application;
