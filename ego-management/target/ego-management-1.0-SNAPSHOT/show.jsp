<%--
  Created by IntelliJ IDEA.
  User: 华灯
  Date: 2020/6/13
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="show"><strong>返回首页</strong></a><br/>
    <table border="1">
        <tr align="center">
            <td>图片ID</td>
            <td>图片名称</td>
            <td>图片显示</td>
        </tr>
        <tr align="center">
            <td>${pic.id }</td>
            <td>${pic.path }</td>
            <td><img src="files/${pic.path}" width="200" height="200"/></td>
        </tr>

    </table>
</body>
</html>
