<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/28/2022
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/upLoad" method="post" modelAttribute="music">
    <label>Ten Bai Hat</label><br>
    <form:input path="tenBaiHat" type="text" /><br>
    <label>Ten ca si</label><br>
    <form:input path="caSi" type="text" /><br>
    <label>The Loai</label><br>
    <form:input path="theLoai" type="text" /><br>
    <label>Linkfile</label><br>
    <form:input path="linkFile" type="text" /><br>
    <button type="submit">Update</button>
</form:form>
    <a href="/display">Quay Lai</a>
</body>
</html>
