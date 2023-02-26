<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Task</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<div align="center">
<h1>Create new Task</h1>
<%
	String code = request.getParameter("c");
	String color="";
	String msg="";
	if(code!=null) {
		switch(code) {
		case "200" :
			color="green";
			msg="Task Created Successfully...";
			break;
		case "500" :
			color="red";
			msg="Task Creation failed. Please try after some time";
			break;
		}
	}
%>
	<h3 style="color: <%=color%>"> <%=msg%></h3>
	<form action="create-my-task">
		Task Title: <input name="title">
		<br><br>
		Task Status: <select name="status">
						<option value="open">Open</option>
						<option value="inprogress">In-Progress</option>
						<option value="close">close</option>
					</select>
		<br><br>
		Schedule On: <input type="date" name="scheduledOn">
		<br><br>
		<button type="submit">Create Task</button>
	</form>
</div>
</body>
</html>










