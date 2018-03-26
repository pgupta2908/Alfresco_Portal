<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>View Problem</title>
<link rel="stylesheet" href="css/index.css">	
		<style type="text/css">
		body{
			background-image: url("images/problemBackground.jpg");
			background-size: 100%;
		}
		.tabla{
			background-image: url("images/problem2.jpg");
			background-size: 100%;
		}
		</style>
</head>

<body>
<div align="right"><a class="button" href="logout.html">Logout</a></div>
	<h1 class="title" align="center">View Problem</h1>
	<a href="leaderBoard.html">LeaderBoard </a>
	<form:form action="addSolution.html" method="post">
		<table border="5" align="center">

			<tr>

				<td>ProblemID </td>
				<td>${problem.pId}</td>
			</tr>
			<tr>
				<td>ProblemDescription:<br></td>
				<td>${problem.pDescription}<br>
				</td>
			</tr>
			<tr>
				<td>ProblemContent:<br></td>
				<td>${problem.pContent}<br>
				</td>
			</tr>
			<tr>
				<td>Start Date:</td>
				<td>${problem.sDate}</td>
			</tr>

			<tr>
				<td>End Date:</td>
				<td>${problem.eDate}</td>
			</tr>
			<br>
			<br>
			<tr>
				<td>No. of Solutions :<br></td>
				<td>solution count <br>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<button type="submit">AddSolution</button>
				<input type="hidden" name="pId" value="${problem.pId}"/>
				<input type="hidden" name="empId" value="${problem.empId}"/>
				</td>
			</tr>
			
		</table>
	</form:form>
</body>

</html>