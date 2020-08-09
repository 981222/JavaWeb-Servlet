<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/31
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>???</title>
</head>
<body>
    <%
        List<String> names = new ArrayList<>();
        names.add("黄松仁");
        names.add("曾林芳");
        names.add("黄俊鹏");

        List<Integer> ages = new ArrayList<>();
        ages.add(21);
        ages.add(23);
        ages.add(16);
    %>
    <table>
        <tr>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        <%
            for (int i = 0; i < names.size(); i++) {
        %>
            <tr>
                <td>
                   <%=names.get(i)%>
                </td>
                <td>
                    <%=ages.get(i)%>
                </td>
            </tr>
        <%
            }
        %>
    </table>
    <%
        Integer id = (Integer)request.getAttribute("id");
    %>
    <%=id%>
</body>
</html>
