<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/4
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>成绩</th>
            <th>操作</th>
            <th><a href="/addUser.jsp">添加</a></th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.score}</td>
                <td><a href="/user?method=delete&id=${user.id}">删除</a></td>
                <td><a href="/user?method=update&id=${user.id}&name=${user.name}&age=${user.age}&score=${user.score}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
