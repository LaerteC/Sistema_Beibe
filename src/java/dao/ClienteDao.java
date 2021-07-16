/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cliente;
import java.util.List;

/**
 *
 * @author laert
 */
public interface ClienteDao {
    
 public List<Cliente> listar();
 
 public Cliente buscarClienteID(int id);
 
 public  Cliente buscarClienteCPF(String cpf);
 
 public void inserir(Cliente cliente);
 
 public boolean atualizar(Cliente cliente);
 
 public boolean excluir(Cliente cliente);
 
 public Cliente buscarCliente(Object dado, String sql);
    
}
