/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servico.ClienteServico;
import servico.ServicoException;
import servico.ValidacaoException;

/**
 *
 * @author laert
 */
@WebServlet("/cliente/atualizar")
public class ClienteAtualizar extends HttpServlet {

    private static final long serialVersionUID = 1L;
                                           
	private static String DESTINO = "/ClienteTela/lista.jsp";

	private static String ERRO = "/publico/erro.jsp";
	
	private static String FORM = "/ClienteTela/formEditar.jsp";
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClienteServico cs = new ClienteServico();

		Cliente x = Instanciar.Cliente(request);
		try {

			//cliente.validar(x);
			cs.atualizar(x);

			List<Cliente> itens = cs.buscar();
			request.setAttribute("itens", itens);
			request.getRequestDispatcher(DESTINO).forward(request, response);

		} catch (ServicoException e) {
			request.setAttribute("msg", e.getMessage());

			request.getRequestDispatcher(ERRO).forward(request, response);

		} 

	}
}
