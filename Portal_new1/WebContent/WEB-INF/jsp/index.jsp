<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/index.css">
<style type="text/css">
body{
	background-image: url("images/background.jpg");
	background-size: 100%;
}
</style>
<title class="title">Login</title>

</head>
<body>
	<!-- 
	boolean getAuthenticationEnabled(String userName)
                          throws AuthenticationException -->
    
    <table align="center">
    <tr><td>
    <img id="image" src="images/login.png" align="middle"/>
    <br><br><br><br>
    </td></tr>
    <br><br><br><br>
    <tr><td>
	<!-- <h1 class="title">Login</h1> -->
	</td></tr>
	
	<form action="valid.html" method="post">
	<table align="center">
		<tr>
			<td class="field"></td>
			<td><input class="textbox" type="text" name="username" placeholder="Username"></td>
		</tr>
		<tr>
			<td class="field"></td>
			<td><input class="textbox" type="password" name="password" placeholder="Password"></td>
		</tr>
		<tr><td>
		<br>
		</td></tr>
		<tr>
			<td>&nbsp</td>
			<td align="center"><button class="button" type="submit">Login</button></td>
		</tr>
	
	</table>
	</form>
    </table>
	<c:if test="${param.message ne null}">
			<p class="error">${param.message}</p>
	</c:if>
</body>
</html>