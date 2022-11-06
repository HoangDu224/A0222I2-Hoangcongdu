<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/31/2022
  Time: 6:36 PM
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
<h1>USER MANAGEMENT</h1>
<form action="/user" method="get">
    <input name="action" value="searchByCountry" hidden>
    <input type="text" name="country">
    <input class="btn btn-primary" type="submit">
</form>
<a class="btn btn-primary" href="/user?action=them">ADD NEW USER </a>
<a class="btn btn-primary" href="/user?action=sapxep">SẮP XẾP THEO NAME</a>
</div>
<table class="table table-striped " border="1" style="margin: 5px">
    <tr>
        <th> ID</th>
        <th> NAME</th>
        <th> EMAIL</th>
        <th> COUNTRY</th>
        <th> ACTION</th>
    </tr>
    <c:forEach var="user" items="${userList}" varStatus="status">
        <tr>
            <td>${user.getId()}</td>
            <td>${user.getName()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td>
                <button type="button"
                        onclick="infoEdit('${user.getId()}','${user.getName()}','${user.getEmail()}','${user.getCountry()}')"
                        class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModalEdit">
                    Edit
                </button>
                <button type="button" onclick="infoDelete('${user.getId()}','${user.getName()}')"
                        class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
</table>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/user" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Delete User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="xoa" hidden>
                    <input name="deleteId" id="deleteId" hidden>
                    <span class="text-danger">Bạn có muốn xoá User </span><span id="deleteName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </form>

    </div>
</div>
<!--modal edit-->
<div class="modal fade" id="exampleModalEdit" tabindex="-1" aria-labelledby="exampleModalLabelEdit" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/user" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelEdit">Edit User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="edit" hidden>
                    <input Id="EditId" name="EditId" hidden>
                    <label>Name</label><br>
                    <input id="EditName" name="EditName"><br>
                    <label>Email</label><br>
                    <input id="EditEmail" name="EditEmail"><br>
                    <label>Country</label><br>
                    <input id="EditCountry" name="EditCountry">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Edit</button>
                </div>
            </div>
        </form>

    </div>
</div>
<script>
    function infoDelete(id, name) {
        document.getElementById("deleteName").innerText = name;
        document.getElementById("deleteId").value = id;
    }

    function infoEdit(id, name, email, country) {
        document.getElementById("EditId").value = id;
        document.getElementById("EditName").value = name;
        document.getElementById("EditEmail").value = email;
        document.getElementById("EditCountry").value = country;
    }
</script>
</body>
</html>
