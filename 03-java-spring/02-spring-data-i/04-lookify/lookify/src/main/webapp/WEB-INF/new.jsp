<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new</title>
</head>
<body>
<form:form action="/add" method ="POST" modelAttribute="look">
	<p>
		<form:label path="title">Title</form:label>
		<form:errors path="title"/>
		<form:input path="title"/>
	</p>
	<p>
		<form:label path="artist">Artist</form:label>
		<form:errors path="artist"/>
		<form:input path="artist"/>
	</p>
	<p>
		<form:label path="rating">Rating</form:label>
		<form:errors path="rating"/>
		<form:input path="rating"/>
	</p>
	<input type="submit" value="Add Song"/>

</form:form>

<a href="/dashboard">Dashboard</a>
</body>
</html>