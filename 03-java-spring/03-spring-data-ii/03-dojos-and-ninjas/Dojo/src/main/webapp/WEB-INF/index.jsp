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

<h1>New Dojo</h1>
<form:form action="/newdojo" method="post" modelAttribute="Dojo">
	<p>
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</p>
	<input type="submit" value="submit"/>
	
</form:form>
<a href="/addNinja">Add a ninja!</a>
<h2>All Dojos</h2>
<table>
    <thead>
        <tr>
            <th>Location</th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${dojos}" var="dojo">
        <tr>
            <td><a href="/show/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
           
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>