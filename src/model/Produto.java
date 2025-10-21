package model;

public class Produto {

    private int idproduto;
    private String produto;
    private double preco;
    private String descricao;

    public Produto() {
    }

    public Produto(int idproduto, String produto, double preco, String descricao) {
        this.idproduto = idproduto;
        this.produto = produto;
        this.preco = preco;
        this.descricao = descricao;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
