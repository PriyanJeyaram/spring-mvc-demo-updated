<%--
  Created by IntelliJ IDEA.
  User: prijeyar
  Date: 29-02-2024
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Data</title>
</head>
<body>
<h1><%= "Add Products Page" %>
</h1>
<hr>
<form action="<%=request.getContextPath()%>/add" method="post">
    Product ID : <input type="number" name="productId"><br><br>
    Product Name : <input type="text" name="productName" placeholder="Enter Product Name"><br><br>
    Product Desc : <input type="text" name="productDesc" placeholder="Enter Product Desc"><br><br>
    Product Price: <input type="number" name="productPrice"><br><br>
    <button type="submit" value="insert">Add Product</button>
</form>
</body>
</html>
