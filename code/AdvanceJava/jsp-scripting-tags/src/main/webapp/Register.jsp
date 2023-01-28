<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="preview.jsp">
		Enter Name :  <input name="name">
		<br><br>
		Enter Email:  <input name="email">
		<br><br>
		Enter Password :  <input name="pass" type="password">
		<br><br>
		<button type="submit">Register</button>
	</form>
	
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Total</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>TV</td>
				<td>30000</td>
				<td>1</td>
				<td>30000</td>
			</tr>
			<tr>
				<td>Pen</td>
				<td>30</td>
				<td>5</td>
				<td>150</td>
			</tr>
			<tr>
				<td colspan="4" >Payable Amount : 30150</td>
			</tr>
		</tbody>
	
	</table>
</body>
</html>












