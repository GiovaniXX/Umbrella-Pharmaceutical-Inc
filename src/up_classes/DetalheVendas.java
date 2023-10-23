package up_classes;

import java.util.Date;

public class DetalheVendas {

    private int idvenda;
    private int linha;
    private int produto;
    private String descricao;
    private double preco;
    private int quantidade;
    private Date data;

    public DetalheVendas(int idvenda, int linha, int produto, String descricao, double preco, int quantidade, Date data) {
        this.idvenda = idvenda;
        this.linha = linha;
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

    public int getLinha(int linha) {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
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

    @Override
    public String toString() {
        return "descricao";
    }

//    String getDataVenda() {
//        return data.toString();
//    }
//
//    double getValorTotal() {
//        return (double) (preco * quantidade);
//    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
