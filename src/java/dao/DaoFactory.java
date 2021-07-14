/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.implementacao.FuncionarioDaoImpl;
import dao.implementacao.ProdutoDaoImpl;
import dao.implementacao.UsuarioDaoImpl;

/**
 *
 * @author laert
 */
public class DaoFactory {
    
    
    public static UsuarioDao criarUsuarioDao(){
        
        return new UsuarioDaoImpl();
    }
    public static ProdutoDao criarProdutoDao(){
        
        return new ProdutoDaoImpl();
    }
    public static FuncionarioDao criarFuncionarioDao(){
        
        return new FuncionarioDaoImpl();
    }
}
