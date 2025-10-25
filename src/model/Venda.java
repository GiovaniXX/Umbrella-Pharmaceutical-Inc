package model;

import java.util.Date;

public class Venda {

    private int idvenda;
    private String produto;
    private String descricao;
    private double preco;
    private int quantidade;
    private Date data;
    private int idproduto;
    private int idcliente;
    private int idusuario;

    public Venda(int idvenda, String produto, String descricao, double preco, int quantidade, Date data, int idproduto, int idcliente, int idusuario) {
        this.idvenda = idvenda;
        this.produto = produto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
        this.idproduto = idproduto;
        this.idcliente = idcliente;
        this.idusuario = idusuario;
    }

    public Venda() {
    }

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
}
