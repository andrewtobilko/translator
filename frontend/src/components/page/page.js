import React from 'react'
import {Route, Switch} from 'react-router-dom'
import HomePage from "./home/home";
import RequestPage from "./request/request";

const Page = () => (
    <main>
        <Switch>
            <Route exact path='/' component={HomePage}/>
            <Route path='/request' component={RequestPage}/>
        </Switch>
    </main>
);

export default Page;