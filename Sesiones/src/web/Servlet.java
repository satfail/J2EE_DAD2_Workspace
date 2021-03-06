package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		//Regresa la sesion asociada con la petici�n
		// Si no existe se crea una nueva
		HttpSession sesion = request.getSession();
		String titulo = null;
		
		//Pedir el atributo 
		Integer contador = (Integer) sesion.getAttribute("contador");
		if (contador == null) {
			contador = 0;
			titulo="Bienvenido por Primera vez";
		}
		else {
			contador++;
			titulo="Bienvenido nuevamente";
		}
		
		//Agregamos el nuevo valor
		//Map(key,value)
		sesion.setAttribute("contador", contador);
		
		PrintWriter pw = response.getWriter();
		pw.print(titulo);
		pw.print("<br>");
		pw.print("Numero de Accesos : " + contador);
		pw.print("<br>");
		pw.print("ID de la sesion : " + sesion.getId());
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
