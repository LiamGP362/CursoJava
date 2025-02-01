package controller;

/**
 *
 * @author LiamGP
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        double a = 147, b = 39;
        
        System.out.println("La suma de a + b es: " + (a + b));
        System.out.println("La resta de a - b es: " + (a - b));
        System.out.println("La multiplicacion de a * b es: " + (a * b));
        System.out.println("La division de a / b es: " + (a / b));
        System.out.println("El resto de a % b es: " + (a % b));
        
        System.out.println("");
        
        a++;// aumenta
        System.out.println("El valor de a despues de a++ es: " + a);
        b--; // disminuye
        System.out.println("El valo de b despues de b-- es: " + b);
    }
}
