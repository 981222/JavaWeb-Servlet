<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/3
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="/login" method="post">
        用户：<input type="text" name="username">
        密码：<input type="text" name="password">
        <input type="submit" value="登陆">
        <button><a href="login.jsp">重置</a></button>
    </form>
</body>
</html>
