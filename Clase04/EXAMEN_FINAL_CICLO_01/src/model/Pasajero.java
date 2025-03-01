package model;

public class Pasajero extends Persona{
    private String cod_pasajero;
    private String nom_pasajero;

    public Pasajero(String cod_pasajero, String nom_pasajero, Persona persona) {
        super(persona.getDni(), persona.getNombres());
        this.cod_pasajero = cod_pasajero;
        this.nom_pasajero = nom_pasajero;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }

    public String getNom_pasajero() {
        return nom_pasajero;
    }

    public void setNom_pasajero(String nom_pasajero) {
        this.nom_pasajero = nom_pasajero;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String getNombres() {
        return nombres;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "cod_pasajero=" + cod_pasajero + ", nom_pasajero=" + nom_pasajero + '}';
    }
               
}
