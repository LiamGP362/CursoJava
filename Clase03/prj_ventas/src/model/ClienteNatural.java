package model;

// ClienteNatural sera clase hija de cliente/subclase de la superclase Cliente
public class ClienteNatural extends Cliente {
    private String DNI;
    
    public ClienteNatural(String DNI, String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
        this.DNI = DNI;
    }
    
    public ClienteNatural(String DNI, String nombre, double capacidad_compra, String domicilio, String email, int año_inscrip) {
        super(nombre, capacidad_compra, domicilio, email, año_inscrip);
        this.DNI = DNI;
    }
    
    // Manipulara año_inscrip
    public int getAntiguedad(){
        // Año actual - año de inscrip, el acceso a año_inscrip desde esta clase es porque en la clase padre se ah definido
        // con acceso protegido (si fuera privado NO es accesible)
        return 2025 - año_inscrip;
    }
    
    // Sobre escribe el metodo toString de la clase padre
    @Override
    public String toString() {
        return "ClienteNatural{" + "DNI=" + DNI + ", " + super.toString() + '}';
    }
        
}
