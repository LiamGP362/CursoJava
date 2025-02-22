package model;

public class Efectivo extends FormaPago {
    private String tipoMoneda;
    
    public Efectivo(double monto){
        super("Pago en efectivo");
        tipoMoneda = "Soles";
        this.monto = monto;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
        
}
