<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean1" class="com.dxc.beans.Hello" scope="page" />
	Default Message : 
	<b>
		<jsp:getProperty property="greeting" name="bean1"/>
	</b>
	<jsp:setProperty property="greeting" name="bean1" value="Good Afternoon..."/>
	<br/><br/> 
	Updated Value : 
	<jsp:getProperty property="greeting" name="bean1" />
</body>
</html>