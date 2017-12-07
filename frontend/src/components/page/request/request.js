import React, {Component} from 'react';
import './request.css'

class RequestPage extends Component {

    constructor(props) {
        super(props);
        this.state = {text: ''};

        this.onFormSubmit = this.onFormSubmit.bind(this);
    }

    onFormSubmit(event) {
        event.preventDefault();

        // todo
    }

    render() {
        return (
            <div>
                <div className="request-type">Request type: TYPE</div>
                {/* todo : request type */}
                <div>
                    Language: (try to figure out before it is shown)
                </div>
                <div>
                    <form onSubmit={this.onFormSubmit}>
                        <input type="text" value={this.state.text}/>
                        <button type="submit">Submit</button>
                    </form>
                </div>
            </div>
        );

    }
}

export default RequestPage;