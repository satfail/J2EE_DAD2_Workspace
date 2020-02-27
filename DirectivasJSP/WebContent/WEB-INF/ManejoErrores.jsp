<%@ page isErrorPage="true"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Manejo de Errores</title>
	</head>
	<body>
	
				<h1>Manejo de Errores</h1>
				Ocurrio una excepción : <%exception.getMessage(); %>
				
				<%-- No agrega formato --%>
				<textarea rows="30" cols="30">
				

				<% exception.printStackTrace(new PrintWriter(out)); %>
				
				</textarea>
	
	</body>
</html>