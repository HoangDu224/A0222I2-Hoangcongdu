<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/16/2022
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/thi?action=Add">
    <label> Ten nguoi thue</label><br>
    <input name="tenNguoi" type="text"><br>
    <label> So dien thoai</label><br>
    <input name="soDienThoai" type="text"><br>
    <label> Ngay Bat Dau Thue</label><br>
    <input name="ngayBatDau" type="date"><br>
    <label> Hinh Thuc Thanh Toan</label><br>
    <select name="hinhThuc">
        <option value="2">Theo Thang</option>
        <option value="1">Theo Quy</option>
        <option value="3">Theo Nam</option>
    </select><br>
    <label> Ghi Chu</label><br>
    <input name="ghiChu" type="text"><br>
    <input type="submit" value="Tao Moi">
</form>
<a href="/thi">Huy</a>
</body>
</html>
