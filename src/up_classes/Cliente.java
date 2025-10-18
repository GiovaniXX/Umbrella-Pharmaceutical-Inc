package up_classes;

import java.util.Date;

public class Cliente {

    private int idcliente;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String telefone;
    private int cidade;
    private Date dataCadastro;
    private int idCliente;

    public Cliente(int idcliente, String nome, String sobrenome, String endereco, String telefone, int cidade, Date dataCadastro) {
        this.idcliente = idcliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
        this.dataCadastro = dataCadastro;
    }

    public Cliente() {
        this.idCliente = 0; // ou outro valor padrão
        this.nome = "";
        // Inicializar outros atributos com valores padrão
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

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
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
