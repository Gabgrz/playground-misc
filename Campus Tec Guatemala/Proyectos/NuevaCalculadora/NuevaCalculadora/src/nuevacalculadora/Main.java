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
public class Main {
 
    public static void main(String[] args){
    
        int num1;
        int num2;
        
        NuevaCalculadora calc = new NuevaCalculadora (23,12);
        int numero1 = calc.getNum1();
        int numero2 = calc.getNum2();
        System.out.println(numero1);
        System.out.println(numero2);
    }
}