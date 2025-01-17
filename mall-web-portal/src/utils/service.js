import axios from 'axios'

axios.defaults.headers['Content-Type'] = 'application/json;charset=utf-8'
axios.defaults.headers['token']=localStorage.getItem('token')
const service = axios.create({
    // axios中请求配置有baseURL选项，表示请求URL公共部分
    baseURL: 'http://localhost:8080/',
    // 超时
    timeout: 10000
})
export default  service