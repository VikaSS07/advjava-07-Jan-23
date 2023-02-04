<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Preview</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String email= request.getParameter("email");
	String contact= request.getParameter("contact");
	String city = request.getParameter("city");
	String pin= request.getParameter("pin");
	String state= request.getParameter("state");
	String title = request.getParameter("title");
	String percent = request.getParameter("percent");
	String year = request.getParameter("year");
	String url = "save-info?name="+name+"&email="+email+"&contact="
	+contact+"&city="+city+"&pin="+pin+"&state="+state
	+"&title="+title+"&percent="+percent+"&year="+year;
%>
<div align="center">
	<h1>Page 4 of 4</h1>
	<hr>
	<h2>User Personal Details</h2>
		<h3>Name : <%=name%> </h3>
		<h3>Email : <%=email%></h3>
		<h3>Contact : <%=contact%></h3>
	<h2>User Address Details</h2>
		<h3>City : <%=city%> </h3>
		<h3>pincode : <%=pin%></h3>
		<h3>State : <%=state%></h3>
	<h2>User Educational Details</h2>
		<h3>Title : <%= title %> </h3>
		<h3>Percent : <%= percent %> </h3>
		<h3>Year : <%= year %> </h3>
	<h1><a href="<%=url%>">Save and Continue</a></h1>
</div>

</body>
</html>





