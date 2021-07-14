/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author laert
 */
public class Funcionario extends Usuario implements Serializable {

    private String tipo;

    public Funcionario() {

    }

    public Funcionario(String id, String cpf, String nome, String senha, String email, Date data, String rua, String telefone, int numero, String cep, Cidade cidade, String tipo) {
        super(id, cpf, nome, senha, email, data, rua, telefone, numero, cep, cidade);

        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
