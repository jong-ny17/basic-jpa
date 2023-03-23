import axios from 'axios'

export default axios.create({
  // baseURL: 'http://aop-env.eba-fw8bfvmu.ap-northeast-2.elasticbeanstalk.com', // 배포 시
  // baseURL: 'https://aop.accurasoft.co.kr', // 배포 시
  baseURL: 'http://localhost:5886', // 개발 시
  headers: {
    'Content-Type': 'application/json;charset=UTF-8',
    'Access-Control-Allow-Origin': '*',
  },
});