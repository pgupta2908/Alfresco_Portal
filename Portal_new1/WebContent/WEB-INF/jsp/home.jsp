<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>

	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Discussion Portal</title>
		<link rel="stylesheet" href="css/index.css">	
		<style type="text/css">
		body{
			background-image: url("images/problemHome.jpg");
			background-size: 100%;
		}
.tabla{
			background-image: url("images/problem.jpg");
			background-size: 100%;
			float:left;
		}
		</style>
	</head>
	<body>

		<h1 class="title" align="center">HomePage</h1>
		<div class="field" align="right">
			<h3>Welcome ${username} !&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
			<a class="button" href="logout.html">Logout</a>
			</h3>
			
		</div>
		
		<br><br><br><br>
		
		
	
		<form action="addProblem.html">
			<input class="button" type="submit" value="Add new Problem">
		</form>
	
		<br>
		<br>
	
		<c:if test="${empty problemList}">
			<p>No List Found</p>
		</c:if>
	
		<c:if test="${not empty problemList}">

					<c:forEach items="${problemList}" var="problem">

							<table class="tabla" border="5">
								<tr>
									<td>Problemid:</td>
									<td>${problem.pId}</td>
								</tr>
	
								<tr>
									<td>Description</td>
									<td>${problem.pDescription}</td>
								</tr>
	
								<tr>
									<td>Start Date:</td>
									<td>${problem.sDate}</td>
								</tr>
	
								<tr>
									<td>End Date:</td>
									<td>${problem.eDate}</td>
								</tr>
	
								<%-- <tr>
								<td>
									<form action="leaderboard.html">
										<table>
											<tr>
												<td colspan="2">
													<button type="submit">Leaderboard</button>
												</td>
											</tr>
										</table>
									</form>
								</td>
	
								<td>
									<form action="viewProblem.html">
										<table>
											<tr>
												<td colspan="2">
													<button type="submit">View Problem</button>
												</td>
											</tr>
										</table>
									</form>
								</td>
							</tr> --%>
	
								<tr>
									<td><a class="minibutton" href=leaderBoard.html>LeaderBoard</a></td>
	
									<td><a class="minibutton" href="viewProblem.html?pId=${problem.pId}">View
											Problem</a></td>
								</tr>
								<tr>
									<td colspan="2"><a class="minibutton" href=solutions.html?pId=${problem.pId}>View
											All Solutions</a></td>
							</table>
					</c:forEach>
	
		</c:if>
	
		<br>
		<br>
	</body>
</html>

