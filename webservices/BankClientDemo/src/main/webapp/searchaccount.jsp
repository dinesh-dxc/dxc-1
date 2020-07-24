<%@page import="com.dxc.bank.Account"%>
<%@page import="com.dxc.bank.AccountService"%>
<%@page import="com.dxc.bank.AccountServiceServiceLocator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="searchaccount.jsp">
		<center>
			Account No : 
		<input type="text" name="accountNo" /> <br/><br/> 
		<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("accountNo") !=  null) {
			int accountNo = Integer.parseInt(request.getParameter("accountNo"));
			AccountServiceServiceLocator locator = new AccountServiceServiceLocator();
			AccountService proxy = locator.getAccountService();
			Account result = proxy.searchAccount(accountNo);
			if (result!=null) {
				out.println("First Name  " +result.getFirstName());
			}
		}
	%>
</body>
</html>