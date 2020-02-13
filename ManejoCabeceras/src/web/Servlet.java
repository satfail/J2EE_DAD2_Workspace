package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		String metodoHttp = request.getMethod();
		
		pw.print("<html>");pw.print("<head>");
		pw.print("<title>Headers Http </title>");pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1> Headers Http <br></h1>");
		pw.print("Metodo Http: " + metodoHttp + "<br>");
		String url = request.getRequestURI();
		pw.print("Metodo Url: " + url + "<br>");
		//Todos los cabeceros
		Enumeration cabeceros = request.getHeaderNames();
		pw.print("<br>");pw.print("<br>");
		while(cabeceros.hasMoreElements()) {
			String nombreCabecero = (String) cabeceros.nextElement();
			pw.print("<b> " + nombreCabecero + "</b>");
			pw.print(request.getHeader(nombreCabecero));
			pw.print("<br>");
		}
		pw.print("</body>");	pw.print("</html>");
		pw.close();
		
		
	}

}
