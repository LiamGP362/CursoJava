package model;

import interfaz.*;

public class VehiculoElectrico implements Electrico{

    @Override
    public void motorElectrico() {
        System.out.println("Se ha implementado el motor electrico");
    }
    
}
