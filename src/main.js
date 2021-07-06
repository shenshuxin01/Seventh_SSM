import Vue from 'vue'
import App from './App.vue'
import Routes from './router/index'
import global_ from './components/Global'//引用文件

Vue.config.productionTip = false
Vue.prototype.GLOBAL = global_//挂载到Vue实例上面



new Vue({
  render: h => h(App),
  router: Routes
}).$mount('#app')
