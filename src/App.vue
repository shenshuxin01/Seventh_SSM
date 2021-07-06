<template>
  <div id="onload_id">
<!--    <router-link v-show="true" class="one" :to="{path:'/login' ,query:{id1:0}}">点我进入登录页面</router-link><br>-->
<!--    <router-link v-show="true" class="one" :to="{path:'/main' ,query:{id1:0}}">点我进入主页面</router-link>-->
   当前登录的用户：{{ my_1 }}
    <hr>
    <router-view/>
   </div>
</template>

<script>

export default {
  name: 'App',
  data(){
    return{
      my_1:'',
      my_2:1
    }
  },
  watch: {
    // 如果路由有变化，会再次执行该方法
    '$route': 'fun_1'
  },
  methods:{
    fun_1(){
      this.my_1 = this.GLOBAL.userName;
      // alert(this.GLOBAL.token)
      if (!this.GLOBAL.hasEnter){
        //跳转登录页面
        this.$router.push({
          path:'/login' ,query:{id1:0}
        })
      }else {
        //跳转主页面
        this.$router.push({
          path:'/main' ,query:{id1:0}
        });
       }
    }
  },
  created() {
    this.fun_1();
  }
}

</script>
