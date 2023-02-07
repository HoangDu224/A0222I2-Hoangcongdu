<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2022
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach sach</h1>
<div>
<table class="table table-dark ">
    <tr>
        <th>Ma sach</th>
        <th>ten sach</th>
        <th>tac gia</th>
        <th>so luong</th>
        <th>mo ta</th>
        <th>Action</th>
    </tr>
    <c:forEach var="sach" items="${sachList}" varStatus="status">
    <tr>
        <td>${sach.getMaSach()}</td>
        <td>${sach.getTenSach()}</td>
        <td>${sach.getTacGia()}</td>
        <td>${sach.getMoTa()}</td>
        <td>${sach.getSoLuong()}</td>
        <td>
            <a href="/thi?action=Muon">Muon</a>
        </td>
    </tr>
    </c:forEach>
</table>
</div>
<script>

</script>
</body>
</html>
