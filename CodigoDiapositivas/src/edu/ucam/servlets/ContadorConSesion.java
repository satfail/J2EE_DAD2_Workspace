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
public class ContadorConSesion extends HttpServlet {
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
		//Se recupera la variable almacenada en la sesi�n. Para acceder a la sesi�n se utiliza el m�todo
		//getSession de la clase HttpServletRequest.
		Integer contador = (Integer) request.getSession().getAttribute("ATR_CONTADOR");
		
		//Si es la primera vez que se ejecuta en esta sesi�n se crea un nuevo objeto.
		if (contador == null){
			contador =  new Integer(0);
		}
		
		//Se incrementa el contador.
		contador = new Integer(contador.intValue() + 1);
		
		//Se vuelve guarda el nuevo objeto en la sesi�n y as� no acceder al antiguo en peticiones posteriores.
		request.getSession().setAttribute("ATR_CONTADOR", contador);
		
		
		//Se env�a el n�mero.
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html>");
		pw.println("<head><title>Contador con sesion</title></head>");
		pw.println("Numero de veces: " + contador.intValue());
		pw.println("</html");
		
	}

}
