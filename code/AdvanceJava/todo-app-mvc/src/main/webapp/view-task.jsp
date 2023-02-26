<%@page import="edu.todo.dto.Task"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Task</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>Title</th>
				<th>Status</th>
				<th>Scheduled Date</th>
				<th>Updated Date</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<%
			ArrayList<Task> list =(ArrayList<Task>) request.getAttribute("myTasks");
			for(Task t : list) {
		%>		
			<tr>
				<td><%=t.getTitle()%> </td>
				<td><%=t.getStatus()%> </td>
				<td><%=t.getScheduledOn()%> </td>
				<td><%=t.getUpdatedOn()%> </td>
				<td> Edit / Delete </td>
			</tr>	
		<%		
			}
		%>
		</tbody>
	</table>



</body>
</html>











