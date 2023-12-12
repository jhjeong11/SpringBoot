// src/router/index.js
import PageHome from "../views/PageHome.vue";
import DetailView from "../views/DetailView.vue";
import PageExternalData from "@/views/PageExternalData.vue";
import ListView from "@/views/ListView.vue";
import PageDetailExternalData from "@/views/PageDetailExternalData.vue";

const routes = [
    {
        path: '/',
        name: 'PageHome',
        component: PageHome
    },
    {
        path: '/list',
        name: 'ListView',
        component: ListView
    },
    {
        path: '/detail/:id',
        name: 'DetailView',
        component: DetailView
    },
    {
        path: '/api/external-data',
        name: 'PageExternalData',
        component: PageExternalData
    },
    {
        path: '/api/external-data/:id',
        name: 'PageDetailExternalData',
        component: PageDetailExternalData
    }

];

export default routes;