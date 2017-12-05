import {combineReducers} from 'redux';
import {reducer as formReducer} from 'redux-form'

const rootReducer = combineReducers({
    form: formReducer,
    testReducer: testReducer
});

function testReducer(data) {
    if (!data) {
        return {
            state: "initialState"
        };
    }
    console.log('my reducer data ', data);

    return data;
}

export default rootReducer;