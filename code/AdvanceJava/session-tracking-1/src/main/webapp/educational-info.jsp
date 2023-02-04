<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Educational Details</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String email= request.getParameter("email");
	String contact= request.getParameter("contact");
	String city = request.getParameter("city");
	String pin= request.getParameter("pin");
	String state= request.getParameter("state");
%>
<div align="center">
	<h1>Page 3 of 4</h1>
	<hr>
	<h2>User Educational Details</h2>
	<form action="preview.jsp">
		ENnter Title : <input type="text" name="title">
		<br><br>
		ENnter Percent : <input type="text" name="percent">
		<br><br>
		ENnter Year : <input type="number" name="year">
		<br><br>
		<input type="submit" value="Preview">

		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="email" value="<%=email%>">
		<input type="hidden" name="contact" value="<%=contact%>">
		<input type="hidden" name="city" value="<%=city%>">
		<input type="hidden" name="pin" value="<%=pin%>">
		<input type="hidden" name="state" value="<%=state%>">
	</form>
</div>
</body>
</html>