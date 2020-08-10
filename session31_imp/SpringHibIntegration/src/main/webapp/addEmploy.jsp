<%@page import="com.dxc.hib.EmployCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="addEmploy.jsp">
		Employ No :
		<input type="text" name="empno" /> <br/><br/> 
		Employ Name : 
		<input type="text" name="name" /> <br/><br/> 
		Department : 
		<input type="text" name="dept" /> <br/><br/> 
		Designation : 
		<input type="text" name="desig" /> <br/><br/> 
		Basic : 
		<input type="text" name="basic" /> <br/><br/> 
		<input type="submit" value="Insert" />
	</form>
	<%
		if (request.getParameter("empno") != null && 
			 request.getParameter("basic") !=null) {
	%>
	<jsp:useBean id="employ" class="com.dxc.hib.Employ" />
	<jsp:setProperty property="*" name="employ"/>
	<%=new EmployCrud().addEmploy(employ) %>
	<%
		}
	%>
</body>
</html>