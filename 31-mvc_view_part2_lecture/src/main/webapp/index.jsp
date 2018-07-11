<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>MVC Views Part 2</title>
		
		<style>
			* {
				font-size: 14pt;
			}
		
			td {
				border: 1px solid black;
				padding: .5em;
			}
			
			code {
				color: red;
			}
		</style>
	</head>
	<body>
		<h1>MVC Views Part 2</h1>
		<table>
			<tr>
				<td><a href="nameList">Name List</a></td>
				<td>
				</td>
			</tr>
			<tr>
				<td><a href="personList">Person List</a></td>
				<td>
				</td>
			</tr>
			
			<tr>
				<td><a href="expressionLanguage.jsp">Expression Language</a></td>
				<td>
					Checkout <code>expressionLanguage.jsp</code> to assorted examples of 
					JSP EL syntax for Maps and Lists as well as examples of different 
					JSP variable scopes.
				</td>
			</tr>
				
		</table>
	</body>
</html>