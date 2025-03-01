package model;

public class Automovil {
    private String placa;
    private String marca;
    private int a�o_fab;

    public Automovil(String placa, String marca, int a�o_fab) {
        this.placa = placa;
        this.marca = marca;
        this.a�o_fab = a�o_fab;
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

    public int getA�o_fab() {
        return a�o_fab;
    }

    public void setA�o_fab(int a�o_fab) {
        this.a�o_fab = a�o_fab;
    }
    
    public int getAntiguedad(){
        return 2025 - a�o_fab;
    }

    @Override
    public String toString() {
        return "Automovil{" + "placa=" + placa + ", marca=" + marca + ", a\u00f1o_fab=" + a�o_fab + '}';
    }
        
}
