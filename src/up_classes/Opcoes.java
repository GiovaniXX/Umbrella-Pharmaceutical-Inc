package up_classes;

public class Opcoes {

    //public static Object Utilidades;
    //public Object Opcoes;
    
    public final String valor;
    public final String descricao;

    public Opcoes(String valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
