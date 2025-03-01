package controller;

public class Arreglos2 {
    public static void main(String[] args) {
        double precios[]; // definicion de que la variable precios es un arreglo / vector
        precios = new double[5]; // se disponga un espacio para 5 doubles
        
        // Asignar los valores a todas las posiciones de la variable precios
        precios[0] = 25.5 * 1.1;// asignar un valor a la posicion 0 de precios
        precios[1] = 198.90 * 1.1;
        precios[2] = 45.50 * 1.1;
        precios[3] = 1999.90 * 1.1;
        precios[4] = 29.90 * 1.1;
        
        for(int i = 0; i < 5; i++){
            System.out.println("Precio" + i + ": " + precios[i] + ", IGV es: " + precios[i] * 0.18);
        }
    }
}
