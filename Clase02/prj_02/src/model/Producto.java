package model;

import java.util.Objects;

public class Producto {
    // Atributos
    private int cod_producto;
    private String nombre;
    private double precio;
    private int stock;
    
    // Constructores

    public Producto(int cod_producto, String nombre, double precio, int stock) {
        this.cod_producto = cod_producto;
        this.nombre = nombre; // this.nombre... es una referencia a la clase en curso
        
        this.precio = precio;
        this.stock = stock;
    }
    
    // sobre carga
    public Producto(int cod, String nombre) {
        if(cod != 0){
            cod_producto = cod;
        }else{
            System.out.println("El codigo no puede ser negativo o cero");
        }
        this.nombre = nombre; // this.nombre... es una referencia a la clase en curso
        if(precio > 0){
            this.precio = 0.0; // inicializar el resto de atributos
        }else{
            System.out.println("El precio no puede ser negativo o cero");
        }        
        this.stock = 0;
    }
    
    // Constructor vacio
    public Producto() {
        cod_producto = 0;
        this.nombre = "SIN NOMBRE"; // this.nombre... es una referencia a la clase en curso
        this.precio = 0;
        this.stock = 0;
    }
    
    public boolean EsVendible(){
        boolean esVendible = true;
        if(cod_producto == 0 || nombre.equals("SIN NOMBRE") || stock == 0 || precio == 0){
            esVendible = false;
        }
        return esVendible;
    }
    
    // Metodo para obtener (get) el codigo del producto
    public int getCod_producto() {
        return cod_producto;
    }
    
    // Metodo para guardar/asignar (set) el codigo del producto
    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }
    
    // Obtener el nombre
    public String getNombre() {
        return nombre;
    }
    
    // Guardar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_producto=" + cod_producto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.cod_producto;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.cod_producto != other.cod_producto) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}
