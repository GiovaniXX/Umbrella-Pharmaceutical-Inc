package up_classes;

import java.util.Date;

public class Boletos {

    private int IDBoleto;
    private String Cedente;
    private double CodigoBarras;
    private Date DataVencimento;
    private float Valorpagar;

    public Boletos(int IDBoleto, String Cedente, double CodigoBarras, Date DataVencimento, float Valorpagar) {
        this.IDBoleto = IDBoleto;
        this.Cedente = Cedente;
        this.CodigoBarras = CodigoBarras;
        this.DataVencimento = DataVencimento;
        this.Valorpagar = Valorpagar;
    }

    public int getIDBoleto() {
        return IDBoleto;
    }

    public void setIDBoleto(int IDBoleto) {
        this.IDBoleto = IDBoleto;
    }

    public String getCedente() {
        return Cedente;
    }

    public void setCedente(String Cedente) {
        this.Cedente = Cedente;
    }

    public double getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(double CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }

    public Date getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(Date DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    public float getValorpagar() {
        return Valorpagar;
    }

    public void setValorpagar(float Valorpagar) {
        this.Valorpagar = Valorpagar;
    }
}
