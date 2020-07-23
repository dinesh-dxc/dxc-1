<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='3'>
		<form method="post" action="LoginServlet">
			<center>
			<tr>
			<th colspan="2">Login Page</th>
			</tr>
			<tr>
			<th>User Name </th>
			<td>
		<input type="text" name="userName" />
		</td>
		</tr> 
		<tr>
		<th>Password</th>
		<td>
		<input type="password" name="passCode" />
		</td>
		</tr>
		<tr>
		<th colspan="2">
			<input type="submit" value="Login" />
		</th>
		</tr>
			</center>
		</form>
	</table>
</body>
</html>