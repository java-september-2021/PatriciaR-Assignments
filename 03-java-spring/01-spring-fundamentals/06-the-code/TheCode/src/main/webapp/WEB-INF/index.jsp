<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class = "wrapper">
<p>${errors}</p>
 <form action ="/secret" method = POST>
 	<label for ="code">What is the code</label>
 	<input type ="text" name ="code">
 	<input type="submit" value="Try Code">
 </form>
 </div>
</body>
</html>