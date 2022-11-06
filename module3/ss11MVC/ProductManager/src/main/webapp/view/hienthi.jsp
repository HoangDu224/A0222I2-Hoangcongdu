<%--
  Created by IntelliJ IDEA.
  User: Hoangdu
  Date: 10/25/2022
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Product Manager</h2>
<ul>
    <li><a href="/product?action=them">Them san pham moi</a></li>
    <li><a href="/product?action=xoa">Xoa san pham</a></li>
    <li><a href="/product?action=xem">Xem chi tiết một sản phẩm</a></li>
</ul>
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
