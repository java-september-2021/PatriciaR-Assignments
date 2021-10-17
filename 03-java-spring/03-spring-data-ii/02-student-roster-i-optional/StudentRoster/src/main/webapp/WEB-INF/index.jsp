<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students!</title>
</head>
<body>

<a href="/addContact">Add contact info</a>
<h1>New Student</h1>	

	<form:form action="/create" method="post" modelAttribute="Student">
    <p>
        <form:label path="first">First Name</form:label>
        <form:errors path="first"/>
        <form:input path="first"/>
    </p>
    <p>
        <form:label path="last">Last Name</form:label>
        <form:errors path="last"/>
        <form:input path="last"/>
    </p>
    <p>
    	<form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </p>
    
   
    <input type="submit" value="Submit"/>
</form:form>    

<c:forEach items="${students}" var="student">
<p>
${student.first}
${student.last}
${student.age}
</p>
</c:forEach>
</body>
</html>