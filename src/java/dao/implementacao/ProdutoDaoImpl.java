/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implementacao;

import dao.ProdutoDao;
import dominio.Produto;
import java.util.List;

/**
 *
 * @author laert
 */
public class ProdutoDaoImpl implements ProdutoDao{

    @Override
    public void inserirAtualizar(Produto x) {
       
    }

    @Override
    public void excluir(Produto x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> buscarPorNomeAno(String nome, int dataMin, int dataMax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
