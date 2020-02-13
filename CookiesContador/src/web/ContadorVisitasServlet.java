package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContadorVisitasServlet
 */
@WebServlet("/Servlet")
public class ContadorVisitasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContadorVisitasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int contador = 0; 
		
		//ver si existen  cookies
		Cookie[] cookies =request.getCookies();
		if(cookies !=null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("contadorVisitas"))
					contador =Integer.parseInt(c.getValue()); 
			}
		}	
		contador++;
		//Agregamos a la respuesta al navegador
		Cookie galleta = new Cookie("contadorVisitas", Integer.toString(contador));
		//La cookie dura 1 Hora
		galleta.setMaxAge(3600);//3600 segundos
		response.addCookie(galleta);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.print("Contador Visitas de cada cliente : " + contador);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
