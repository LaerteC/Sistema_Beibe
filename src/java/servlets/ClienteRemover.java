/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Cliente;
import java.io.IOException;
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
@WebServlet("/cliente/remover")
public class ClienteRemover extends HttpServlet {

   private static final long serialVersionUID = 1L;
                                                
	private static final String DESTINO = "/ClienteTela/confirmarExclusao.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		ClienteServico as = new ClienteServico();
		
		int cod = Integer.parseInt(request.getParameter("id"));
                
                
		
		
		Cliente cliente =  as.buscarId(cod);
		
		
		request.setAttribute("item", cliente);

		request.getRequestDispatcher(DESTINO).forward(request, response);

	}
}
