package controller;

/**
 *
 * @author LiamGP
 */
public class DecisionDosOpciones {
    public static void main(String[] args) {
        // Determinar si un alumno a aprobado o desaprobado el curso de Java Programacion,
        // su calificacion final es mayor o = igual a 14 mostrar APROBADO, de otra forma mostrar DESAPROBADO
        float califFinal = 17.8f;
        
        if(califFinal >= 14) {
            System.out.println("APROBADO con: " + califFinal);
        }else {
            System.out.println("DESAPROBADO con: " + califFinal);
        }
    }
}
