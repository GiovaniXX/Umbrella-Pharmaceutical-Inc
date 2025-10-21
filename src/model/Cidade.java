package model;

public class Cidade {

    private int idCidade;
    private String nome;
    private String estado;

    public Cidade() {
    }

    public Cidade(int idCidade, String nome, String estado) {
        this.idCidade = idCidade;
        this.nome = nome;
        this.estado = estado;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
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
