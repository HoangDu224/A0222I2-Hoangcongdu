<%--
  Created by IntelliJ IDEA.
  User: Hoangdu
  Date: 10/30/2022
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product?action=them" method="post">
    <label>id</label><br>
    <input type="text" name="id"><br>
    <label>ten san pham</label><br>
    <input type="text" name="tenSanPham"><br>
    <label>Nha san xuat</label><br>
    <input type="text" name="nhaSanXuat"><br>
    <input type="submit" name="Them San Pham">
</form>
<a href="/index.jsp" >Quay Lai</a>
</body>
</html>
