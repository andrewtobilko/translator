import React, {Component} from 'react';
import './application.css';

class Application extends Component {
    render() {
        return (
            <div className="application">
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
            </div>
        );
    }
}

export default Application;
