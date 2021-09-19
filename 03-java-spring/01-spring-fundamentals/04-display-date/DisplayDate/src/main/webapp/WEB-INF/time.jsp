<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/time.js"></script>
<meta charset="ISO-8859-1">
<title>Time</title>
</head>
<body>
<p id= "time"><fmt:formatDate type = "time" timeStyle = "short" value = "${date}"/></p>
</body>
</html>