package controller;

/**
 *
 * @author LiamGP
 */
public class DecisionMultipleOpcion {
    public static void main(String[] args) {
        // Determinar el mes a que corresponde un numero. Por ejemplo si el numero es 10, se debe mostrar
        // OCTUBRE
        int mesNro = 11;
        
        switch(mesNro){
            case 1:
                System.out.println("el mes es: ENERO");
                break; // Sirve para salir de la seleccion
            case 2:
                System.out.println("el mes es: FEBRERO");
                break;
            case 3:
                System.out.println("el mes es: MARZO");
                break;
            case 4:
                System.out.println("el mes es: ABRIL");
                break;
            case 5:
                System.out.println("el mes es: MAYO");
                break;
            case 6:
                System.out.println("el mes es: JUNIO");
                break;
            case 7:
                System.out.println("el mes es: JULIO");
                break;
            case 8:
                System.out.println("el mes es: AGOSTO");
                break;
            case 9:
                System.out.println("el mes es: SETIEMBRE");
                break;
            case 10:
                System.out.println("el mes es: OCTUBRE");
                break;
            case 11:
                System.out.println("el mes es: NOVIEMBRE");
                break;
            case 12:
                System.out.println("el mes es: DICIEMBRE");
                break;
            default:
                System.out.println("No se encontro ese mes");
        }
    }
}
