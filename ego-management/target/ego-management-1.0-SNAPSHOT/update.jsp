<%--
  Created by IntelliJ IDEA.
  User: 华灯
  Date: 2020/6/13
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="update" method="post">
        图片ID：<input type="text" name="id" placeholder="图片ID" value="<%=request.getParameter("id")%>"/>
        新图片路径：<select name="path" value="">
                                    <option value="timg.jpeg">石原里美</option>
                                    <option value="timg.jpg">文咏珊</option>
                                    <option value="timg2.jpg">祝绪丹</option>
                                    <option value="timg3.jpg">濑户早妃</option>
                             </select><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
