<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Scrpting Element Demo</h1>
	<h1>Scriptlet Tag</h1>
	<%
		int a = 10;
		System.out.println("a : " + a);
	%>
	
	<%= "Square : " + (a*a) %>
	
	<%!
		static int x = 30; 
		public void display() {
			System.out.println(x);
		}
	%>
	
	
	
</body>
</html>

















