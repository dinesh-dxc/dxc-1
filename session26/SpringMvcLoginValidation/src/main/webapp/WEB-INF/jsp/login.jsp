<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error{color:red}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	  <form:form action="loginvalidation" modelAttribute="login">
Username: <form:input path="userName"/> <br><br>
<form:errors path="userName" cssClass="error"/><br><br>
Password(*): <form:password path="passWord"/>  
<form:errors path="passWord" cssClass="error"/><br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>