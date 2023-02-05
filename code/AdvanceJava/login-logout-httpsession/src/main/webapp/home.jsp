<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String username = (String) session.getAttribute("un");
	%>
	<div align="right">
		<h3>User, <%=username%> </h3>
		<h3> <a href="#">Logout</a> </h3>
	</div>
	<hr>
	<div align="center">
		<h1>Welcome User, To home Page...</h1>
	
	</div>
</body>
</html>







