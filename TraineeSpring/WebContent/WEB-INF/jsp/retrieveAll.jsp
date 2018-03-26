<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Trainees</title>
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
<c:if test="${empty traineeList}">
	<p>No List Found</p>
	</c:if>
	<c:if test="${not empty '${traineeList}'}">
	<table align="center">
			<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Domain</th>
				<th>Location</th>
			</tr>
			<c:forEach items="${traineeList}" var="trainee">
			<tr>
				<td>${trainee.traineeId}</td>
				<td>${trainee.traineeName}</td>
				<td>${trainee.traineeDomain}</td>
				<td>${trainee.traineeLocation}</td>
			</tr>
	</c:forEach>
	</table>
	</c:if>
	<c:if test="${message ne null}">
			<div>
				<p>${message}</p>
			</div>
	</c:if>
	<a href="menu.html"><p>Home</p></a>
</body>
</html>