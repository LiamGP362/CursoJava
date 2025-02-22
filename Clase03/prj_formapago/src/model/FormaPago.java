package model;

public class FormaPago {
    protected double monto;
    protected String formapago;
    
    public FormaPago(String formapago){
        this.formapago = formapago;
        monto = 0.0;
    }
    
    @Override
    public String toString() {
        return "FormaPago{" + "monto=" + monto + ", formapago=" + formapago + '}';
    }
               
}
