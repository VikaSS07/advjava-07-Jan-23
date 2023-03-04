<%@page import="edu.todo.dto.Task"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<div align="center">
<h1>update new Task</h1>

<%
	Task task = (Task) request.getAttribute("taskDetails");
%>

	<form action="update-my-task">
		<input type="hidden" name="id" value="<%=task.getId()%>">
		Task Title<sup style="color: red">*</sup> : <input name="title" value="<%=task.getTitle()%>">
		<br><br>
		Task Status<sup style="color: red">*</sup>: <select name="status">
						<option value="open">Open</option>
						<option value="inprogress">In-Progress</option>
						<option value="close">close</option>
					</select>
		<br><br>
		Schedule On<sup style="color: red">*</sup>: <input type="date" name="scheduledOn" value="<%=task.getScheduledOn()%>">
		<br><br>
		<button type="submit">Update Task</button>
	</form>
</div>
</body>
</html>