package controller;

import model.*;

public class Test1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("40799320", "David Jhon");
        Persona p2 = new Persona("77878123", "Angelica Carriño");
        Conductor c1 = new Conductor("01", "4x4", p1);
        Pasajero ps1 = new Pasajero("01", "Angela", p2);
        Viaje v1 = new Viaje("01", "Lima", "Huancayo", ps1, c1);
        
        // Imprimimos
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("----------------------");
        System.out.println(c1);
        System.out.println(ps1);
        System.out.println("----------------------");
        System.out.println(v1);
    }
}
