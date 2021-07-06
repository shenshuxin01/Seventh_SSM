# 此仓库代码分为两部分，两个分支
* 分支qianduan：前端vue3源码
* 分支houduan：后端java ssm代码

---
其他：
发布部署到生产环境步骤：
  前后端分离项目以为端口号、ip、传输协议不一样等等原因，调用接口跨域请求
  
0. 前端项目dist目录发布在nginx里面
1. 前端调用后端接口的url以`/helloworld`开头，后面拼接接口地址
2. 在nginx配置文件中新增配置
   ```
    location ~*^/helloworld {
        rewrite (/SSM.*) http://www.aa.com/bbs/$1;
    }
   ```
3. 完成
