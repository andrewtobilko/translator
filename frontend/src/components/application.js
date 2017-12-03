import React, {Component} from 'react';
import Header from './header/header';
import Footer from "./footer/footer";
import Page from "./page/page";

class Application extends Component {
    render() {
        return (
            <div className="application">
                <Header/>
                <Page/>
                <Footer/>
            </div>
        );
    }
}

export default Application;
