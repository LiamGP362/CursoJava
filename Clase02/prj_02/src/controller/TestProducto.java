package controller;

import model.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto(123456, "Galletas del norte", 1.5, 90);
        Producto p2 = new Producto(128249, "Leche condensada");
        Producto p3 = new Producto();        
        
        // Mostar producto
        System.out.println("p1 es: " + p1);
        // Mostrar producto2
        System.out.println("p2 es: " + p2);
        // Mostrar producto3
        System.out.println("p3 es: " + p3);
        
        // Prueba de negocio
        // Para vender producto: debe de estar con stock, debe tener precio, debe de tener codigo, ...
        if(p1.EsVendible()){
            System.out.println("El producto: " + p1.getNombre() + " es vendible");
        }else{
            System.out.println("El producto: " + p1.getNombre() + " no es vendible");
        }
        
        // Comparar un objeto con otro
        // Comparacion por atributos
        if(p1.equals(p2)){
            System.out.println(p1.getNombre() + " es igual a: " + p2.getNombre());
        }else{
            System.out.println(p1.getNombre() + " es diferente a: " + p2.getNombre());
        }
        
        Producto p4 = new Producto(128249, "Leche condensada");
        // Comparacion por atributos
        if(p2.equals(p4)){
            System.out.println(p2.getNombre() + " es igual a: " + p4.getNombre());
        }else{
            System.out.println(p2.getNombre() + " es diferente a: " + p4.getNombre());
        }
        
        // Comparacion por sus valores hash
        if(p1.hashCode() == p2.hashCode()){
            System.out.println(p1.getNombre() + " es igual a: " + p2.getNombre());
        }else{
            System.out.println(p1.getNombre() + " es igual a:" + p2.getNombre());
        }
    }
}
