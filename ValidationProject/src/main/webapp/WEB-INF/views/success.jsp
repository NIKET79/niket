<%@page import="com.comtrollers.User"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="Register.jsp" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	tr,td{
		border:1px solid black;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="border: 1px solid black">
<tr>
	<td>Id</td>
	<td>username</td>
	<td>add</td>
	<td>delete</td>
	<td>view</td>
</tr>
<tr>
	<td>${loginid}</td>
	<td>${user.getUser_name()}</td>
	<td><form action="input" method="post">
			<input type="submit"  name="submit" value="add"/>
		</form></td>
		<td><form action="input" method="post">
			<input type="submit"  name="submit" value="delete"/>
		</form></td>
		<td><form action="view" method="post">
		<input type="hidden" name="loginid" value=${loginid}>
			<input type="submit"  name="submit" value="view"/>
		</form></td>
</tr>
</table>
</body>
</html>