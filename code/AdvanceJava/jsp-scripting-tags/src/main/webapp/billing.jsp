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
	String name1 = request.getParameter("name1");
	String price1 = request.getParameter("price1");
	String qty1 = request.getParameter("quantity1");
	double p1 = Double.parseDouble(price1);
	int q1 = Integer.parseInt(qty1);
	double total1 = p1*q1;
	
	String name2 = request.getParameter("name2");
	String price2 = request.getParameter("price2");
	String qty2 = request.getParameter("quantity2");
	double p2 = Double.parseDouble(price2);
	int q2 = Integer.parseInt(qty2);
	double total2 = p2*q2;
	
	double totalAmt = total1 + total2; 
%>

<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Total</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%= name1 %></td>
				<td><%= price1 %></td>
				<td><%= qty1 %></td>
				<td><%= total1  %></td>
			</tr>
			<tr>
				<td><%= name2 %></td>
				<td><%= price2 %></td>
				<td><%= qty2 %></td>
				<td><%= total2  %></td>
			</tr>
			<tr>
				<td colspan="4" >Payable Amount : <%= totalAmt %></td>
			</tr>
		</tbody>
	
	</table>

</body>
</html>









