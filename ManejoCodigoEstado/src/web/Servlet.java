package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Simular los valores correctos
		String usuariook  = "Juan";
		String passwordok = "123";
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		if(usuariook.equals(usuario) && passwordok.equals(password)) {
			
			pw.print("<h1>");
			pw.print("Datos correctos" );
			pw.print("<br> Usuario : " + usuario);
			pw.print("<br> Password : " + password);
			pw.print("</h1>");
		}else {
			response.sendError(response.SC_UNAUTHORIZED,"Las credenciales son incorrectas");
		}
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
