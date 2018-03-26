<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Trainee</title>
<style type="text/css">
	body{
		background-color:#99CD4E;
	}
	h2{
		color:indigo;
		text-align:center;
	}
	td{
		color: black;
	}
</style>
</head>
<body>
	<h2>Enter Trainee Details</h2>
	<form:form action="save.html" method="post" modelAttribute="trainee">
		<table align="center">
			<%-- <tr>
				<td>Trainee Id</td>
				<td><form:input path="traineeId"></form:input></td>
			</tr> --%>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName"></form:input>
				<td><form:errors path="traineeName"></form:errors></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td>
					<form:radiobutton path="traineeLocation" value="Chennai"/>Chennai
					<form:radiobutton path="traineeLocation" value="Bangalore"/>Bangalore
					<form:radiobutton path="traineeLocation" value="Pune"/>Pune
					<form:radiobutton path="traineeLocation" value="Mumbai"/>Mumbai
				</td>
				<td><form:errors path="traineeLocation"></form:errors></td>
				</tr>
				<tr>
					<td>Trainee Domain </td>
					<td>
						<form:select path="traineeDomain">
							<form:option value="JEE">JEE</form:option>
							<form:option value=".NET">.NET</form:option>
							<form:option value="Oracle Apps">Oracle Apps</form:option>
							<form:option value="SAP">SAP</form:option>
						</form:select>
					</td>
					<td><form:errors path="traineeDomain"></form:errors></td>
				</tr>
				<tr>
					<td>&nbsp</td>
					<td><form:button type="submit">Add Trainee</form:button></td>
				</tr>
		</table>
	</form:form>
	
</body>
</html>