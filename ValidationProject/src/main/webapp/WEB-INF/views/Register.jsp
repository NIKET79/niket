<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="validate.js"></script>
<style>
	.size{
		font-size: 14px;
	}
</style>
</head>
<body>
<form:form id="Registerform" action="registerform" enctype="multipart/form-data" method="post" modelAttribute="user">
	Username:<br><form:input path="user_name"/><br>
	<form:errors cssClass="size" cssStyle="color: red" path="user_name"></form:errors><br>
	LastName:<br><form:input path="user_lastname"/><br>
	<form:errors cssClass="size" cssStyle="color: red" path="user_lastname"></form:errors><br>
	Email:<br><form:input path="user_email"/><br>
	<form:errors cssClass="size" cssStyle="color: red" path="user_email"></form:errors><br>
	Address:<br><form:textarea rows="4" cols="18" path="user_address"/><br>
	<form:errors cssClass="size" cssStyle="color: red" path="user_address"></form:errors><br>
	Mobile Number:<br><form:input path="user_number"/><br>
	<form:errors cssClass="size" cssStyle="color: red" path="user_number"></form:errors><br>
	Password:<br><form:input path="user_password"/><br>
	<form:errors cssClass="size" cssStyle="color: red" path="user_password"></form:errors><br>
	Upload file:<br><input type="file" id="myFile" name="filename"><br><br>

	<input type="submit"  id="btnSubmit" value="submit">
</form:form>
<script src="https://code.jquery.com/jquery-3.6.1.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js" integrity="sha512-rstIgDs0xPgmG6RX1Aba4KV5cWJbAMcvRCVmglpam9SoHZiUCyQVDdH2LPlxoHtrv17XWblE/V/PP+Tr04hbtA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</body>
</html>