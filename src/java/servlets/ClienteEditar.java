/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servico.ClienteServico;

/**
 *
 * @author laert
 */
@WebServlet("/cliente/editar")
public class ClienteEditar extends HttpServlet {

 private static String DESTINO = "/ClienteTela/formEditar.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		int cod = Integer.parseInt(request.getParameter("id"));
		
		
				
		ClienteServico cs = new ClienteServico();
		
		Cliente cliente =  cs.buscarId(cod);
		
		
		
		request.setAttribute("item", cliente);

		request.getRequestDispatcher(DESTINO).forward(request, response);

	}
}
