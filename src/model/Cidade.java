package model;

public class Cidade {

    private int idcidade;
    private String nome;
    private String estado;

    public Cidade() {
    }

    public Cidade(int idcidade, String nome, String estado) {
        this.idcidade = idcidade;
        this.nome = nome;
        this.estado = estado;
    }

    public int getIdCidade() {
        return idcidade;
    }

    public void setIdCidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nome;
    }
}
