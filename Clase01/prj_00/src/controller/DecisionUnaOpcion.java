package controller;

/**
 *
 * @author LiamGP
 */
public class DecisionUnaOpcion {
    public static void main(String[] args) {
        // Determinar si un año es bisiesto, el año tiene que ser multiplo de 4 pero no de 100, pero si de 400
        int año = 200;
        
        boolean r =
                año % 4 == 0 &&
                año % 100 != 0 ||
                año % 400 == 0;
        
        if(r == true){
            System.out.println(año + " es bisiesto.");
        }
    }
}
