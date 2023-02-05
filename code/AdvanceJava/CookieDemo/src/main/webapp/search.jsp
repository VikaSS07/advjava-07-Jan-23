<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Search</title>
</head>
<body>


<%
	Cookie cks[] = request.getCookies(); // To get all the cookies from request
	String lastsearch ="";
	String lastvisit = "";
	if(cks != null) {
		for(Cookie ch : cks) {
			if("lastvisit".equals(ch.getName())) {
				lastvisit = ch.getValue();
			}
			if("search".equals(ch.getName())) {
				lastsearch = ch.getValue();
			}
		}
	}
%>
	<div align="center">
	<h1>Your List Visit : <%= lastvisit %> </h1>	
	<h1>Your Previous Search for : <%= lastsearch.replaceAll("_", " ") %> </h1>
		<form action="result">
			Search For : <input type="text" name="q">
			<br><br>
			<button type="submit">Get Result</button> 
		</form>
	
	</div>

</body>
</html>