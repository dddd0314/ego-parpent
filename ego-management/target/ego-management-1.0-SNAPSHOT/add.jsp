<%--
  Created by IntelliJ IDEA.
  User: 华灯
  Date: 2020/6/12
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="insert" method="post" enctype="multipart/form-data">
        广告图片: <input type="file" name="file" accept="files/*"/> <br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
