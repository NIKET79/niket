<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	Username:<br>
	<input type="text" value=${ login.getUser_name()}><br>
	Lastname:<br>
	<input type="text" value=${ info.getUser_lastname() }><br>
	Email:<br>
	<input type="text" value=${ info.getUser_email()}><br>
	Address:<br>
	<input type="text" value=${ info.getUser_address()}><br>
	password:<br>
	<input type="text" value=${ login.getUser_password() }><br>
	<img width="100" height="100" src="/resources/images/${info.getFilename()}"><br>
</form>
<%@include file="success.jsp"%>
</body>
</html>