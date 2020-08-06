<%@page import="java.util.List"%>
<%@page import="com.dxc.college.CollegeCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
	show() {
		alert("Hi");
	}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	CollegeCrud obj = new CollegeCrud();
	String fid = obj.generateFeedbackId();
%>
	<form name="feedback" method="get" action="feedback.jsp">
		<center>
			FeedBack Id : 
			<input type="text" value=<%=fid %> name="fid" readonly="readonly" />
			<br/><br/>
			StudentName:
			<input type="text" name="studentName"><br/><br/>
			Instructor : 
			<select name="instructor" onchange="show()">
				<option value="please Select">Select Instructor</option>
	<%
		List<String> lstinstr=new CollegeCrud().getInstructors();
		for(String s : lstinstr){
	%>
		<option value="<%=s%>"> <%=s%> </option>
	<%
		}
	%>
			</select>
		<br/><br/>
		Subject : 
		<select name="subject">
			<option value="please Select">Please Select</option>
		</select>
		</center>
	</form>
</body>
</html>