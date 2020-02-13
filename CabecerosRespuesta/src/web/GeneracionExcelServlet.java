package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HolaServlet{
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		//Tipo de respuesta Un excel
		response.setContentType("application/vnd.ms-excel");
		//Como: Una descarga de un archivo excel
		response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
		//para un uso profesional de excel poi.apache.org
		
		//Para decir que no guarde caché,Expira -1 Inmediato
		//Esto lo haemos para generar un nuevo doc siempre
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Expires", "-1");
		
		//desplegamos la info al cliente
		PrintWriter pw = response.getWriter();
		pw.println("\tValores");pw.println("\t1");pw.println("\t2");
		pw.println("Total\t=SUMA(b2:b3) ");
		pw.close();
	}

}
