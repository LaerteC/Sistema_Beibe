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

/**
 *
 * @author laert
 */
@WebServlet("/cliente/listar")
public class ClienteListar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/ClienteTela/lista.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ClienteServico cs = new ClienteServico();
		List<Cliente> itens = cs.buscar();
		request.setAttribute("itens", itens);

		request.getRequestDispatcher(DESTINO).forward(request, response);

	}
}
