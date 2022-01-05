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

<h1>Total Gold ${total}</h1>
<div id ="wrapper">
<div class ="build">
	<form action ="/findgold" method = POST>
		<h2>Farm</h2>
		
		<input type ="hidden" name= "building" value ="farm">
		<p>(Earns 10-20 gold)</p>
		<input type = "submit" value ="Find Gold!">
	</form>
</div>

<div class ="build">
	<form action ="/findgold" method = POST>
		<h2>Cave</h2>
		
		<input type ="hidden" name= "building" value ="cave">
		<p>(Earns 5-10 gold)</p>
		<input type = "submit" value ="Find Gold!">
	</form>
</div>
<div class ="build">
	<form action ="/findgold" method = POST>
		<h2>House</h2>
		
		<input type ="hidden" name= "building" value ="house">
		<p>(Earns 2-5 gold)</p>
		<input type = "submit" value ="Find Gold!">
	</form>
</div>
<div class ="build">
	<form action ="/findgold" method = POST>
		<h2>Casino!</h2>
		
		<input type ="hidden" name= "building" value ="casino">
		<p>(Earns 10-20 gold)</p>
		<input type = "submit" value ="Find Gold!">
	</form>
</div>
</div>
</body>
</html>