package up_classes;

import java.util.Date;

public class DetalheVendas {

    private int idvenda;
    private int linha;
    private int produto;
    private String descricao;
    private double preco;
    private int quantidade;
    private String cedente;
    private Date dataVenda;
    private float valorPagamento;
    private String situacao;
    private String formaPagamento;

    public DetalheVendas(int idvenda, int linha, int produto, String descricao, double preco, int quantidade, String cedente, Date dataVenda, float valorPagamento, String situacao, String formaPagamento) {
        this.idvenda = idvenda;
        this.linha = linha;
        this.produto = produto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cedente = cedente;
        this.dataVenda = dataVenda;
        this.valorPagamento = valorPagamento;
        this.situacao = situacao;
        this.formaPagamento = formaPagamento;
    }

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public int getLinha() {
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

    public String getCedente() {
        return cedente;
    }

    public void setCedente(String cedente) {
        this.cedente = cedente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
