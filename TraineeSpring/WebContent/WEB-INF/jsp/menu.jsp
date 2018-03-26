<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
<style type="text/css">
	body{
		background-color:#99CD4E;
	}
	h2{
		color:indigo;
		text-align:center;
	}
	p{
		color:yellow;
		text-align:center;
	}
</style>
</head>
<body>
	<h2>Trainee Management System</h2>
	<table align="center">
		<tr>
			<td><a href="insert.html"><p>Add a Trainee</p></a></td>
		</tr>
		<tr>
			<td><a href="delete.html"><p>Delete a Trainee</p></a></td>
		</tr>
		<tr>	
			<td><a href="modify.html"><p>Modify a Trainee</p></a></td>
		</tr>
		<tr>
			<td><a href="retrieve.html"><p>Retrieve a Trainee</p></a></td>
		</tr>
		<tr>
			<td><a href="viewall.html"><p>Retrieve all Trainees</p></a></td>
		</tr>		
	</table>
	<c:if test="${message ne null}">
			<div>
				<p>${message}</p>
			</div>
	</c:if>
</body>
</html>