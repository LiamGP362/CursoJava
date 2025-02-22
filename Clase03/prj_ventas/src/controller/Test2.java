package controller;

import model.*;

public class Test2 {
    public static void main(String[] args) {
        Cliente cli1; // Instancia de cliente
        
        cli1 = new ClienteNatural("40799393", "Pablo", 2000);
        
        // Determinar el tipo de cliente que es cli1
        if(cli1 instanceof ClienteJuridico){
            System.out.println("cli1 es un tipo de ClienteJuridico");
        }else{
            System.out.println("cli1 es un tipo de ClienteNatural");
        }
    }
}
