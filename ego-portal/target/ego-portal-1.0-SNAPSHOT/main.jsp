<%--
  Created by IntelliJ IDEA.
  User: 华灯
  Date: 2020/6/16
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr align="center">
            <td>图片ID</td>
            <td>图片</td>
            <td>操作1</td>
            <td>操作2</td>
        </tr>
        <c:forEach items="${list }" var="pic">
            <tr align="center">
                <td>${pic.id}</td>
                <td><img src="files/${pic.path}"  width="200" height="200"/></td>
                <td><a href="delete?id=${pic.id }">删除</a></td>
                <td><a href="update.jsp?id=${pic.id}">修改</a></td>
            </tr>
        </c:forEach>
    </table><br/>
    <a href="show"><strong>返回首页</strong></a>
</body>
</html>
