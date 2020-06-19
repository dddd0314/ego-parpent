<%--
  Created by IntelliJ IDEA.
  User: 华灯
  Date: 2020/6/12
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="selById" method="post">
        图片ID: <input type="text" name="id"/>
                     <input type="submit" value="查询">
    </form>
   <a href="add.jsp">新增信息</a><br/>
    <table border="1">
        <tr align="center">
            <td>图片ID</td>
            <td>图片名称</td>
            <td>图片</td>
            <td>操作1</td>
            <td>操作2</td>
        </tr>
        <c:forEach items="${list }" var="pic">
            <tr align="center">
                <td>${pic.id }</td>
                <td>${pic.path }</td>
                <td><img src="files/${pic.path}" width="200" height="200"/></td>
                <td><a href="delete?id=${pic.id }">删除</a></td>
                <td><a href="update.jsp?id=${pic.id }">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
