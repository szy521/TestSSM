<%--
  Created by IntelliJ IDEA.
  User: 常帅
  Date: 2018/10/27
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        var json = {};
        json.pname="张三";
        json.pid="2";
        $(function(){
            $(".we").click(function(){
                $.ajax({
                    url : "test/setall",
                    data : JSON.stringify(json),
                    contentType : "application/json",
                    type : "post",
                    success:function (res) {
                        alert(res);
                    }
                });
            });

            $(".bu").click(function () {
                $.getJSON("test/getall",function (result) {
                    for (var i in result){
                        alert(result[i].pname)
                    }
                })
            })
        });
    </script>
</head>

<body>
<button class="we">点击</button>
<button class="bu">点击显示json</button>
</body>
</html>
