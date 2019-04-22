/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mishilos;

/**
 *
 * @author ap
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilos numero1 = new Hilos("numero 1",500);
        Hilos numero2 = new Hilos("Numero 2",1000);
        numero1.start();
        numero2.start();
        
    }
    
}
