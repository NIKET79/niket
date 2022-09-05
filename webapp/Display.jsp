<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr,td{
		border:1px solid black;
	}
</style>

</head>
<body>
<%@include file="Register.jsp" %>
<div style="margin-top:5x%;">
<h1>Details</h1>
<table style="border: 1px solid black">
	
	<tr>
		<td>Name</td>
		<td>Mobile_Number</td>
		<td>Hobby</td>
		<td>Update_details</td>
	</tr>
	<tr>
		<td><%= request.getParameter("user_name") %></td>
		<td><%= request.getParameter("user_mobile") %></td>
		<td><%= request.getParameter("user_hobby") %></td>
		
		<td><form action="input" method="post">
			<input type="submit"  name="submit" value="edit"/>
		</form></td>
	</tr>
</table>
</div>
</body>
</html>