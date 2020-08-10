<%@page import="com.dxc.hib.Employ"%>
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
	<form method="get" action="searchEmploy.jsp">
		<center>
			Employ No : 
			<input type="text" name="empno" /> <br/><br/>
			<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("empno") != null) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			Employ res = new EmployCrud().searchEmploy(empno);
			if (res!=null) {
				out.println("Employ Name   " +res.getName() + "<br/>");
				out.println("Department   " +res.getDept() + "<br/>");
				out.println("Designation   " +res.getDesig() + "<br/>");
				out.println("Basic   " +res.getBasic() + "<br/>");
			} else {
				out.println("*** Record Not Found ***");
			}
	%>
		
	<%
		}
	%>
</body>
</html>