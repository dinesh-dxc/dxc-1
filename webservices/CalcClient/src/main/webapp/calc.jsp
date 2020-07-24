<%@page import="com.dxc.calc.Calc"%>
<%@page import="com.dxc.calc.CalcServiceLocator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="calc.jsp">
		<center>
			First No : 
		<input type="text" name="firstNo" /> <br/><br/> 
			Second No : 
		<input type="text" name="secondNo" /> <br/><br/> 
		<input type="submit" value="Calc" />
		</center>
	</form>
	<%
		if (request.getParameter("firstNo") != null && request.getParameter("secondNo") != null) {
			int a,b;
			a=Integer.parseInt(request.getParameter("firstNo"));
			b=Integer.parseInt(request.getParameter("secondNo"));
			CalcServiceLocator locator = new CalcServiceLocator();
			Calc proxy = locator.getCalc();
			out.println("Sum is  " +proxy.sum(a, b) + "<br/>");
			out.println("Sub is  " +proxy.sub(a,b) + "<br/>"); 
			out.println("Mult is  " +proxy.mult(a, b));
		}
	%>
</body>
</html>