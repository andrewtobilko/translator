import axios from 'axios';

export const FETCH_REQUESTS = 'FETCH_REQUESTS';
export const BASE_URL = 'localhost:5000/api/';

export const REQUESTS_URL = 'requests';

export function fetchRequests() {
    const url = `${BASE_URL}\\${REQUESTS_URL}`;
    const request = axios.get(url);

    return {
        type: FETCH_REQUESTS,
        payload: request
    }
}