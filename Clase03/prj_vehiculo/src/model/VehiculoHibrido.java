package model;

import interfaz.*;

public class VehiculoHibrido implements Electrico, Combustion{

    @Override
    public void motorElectrico() {
        System.out.println("Tiene motor electrico");
    }

    @Override
    public void motorCombustion() {
        System.out.println("Tiene motor a combustion");
    }
    
}
