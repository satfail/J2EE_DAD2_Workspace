<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP con Scriptles</title>
	</head>
	<body>
		<h1>JSP con Scriptles</h1>
		<br>
		<%-- Scriptlet para enviar info al navegador --%>
		<% 
			out.print("Saludos desde un Scriptlet");
		%>
		<%-- Scriptlet para manejar Objetos --%>
		<% 
				String nombreAplicacion = request.getContextPath();
				out.print("Nombre app " + nombreAplicacion);
		%>
		
			<%-- Codigo Condicionado --%>
		<% 
				if(session != null && session.isNew()){
		%>
		
		la sesion es nueva
		
		<% 
				}
			else if(session != null){
		
	
		%>
		
		La sesión no es nueva
		
		<% }%>
					<%-- No es recomendable hacer este código--%>
				<br>
		<a href ="index.html">Inicio</a>
	</body>
</html>