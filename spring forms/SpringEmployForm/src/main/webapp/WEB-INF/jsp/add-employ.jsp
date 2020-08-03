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
		<form:form action="employSubmit" modelAttribute="employ">
			Employ No : 
			<form:input path="empno"/> <br/><br/> 
			Employ Name : 
			<form:input path="name" /> <br/><br/> 
			Department : 
			<form:input path="dept" /> <br/><br/> 
			Designation : 
			<form:input path="desig" /> <br/><br/> 
			Basic : 
			<form:input path="basic" /> <br/><br/> 
			<input type="submit" value="Show" />
		</form:form>
</body>
</html>