<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="ISO-8859-1">
<title>New Person</title>
</head>
<body>
<a href="/newlic">New License</a>
<h1>New Person</h1>	

	<form:form action="/create" method="post" modelAttribute="Person">
    <p>
        <form:label path="first_name">First Name</form:label>
        <form:errors path="first_name"/>
        <form:input path="first_name"/>
    </p>
    <p>
        <form:label path="last_name">Last Name</form:label>
        <form:errors path="last_name"/>
        <form:input path="last_name"/>
    </p>
    
   
    <input type="submit" value="Submit"/>
</form:form>    

<h2>People</h2>

<p>
<c:forEach items="${person}" var ="persons">
<p>
${persons.first_name}
${persons.last_name}
</p>
</c:forEach>
</p>
</body>
</html>