<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inquery Page</title>
</head>
<body>
	<div align="center">
		<h1>User Inquery</h1>
		<form action="save-inquery">
			Enter Name : <input type="text" name="name">
			<br><br>
			Enter Email : <input type="email" name="email">
			<br><br>
			Enter Contact : <input type="text" name="contact">
			<br><br>
			Enter City : <select name="city">
							<option value="Pune">Pune</option>
							<option value="Mumbai">Mumbai</option>
							<option value="Delhi">Delhi</option>
						</select>
						<br><br>
			Inquery For : <input type="radio" name="inq" value="Java"> Java
							<input type="radio" name="inq" value="testing"> Testing
							<input type="radio" name="inq" value="python"> Python
							<input type="radio" name="inq" value="devops"> DevOps			
			<br><br>
			<button type="submit">Save</button>
		</form>
	</div>


</body>
</html>