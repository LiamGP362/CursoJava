package model;

public class Pasaporte {
    private String nro_pasaporte;
    private Persona persona;

    public Pasaporte(String nro_pasaporte, Persona persona) {
        this.nro_pasaporte = nro_pasaporte;
        this.persona = persona;
    }

    public String getNro_pasaporte() {
        return nro_pasaporte;
    }

    public void setNro_pasaporte(String nro_pasaporte) {
        this.nro_pasaporte = nro_pasaporte;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "nro_pasaporte=" + nro_pasaporte + ", persona=" + persona + '}';
    }
        
}
