<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/23/2022
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/calculator">
    <h2>Calculator</h2>
    <label>first operator</label>
    <input type="text" name="firstOperator" ><br>
    <label>operator</label>
    <select name="operator">
      <option>+</option>
      <option>-</option>
      <option>x</option>
      <option>/</option>
    </select><br>
    <label>second operator</label>
    <input type="text" name="secondOperator" ><br>
    <input type="submit">
  </form>

  </body>
</html>
