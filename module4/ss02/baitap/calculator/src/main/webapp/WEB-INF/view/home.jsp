<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/23/2022
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/caculator" method="post">
    <input type="text" name="operation1">
    <input type="text" name="operation2"><br>
    <input type="submit" name="operation" value="Addition">
    <input type="submit" name="operation" value="Subtraction">
    <input type="submit" name="operation" value="Multiplication">
    <input type="submit" name="operation" value="Division">
</form>
<p>Result :<span>${result}</span></p>
</body>
</html>
