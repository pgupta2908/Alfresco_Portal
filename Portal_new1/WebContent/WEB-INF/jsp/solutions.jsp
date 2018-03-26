<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>
<head>
<div class="right" align="right"><a href="logout.html">Logout</a></div>

</head>
<body>
	<h1 align="center">Solutions</h1>
	<table border="5">
		<tr>
			<td>PID:</td>
			<td>${pId}</td>
		</tr>
		<tr>
			<c:if test="${empty solutionList}">
							<p>No Solutions</p>
						</c:if> 
						<c:if test="${not empty solutionList}">

							<c:forEach items="${solutionList}" var="solution">
								<table border="5">

									<tr>
										<td>SolutionId:</td>
										<td>${solution.sId}</td>
									</tr>
									<tr>
										<td>Solution Description</td>
										<td><input type="textarea" rows="45" cols="5"
											name="description" placeholder="Description"
											value="${solution.sDescription }" /></td>
									</tr>
									<tr>

										<td><a href="viewSolution.html?sId=${solution.sId}">View Solution</a></td>
										<td><a href=vote.html>Vote</a></td>
									</tr>
								</table>
							</c:forEach>
						</c:if>
				</tr>
				</table>		
</body>

</html>