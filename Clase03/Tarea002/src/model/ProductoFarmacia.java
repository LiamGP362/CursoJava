package model;

public class ProductoFarmacia extends Producto{
    private int id_producto;
    private String nom_producto;
    private int cant_producto;
    private String proveedor;
    
    public ProductoFarmacia(int id_producto, String nom_producto, int cant_producto, String proveedor) {
        super(id_producto, nom_producto, cant_producto);
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.cant_producto = cant_producto;
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "ProductoFarmacia{" + "id_producto=" + id_producto + ", nom_producto=" + nom_producto + ", cant_producto=" + cant_producto + ", proveedor=" + proveedor + super.toString() +'}';
    }
            
}
