
<%@page import="org.eclipse.jdt.internal.compiler.ast.ThisReference"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- Agregamos una declaración la ! para declarar dentro de la
 clase del Servlet interno del JSP--%>
<%! 
	private String usuario = "Miguel";
	public String getUsuario(){
		return this.usuario;

	}
//Contador de Visitas
private int contadorVisitas = 1;

%>
<html>
	<head>
		<title>Uso de Declaraciones</title>
	</head>
	<body>
			<h1>Uso de Declaraciones</h1>
			Valor de usuario por medio de atributo :<%= this.usuario %>
			<br>
			Valor de usuario por medio del método :<%= this.getUsuario()%>
			<br>
			Contador de Visitas :  <%= this.contadorVisitas++ %>
	</body>
</html>