<%--
  Created by IntelliJ IDEA.
  User: 华灯
  Date: 2020/6/17
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="update" method="post" >
        <!--此处request.getParameter("id")是获取上一页面传输得来的值-->
        图片ID: <input type="text" name="id" placeholder="ID名称" value="<%=request.getParameter("id")%>"/>
        图片新地址:
        <select name="path" value="">
            <option value="timg.jpeg">石原里美</option>
            <option value="timg.jpg">文咏珊</option>
            <option value="timg2.jpg">祝绪丹</option>
            <option value="timg3.jpg">濑户早妃</option><br/>
        </select>
        <input type="submit" value="提交"/>
    </form><br/>
    <a href="show"><strong>返回首页</strong></a>
</body>
</html>
