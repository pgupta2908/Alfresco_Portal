<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" href="css/index.css">
<style type="text/css">
	body{
		background-image: url("images/problem.jpg");
		background-size: 100%;
	}
	.tabla{
	background-image: url("images/problem.jpg");
	background-size: 100%;
	}
	</style>
</head>

<body>
	<div align="right">
	<div class="button"><a href="logout.html">Logout</a></div>
	</div>
	<form:form action="addSol.html" method="post" modelAttribute="solution">

		<h1 class="title" align="center">Upload Solutions</h1>
		<table class="tabla" border="5" align="center">
			<tr>
				<td class="field">PID <br> <br>
				</td>
				<td><input class="textbox" type="text" name="pId" value="${pId}" readonly/></td>
			</tr>
			<tr>
				<td class="field">EmployeeId <br> <br>
				</td>
				<td><input class="textbox" type="text" name="empId" value="${empId}" readonly/></td>
			</tr>
			
			<!-- <textarea class="textbox" name="pDescription" id="pDescription" cols="15" rows="5" required></textarea> -->
			
			<tr>	
				<td class="field">SolutionDescription:<br></td>
				<td><textarea class="textbox" name="sDescription" id="sDescription" cols="25" rows="10" required></textarea> <br>
					<br></td>
			</tr>
			<tr>
				<td class="field">SolutionContent:<br></td>
				<td><textarea class="textbox" name="sContent" id="sContent" cols="25" rows="10" required></textarea> <br>
					<br></td>
			</tr>
			<tr>
				<td class="field">Link:</td>
				<td><input class="textbox" type="text" name="sLink" id="sLink" placeholder="addLink" required/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input class="button" type="submit" value="Upload" /></td>
			</tr>
			
		</table>
	</form:form>
		<div align="center">
	<c:if test="${message ne null}">
			<h1 class="error">${message}</h1>
			<h1 class="error">${sId}</h1>
	</c:if>
			<a class="button" href="home.html">Home</a>
			<a class="button" href="viewSolution.html?sId=${sId}">view</a>
		</div>
	
</body>

</html>