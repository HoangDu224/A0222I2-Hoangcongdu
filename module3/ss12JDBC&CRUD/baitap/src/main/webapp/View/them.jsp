<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2022
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user?action=them" method="post">
    <label>Name</label><br>
    <input type="text" name="name"><br>
    <label>Email</label><br>
    <input type="text" name="email"><br>
    <label>Country</label><br>
    <input type="text" name="country"><br>
    <input type="submit" name="Them User">
</form>
<a href="/index.jsp" >Quay Lai</a>
</body>
</html>
