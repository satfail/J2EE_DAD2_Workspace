
<%-- Esto es una directiva java, tipo html
page : incluir archivos (tiene atributos contenttype,pageencoding..)
taglib para añadir librerias --%>

<%-- He tenido que pasar a MavenProject click derecho->configure
en pom añado dependencias y con click derecho maven-update --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		
		<title>Hola Mundo JSP</title>
	</head>
	<body>
	<h1>Hola Mundo JSP</h1>
	<ul>
			<%-- Dentro va codigo java hay algunas variables disponibles --%>
			<li> <% out.print("Hola Mundo con Scriptles");%></li>
			<li>${"Hola Mundo con Expression Lenguage (EL)" }</li>
			<li><%= "Uso de out sin tocar la variable, Usado con Expresiones " %></li>
			<li><c:out value="Hola mundo con jstl"/> </li>
	</ul>
	</body>
</html>