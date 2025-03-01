package model;

public class Persona {
   protected String dni;
   protected String nombres;

    public Persona(String dni, String nombres) {
        this.dni = dni;
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombres=" + nombres + '}';
    }
      
}
