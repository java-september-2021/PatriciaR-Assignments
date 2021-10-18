<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/createNinja" method="post" modelAttribute="Ninja">
    <p>
    	
        <form:select path="Dojo">
        <c:forEach items="${dojos}" var="dojo">
        <option value="${dojo.id}">${dojo.name}</option>
        </c:forEach>
        </form:select>	
    </p>
    <p>
        <form:label path="firstName">First Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>		
    </p>
   <p>
        <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>		
    </p>
    
    <p>
        <form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>		
    </p>
    <input type="submit" value="Submit"/>
	</form:form>    
	
	
<c:forEach items="${ninjas}" var ="ninja">
<p>
${ninja.dojo.name}
${ninja.firstName}
${ninja.lastName}
${ninja.age}

</p>
</c:forEach> 
</body>
</html>