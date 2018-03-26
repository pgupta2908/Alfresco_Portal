<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Trainee</title>
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
	<form action="update.html" method="post">
		<table align="center">
			<tr>
				<td>Please Enter Trainee ID: </td>
				<td><input type="text" name="traineeId"></td>
			</tr>
			<tr>
				<td>&nbsp</td>
				<td><input type="submit"
					  		value="Confirm Update">
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
		<form:form action="confirmUpdate.html" modelAttribute="trainee" method="post" >
			<table align="center">
				<tr>
					<td>Trainee Id</td>
					<td><form:input path="traineeId" value="${trainee.traineeId}" readOnly="true"/></td>
				</tr>
				<tr>
					<td>Trainee Name</td>
					<td><form:input path="traineeName" value="${trainee.traineeName}"/></td>
				</tr>
				<tr>
					<td>Trainee Domain</td>
					<td><form:input path="traineeDomain" value="${trainee.traineeDomain}"/></td>
				</tr>
				<tr>
					<td>Trainee Location</td>
					<td><form:input path="traineeLocation" value="${trainee.traineeLocation }"/></td>
				</tr>
				<tr>
					<td><form:button type="submit">Update</form:button>
				</tr>
			</table>
		</form:form>
		</c:if>
</body>
</html>