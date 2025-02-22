package controller;

import model.ProductoFarmacia;
import model.ProductoFerreteria;
import model.PlatoRestaurante;

public class Test {
    public static void main(String[] args) {
        ProductoFarmacia pro_farm;
        
        pro_farm = new ProductoFarmacia(2, "Alchol", 3, "Engerede");
        System.out.println(pro_farm);
        
        ProductoFerreteria pro_ferreteria;
        
        pro_ferreteria = new ProductoFerreteria(1, "Tuerca", 2, "Ingetelcon");
        System.out.println(pro_ferreteria);
        
        PlatoRestaurante plato_restau;
        
        plato_restau = new PlatoRestaurante(3, "Milanesa de pollo", 1, "Pablo");
        System.out.println(plato_restau);
    }
}
