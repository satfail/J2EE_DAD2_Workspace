<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
		<title>JSP con expresiones</title>
	</head>
	<body>
		<h1>JSP con expresiones</h1>
		Concatenar:
		<%= "Saludos " + "JSP" %>
		<br>
		Multiplicando con java: <%= 2*3 %>
		<br>
		Session id: <%= session.getId() %>
		<br>
		<br>
		<a href="index.html">Volver</a>
		
	</body>
</html>