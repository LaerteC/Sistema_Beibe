/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Usuario;
import java.util.List;

/**
 *
 * @author laert
 */
public interface UsuarioDao {
    
    public void inserirAtualizar(Usuario x);
    public void excluir(Usuario x);
    public Usuario buscar(int id);
    public List<Usuario> buscarTodos();
    
    public List<Usuario> buscarPorNomeAno(String nome,int dataMin,int dataMax);
    
    
}
