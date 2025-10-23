package model;

import java.math.BigDecimal;

public class Produto {

    private int idproduto;
    private String produto;
    private BigDecimal preco;
    private String descricao;
    private String observacao;

    public Produto() {
    }

    public Produto(int idproduto, String produto, BigDecimal preco, String descricao, String observacao) {
        this.idproduto = idproduto;
        this.produto = produto;
        this.preco = preco;
        this.descricao = descricao;
        this.observacao = observacao;
    }

    public int getIdProduto() {
        return idproduto;
    }

    public void setIdProduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
