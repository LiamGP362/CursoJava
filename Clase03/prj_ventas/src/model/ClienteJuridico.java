package model;

public class ClienteJuridico extends Cliente {
    private String RUC;
    private String DNI_repre_legal;
    private String nombres_repre_legal;
    
    public ClienteJuridico(String RUC, String razon_social, String domicilio , double capacidad_compra, String email,String DNI_repre_legal, String nombres_repre_legal,
                           int año_inscrip) {
        super(razon_social, capacidad_compra, domicilio, email, año_inscrip);
        this.RUC = RUC;
        this.DNI_repre_legal = DNI_repre_legal;
        this.nombres_repre_legal = nombres_repre_legal;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" + "RUC=" + RUC + ", DNI_repre_legal=" + DNI_repre_legal +
               ", nombres_repre_legal=" + nombres_repre_legal + ", " + super.toString() + '}';
    }
            
}
