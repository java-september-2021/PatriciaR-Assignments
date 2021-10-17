<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/createlic" method="post" modelAttribute="Lic">
    <p>
    	
        <form:select path="person">
        <c:forEach items="${persons}" var="person">
        <option value="${person.id}">${person.first_name} ${person.last_name}</option>
        </c:forEach>
        </form:select>
    </p>
    <p>
        <form:label path="state">State</form:label>
        <form:errors path="state"/>
        <form:input path="state"/>		
    </p>
    <p>
    	<form:label path="expiration_date">Date</form:label>
    	<form:errors path="expiration_date"/>
    	<form:input type="date" path="expiration_date"/>
    	
    	
    </p>
   
    <input type="submit" value="Submit"/>
</form:form>    

<c:forEach items="${lics}" var ="lic">
<p>
${lic.person.first_name}
${lic.person.last_name}
${lic.state}
${lic.getNumber()}

</p>
</c:forEach>
</body>
</html>