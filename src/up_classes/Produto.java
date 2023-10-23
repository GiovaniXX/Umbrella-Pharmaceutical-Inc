package up_classes;

public class Produto {

    private int idproduto;
    private String descricao;
    private double preco;
    private int imposto;
    private String anotacao;

    public Produto(int idproduto, String descricao, double preco, int imposto, String anotacao) {
        this.idproduto = idproduto;
        this.descricao = descricao;
        this.preco = preco;
        this.anotacao = anotacao;
        this.imposto = imposto;
    }

    public int getIdProduto() {
        return idproduto;
    }

    public void setIdProduto(int idproduto) {
        this.idproduto = idproduto;
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

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + '}';
    }

}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
