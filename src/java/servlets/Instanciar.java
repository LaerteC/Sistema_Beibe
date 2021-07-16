/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author laert
 */
public class Instanciar {

    public static Cliente Cliente(HttpServletRequest request) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Cliente aux = new Cliente();
        
        String s;

        s = request.getParameter("id");
        if (s != null && !s.isEmpty()) {
            try {
                aux.setId(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Instanciacao: Id do Cliente invalido");
            }
        }

        s = request.getParameter("nome");
        if (s != null && !s.isEmpty()) {
            aux.setNome(s);
        }
        
         s = request.getParameter("cpf");
        if (s != null && !s.isEmpty()) {
            aux.setCpf(s);
        }
        
         s = request.getParameter("email");
        if (s != null && !s.isEmpty()) {
            aux.setEmail(s);
        }
        
        
        s = request.getParameter("dataNasc");
        if (s != null && !s.isEmpty()) {
            try {
                aux.setDataNasc(sdf.parse(s));
            } catch (ParseException e) {
                System.out.println("Instanciacao: nascimento invalido");
            }
        }

        return aux;
    }
}
