package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			
			//Procesamos el nuevo art�culo
			
			
			
			//Recuperamos el objeto HttpSession
			HttpSession sesion = request.getSession();
			
			//Lista de articulos agregados
			List<String> articulos = (List<String>)sesion.getAttribute("articulos");
			//Vemos si existe algun articulo si no init
			if(articulos == null) {
				articulos = new ArrayList<String>();
				sesion.setAttribute("articulos", articulos);
			}
			
			String articuloNuevo = request.getParameter("articulo");
			//Comprueba que no es nulo y esta vac�a(trim quita espacios izq derecha)
			//Como trabajamos con referencias, modifica la lista de la sesi�n
			if(articuloNuevo != null && !articuloNuevo.trim().equals(""))
				articulos.add(articuloNuevo);
			
			//Imprimir
			PrintWriter pw = response.getWriter();
			pw.print("<h1>Lista de Art�culos</h1><br>");
			
			for (String articulo : articulos) {
				pw.print("<li>" + articulo + "</li>");
			}
			pw.print("<br>");
			pw.print("<a href='/CarritoCompras'>Regresar al Inicio</a>");
			pw.close();
			
			
	}

}
