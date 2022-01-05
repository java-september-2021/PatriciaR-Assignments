<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${show.title}</title>
</head>
<body>
<h1>${show.title}</h1>
Posted by: ${show.getUser().getName()}
<p>
Network: ${show.network}
</p>
<p>
Description: ${show.description}
<p>
<a href="/shows"">Back to Dashboard</a>
</p>
<p>
<a href="/edit/${show.id}">Edit</a>
</p>
</body>
</html>