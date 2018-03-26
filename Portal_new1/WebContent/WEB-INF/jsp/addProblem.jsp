<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Add a Problem</title>
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
	<form:form action="addProb.html" method="post" modelAttribute="problem">
	<h1 class="title" align="center">Add Problem</h1>
	<table class="tabla" border="5" align="center">
		
		<tr>
			<td class="field" align="center">EmployeeID:</td>
			<td><input class="textbox" name="empId" id="empId" type="text"/></td>
			<br>
		</tr>
		<tr>
			<td class="field">ProblemDescription:<br></td>
			<td><textarea class="textbox" name="pDescription" id="pDescription" cols="15" rows="5" required></textarea> <br>
			<br></td>
		</tr>
		<tr>
			<td class="field">Start Date:<br></td>
			<td><input class="textbox" name="sDate" type="date" required/> <br>
			<br></td>
		</tr>
		<tr>
			<td class="field">End Date:<br></td>
			<td><input class="textbox" name="eDate"  type="date" required/> <br>
			<br></td>
		</tr>
		<tr>
			<td class="field">ProblemContent:<br></td>
			<td><textarea class="textbox" name="pContent" id="pContent" cols="15" rows="5" required></textarea> <br>
			<br></td>
		</tr>
		<br>
		<br>

		
			
		
	</table>
	<div align="center"><button  class="button" type="submit">Upload</button></div>
	</form:form>
	
	<c:if test="${message ne null}">
			<div align="center">
				<h1 class="error">${message}</h1>
				<a class="button" href="home.html">Home</a>
			</div>
			
		</c:if>
</body>

</html>