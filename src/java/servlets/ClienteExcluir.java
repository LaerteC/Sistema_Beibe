/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Cliente;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servico.ClienteServico;
import servico.ServicoException;

/**
 *
 * @author laert
 */
@WebServlet("/cliente/excluir")
public class ClienteExcluir extends HttpServlet {

    	private static final long serialVersionUID = 1L;
                                            
	private static String DESTINO = "/ClienteTela/lista.jsp";
	
	private static String ERRO = "/publico/erro.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClienteServico cs = new ClienteServico();
		
		int cod = Integer.parseInt(request.getParameter("cod"));
		
		Cliente cli =  cs.buscarId(cod);
		
		
		try {
			
			cs.excluir(cli);
			
			List<Cliente> itens = cs.buscar();
			
			request.setAttribute("itens", itens);
			
			request.getRequestDispatcher(DESTINO).forward(request, response);

		} catch (ServicoException e) {
			request.setAttribute("msg", e.getMessage());

			request.getRequestDispatcher(ERRO).forward(request, response);

		} 
	}
}
