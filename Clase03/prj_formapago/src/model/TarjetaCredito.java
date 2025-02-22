package model;

public class TarjetaCredito extends FormaPago {
    private int cantCoutas;
    private String nro_tarjeta;
    
    public TarjetaCredito(double monto) {
        super("Tarjeta de credito");
        cantCoutas = 1;
        nro_tarjeta = "";
        this.monto = monto;
    }

    public int getCantCoutas() {
        return cantCoutas;
    }

    public void setCantCoutas(int cantCoutas) {
        this.cantCoutas = cantCoutas;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
