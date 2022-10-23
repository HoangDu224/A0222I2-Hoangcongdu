<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/21/2022
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <form method="post" action="display">
   <div>
     <label>Product Description</label><br>
     <input type="text" name="description" placeholder="DECRIPTION"/><br>
     <label>Price</label><br>
     <input type="text" name="price" placeholder="PRICE"><br>
     <label>Discount Percent</label><br>
     <input type="text" name="discount" placeholder="DISCOUNT"><br>
     <input type="submit" value="Submit">
   </div>
 </form>
  </body>
</html>
