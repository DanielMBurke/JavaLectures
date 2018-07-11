<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<ol>
			<c:forEach var="name" items="${requestScope.nameList}">
			<%--var = name variable DOESN'T NEED $ and
			 items is the list called DOES NEED $ TO GET VALUES OF LIST--%>
				<li><c:out value="${name}"/></li>
			</c:forEach>
		</ol>
	</body>
</html>