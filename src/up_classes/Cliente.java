package up_classes;

import java.util.Date;

public class Cliente {

    private String idCliente;
    private int idTipo;
    private String Nome;
    private String SNome;
    private String Endereco;
    private String Telefone;
    private int idCidade;
    private Date DNascimento;
    private Date Data;

    public Cliente(String idCliente, int idTipo, String Nome, String SNome, String Endereco, String Telefone, int idCidade, Date DNascimento, Date Data) {
        this.idCliente = idCliente;
        this.idTipo = idTipo;
        this.Nome = Nome;
        this.SNome = SNome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.idCidade = idCidade;
        this.DNascimento = DNascimento;
        this.Data = Data;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSNome() {
        return SNome;
    }

    public void setSNome(String SNome) {
        this.SNome = SNome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public Date getDNascimento() {
        return DNascimento;
    }

    public void setDNascimento(Date DNascimento) {
        this.DNascimento = DNascimento;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
}
