<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/31
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>JavaWeb</title>
  </head>
  <body>
  <h1>这是我第一个javaWeb应用</h1>
  <%!
    public String doSome(){
      return "Hello Wrold!";
    }
  %>
  <%
    String str = doSome();
  %>
  <%=str%>
<%--  <%
    String id = request.getParameter("id");
    Integer num = Integer.parseInt(id);
    num++;
    request.setAttribute("id",num);
    request.getRequestDispatcher("huang.jsp").forward(request,response);
  %>
  <%=id%>--%>
  <c:catch var="error">
    <%
      int num = 10/0;
    %>
  </c:catch>
  ${error}

  <hr/>
  <c:set var="num1" value="10"></c:set>
  <c:set var="num2" value="20"></c:set>
  <c:if test="${num1 > num2}">ok</c:if>
  <c:if test="${num1 < num2}">not ok</c:if>
  <hr/>
  <c:choose>
    <c:when test="${num1 > num2}">ok</c:when>
    <c:otherwise>not ok</c:otherwise>
  </c:choose>
  <hr/>
  <%
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    list.add("h");
    list.add("i");
    list.add("j");
    list.add("k");
    request.setAttribute("list",list);
  %>
  <c:forEach items="${list}" var="item" begin="2" end="10" step="2" varStatus="indexs">
    <h1>${indexs.count} --> ${item}</h1>
  </c:forEach>
  </body>
</html>
