package up_classes;

public class Cidades {

    private int idcidade;
    private String cidade;
    private String uf;

    public Cidades(int idcidade, String cidade, String uf) {
        this.idcidade = idcidade;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
