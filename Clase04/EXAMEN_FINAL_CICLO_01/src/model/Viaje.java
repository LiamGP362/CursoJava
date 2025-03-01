package model;

public class Viaje {
    private String cod_viaje;
    private String origen;
    private String destino;
    private Pasajero pasajero;
    private Conductor conductor;

    public Viaje(String cod_viaje, String origen, String destino, Pasajero pasajero, Conductor conductor) {
        this.cod_viaje = cod_viaje;
        this.origen = origen;
        this.destino = destino;
        this.pasajero = pasajero;
        this.conductor = conductor;
    }

    public String getCod_viaje() {
        return cod_viaje;
    }

    public void setCod_viaje(String cod_viaje) {
        this.cod_viaje = cod_viaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Viaje{" + "cod_viaje=" + cod_viaje + ", origen=" + origen + ", destino=" + destino + ", pasajero=" + pasajero + ", conductor=" + conductor + '}';
    }
        
}
