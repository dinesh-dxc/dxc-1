<%@page import="com.dxc.bank.AccountService"%>
<%@page import="com.dxc.bank.AccountServiceServiceLocator"%>
<%@page import="com.dxc.bank.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Account account = new Account();
		account.setFirstName(request.getParameter("firstName"));
		account.setLastName(request.getParameter("lastName"));
		account.setCity(request.getParameter("city"));
		account.setState(request.getParameter("state"));
		account.setAmount(Integer.parseInt(request.getParameter("amount")));
		account.setCheqFacil(request.getParameter("cheqFacil"));
		account.setAccountType(request.getParameter("accountType"));
		
		AccountServiceServiceLocator locator = new AccountServiceServiceLocator();
		AccountService proxy = locator.getAccountService();
		out.println(proxy.createAccount(account));
	%>
</body>
</html>