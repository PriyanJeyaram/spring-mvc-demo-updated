<%@ page import="com.bootcamp.springmvcdemoupdated.model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: prijeyar
  Date: 29-02-2024
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HOME</title>
</head>
<body>
<h1>Hello Java</h1>
<p>Welcome to the world :)</p>
<hr>
<% List<Product> productList=(List<Product>)request.getAttribute("productList");%>
<%= productList.get(0).getProductName()%>
</body>
</html>
