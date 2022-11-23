<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/23/2022
  Time: 5:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/convert" >
    <label>USD</label><br>
    <input type="text" name="usd">
    <input type="submit">
</form>
<p>Result:<span>${vnd}</span></p>
</body>
</html>
