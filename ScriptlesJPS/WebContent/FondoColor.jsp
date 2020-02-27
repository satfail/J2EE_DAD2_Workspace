<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
		<%-- Recuperamos el parametro --%>
		<% 
			String fondo = request.getParameter("colorFondo");
			if( fondo == null || fondo.trim().equals("")){
				fondo ="white";
			}
		%>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSP cambio de fondo</title>
	</head>
	<body bgcolor= "<%=fondo %>">
		<h1>JSP cambio de fondo</h1>
		<br>
		Color de fondo aplicado <%=fondo %>
		<br>
		<a href ="index.html">Inicio</a>
	</body>
</html>