<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
<h1>New Product</h1>

<form:form action="/createProduct" method="Post" modelAttribute="Product">
	<p>
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</p>
	<p>
	<form:label path="description">Description</form:label>
	<form:errors path="description"/>
	<form:input path="description"/>
	</p>
	<p>
	<form:label path="price">price</form:label>
	<form:errors path="price"/>
	<form:input path="price"/>
	</p>
	<input type="submit" value="submit"/>

</form:form>

<a href="/addCategory">Add a Category</a>
<h2>All Products</h2>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${products}" var="prod">
        <tr>
            <td><a href="/showprod/${prod.id}"><c:out value="${prod.name}"/></a></td>
            <td>${prod.description}</td>
            <td>${prod.price}</td>
           
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>