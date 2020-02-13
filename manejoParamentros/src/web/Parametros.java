package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name ="Servlet", urlPatterns = "/Servlet")
public class Parametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Parametros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Metodo no sorportado por el Servlet*/
		/* Si no es info sensible se puede hacer por aqui
		 * esto se ve en la url por eso no es seguro mandar el pass por aqui
		 */
		PrintWriter pWriter = response.getWriter();
		pWriter.println("<html>");
		pWriter.println("<body>");
		pWriter.println("Metodo no soportado por el Servlet");
		pWriter.println("</body>");pWriter.println("</html>");
		pWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Leemos los parametros del form
		//viene por tipo GET
		// form = post
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
	
		System.out.println("usuario : " + usuario);
		System.out.println("password : " + password); // Log del servidor
		
		PrintWriter  pWriter = response.getWriter(); // va al navegadorWeb
		pWriter.println("<html>");
		pWriter.println("<body>");
		pWriter.println("Usuario es : " + usuario);
		pWriter.println("Password es : " + password);
		pWriter.println("</body>");pWriter.println("</html>");
		pWriter.close();
	}

}
