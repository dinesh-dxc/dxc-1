<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.dxc.welcome.Employ"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employ Data Coming Soon...
<table border="3">
	<tr>
		<th>Employ No</th>
		<th>Name</th>
		<th>Department</th>
		<th>Designation</th>
		<th>Salary</th>
	</tr>

<c:forEach var="employ" items="${employs}">
<tr>
  <td>${employ.getEmpno()} </td>
  <td>${employ.getName()} </td>
  <td>${employ.getDept()} </td>
  <td>${employ.getDesig()} </td>
  <td>${employ.getBasic()} </td>
</tr>
</c:forEach>
</table>
</body>
</html>