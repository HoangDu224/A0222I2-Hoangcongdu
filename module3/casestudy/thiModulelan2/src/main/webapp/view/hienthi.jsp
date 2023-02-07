<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/16/2022
  Time: 6:13 PM
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
<style>
    .button {
        width: 120px;
        height: 60px;
        margin: 50px;
    }

    .buttontop {
        background-color: black;
        border: none;
        padding: 15px 32px;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        cursor: pointer;
    }

    .buttontop:hover {
        color: white;
    }</style>
<head>
    <title>Title</title>
</head>
<body>
<div class="row">
    <div class="col-10">
        <form action="/thi" method="get">
            <input hidden type="text" name="action" value="Search">
            <input type="text" name="searchMa" placeholder="nhập ma phong tro">
            <input type="text" name="searchName" placeholder="nhập name">
            <input type="text" name="searchPhone" placeholder="Nhap phone">
            <button type="submit">Search</button>
        </form>
    </div>
    <div class="col-2">
        <a class="button" href="/thi?action=Add">Tao Moi</a>
    </div>
</div>
<div>
    <table class="table table-dark ">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Date</th>
            <th>Hinh Thuc</th>
            <th>Ghi Chu</th>
            <th>Action</th>
        </tr>
        <c:forEach var="phong" items="${phongtroList}" varStatus="status">
            <tr>
                <td>${phong.getId()}</td>
                <td>${phong.getTenNguoi()}</td>
                <td>${phong.getDienthoai()}</td>
                <td>${phong.getNgayBatDau()}</td>
<%--                <td>${phong.getHinhThuc()}</td>--%>
                <c:choose>
                    <c:when test="${phong.getHinhThuc()==1}">
                        <td>Theo Quy</td>
                    </c:when>
                    <c:when test="${phong.getHinhThuc()==2}">
                        <td>Theo Thang</td>
                    </c:when>
                    <c:when test="${phong.getHinhThuc()==3}">
                        <td>Theo Nam</td>
                    </c:when>
                </c:choose>
                <td>${phong.getGhiChu()}</td>
                <td>
                    <button type="button"
                            onclick="infoDelete('${phong.getId()}')" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <!-- Modal delete -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form action="/thi" method="get">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Delete Phong</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <input name="action" value="Delete" hidden>
                        <input name="deleteId" id="deleteId" hidden>
                        <span class="text-danger">Bạn có muốn xoá Phong tro </span><span id="deleteName"></span>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Delete</button>
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>
<script>
    function infoDelete(id) {
        document.getElementById("deleteId").value = id;
        document.getElementById("deleteName").innerText = id;
    }

</script>
</body>
</html>
