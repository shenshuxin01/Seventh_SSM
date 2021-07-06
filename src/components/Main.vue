<template>
<div id="main_id">
  <p>这是主页面</p>
  <hr>
  <p>开始调用后端接口：执行post请求，向数据库添加一条记录</p>
    输入数据：<input v-model="pg_input" placeholder="必填项" required /><br>
    <button @click="fun_3">开始调用</button>
  <br>
  <h1 id="sohowid2">{{pg_input}}</h1>
  <h1 id="sohowid">{{p_2}}</h1>
  <hr>
  <hr>
</div>
</template>

<script>
  import axios from "axios";
  export default {
  name: "Main",
  data(){
    return{
      pg_input:'',
      p_1: this.$route.query.id1,
      p_2:''
    }
  },

  methods: {
    fun_3() {
      axios.post(
          '/Seventh_SSM-2.0-RELEASE/jj/addname.do',
          {name:this.pg_input}
      )/*.then(function (response) {
        if (response.status == 200 && response.data.isok == "true"){
          this.p_2 = "操作成功";
          alert("操作成功")
        }else {
          this.p_2 = "操作失败"
          alert(this.p_2)

        }
      })*/
      .then((response) => {
        if (response.status == 200 && response.data.isok){
          this.p_2 = "操作成功";
        }else {
          this.p_2 = "操作失败"
        }
      })
    }
  }
}

</script>

<style scoped>
  #sohowid2 {color: red}
  #sohowid {color: red}
</style>
