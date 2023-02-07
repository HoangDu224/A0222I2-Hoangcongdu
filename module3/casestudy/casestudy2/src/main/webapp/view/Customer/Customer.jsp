<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/11/2022
  Time: 6:46 PM
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
    }
</style>
<head>
    <title>Title</title>

</head>
<body>
<div class="row ">
    <div class="col">
        <img src="FURAMA.png" height="40" width="40">
    </div>
</div>
<div class="row" style="background-color: black; color: rgba(238,234,203,0.35)">
    <div class="col-10">
        <a href="/furama?action=" class="buttontop ">Home</a>
        <a href="/furama?action=Customer" class="buttontop ">Customer</a>
        <a href="/furama?action=Create" class="buttontop ">Create Customer</a>
    </div>
    <div class="col-2">
        <div style="padding: 15px 32px;">
            <form action="/furama" method="get">
                <input hidden type="text" name="action" value="Search">
                <input type="text" name="searchName" placeholder="nhập Name">
                <input type="text" name="searchPhone" placeholder="nhập Phone">
                <input type="text" name="searchAddress" placeholder="Nhap dia chi">
<%--                <select name="classId">--%>
<%--                    <option value="">--Chon Type-- </option>--%>
<%--                    <c:forEach var="type" items="${listType}">--%>
<%--                        <option value="${type.getId()}">${type.getType()}</option>--%>
<%--                    </c:forEach>--%>
<%--                </select>--%>
                <button type="submit">Search</button>
        </div>
    </div>
</div>
<div>
    <div>
        <table class="table table-dark ">
            <tr>
                <th>Id</th>
                <th>Type</th>
                <th>Name</th>
                <th>Birthday</th>
                <th>Gender</th>
                <th>Id Card</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Address</th>
                <th>Action</th>
            </tr>
            <c:forEach var="customer" items="${customerList}" varStatus="status">
                <tr>
                    <td>${customer.getCustomer_id()}</td>
                    <td>${customer.getCustomer_type_id()}</td>
                    <td>${customer.getCustomer_name()}</td>
                    <td>${customer.getCustomer_birthday()}</td>
                    <c:if test="${customer.getCustomer_gender()}">
                        <td>Nam</td>
                    </c:if>
                    <c:if test="${!customer.getCustomer_gender()}">
                        <td>Nữ</td>
                    </c:if>
                    <td>${customer.getCustomer_id_card()}</td>
                    <td>${customer.getCustomer_phone()}</td>
                    <td>${customer.getCustomer_email()}</td>
                    <td>${customer.getCustomer_address()}</td>
                    <td>
                        <button type="button"
                                onclick="infoEdit('${customer.getCustomer_id()}','${customer.getCustomer_type_id()}','${customer.getCustomer_name()}',
                                        '${customer.getCustomer_birthday()}','${customer.getCustomer_gender()}','${customer.getCustomer_id_card()}',
                                        '${customer.getCustomer_phone()}','${customer.getCustomer_email()}','${customer.getCustomer_address()}',)"
                                class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModalEdit">
                            Edit
                        </button>
                        <button type="button"
                                onclick="infoDelete('${customer.getCustomer_id()}','${customer.getCustomer_name()}')"
                                class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                            Delete
                        </button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<div class="bg-secondary">Footer</div>
<!-- Modal delete -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/furama" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Delete User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="Delete" hidden>
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
        <form action="/furama" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelEdit">Edit User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="Update" hidden>
                    <input Id="EditId" name="EditId" hidden>
                    <label>EditType</label><br>
                    <input id="EditType" name="EditType"><br>
                    <label>Name</label><br>
                    <input id="EditName" name="EditName"><br>
                    <label>EditBirthday</label><br>
                    <input type="date" id="EditBirthday" name="EditBirthday"><br>
                    <label>EditGender</label><br>
                    <input id="EditGender" name="EditGender"><br>
                    <label>EditIdCard</label><br>
                    <input id="EditIdCard" name="EditIdCard"><br>
                    <label>EditPhone</label><br>
                    <input id="EditPhone" name="EditPhone"><br>
                    <label>EditEmail</label><br>
                    <input id="EditEmail" name="EditEmail"><br>
                    <label>EditAddress</label><br>
                    <input id="EditAddress" name="EditAddress"><br>
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

    function infoEdit(Id, Type, Name, Birthday, Gender, IdCard, Phone, Email, Address) {
        document.getElementById("EditId").value = Id;
        document.getElementById("EditType").value = Type;
        document.getElementById("EditName").value = Name;
        document.getElementById("EditBirthday").value = Birthday;
        document.getElementById("EditGender").value = Gender;
        document.getElementById("EditIdCard").value = IdCard;
        document.getElementById("EditPhone").value = Phone;
        document.getElementById("EditEmail").value = Email;
        document.getElementById("EditAddress").value = Address;
    }
</script>
</body>
</html>
