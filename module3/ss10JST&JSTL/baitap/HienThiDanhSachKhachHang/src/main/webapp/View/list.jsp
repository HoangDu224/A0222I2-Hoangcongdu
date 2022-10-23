<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hoangdu
  Date: 10/22/2022
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" >
    <tr>
        <td>name</td>
        <td>ngay sinh</td>
        <td>dia chi</td>
        <td>anh</td>
    </tr>
    <c:forEach var="khachhang" items="${khachhangList}" varStatus="status">
        <tr>
            <td>${khachhang.getName()}</td>
            <td>${khachhang.getNgaysinh()}</td>
            <td>${khachhang.getDiachi()}</td>
            <td><img src="${khachhang.getAnh()}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
