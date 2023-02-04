<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Details</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String email= request.getParameter("email");
	String contact= request.getParameter("contact");
%>
<div align="center">
	<h1>Page 2 of 4</h1>
	<hr>
	<h2>User Address Details</h2>
	<form action="educational-info.jsp">
		ENnter City : <input type="text" name="city">
		<br><br>
		ENnter Pincode : <input type="text" name="pin">
		<br><br>
		ENnter State : <input type="text" name="state">
		<br><br>
		<input type="submit" value="Next">
		
		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="email" value="<%=email%>">
		<input type="hidden" name="contact" value="<%=contact%>">
	</form>
</div>
</body>
</html>




