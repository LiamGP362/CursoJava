package model;

public class Automovil {
    private String placa;
    private String marca;
    private int año_fab;

    public Automovil(String placa, String marca, int año_fab) {
        this.placa = placa;
        this.marca = marca;
        this.año_fab = año_fab;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño_fab() {
        return año_fab;
    }

    public void setAño_fab(int año_fab) {
        this.año_fab = año_fab;
    }
    
    public int getAntiguedad(){
        return 2025 - año_fab;
    }

    @Override
    public String toString() {
        return "Automovil{" + "placa=" + placa + ", marca=" + marca + ", a\u00f1o_fab=" + año_fab + '}';
    }
        
}
