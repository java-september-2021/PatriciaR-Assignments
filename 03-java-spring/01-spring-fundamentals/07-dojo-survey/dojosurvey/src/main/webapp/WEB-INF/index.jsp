<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<h1>Dojo Survey</h1>
    <form action="/showdata" method="POST">
        
        <label for="your_name">Your Name:</label>
        <input type="text" name="your_name">
        <p>Dojo Location
            <select name="location">
                <option value ="West Coast">West Coast</option>
                <option value="East Coast">East Coast</option>
                <option value="Mid-West">Mid-West</option>
            </select>
        </p>
        <p>Favorite Language
            <select name="lang">
                <option value="python">Python</option>
                <option value="Java">Java</option>
            </select>
        </p>
        <p>Comments</p>
            <p> <textarea name="comments"></textarea>
        </p>

        <input type="submit">
        </form>
</body>
</html>