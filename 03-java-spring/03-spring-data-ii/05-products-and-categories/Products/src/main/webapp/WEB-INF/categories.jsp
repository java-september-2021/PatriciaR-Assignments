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
<h1>New Category!</h1>
<form:form action="/createCategory" method="Post" modelAttribute="Category">
	<p>
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</p>
	
	<input type="submit" value="submit"/>

</form:form>

<a href="/">Back to products!</a>
<h2>All Categories</h2>
<table>
    <thead>
        <tr>
            <th>Name</th>
            
            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${categories}" var="cat">
        <tr>
            <td><a href="/showcat/${cat.id}"><c:out value="${cat.name}"/></a></td>
           
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>