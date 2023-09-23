package up_classes;

import java.util.Date;

public class Venda {

    private int id;
    private int linha;
    private String produto;
    private String descricao;
    private float preco;
    private int quantidade;
    private String informacao;
    private Date data;

    public Venda(int id, int linha, String produto, String descricao, float preco, int quantidade, String informacao, Date data) {
        this.id = id;
        this.linha = linha;
        this.produto = produto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.informacao = informacao;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLinha(int linha) {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
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
//    float getValorTotal() {
//        return (float) (preco * quantidade);
//    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
