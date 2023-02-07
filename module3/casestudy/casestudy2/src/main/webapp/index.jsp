<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/7/2022
  Time: 9:00 PM
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
        .buttontop:hover{
            color: white;
        }
    </style>
    <title>$Title$</title>
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
        <div class="buttontop ">Employee</div>
        <a href="/furama?action=Customer" class="buttontop ">Customer</a>
        <div class="buttontop ">Service</div>
        <div class="buttontop ">Contract</div>
    </div>
    <div class="col-2">
        <div style="padding: 15px 32px;">
            <input type="text" placeholder="Search">
        </div>
    </div>
</div>
<div class="row ">
    <div class="col">aa</div>
</div>
<div class="bg-secondary">Footer</div>
</body>
</html>
