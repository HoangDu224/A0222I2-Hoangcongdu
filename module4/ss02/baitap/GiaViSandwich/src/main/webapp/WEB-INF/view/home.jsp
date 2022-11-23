<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/23/2022
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiment</h1>
<form method="post" action="/sandwich/option">
    <input type="checkbox" name="Condiment" value="Lettuce">Lettuce
    <input type="checkbox" name="Condiment" value="Tomato">Tomato
    <input type="checkbox" name="Condiment" value="Mustard">Mustard
    <input type="checkbox" name="Condiment" value="Sprouts">Sprouts<br>
    <input type="Submit" value="Gui">
</form>
<c:forEach var="condiment" items="${condimentList}" >
    <p>${condiment}</p>
</c:forEach>
</body>
</html>
