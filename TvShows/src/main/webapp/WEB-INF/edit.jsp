<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit ${show.id}</title>
</head>
<body>
<form:form method="POST" action="/edit/${show.id}" modelAttribute="show">
        <p>
        	<form:label path="title">Title</form:label>
        	<form:errors path="title"/>
            <form:input type="title" path="title"/>
        	
        </p>
        
        <p>
            <form:label path="network">Network</form:label>
            <form:errors path="network"/>
            <form:input type="network" path="network"/>
        </p>
        <p>
            <form:label path="description">Description</form:label>
            <form:errors path="description"/>
            <form:input type="description" path="description"/>
        </p>
        <input type="submit" value="Submit"/>
    </form:form>
    
    <p>
    <a href="/delete/${show.id}">Delete</a>
</body>
</html>