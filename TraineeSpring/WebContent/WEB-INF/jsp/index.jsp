<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
	body{
		background-color:indigo;
	}
	h1{
		text-align:center;
		color:white;
	}
	td{
		color:cyan;
	}
	p{
		color:red;
	}
</style>
</head>
<body>
	<h1>Login</h1>
	<form action="valid.html" method="post">
	<table align="center">
		<tr>
			<td>Username : </td>
			<td><input type="text"
					   name="username"></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="password"
					   name="password"></td>
		</tr>
		<tr>
			<td>&nbsp</td>
			<td><input type="submit"
			            value="login"></td>
		</tr>
	</table>
	</form>
	<c:if test="${param.message ne null}">
			<div>
				<p>${param.message}</p>
			</div>
	</c:if>
</body>
</html>