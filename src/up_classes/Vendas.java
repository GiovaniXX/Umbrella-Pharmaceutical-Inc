package up_classes;

import java.util.Date;

public class Vendas {

    private int idvenda;
    private String produto;
    private String descricao;
    private double preco;
    private int quantidade;
    private Date data;

    public Vendas(int idvenda, String produto, String descricao, double preco, int quantidade, Date data) {
        this.idvenda = idvenda;
        this.produto = produto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
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
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
