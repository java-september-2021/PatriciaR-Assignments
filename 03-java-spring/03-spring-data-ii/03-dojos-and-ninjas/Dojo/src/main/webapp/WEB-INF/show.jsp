<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>${dojo.name} location Ninjas</h1>
<c:forEach items="${ninja}" var ="ninja">
<p>
${ninja.firstName}
${ninja.lastName}
${ninja.age}


</p>
</c:forEach>
</body>
</html>