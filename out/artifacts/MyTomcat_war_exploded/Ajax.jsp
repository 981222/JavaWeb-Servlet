<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/7
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.5.1.min.js"></script>
    <script>
        $(function () {
            var btn = $("#btn");
            btn.click(function () {
                $.ajax({
                    url:'/Ajax',
                    type:'post',
                    dateType:'text',
                    success:function (data) {
                        var text = $("#text");
                        text.before("<h1>" + data + "<h1>")
                    }
                })
            })
        })
    </script>
</head>
<body>
    <input id="text" type="text" name="value">
    <input id="btn" type="button" value="提交">
</body>
</html>
