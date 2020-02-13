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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter pWriter = response.getWriter();
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		String[] tecnologias = request.getParameterValues("tecnologia");//Se puede sel + de 1
		String genero = request.getParameter("genero");
		String ocupacion = request.getParameter("ocupacion");
		String[] musicas = request.getParameterValues("musica");
		String comentario = request.getParameter("comentarios");
		
		pWriter.println("<html>");pWriter.println("<head>");
		pWriter.println("<title> Resultado del Servlet");pWriter.println("</title>");
		pWriter.println("</head>");pWriter.println("<body>");
		pWriter.println("<h1> Parametros procesados por el Servlet :");
		pWriter.println("<table border = '1'>");
		pWriter.println("<tr>");
		pWriter.println("<td>");pWriter.println("Usuario");pWriter.println("</td>");
		pWriter.println("<td>");pWriter.println(usuario);pWriter.println("</td>");
		pWriter.println("</tr>");
		pWriter.println("<tr>");
		pWriter.println("<td>");pWriter.println("Password");pWriter.println("</td>");
		pWriter.println("<td>");pWriter.println(password);pWriter.println("</td>");
		pWriter.println("</tr>");
		
		pWriter.println("<tr>");pWriter.println("<td>");
		pWriter.println("Tecnologias");pWriter.println("</td>");
		pWriter.println("<td>");
		
		for(String tecnologia : tecnologias) {
			pWriter.println(tecnologia);
			pWriter.println(" / ");
		}		
		pWriter.println("</td>");pWriter.println("</tr>");
		
		pWriter.println("<tr>");
		pWriter.println("<td>");pWriter.println("Genero");pWriter.println("</td>");
		pWriter.println("<td>");pWriter.println(genero);pWriter.println("</td>");
		pWriter.println("</tr>");
		
		
		pWriter.println("<tr>");
		pWriter.println("<td>");pWriter.println("Ocupacion");pWriter.println("</td>");
		pWriter.println("<td>");pWriter.println(ocupacion);pWriter.println("</td>");
		pWriter.println("</tr>");
		
		pWriter.println("<tr>");
		pWriter.println("<td>");pWriter.println("Musica");pWriter.println("</td>");
		pWriter.println("<td>");		
		if(musicas != null) {
			for(String musica : musicas) {
				pWriter.println(musica);
				pWriter.println(" / ");
			}	
		}
		else {
			pWriter.println("void");
		}
		pWriter.println("</td>");pWriter.println("</tr>");
		
		pWriter.println("<tr>");
		pWriter.println("<td>");pWriter.println("Comentario");pWriter.println("</td>");
		pWriter.println("<td>");pWriter.println(comentario);pWriter.println("</td>");
		pWriter.println("</tr>");
		pWriter.println("</table>");pWriter.println("</body>");pWriter.println("</html>");
	}

}
