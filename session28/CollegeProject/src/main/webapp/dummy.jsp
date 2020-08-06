<%@page import="com.dxc.college.CollegeCrud"%>
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
	int year=2020;
    String instructor="Prasanna";
    String topic="PC Architecture";
%>
<%= new CollegeCrud().check(year,instructor,topic) %>
</body>
</html>