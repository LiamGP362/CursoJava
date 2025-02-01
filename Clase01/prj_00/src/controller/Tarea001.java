package controller;

/**
 *
 * @author Alumno
 */
public class Tarea001 {
    public static void main(String[] args) {
        int nota = 20;
        
        if(nota > 20 || nota < 0) {
            System.out.println("NOTA INVALIDA");
        }else if(nota > 10 && nota < 14) {
            System.out.println("PARA SUSTITURIO, debido a que su nota es de: " + nota);
        }else if(nota >= 14 && nota <= 20){
            System.out.println("APROBADO con: " + nota);
        }else{
            System.out.println("DESAPROBADO");
        }
    }
}
