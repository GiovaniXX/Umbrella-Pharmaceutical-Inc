package model;

import java.util.Date;

public class Cliente {

    private int idcliente;
    private String nome;
    private String sobrenome;
    private String email;
    private String endereco;
    private String telefone;
    private String cidade;
    private Date dataCadastro;
    private int idCliente;

    public Cliente(int idcliente, String nome, String sobrenome, String email, String endereco, String telefone, String IdCidade, Date dataCadastro) {
        this.idcliente = idcliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
        this.dataCadastro = dataCadastro;
    }

    public Cliente() {
        this.idCliente = 0;
        this.nome = "";
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idCliente) {
        this.idcliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
