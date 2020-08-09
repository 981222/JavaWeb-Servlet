<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/4
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("info","huangs,ongr,en");
    %>
    ${fun:contains(info, "huang")}
    <br/>
    ${fun:startsWith(info, "hu")}
    <br/>
    ${fun:endsWith(info, ",en")}
    <br/>
    ${fun:indexOf(info, "123")}
    <br/>
    ${fun:replace(info, "s", "song")}
    <br/>
    ${fun:substring(info, 2, 3)}
    <br/>
    ${fun:split(info, ",")[1]}-${fun:split(info, ",")[2]}
</body>
</html>
