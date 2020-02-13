package edu.ucam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecuperarParametros
 */
public class RecuperarParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Par‡metro recibido por URL
		String urlParam = request.getParameter("URL_PARAM");
		
		//Par‡metro recibido del formulario
		String postParam = request.getParameter("POST_PARAM");
		
		//Par‡metro recibido de la url del formulario
		String postUrlParam = request.getParameter("POST_URL_PARAM");
		
		//Se env’an los valores recibidos
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html>");
		pw.println("<head><title>Recuperar parametro</title></head>");
		pw.println("Par&aacute;metro URL: " + urlParam +"<br/>");
		pw.println("Par&aacute;metro formulario: " + postParam +"<br/>");
		pw.println("Par&aacute;metro URL formulario: " + postUrlParam +"<br/>");
		pw.println("Prueba a poner http://localhost:8080/VariableSesion/RecuperarParametros?URL_PARAM=2679");
		pw.println("</html");
		
	}

}
