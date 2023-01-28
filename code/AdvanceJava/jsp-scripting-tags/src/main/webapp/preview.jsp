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
	String name = request.getParameter("name");
	String email = request.getParameter("email");
%>


<h1>Name : <%= name %> </h1>
<h1>Email : <%= email %> </h1>

</body>
</html>











