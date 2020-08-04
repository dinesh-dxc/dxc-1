<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>The Page Under Construction</p>
		  <form:form action="employvalidation" modelAttribute="employ">
Employ No: <form:input path="empno"/> <br><br>
<form:errors path="empno" cssClass="error"/><br><br>
Employ Name : <form:input path="name" /> <br/><br/>
<form:errors path="name" cssClass="error"/><br><br>
Employ Salary : <form:input path="basic"/>  
<form:errors path="basic" cssClass="error"/><br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>