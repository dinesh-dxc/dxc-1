<%@page import="com.dxc.college.CollegeCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
	function change() {
		var sub = subjectForm.topic.value;
		if (sub=="PC Architecture") {
			subjectForm.theory.value="120";
			subjectForm.practical.value="98";
		}
		if (sub=="PC Hardware1") {
			subjectForm.theory.value="90";
			subjectForm.practical.value="50";
		}
		if (sub=="PC Hardware2") {
			subjectForm.theory.value="60";
			subjectForm.practical.value="41";
		}
		if (sub=="Microprocessor") {
			subjectForm.theory.value="107";
			subjectForm.practical.value="93";
		}
		if (sub=="Data Structure") {
			subjectForm.theory.value="84";
			subjectForm.practical.value="56";
		}
		if (sub=="Operating System") {
			subjectForm.theory.value="96";
			subjectForm.practical.value="74";
		}
		if (sub=="SQl Server") {
			subjectForm.theory.value="112";
			subjectForm.practical.value="98";
		}
		if (sub=="Networking") {
			subjectForm.theory.value="89";
			subjectForm.practical.value="91";
		}
	}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="addSubject.jsp" name="subjectForm">
<center>
Academic Year : 
<select name="acYear">
	<option value="2020">2020</option>
</select> <br/><br/>
Select Subject:
<select name="topic" onchange="change()">
<option value="Please Select">Please Select</option>
    <option value="PC Architecture">PC Architecture</option>
    <option value="PC Hardware1">PC Hardware1</option>
    <option value="PC Hardware2">PC Hardware2</option>
     <option value="Microprocessor">Microprocessor</option>
      <option value="Data Structure">Data Structure</option>
       <option value="Operating System">Operating System</option>
        <option value="SQl Server">SQl Server</option>
         <option value="Networking">Networking</option>
       
</select> <br/><br/>
Theory:
<input type="number" name="theory" id="theory" ><br/><br/>
Practical:
<input type="number" name="practical" id="practical" ><br/><br/>
Instructor Name : 
<select name="instructor">
	<option value="Prasanna">Prasanna</option>
	<option value="Pallavi">Pallavi</option>
	<option value="Akash">Akash</option>
	<option value="Habib">Habib</option> 
</select> <br/><br/>
<input type="submit" name="submit">
</center>
</form>
</body>
<%
	if (request.getParameter("theory") !=null && 
			request.getParameter("practical") != null) {
%>
<jsp:useBean id="subject" class="com.dxc.college.Subject" />
<jsp:setProperty property="*" name="subject"/>
<%=new CollegeCrud().addSubject(subject) %>
<%
	}
%>
</html>