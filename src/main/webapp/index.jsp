<%--
  Created by IntelliJ IDEA.
  User: TruongDubai
  Date: 5/24/2021
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/Servlet" method="get">
    <h1>Simple Calculator</h1>
    <label>First Operand</label>
    <input type="number" name="first"> <br>
    <label>Operator</label>
    <select name="operator" >
      <option value="ADD">+</option>
      <option value="MIN">-</option>
      <option value="MUL">*</option>
      <option value="DIV">/</option>
    </select> <br>
    <label>Second Operand</label>
    <input type="number" name="second"> <br>
    <input type="submit" value="Calculator">
  </form>
  </body>
</html>
