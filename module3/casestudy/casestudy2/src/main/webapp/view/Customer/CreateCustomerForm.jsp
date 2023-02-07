
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/11/2022
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/furama?action=Create" method="post">
    <label>Name</label><br>
    <input type="text" name="name"><br>
    <label>Type</label><br>
    <select name="type">
        <option value="">Chon Type Khach Hang</option>
        <c:forEach var="type" items="${listType}">
            <option value="${type.getId()}" > ${type.getType()}</option>
        </c:forEach>
    </select><br>
    <label>Birthday</label><br>
    <input type="date" name="birthday"><br>
    <label>Gender</label><br>
    <select name="gender" >
        <option value="">Chon Gioi Tinh</option>
        <option value="0">Nam</option>
        <option value="1">Nu</option>
    </select><br>
    <label>Id Card</label><br>
    <input type="text" name="idCard"><br>
    <label>Phone</label><br>
    <input type="text" name="phone"><br>
    <label>Email</label><br>
    <input type="text" name="email"><br>
    <label>Address</label><br>
    <input type="text" name="address"><br>
    <input type="submit">
</form>
</body>
</html>
