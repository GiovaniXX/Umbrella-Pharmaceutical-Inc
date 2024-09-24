package up_classes;

public class Opcoes {

    private int id;
    private final String preco;
    private final String descricao;

    public Opcoes(int id, String preco, String descricao) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
