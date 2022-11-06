<%--
  Created by IntelliJ IDEA.
  User: Hoangdu
  Date: 10/30/2022
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product?action=xem" method="post">
    <label>Nhap id san pham can xem</label><br>
    <input type="text" name="id"><br>
    <input type="submit" name="Xem San Pham">
</form>
<a href="/index.jsp" >Quay Lai</a>
<table border="">
    <tr>
    <td>${product.getId()}</td>
    <td>${product.getTen()}</td>
    <td>${product.getNhaSanXuat()}</td>
    </tr>
</table>
</body>
</html>
