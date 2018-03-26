<html>
<head>
<div class="right" align="right"><a href="logout.html">Logout</a></div>

</head>

<body>
	<h1 align="center">View Solutions</h1>
	<table border="5" align="center">
		<tr>
			<td>ProblemID: </td>
			<td>${solution.pId}</td>
		</tr>
		<tr>
			<td>SolutionID: </td>
			<td>${solution.sId}</td>
		</tr>

		<tr>
			<td>SolutionDescription:<br></td>
			<td>${solution.sDescription}<br>
			</td>
		</tr>
		<tr>
			<td>SolutionContent:<br></td>
			<td>${solution.sContent}<br>
			</td>
		</tr>
		<tr>
			<td>Link: </td>
			<td>${solution.sLink}</td>
		</tr>

		<tr>
			<!-- <td><a href="">Link</a></td> -->

			<td colspan="2" align="center"><input type="button" value="Vote" /></td>
		</tr>
	</table>
</body>

</html>