package model;

import java.util.ArrayList;

public class EquipoFutbol {
    private String nombre;
    // Los jugadores son exclusivamente del tipo personas
    private ArrayList<Persona> jugadores; // <Persona> es homogenizar los elementos

    public EquipoFutbol(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>(); // Crear el objeto para guardar jugadores
    }
    
    // Agregar un jugador
    public void addJugador(Persona p){
        jugadores.add(p);
    }
    
    // Mostrar la lista de jugadores
    public void mostrarJugadores(){
        for(Persona j: jugadores){
            System.out.println(j);
        }
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }
        
}
