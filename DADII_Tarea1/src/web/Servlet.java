package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private int contador = 0;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter pWriter = response.getWriter();
		String usuario = request.getParameter("usuario");
		
		
		pWriter.println("<html>");pWriter.println("<head>");
		pWriter.println("<title> Resultado del Servlet");pWriter.println("</title>");
		pWriter.println("</head>");pWriter.println("<body>");
		pWriter.println("<h1> Parametros procesados por el Servlet</h1>");
		pWriter.println("<table border = '1'>");
		pWriter.println("<tr>");
		pWriter.println("<td>");pWriter.println("Bienvenido ! ");pWriter.println("</td>");
		pWriter.println("<td>");pWriter.println(usuario);pWriter.println("</td>");
		pWriter.println("</tr>");
		pWriter.println("</table>");pWriter.println("</body>");pWriter.println("</html>");
		
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		incremento();
		try {

			if(request.getParameter("RESET").equals("1")  )
				setContador(0);
		}catch (NullPointerException e) {
			System.out.println("No hay parámetro");
		}
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter pWriter = response.getWriter();
		pWriter.print("<br><br> Contador = ");
		pWriter.print(getContador());
		pWriter.print("<br><br>");
		pWriter.print("<a href='http://localhost:8080/DADII_Tarea1/index.html'>Volver</a>");
		pWriter.print("<br><br>");
		pWriter.print("<a href='http://localhost:8080/DADII_Tarea1/Servlet?RESET=1'>Resetear</a>");
		
		
		
	
	}
	private synchronized void incremento() {contador++;}
	
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
