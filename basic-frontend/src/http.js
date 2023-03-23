import axios from 'axios'

export default axios.create({
  // baseURL: 'https://', // 배포 시
  baseURL: 'http://localhost:5886', // 개발 시
  headers: {
    'Content-Type': 'application/json;charset=UTF-8',
    'Access-Control-Allow-Origin': '*',
  },
});