<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/23/2022
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tu Dien</h1>
<form method="get" action="/tudien/search">
    <label>Nhap Tu</label><br>
    <input type="text" name="key">
    <input type="submit" value="Search">
</form>
<p>${key}</p>
</body>
</html>
