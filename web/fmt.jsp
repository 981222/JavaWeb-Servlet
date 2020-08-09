<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/4
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date date = new Date();
        request.setAttribute("date",date);
    %>
    <fmt:formatDate value="${date}" pattern="yyyy-MM-dd hh:mm:ss sss"></fmt:formatDate>
    <fmt:formatNumber value="981.222" maxIntegerDigits="2" maxFractionDigits="3"></fmt:formatNumber>
</body>
</html>
