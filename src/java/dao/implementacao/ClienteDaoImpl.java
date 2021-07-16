/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implementacao;

import dao.ClienteDao;
import dominio.Cliente;
import dominio.Endereco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author laert
 */
public class ClienteDaoImpl implements ClienteDao {

    private static final String TABELA = "tb_cliente";
    
    @Override
    public List<Cliente> listar() {

            try (Connection conn = FactoryConnection.getConnection()) {
            List<Cliente> clientes = new ArrayList<>();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                "SELECT " +
                "id_cliente, cpf_cliente, nome_cliente, email_cliente, data_cliente, " +
                "cep_cliente, rua_cliente, nr_cliente, cidade_cliente, uf_cliente " +
                "FROM " + TABELA + ";"
            );
            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setCep(rs.getString("cep_cliente"));
                endereco.setRua(rs.getString("rua_cliente"));
                endereco.setNumero(rs.getInt("nr_cliente"));
                endereco.setCidade(rs.getString("cidade_cliente"));
                endereco.setUf(rs.getString("uf_cliente"));
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setCpf(rs.getString("cpf_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setEmail(rs.getString("email_cliente"));
                cliente.setDataNasc(rs.getDate("data_cliente"));
                cliente.setEndereco(endereco);
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public Cliente buscarClienteID(int id) {
             String sql = "SELECT " +
            "id_cliente, cpf_cliente, nome_cliente, email_cliente, data_cliente, " +
            "cep_cliente, rua_cliente, nr_cliente, cidade_cliente, uf_cliente " +
            "FROM " + TABELA + " WHERE id_cliente = ?;";
        return buscarCliente(id, sql);
    }

    @Override
    public Cliente buscarClienteCPF(String cpf) {
            
            String sql = "SELECT " +
            "id_cliente, cpf_cliente, nome_cliente, email_cliente, data_cliente, " +
            "cep_cliente, rua_cliente, nr_cliente, cidade_cliente, uf_cliente " +
            "FROM " + TABELA + " WHERE cpf_cliente = ?;";
            return buscarCliente(cpf, sql);
        
        }

    @Override
    public void inserir(Cliente cliente) {

            try (Connection conn = FactoryConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO " + TABELA + "(" +
                "cpf_cliente, nome_cliente, email_cliente, data_cliente) VALUES(?,?,?,?);"
                    

            );
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setDate(4, new Date(cliente.getDataNasc().getTime()));
            //stmt.setString(5, cliente.getEndereco().getCep());
           // stmt.setString(6, cliente.getEndereco().getRua());
           // stmt.setInt(7, cliente.getEndereco().getNumero());
          //  stmt.setString(8, cliente.getEndereco().getCidade());
         //   stmt.setString(9, cliente.getEndereco().getUf());
            stmt.executeUpdate();
            
           
          
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean atualizar(Cliente cliente) {
            
        try (Connection conn = FactoryConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(
                "UPDATE " + TABELA + " SET " +
                "cpf_cliente = ?, nome_cliente = ?, email_cliente = ?, " +
                "data_cliente = ? " +
                "WHERE id_cliente = ?;"
            );
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setDate(4, new Date(cliente.getDataNasc().getTime()));
           // stmt.setString(5, cliente.getEndereco().getCep());
          //  stmt.setString(6, cliente.getEndereco().getRua());
           // stmt.setInt(7, cliente.getEndereco().getNumero());
          //  stmt.setString(8, cliente.getEndereco().getCidade());
          //  stmt.setString(9, cliente.getEndereco().getUf());
            stmt.setInt(5, cliente.getId());
            return stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public boolean excluir(Cliente cliente) {
            try (Connection conn = FactoryConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(
                "DELETE FROM " + TABELA + " WHERE id_cliente = ?;"
            );
            stmt.setInt(1, cliente.getId());
            return stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Cliente buscarCliente(Object dado, String sql) {
            
        try (Connection conn = FactoryConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            if (dado instanceof Integer) {
                stmt.setInt(1, (Integer) dado);
            } else {
                stmt.setString(1, (String) dado);
            }
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) return null;
            Endereco endereco = new Endereco();
            endereco.setCep(rs.getString("cep_cliente"));
            endereco.setRua(rs.getString("rua_cliente"));
            endereco.setNumero(rs.getInt("nr_cliente"));
            endereco.setCidade(rs.getString("cidade_cliente"));
            endereco.setUf(rs.getString("uf_cliente"));
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id_cliente"));
            cliente.setCpf(rs.getString("cpf_cliente"));
            cliente.setNome(rs.getString("nome_cliente"));
            cliente.setEmail(rs.getString("email_cliente"));
            cliente.setDataNasc(rs.getDate("data_cliente"));
            cliente.setEndereco(endereco);
            return cliente;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}
