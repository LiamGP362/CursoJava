package controller;

/*
import model.Alumno;
import model.Curso;
 */
import model.*; // Importa todas las clases de model;

public class Test {

    public static void main(String x[]) {
        // Definicion/Creacion del objeto
        // nombre_clase nombre_objeto;
        Alumno alum1, alum2;

        // Inicializar el objet (darle un espacio en memoria), opcionalmente darle valores iniciales
        //alum1 = null; // Este objeto no tiene valor

         // Asignar espacio de memoria para alum1 y de paso poner valores iniciales
        alum1 = new Alumno(3333, "Perez", "Amon", 1);
        alum2 = new Alumno();// usa el constructor vacio

        //recien se puede usar el objeto alum1
        //alum1.registrarAlumno(12345, "Giraldo", "Liam", 3);

        // Mostramos los datos de alum1
        alum1.mostrarCarnet();
        
        // ... mucho despues se asignan valores a alum2
        alum2.registrarAlumno(12345, "Tello", "Anige", 4);
        alum2.mostrarCarnet();
        
        /*
        // --------------------------------------------------------------
        Curso curso1;

        curso1 = new Curso();

        curso1.registrarCurso(104, "Java", "07/01/2025");

        curso1.mostrar();

        curso1.modificarFechaInicio("02/01/2025");

        curso1.mostrar();*/
    }
}
