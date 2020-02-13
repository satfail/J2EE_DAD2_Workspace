package edu.ucam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contador
 */
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Integer contador = new Integer(0);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Se incrementa el contador.
		contador = new Integer(contador.intValue() + 1);
		
		
		//Se env’a el nœmero.
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html>");
		pw.println("<head><title>Contador con sesion</title></head>");
		pw.println("Numero de veces: " + contador.intValue());
		pw.println("</html");
		
	}

}
