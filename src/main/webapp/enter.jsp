<%--
  Created by IntelliJ IDEA.
  User: bakdu
  Date: 2024-07-18
  Time: 8:56 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><a href="index.jsp">Sign Up</a></h3>
<h3><a href="enter.jsp">Sign In</a></h3>
<form action="/enter" method="get">
    <label><b>User id:</b></label>
    <input name="id" type="number" placeholder="id">
    <br>
    <label><b>User password:</b></label>
    <input name="password" type="password" placeholder="**********">
    <br>
    <input type="submit" name="jonatish">
</form>

</body>
</html>
