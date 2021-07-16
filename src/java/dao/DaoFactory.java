/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.implementacao.FuncionarioDaoImpl;
import dao.implementacao.ProdutoDaoImpl;
import dao.implementacao.ClienteDaoImpl;

/**
 *
 * @author laert
 */
public class DaoFactory {
    
    
    public static ClienteDao criarClienteDao(){
        
        return new ClienteDaoImpl();
    }
    public static ProdutoDao criarProdutoDao(){
        
        return new ProdutoDaoImpl();
    }
    public static FuncionarioDao criarFuncionarioDao(){
        
        return new FuncionarioDaoImpl();
    }
}
