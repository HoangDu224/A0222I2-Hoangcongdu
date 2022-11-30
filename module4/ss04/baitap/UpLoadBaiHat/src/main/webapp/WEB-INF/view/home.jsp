<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/28/2022
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<p style="color: blue">${msg}</p>--%>
<table border="1">
    <tr>
        <th>Ten Bai Hat</th>
        <th>Ca Si</th>
        <th>The Loai</th>
        <th>Link file</th>
    </tr>
    <c:forEach var="musicList" items="${musicList}">
        <tr>
            <td>${musicList.getTenBaiHat()}</td>
            <td>${musicList.getCaSi()}</td>
            <td>${musicList.getTheLoai()}</td>
            <td>${musicList.getLinkFile()}</td>
        </tr>
    </c:forEach>
</table>
<a href="/upLoad">Upload</a>
</body>
</html>
