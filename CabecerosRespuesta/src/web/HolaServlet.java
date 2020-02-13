package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HolaServlet")
public class HolaServlet extends HttpServlet {
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		//resfreca cada 1 sec
		response.setHeader("refresh", "1");
		Date fecha = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualzada' HH:mm:ss");
		String horaconformato = formateador.format(fecha);
		PrintWriter pw = response.getWriter();
		pw.print("Hora actualizada : " + horaconformato);
		pw.close();
		
	}

}
