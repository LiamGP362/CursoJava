
public class Test
{
    public static void main(String x[]){
        // Definicion/Creacion del objeto
        // nombre_clase nombre_objeto;
        Alumno alum1;
        
        // Inicializar el objet (darle un espacio en memoria), opcionalmente darle valores iniciales
        alum1 = null; // Este objeto no tiene valor
        
        // ... muchas lineas adelante recien se requiere llenar datos
        alum1 = new Alumno(); // Asignar espacio de memoria 
        
        //recien se puede usar el objeto alum1
        alum1.registrarAlumno(12345, "Giraldo", "Liam", 3);
        
        // Mostramos los datos
        alum1.mostrarCarnet();
        
        // --------------------------------------------------------------
        
        Curso curso1;
        
        curso1 = new Curso();
        
        curso1.registrarCurso(104, "Java", "07/01/2025");
        
        curso1.mostrar();
        
        curso1.modificarFechaInicio("02/01/2025");
        
        curso1.mostrar();
    }
}
