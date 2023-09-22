import { createApp } from 'vue'
import { createPinia } from 'pinia'
import  '/assets/css/bootstrap.min.css'
import  '/assets/css/main.css'
import  '/assets/js/jquery.min.js'
import  '/assets/js/bootstrap.min.js'
import App from './App.vue'
import router from './router'
const app = createApp(App)

app.use(createPinia())

app.use(router)
app.mount('#app')
