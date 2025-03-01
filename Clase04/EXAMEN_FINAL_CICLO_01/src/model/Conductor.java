package model;

public class Conductor extends Persona{
    private String nro_lic;
    private String tipo_carro;

    public Conductor(String nro_lic, String tipo_carro, Persona persona) {
        super(persona.getDni(), persona.getNombres());
        this.nro_lic = nro_lic;
        this.tipo_carro = tipo_carro;
    }

    public String getNro_lic() {
        return nro_lic;
    }

    public void setNro_lic(String nro_lic) {
        this.nro_lic = nro_lic;
    }

    public String getTipo_carro() {
        return tipo_carro;
    }

    public void setTipo_carro(String tipo_carro) {
        this.tipo_carro = tipo_carro;
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
        return "Conductor{" + "nro_lic=" + nro_lic + ", tipo_carro=" + tipo_carro + ", dni=" + dni + ", nombres=" + nombres + '}';
    }
   
   
}
