package model;

import interfaz.*;

public class VehiculoCombustion implements Combustion{

    @Override
    public void motorCombustion() {
       System.out.println("Se ha implementado el motor a combustion");
    }
    
}
