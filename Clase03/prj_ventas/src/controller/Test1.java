package controller;

import model.Cliente;
import model.ClienteJuridico;

public class Test1 {
    public static void main(String[] args) {
        /*
        // Cliente no puede ser instanciado (objeto), por ser abstracto, el fin de la clase Cliente es servir
        // como modelo para otros tipos de clientes
        Cliente clien1 = new Cliente("Pepe", 1500);
        System.out.println(clien1);
        */

        model.ClienteNatural clienN1 = new model.ClienteNatural("77878121", "David", 
                                                                5000, "Av. Amancaes 123", "lordDavid@gmail.com", 2015);
        System.out.println(clienN1);
        System.out.println("Antiguedad del cliente natural: " + clienN1.getAntiguedad() + " años");
        
        ClienteJuridico clienJ1 = new ClienteJuridico("201020404041", "Empresa Technologis.co", "Av. Amancaes 1010", 100000,
                                                      "technologis@gmail.com", "40479393", "Pepe", 2020);
        System.out.println(clienJ1);
    }
}
