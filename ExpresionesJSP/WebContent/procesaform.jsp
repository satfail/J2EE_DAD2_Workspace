<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
		<title>Procesa Formulario</title>
	</head>
	<body>
		<h1>Procesa Formulario</h1>
		Usuario : <%= request.getParameter("usuario") %>
		<br>
		Password : <%= request.getParameter("password") %>
		<br><br>
		<a href="index.html">Volver</a>

	</body>
</html>