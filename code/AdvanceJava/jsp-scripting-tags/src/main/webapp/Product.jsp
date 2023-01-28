<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<form action="billing.jsp">
		 <h3>1st Product Details</h3>
		Enter Name : <input name="name1"> <br>
		<br> 
		Enter Price : <input name="price1"> <br>
		<br> 
		Enter Quantity : <input name="quantity1">
		<br>
		<br>
		
		<h3>2nd Product Details</h3>
		Enter Name : <input name="name2"> <br>
		<br> 
		Enter Price : <input name="price2"> <br>
		<br> 
		Enter Quantity : <input name="quantity2">
		<br>
		<br>
		<button type="submit">Generate Bill</button>
	</form>
</div>

</body>
</html>