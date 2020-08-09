<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/3
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            out.write(cookie.getMaxAge());
            out.write(cookie.getName());
            out.write(cookie.getValue());
            out.write(cookie.getVersion());
            out.write("<br/>");
        }
    %>

</body>
</html>
