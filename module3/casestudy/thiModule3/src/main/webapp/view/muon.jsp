<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2022
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Muon sach</h1>
<form action="/thi?action=Muon" method="post">
<label>Ma muon sach</label><br>
<input value="tenSach" name="maMuon"><br>
<label>Ten sach</label><br>
    <select name="tenSach">
        <option value="">Chon Sach</option>
        <c:forEach var="sach" items="${sachList}">
            <option value="${sach.getMaSach()}"> ${sach.getTenSach()}</option>
        </c:forEach>
    </select><br>
<label>Ten Hoc Sinh</label><br>
<select name="hocsinh">
    <option value="">Chon Hoc Sinh</option>
    <c:forEach var="hocsinh" items="${hocsinhList}">
        <option value="${hocsinh.getMaHocSinh()}"> ${hocsinh.getHoTen()}</option>
    </c:forEach>
</select><br>
<label>Ngay Muon Sach</label><br>
<input type="date" name="ngayMuon"><br>
<label>Ngay Tra Sach</label><br>
<input type="date" name="ngayTra"><br>
<input type="submit"><br>
</form>
<a href="/index.jsp">Huy</a>
</body>
</html>
