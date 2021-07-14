/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author laert
 */
public class Produto implements Serializable {
    
    private String idProduto;
    private String nomeProduto;
    private Categoria categoria;
    private String descricao;
    private double peso;

    public Produto(String idProduto, String nomeProduto, Categoria categoria, String descricao, double peso) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.descricao = descricao;
        this.peso = peso;
    }

    public Produto() {
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", categoria=" + categoria + ", descricao=" + descricao + ", peso=" + peso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idProduto);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.idProduto, other.idProduto)) {
            return false;
        }
        return true;
    }
    
    
    
}
