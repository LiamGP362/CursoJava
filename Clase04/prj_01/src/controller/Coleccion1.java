package controller;

import java.util.ArrayList;
import model.*;

public class Coleccion1 {
    public static void main(String[] args) {
        ArrayList colec1 = new ArrayList();
        // Guardar elementos
        colec1.add(3.14);
        colec1.add("Pepito");
        colec1.add(2025);
        colec1.add(new Automovil("GHX778", "Toyota", 2025));
        colec1.add(new Automovil("TXH243", "Ferrari", 2020));
        colec1.add(new Conductor("Q1110022", "AIII-Profesional", "Juan"));
        colec1.add("Ultimo elemento");
        
        // Recuperar y mostrar cada elemento
        // Pero de los vehiculos solo mostrar la placa
        for(Object e: colec1){
            // Obtener cada objeto y mostrarlo
            if(e instanceof Automovil){
                System.out.println(((Automovil)e).getPlaca());
            }else{
                System.out.println(e); // se muestra el ibjeto e
            }
        }
    }
}
