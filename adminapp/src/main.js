import axios from "axios";
import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'
import routes from './router'
import store from './store'

axios.defaults.baseURL = "http://localhost:8081";
Vue.use(VueRouter)

const router = new VueRouter({
    mode: 'history',
    routes,
    store,
});

Vue.prototype.$axios = axios;

new Vue({
    router,
    store,
    render: (h) => h(App),
}).$mount('#app');