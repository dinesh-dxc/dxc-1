<%@page import="com.dxc.hib.Employ"%>
<%@page import="java.util.List"%>
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
	<table border="3">
		<tr> 
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Salary</th>
		</tr>
	<%
		EmployCrud obj = new EmployCrud();
		List<Employ> result = obj.showEmploy();
		for(Employ employ : result) {
	%>
	<tr>
		<td> <%=employ.getEmpno() %> </td>
		<td> <%=employ.getName() %> </td>
		<td> <%=employ.getDept() %> </td>
		<td> <%=employ.getDesig() %> </td>
		<td> <%=employ.getBasic() %> </td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>