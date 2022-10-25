<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/24/2022
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>Ten san pham</td>
        <td>Hang san xuat</td>
    </tr>
    <c:forEach var="product" items="${productList}" varStatus="status">
    <tr>
        <td>${product.getId()}</td>
        <td>${product.getTen()}</td>
        <td>${product.getNhaSanXuat()}</td>
    </tr>
    </c:forEach>
</body>
</html>
