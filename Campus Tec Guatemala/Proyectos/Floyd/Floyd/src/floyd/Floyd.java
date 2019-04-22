/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd;

import java.util.Scanner;

/**
 *
 * @author gab12
 */
public class Floyd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 0;
        int count = 1;
        
        System.out.print("Ingresa el número máximo de filas para formar un triángulo de Floyd: ");
        Scanner input = new Scanner (System.in);
        max = input.nextInt();
        
        for (int i = 1; i <= max; i++){
            
            for (int x = 0; x < i; x++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }
}