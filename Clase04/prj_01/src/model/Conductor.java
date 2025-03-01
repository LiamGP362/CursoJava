package model;

public class Conductor {
    private String nro_lic;
    private String categoria;
    private String nombres;

    public Conductor(String nro_lic, String categoria, String nombres) {
        this.nro_lic = nro_lic;
        this.categoria = categoria;
        this.nombres = nombres;
    }

    public String getNro_lic() {
        return nro_lic;
    }

    public void setNro_lic(String nro_lic) {
        this.nro_lic = nro_lic;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nro_lic=" + nro_lic + ", categoria=" + categoria + ", nombres=" + nombres + '}';
    }
        
}
