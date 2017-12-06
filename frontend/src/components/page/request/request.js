import React, {Component} from 'react';
import './request.css'
import {bindActionCreators} from 'redux'
import {fetchRequests} from "../../../actions";
import {connect} from "react-redux";

class RequestPage extends Component {

    constructor(props) {
        super(props);
        this.state = {text: ''};

        this.onFormSubmit = this.onFormSubmit.bind(this);
    }

    onFormSubmit(event) {
        event.preventDefault();

        this.props.fetchRequests();
        // todo : move fetchRequests to the home page
    }

    render() {
        return (
            <div>
                <div className="request-type">Request type: {this.props.match.params.type}</div>
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

function mapDispatchToProps(dispatch) {
    return bindActionCreators({fetchRequests}, dispatch);
}

export default connect(null, mapDispatchToProps)(RequestPage)