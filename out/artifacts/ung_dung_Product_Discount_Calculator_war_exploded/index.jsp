<%--
  Created by IntelliJ IDEA.
  User: harrynguyen
  Date: 13/05/2020
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <div style="width: 500px; height: 200px; border: blue solid 2px; margin: 20px auto">
  <form style="margin: 0 100px" method="post" action="/discount">
    <h2>Product Discount Calculator</h2>
    <table>
      <tr>
        <td>Product Description:</td>
        <td><input type="text" name="mota" placeholder="Mô tả"></td>
      </tr>
      <tr>
        <td>List Price:</td>
        <td><input type="text" name="gia" placeholder="Giá"></td>
      </tr>
      <tr>
        <td>Discount Percent:</td>
        <td><input type="text" name="chietkhau" placeholder="Chiếu Khấu">(%)</td>
      </tr>
      <tr >
        <td></td>
        <td><input type="submit" id="submit" value="Calculate Discount"></td>
      </tr>
    </table>
  </form>
  </div>
  </body>
</html>
