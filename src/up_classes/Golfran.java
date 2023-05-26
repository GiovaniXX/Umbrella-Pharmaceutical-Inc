package up_classes;

import java.util.Date;

public class Golfran {

    private String Cedente;
    private double codigoBarras;
    private Date dataVencimento;
    private float valorPagamento;
    private String situacao;

    public Golfran(int idboleto, String Cedente, double codigoBarras, Date dataVencimento, float valorPagamento, String situacao) {
        this.Cedente = Cedente;
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
        this.valorPagamento = valorPagamento;
        this.situacao = situacao;
    }

    public String getCedente() {
        return Cedente;
    }

    public void setCedente(String Cedente) {
        this.Cedente = Cedente;
    }

    public double getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(double codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {

    }
}
