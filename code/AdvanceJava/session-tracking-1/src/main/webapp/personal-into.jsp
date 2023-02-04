<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Info</title>
</head>
<body>
	<div align="center">
		<h1>Page 1 of 4</h1>
		<hr>
		<%
		String code = request.getParameter("c");
		String msg = "";
		String color = "";
		if (code != null) {
			switch (code) {
			case "0":
				msg = "Sorry... Your Registration Failed. Please try after sometime";
				color = "red";
				break;
			case "1":
				msg = "Your Registration Successfully Completed";
				color = "green";
				break;
			}
		}
		%>
		<h3 style="color: <%=color%>"><%=msg%></h3>
		<h2>User Personal Details</h2>
		<form action="address-info.jsp">
			ENnter Name : <input type="text" name="name"> <br>
			<br> ENnter Email : <input type="text" name="email"> <br>
			<br> ENnter Contact : <input type="text" name="contact">
			<br>
			<br> <input type="submit" value="Next">
		</form>
	</div>


</body>
</html>