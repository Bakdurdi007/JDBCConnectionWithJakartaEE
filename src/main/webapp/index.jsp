<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h3><a href="index.jsp">Sign Up</a></h3>
<h3><a href="enter.jsp">Sign In</a></h3>
<form action="/addUser" method="post">
    <label><b>User id:</b></label>
    <input name="id" type="number" placeholder="id">
    <br>
    <label><b>User last name:</b></label>
    <input name="last_name" type="text" placeholder="John">
    <br>
    <label><b>User first name:</b></label>
    <input name="first_name" type="text" placeholder="Wick">
    <br>
    <label><b>User password:</b></label>
    <input name="password" type="password" placeholder="**********">
    <br>
    <input type="submit" name="jonatish">
</form>
</body>
</html>