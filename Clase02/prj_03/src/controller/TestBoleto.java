package controller;

import model.Boleto;

public class TestBoleto {
    public static void main(String[] args) {
        // Una misma empresa vende boletos en todas sus oficinas a nivle nacional
        Boleto b1 = new Boleto("LIMA", "TRUJILLO");
        System.out.println(b1);
        
        Boleto b2 = new Boleto("ICA", "CAJAMARCA");
        System.out.println(b2);
        
        Boleto b3 = new Boleto("TACNA", "MOQUEGUA");
        System.out.println(b3);
    }
}
