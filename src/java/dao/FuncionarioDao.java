/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Funcionario;
import java.util.List;

/**
 *
 * @author laert
 */
public interface FuncionarioDao {
    
    public void inserirAtualizar(Funcionario x);
    public void excluir(Funcionario x);
    public Funcionario buscar(int id);
    public List<Funcionario> buscarTodos();
    
    public List<Funcionario> buscarPorNomeAno(String nome,int dataMin,int dataMax);
    
}
