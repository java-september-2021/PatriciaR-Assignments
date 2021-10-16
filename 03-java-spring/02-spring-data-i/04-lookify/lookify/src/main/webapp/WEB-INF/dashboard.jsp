<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<div class ="dashtop">
<a href="/new">Add New</a>
<a href="/top">Top Ten</a>
<form:form action="/search" method ="POST" modelAttribute="searchInput">
	<form:label path ="artist">Search</form:label>
	<form:errors path="artist"/>
	<form:input path="artist"/>
	<input type ="submit" value ="search"/>
	</form:form>

</div>

<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items = "${look}" var ="look">
		<tr>
			<td><a href="/details/${look.id}"><c:out value="${look.title}"/></a></td>
			<td><c:out value="${look.rating}"/></td>
			<td><a href="/delete/${look.id}">Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>


</body>
</html>