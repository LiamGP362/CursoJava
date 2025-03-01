package controller;

public class Arreglos3 {
    public static void main(String[] args) {
        // Crear un objeto de Automovil
        model.Automovil veh1 = new model.Automovil("AXC100", "Hyundai", 2005);
        System.out.println(veh1);
        
        // Crear un arreglo de Automoviles
        int cantidad = 5;
        model.Automovil vehs[]; // definir el arreglo
        
        // Indicar la cantidad de vehiculos
        vehs = new model.Automovil[cantidad];
        
        // inicializarlos con null
        for(int i = 0; i < cantidad; i++){
            vehs[i] = null;
        }
        
        // Mucho mas adelante se pueden usar
        
        // Asignando valor al elemento de indice 3
        vehs[3] = new model.Automovil("WDF222", "Mazda", 2022);
        vehs[1] = new model.Automovil("WXG395", "Nissan", 2012);
        
        // Mostrarlos
        System.out.println("Lista de vehiculos");
        for(int i = 0; i < cantidad; i++){
            if(vehs[i] != null){
            System.out.println(vehs[i]);
            }
        }
    }
}
