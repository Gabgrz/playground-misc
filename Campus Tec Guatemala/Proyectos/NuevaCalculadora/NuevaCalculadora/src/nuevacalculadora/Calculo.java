/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevacalculadora;

/**
 *
 * @author gab12
 */
public class Calculo extends NuevaCalculadora {
    
    int miNum1;
    
    Calculo (int numero1, int numero2){
    
        this.setNum1(numero1);
        this.setNum2(numero2);
        this.miNum1 = 2;
    }
    
    public int sumar(){
        
        return this.getNum1() + getNum2();    
    }
}