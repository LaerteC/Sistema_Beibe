/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author laert
 */
public class Usuario implements Serializable{
    
    private String id;
    private String cpf;
    private String nome;
    private String senha;
    private String email;
    private Date data;
    private String rua;
    private String telefone;
    private int numero;
    private String cep;
    private Cidade cidade;
    
    
    public Usuario(){
        
    }

    public Usuario(String id, String cpf, String nome, String senha, String email, Date data, String rua, String telefone, int numero, String cep, Cidade cidade) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.data = data;
        this.rua = rua;
        this.telefone = telefone;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", senha=" + senha + ", email=" + email + ", data=" + data + ", rua=" + rua + ", telefone=" + telefone + ", numero=" + numero + ", cep=" + cep + ", cidade=" + cidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
