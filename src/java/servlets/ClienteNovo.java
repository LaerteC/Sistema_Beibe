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

/**
 *
 * @author laert
 */
@WebServlet("/cliente/novo")
public class ClienteNovo extends HttpServlet {

   private static final long serialVersionUID = 1L;
                                           
	private static String DESTINO = "/ClienteTela/formInserir.jsp";

   @Override
    	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		request.setAttribute("item", new Cliente());

		request.getRequestDispatcher(DESTINO).forward(request, response);

	}
}
