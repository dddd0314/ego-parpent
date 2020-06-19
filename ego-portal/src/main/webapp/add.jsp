<%--
  Created by IntelliJ IDEA.
  User: 华灯
  Date: 2020/6/16
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="insert" method="post" enctype="multipart/form-data">
        人物图片: <input type="file" name="file" accept="files/*"/> <br/>
        <input type="submit"  value="添加"/>
    </form>
</body>
</html>
