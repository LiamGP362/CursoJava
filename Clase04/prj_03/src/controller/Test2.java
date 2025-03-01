package controller;

import model.*;

public class Test2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("76898121", "Juan Herencia");
        Persona p2 = new Persona("85726139", "Luisa Tello");
        
        // EquipoFutbol (1)->(*) Persona
        EquipoFutbol eq = new EquipoFutbol("Chamos F.C");
        // Registrar jugadores
        eq.addJugador(p1);
        eq.addJugador(p2);
        eq.addJugador(new Persona("98726452", "Carriño Cabrera"));
        eq.addJugador(new Persona("89824852", "Oscar Chambelan"));
        // Mostrar jugadores y equipo
        //System.out.println(eq);
        eq.mostrarJugadores();
    }
}
