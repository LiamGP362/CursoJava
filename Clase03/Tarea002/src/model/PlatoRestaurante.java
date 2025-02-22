package model;

public class PlatoRestaurante extends Producto{
    private int id_producto;
    private String nom_producto;
    private int cant_producto;
    private String mesero;

    public PlatoRestaurante(int id_producto, String nom_producto, int cant_producto, String mesero) {
        super(id_producto, nom_producto, cant_producto);
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.cant_producto = cant_producto;
        this.mesero = mesero;
    }

    @Override
    public String toString() {
        return "PlatoRestaurante{" + "id_producto=" + id_producto + ", nom_producto=" + nom_producto + ", cant_producto=" + cant_producto + ", proveedor=" + mesero + super.toString() + '}';
    }
            
}
