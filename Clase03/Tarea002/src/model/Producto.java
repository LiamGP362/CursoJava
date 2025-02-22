package model;

public class Producto {
    private int id_producto;
    private String nom_producto;
    private int cant_producto;

    public Producto(int id_producto, String nom_producto, int cant_producto) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.cant_producto = cant_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public int getCant_producto() {
        return cant_producto;
    }

    public void setCant_producto(int cant_producto) {
        this.cant_producto = cant_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nom_producto=" + nom_producto + ", cant_producto=" + cant_producto + '}';
    }
        
}
