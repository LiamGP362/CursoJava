package model;

public class Alumno {

    // Atributos
    private int cod_alum;
    private String apellidos;
    private String nombres;
    private String DNI;
    private String especialidad;
    private String fec_nacim;
    private String fec_inscrip;
    private int año_estudios;
    
    public Alumno(int cod, String ape, String nom, int año_est) {
        cod_alum = cod;
        apellidos = ape;
        nombres = nom;
        año_estudios = año_est;
    }
    //Sobrecarga de constructores para usar sin valores
    public Alumno() {
        cod_alum = 0;
        apellidos = "";
        nombres = "";
        año_estudios = -1;
    }    
    
    // Metodos/Operaciones
    public void registrarAlumno(int cod, String ape, String nom, int año_est) {
        cod_alum = cod;
        apellidos = ape;
        nombres = nom;
        año_estudios = año_est;
    }

    public int obtenerAñoEstudios() {
        return año_estudios;
    }

    public void mostrarCarnet() {
        System.out.println("------------------------------------");
        System.out.println("Codigo: " + cod_alum);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres);
        System.out.println("Ano de estudios: " + año_estudios);
    }
}
