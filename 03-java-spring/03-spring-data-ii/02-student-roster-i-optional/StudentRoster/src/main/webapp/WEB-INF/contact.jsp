<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
</head>
<body>
<form:form action="/createContact" method="post" modelAttribute="Contact">
    <p>
    	
        <form:select path="student">
        <c:forEach items="${students}" var="student">
        <option value="${student.id}">${student.first} ${student.last}</option>
        </c:forEach>
        </form:select>	
    </p>
    <p>
        <form:label path="address">Address</form:label>
        <form:errors path="address"/>
        <form:input path="address"/>		
    </p>
   <p>
        <form:label path="city">City</form:label>
        <form:errors path="city"/>
        <form:input path="city"/>		
    </p>
    
    <p>
        <form:label path="state">State</form:label>
        <form:errors path="state"/>
        <form:input path="state"/>		
    </p>
    <input type="submit" value="Submit"/>
</form:form>    
<c:forEach items="${contacts}" var ="contact">
<p>
${contact.student.first}
${contact.student.last}
${contact.address}
${contact.state}
${contact.city}

</p>
</c:forEach>
</body>
</html>