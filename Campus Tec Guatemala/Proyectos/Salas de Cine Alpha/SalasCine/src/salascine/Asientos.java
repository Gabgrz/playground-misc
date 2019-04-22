/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salascine;
/**
 *
 * @author gab12
 */
public class Asientos {
 
    int filas = 4;
    int columnas = 5;
    
    public Boolean[] Asientos (int filas, int columnas){
    
        this.filas = filas;
        this.columnas = columnas;
        Boolean[] totalAsientos = new Boolean [filas*columnas];
        return totalAsientos;
    }
 
}


 /*   public String[] getAsientosId(){
        for (int i = 0; i < totalAsientos; i++){
            
        }
    }

 */