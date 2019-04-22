/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author gab12
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         elHilo numero1 = new elHilo();
         elHilo numero2 = new elHilo("Número 2");
         numero1.start();
         numero2.start();
    }
}