
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    private int cod_curso;
    private String nom_curso;
    private String fec_inicio;
    
    public void registrarCurso(int cod, String nom, String inicio){
        cod_curso = cod;
        nom_curso = nom;
        fec_inicio = inicio;
    }
    
    public void modificarFechaInicio(String nuevaFecha){
        fec_inicio = nuevaFecha;
    }
    
    public void mostrar(){
        System.out.println("Codigo del curso: " + cod_curso);
        System.out.println("Nombre del curso: " + nom_curso);
        System.out.println("Fecha de inicio: " + fec_inicio);
    }
}
