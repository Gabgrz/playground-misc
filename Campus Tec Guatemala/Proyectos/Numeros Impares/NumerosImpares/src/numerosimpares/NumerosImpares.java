/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosimpares;

/**
 *
 * @author gab12
 */
public class NumerosImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 1;
        System.out.println("Estos son los números impares del 1 al 100: ");
        System.out.println("");
        for (int i = 0; i < 100; i++) {
            
            
            if (x % 2 != 0)
            {
               System.out.println(x);
               
               
            }
            ++x;
        }

    }
    
}
