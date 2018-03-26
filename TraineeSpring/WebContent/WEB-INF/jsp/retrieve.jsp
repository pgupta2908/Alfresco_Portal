<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Retrieve Trainee</title>
<style type="text/css">
	body{
		background-color:#99CD4E;
	}
	h2{
		color:indigo;
		text-align:center;
	}
	p{
		color:blue;
		text-align:center;
	}
</style>
</head>
<body>
	<h2>Modify Operation</h2>
	<form action="getTrainee.html" method="post">
		<table align="center">
			<tr>
				<td>Please Enter Trainee ID: </td>
				<td><input type="text" name="traineeId"></td>
			</tr>
			<tr>
				<td>&nbsp</td>
				<td><input type="submit"
					  		value="retrieve">
				</td>
			</tr>
		</table>
	</form>
	<c:if test="${message ne null}">
			<div>
				<p>${message}</p>
			</div>
	</c:if>
	<h3>Trainee Details</h3>
		<c:if test="${trainee ne null}">
			<table align="center">
				<tr>
					<th>Trainee ID</th>
					<th>Trainee Name</th>
					<th>Domain</th>
					<th>Location</th>
				</tr>
				<tr>
					<td>${trainee.traineeId}</td>
					<td>${trainee.traineeName}</td>
					<td>${trainee.traineeDomain}</td>
					<td>${trainee.traineeLocation}</td>
				</tr>
			</table>
		</c:if>
		<a href="menu.html"><p>Home</p></a>
</body>
</html>