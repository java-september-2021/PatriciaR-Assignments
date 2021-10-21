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

<h2>${product.name}</h2>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Categories</th>
            
        </tr>
    </thead>
    <tbody>
        
        <tr>
            <td><c:out value="${product.name}"/></td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td><c:forEach items="${prodAndCats}" var="cat">${cat.name}</c:forEach></td>
           
        </tr>
       
    </tbody>
    
    <form:form action="/addcattoprod/${product.id}" method="Post" modelAttribute="Product">
    <p>
    	
    	
        <form:select path="categories">
        <c:forEach items="${addablecategories}" var="cat">
        <option value="${cat.id}">${cat.name}</option>
        </c:forEach>
        </form:select>	
        </p>
        <p>
        <input type ="submit" value ="add">
        </p>
    
    </form:form>
</table>
</body>
</html>