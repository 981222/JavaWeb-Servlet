<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/4
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Integer count = (Integer) application.getAttribute("count");
        if (null == count){
            count = 1;
            application.setAttribute("count",count);
        } else {
            application.setAttribute("count",++count);
        }
    %>
    您是当前的第<%=count%>位访客。
</body>
</html>
