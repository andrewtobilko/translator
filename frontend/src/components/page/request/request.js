import React, {Component} from 'react';
import './request.css'

class RequestPage extends Component {

    constructor(props) {
        super(props);
        this.state = {type: 'improve'}
    }

    render() {
        return (
            <div>
                <div className="request-type">Request type: {this.props.match.params.type}</div>
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

export default RequestPage;