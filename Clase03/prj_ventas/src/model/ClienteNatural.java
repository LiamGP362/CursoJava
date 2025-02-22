package model;

// ClienteNatural sera clase hija de cliente/subclase de la superclase Cliente
public class ClienteNatural extends Cliente {
    private String DNI;
    
    public ClienteNatural(String DNI, String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
        this.DNI = DNI;
    }
    
    public ClienteNatural(String DNI, String nombre, double capacidad_compra, String domicilio, String email, int a�o_inscrip) {
        super(nombre, capacidad_compra, domicilio, email, a�o_inscrip);
        this.DNI = DNI;
    }
    
    // Manipulara a�o_inscrip
    public int getAntiguedad(){
        // A�o actual - a�o de inscrip, el acceso a a�o_inscrip desde esta clase es porque en la clase padre se ah definido
        // con acceso protegido (si fuera privado NO es accesible)
        return 2025 - a�o_inscrip;
    }
    
    // Sobre escribe el metodo toString de la clase padre
    @Override
    public String toString() {
        return "ClienteNatural{" + "DNI=" + DNI + ", " + super.toString() + '}';
    }
        
}
