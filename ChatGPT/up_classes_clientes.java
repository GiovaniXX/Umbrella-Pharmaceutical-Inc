package up_classes;

import java.util.Date;

public class Cliente {
    private String identificadorDoCliente;
    private int tipoDeIdentificador;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private int identificadorDaCidade;
    private Date dataDeNascimento;

    public Cliente(String identificadorDoCliente, int tipoDeIdentificador, String nome, String sobrenome, String endereco, String telefone, int identificadorDaCidade, Date dataDeNascimento) {
        this.identificadorDoCliente = identificadorDoCliente;
        this.tipoDeIdentificador = tipoDeIdentificador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.identificadorDaCidade = identificadorDaCidade;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getIdentificadorDoCliente() {
        return identificadorDoCliente;
    }

    public void setIdentificadorDoCliente(String identificadorDoCliente) {
        this.identificadorDoCliente = identificadorDoCliente;
    }

    public int getTipoDeIdentificador() {
        return tipoDeIdentificador;
    }

    public void setTipoDeIdentificador(int tipoDeIdentificador) {
        this.tipoDeIdentificador = tipoDeIdentificador;
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

    public int getIdentificadorDaCidade() {
        return identificadorDaCidade;
    }

    public void setIdentificadorDaCidade(int identificadorDaCidade) {
        this.identificadorDaCidade = identificadorDaCidade;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDe
