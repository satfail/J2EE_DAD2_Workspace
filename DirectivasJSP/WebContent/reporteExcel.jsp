<%@page import="utils.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%-- Dentro de Web inf para que no sea accesible la gestión de erroes --%>
<%@page errorPage="/WEB-INF/ManejoErrores.jsp" %>
<%
	String nombreArchivo= "reporte.xls";
	response.setHeader("Content-Disposition", "inline;filename="+nombreArchivo);
	

%>
<!DOCTYPE html>
<html>
	<head>
	
		<title>Reporte Excel</title>
		</head>
	<body>
			<h1>Reporte Excel</h1>
			<br>
			<table border="1">
				<tr>
					<th>Curso</th>
					<th>Descripción</th>
					<th>Fecha</th>
				</tr>
				
				<tr>
					<td>1 . Fundamentos de Java</td>
					<td>Aprendemos la sintaxis de Java</td>
					<td><%= Conversiones.format(new Date()) %></td>
				</tr>
				
				
				<tr>
					<td>2 . Programación con Java</td>
					<td>Pondremos en práctica conceptos de Java</td>
					<td><%= Conversiones.format(new Date()) %></td>
				</tr>
			</table>
	
	</body>
</html>