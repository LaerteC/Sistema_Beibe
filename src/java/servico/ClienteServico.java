/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import dao.ClienteDao;
import dao.DaoFactory;
import dominio.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laert
 */
public class ClienteServico {

    private ClienteDao dao;

    public ClienteServico() {

        dao = DaoFactory.criarClienteDao();

    }

    public void validar(Cliente x) throws ValidacaoException {

        List<String> erros = new ArrayList<>();

        if (x.getNome() == null) {

            erros.add(" Favor Preencher o Campo Nome");
        }
        if (x.getCpf() == null) {

            erros.add(" Favor Preencher o Campo CPF");
        }
        if (x.getEmail() == null) {

            erros.add("Favor Informar um valor de Email Correto");
        }
      

        if (!erros.isEmpty()) {

            throw new ValidacaoException("Erro de validação ", erros);
        }
    }

    public void inserir(Cliente x) throws ServicoException {

        try {

             dao.inserir(x);

        } catch (RuntimeException e) {

            System.out.println("Erro: " + e.getMessage());

        }

    }
    
    public Cliente buscarId(int id){
        
        return dao.buscarClienteID(id);
    }

    public void atualizar(Cliente x) throws ServicoException {
        
        try {
    
            dao.atualizar(x);

            if (dao.atualizar(x) != true) {

                throw new ServicoException(" Ja existe um Cliente com esse Nome", 1);
            }

            

        } catch (RuntimeException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }

    public void excluir(Cliente x) throws ServicoException {

        try {
            x = dao.buscarClienteID(x.getId());

            dao.excluir(x);

            
        } catch (RuntimeException e) {

           
            System.out.println("Erro: " + e.getMessage());

        }

    }
    
    public List<Cliente> buscar(){
        
       return dao.listar();
    }

   

}
