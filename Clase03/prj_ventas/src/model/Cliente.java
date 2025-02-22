package model;

/*
// Cliente no puede ser instanciado (objeto), por ser abstracto, el fin de la clase Cliente es servir
// como modelo para otros tipos de clientes
Cliente clien1 = new Cliente("Pepe", 1500);
System.out.println(clien1);
*/
public abstract class Cliente {
    private String nombre;
    private double capacidad_compra;
    private String domicilio;
    private String email;
    protected int año_inscrip;

    public Cliente(String nombre, double capacidad_compra, String domicilio, String email, int año_inscrip) {
        this.nombre = nombre;
        this.capacidad_compra = capacidad_compra;
        this.domicilio = domicilio;
        this.email = email;
        this.año_inscrip = año_inscrip;
    }
    
    public Cliente(String nombre, double capacidad_compra) {
        this.nombre = nombre;
        this.capacidad_compra = capacidad_compra;
        this.domicilio = "SIN DATO";
        this.email = "SIN DATO";
        this.año_inscrip = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad_compra() {
        return capacidad_compra;
    }

    public void setCapacidad_compra(double capacidad_compra) {
        this.capacidad_compra = capacidad_compra;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
        
    // Definir una salida en texto de una clase cuando sea objeto
    @Override // Sobre escribir el metodo toString de la clase base Object
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", capacidad_compra=" + capacidad_compra + ", domicilio=" + domicilio + ", email=" + email + ", a\u00f1o_inscrip=" + año_inscrip + '}';
    }
    
            
}
