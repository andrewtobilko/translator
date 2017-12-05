import React from 'react'
import {Route, Switch} from 'react-router-dom'
import HomePage from "./home/home";
import RequestPage from "./request/request";
import AccountComponent from "./account/account";

const Page = () => (
    <main>
        <Switch>
            <Route exact path='/' component={HomePage}/>
            <Route path="/account" component={AccountComponent}/>
            <Route path='/requests' component={RequestPage}/>
        </Switch>
    </main>
);

export default Page;