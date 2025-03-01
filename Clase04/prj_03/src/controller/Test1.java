package controller;

import model.*;

public class Test1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("77878121", "Samuel Carriño");
        Persona p2 = new Persona("94726139", "Luz Angela");
        // Pasaporte (1)->(1) Persona / Pasaporte tiene Persona
        Pasaporte pass1 = new Pasaporte("001276589", p1);
        System.out.println(pass1);
    }
}
