import React from 'react'
import {Provider} from 'react-redux'
import ReactDOM from 'react-dom'
import {BrowserRouter} from "react-router-dom";
import Application from "./components/application";
import ReduxPromise from 'redux-promise'
import {applyMiddleware, createStore} from "redux";
import reducers from './reducers';

const createStoreWithMiddleware = applyMiddleware(ReduxPromise)(createStore)

ReactDOM.render(
    <Provider store={createStoreWithMiddleware(reducers)}>
        <BrowserRouter>
            <Application/>
        </BrowserRouter>
    </Provider>
    , document.getElementById('root'));