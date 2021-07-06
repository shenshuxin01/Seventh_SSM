<template>
<div id="login_id">
  <p>这是登录页面</p>
  <hr>
  <PrintName></PrintName>
  <button @click="fun_2">提交</button>
</div>
</template>

<script>
import PrintName from "@/components/PrintName";

export default {
  name: "Login",
  components:{ PrintName },
  data(){
    return {
      p_1: this.$route.query.id1
    }
  },
  methods:{
    fun_1(){
      if (this.p_1 == 0){
        let value = document.getElementById("id_input_name").value;
        this.GLOBAL.userName = value;
        this.GLOBAL.hasEnter = true;
      }
    },
    fun_2(){
      this.fun_1();
      this.$router.push({
        path:'/'
      })
    }
  },
  created() {
    // this.fun_1();
  }
}
</script>

<style scoped>

</style>
