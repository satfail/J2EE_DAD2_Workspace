import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesServlet")
public class CookiesServlet  extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//suponesmos que el usuario visita por primera vez el sitio web
		boolean nuevoUsuario = true;
		
		//Obtenemos Cookies
		//Contiene nombre y valor asociado 
		//Es como un map
		Cookie[] cookies = request.getCookies();
		
		//Buscamos si existe alguna Cookie creada con anterioridad
		if(cookies != null) {
			
			for(Cookie c : cookies) {
				
				if(c.getName().equals("visitanteRecurrente")
						&& c.getValue().equals("si")) {
					//Si ya existe es que lo tenemos
					nuevoUsuario = false;
				}
			}
		}
		String mensaje = null;
		if (nuevoUsuario) {
			Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
			response.addCookie(visitanteCookie);
			mensaje = "Gracias por visitar nuestro sitio por primera vez";
		}else {
			
			mensaje = "Hola de nuevo";
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.print("Mensaje " + mensaje);
		pw.close();
		
		
	}

}
