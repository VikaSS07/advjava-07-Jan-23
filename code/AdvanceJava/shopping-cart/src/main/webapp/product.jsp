<%@page import="bean.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>

<style type="text/css">
 .product-div {
	border: solid black;
}
</style>
</head>
<body>
<div align="center">
	<div align="right" class="product-div">
		<h2><a href="cart.jsp">Show Cart</a></h2>
		<%
		ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartList");
		%>
		<h4>Total items (<%= list == null ? 0 : list.size() %>)</h2>
	</div>
	<div class="product-div">
		<h2>Name : Smart Phone</h2>
		<h2>Price : 23000</h2>
		<h2><a href="add-to-cart?pid=12&name=Smart Phone&price=23000">Add To Card</a></h2>
	</div>
	
	<div class="product-div">
		<h2>Name : Smart TV</h2>
		<h2>Price : 53000</h2>
		<h2><a href="add-to-cart?pid=11&name=Smart TV&price=53000">Add To Card</a></h2>
	</div>
	
	<div class="product-div">
		<h2>Name : Smart Watch</h2>
		<h2>Price : 13000</h2>
		<h2><a href="add-to-cart?pid=120&name=Smart Watch&price=13000">Add To Card</a></h2>
	</div>
	
	<div class="product-div">
		<h2>Name : Bluetooth Speaker </h2>
		<h2>Price : 3000</h2>
		<h2><a href="add-to-cart?pid=123&name=Bluetooth Speaker&price=3000">Add To Card</a></h2>
	</div>
	
	<div class="product-div">
		<h2>Name : Bluetooth Headphone</h2>
		<h2>Price : 900</h2>
		<h2><a href="add-to-cart?pid=112&name=Bluetooth Headphone&price=9000">Add To Card</a></h2>
	</div>

</div>

</body>
</html>