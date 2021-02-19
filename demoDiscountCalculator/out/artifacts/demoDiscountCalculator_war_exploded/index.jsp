<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 7/19/2020
  Time: 2:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div style=" margin-left: 400px;border: 1px solid; width: 600px">
    <h2 style="text-align: center">Calculator Discount Product</h2>
    <form method="post" action="/calculator">
      <label style="margin: 30px">Product Description: </label>
      <input type="text" name="description"  value="" style="margin-left: 32px;margin-top: 20px"/><br/>
      <label  style="margin: 30px">Product Price (USD): </label>
      <input type="text" name="price"  value="" style="margin-left: 27px; margin-top: 20px " /><br/>
      <label  style="margin: 30px" >Discount Percent (%): </label>
      <input type="text" name="discount_percent" value="" style="margin-left: 23px; margin-top: 20px"/><br/>
      <input type = "submit" id = "submit" value = "Calculate Discount" style="margin-left: 250px;margin-top: 20px"/>
    </form>
  </div>
  </body>
</html>
