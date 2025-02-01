package controller;

/**
 *
 * @author LiamGP
 */
public class AreaCirculo {
    public static void main(String[] args) {
        // Calcular el área de una circunferencia de radio = 2.5
        // Operador de asignacion es =
        // nom_variable = valor; // nom_variable alamcena valor.
        float radio = 2.5f; // Declaración o definición de variable, tipo_de_dato nombre_variable;   
        float area; // Variable sin valor inicial
        final float pi = 3.141592654f; // pi es una constante, no se puede cambiar, pi es de una sola lectura
        
        area = pi * radio * radio;
        
        System.out.println("El area de un circulo de radio: " + radio + " es de: " + area);
    }
}
