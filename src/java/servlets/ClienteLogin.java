/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.UsuarioDao;
import dominio.LoginBean;
import dominio.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author laert
 */
                
@WebServlet("/cliente/login")
public class ClienteLogin extends HttpServlet {

       protected void processRequest(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException, SQLException {

        // Ajustar configuração charset de entrada
        request.setCharacterEncoding("UTF-8");

        // Capturar dados de acesso da Tela Login
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        // Validar se usuário está logado
        if (login == null && senha == null && request.getSession(false) != null) {
            response.sendRedirect("portal.jsp");
            return;
        }

        // Validar credenciais e efetuar login
        Usuario usuario;
        if (login != null && senha != null) {
            usuario = UsuarioDao.validar(login, senha);
            if (usuario != null) {
                LoginBean bean = new LoginBean();
                bean.setIdUsuario(usuario.getId());
                bean.setLoginUsuario(usuario.getLogin());
                bean.setNomeUsuario(usuario.getNome());
                request.getSession().setAttribute("login", bean);
                response.sendRedirect("portal.jsp");
                return;
            }
        }

        // Em caso de erro, exibir view de erro
        request.setAttribute("msg", "Você digitou algo Errado!");
        request.setAttribute("cor", "danger");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
       
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
