import React, {Component} from 'react';
import {connect} from "react-redux";
import {fetchRequests} from "../../../actions";
import {bindActionCreators} from "redux";

class HomePage extends Component {

    constructor(props) {
        super(props);

        this.props.fetchRequests();
        // todo : handle a response and draw it out
    }

    render() {
        return (
            <div>
                Recent requests:
            </div>
        );
    }
}

function mapDispatchToProps(dispatch) {
    return bindActionCreators({fetchRequests}, dispatch);
}

export default connect(null, mapDispatchToProps)(HomePage)