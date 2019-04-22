/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author gab12
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int max = 0;
        int count = 1;
        int var = 0;
        
        System.out.print("Ingresa un número y el programa te mostrará todos los números primos menores o iguales al mismo: ");
        Scanner input = new Scanner(System.in);
        max = input.nextInt();
        System.out.println("1");
        System.out.println("2");
        
        for (int i = 3; i <= max; i++){
            int count2 = 0;
            for (int x = 2; x < i; x++){
                var = i%x;
                if (var == 0){
                    count2++;
                }
            }
            if (count2 == 0){
                System.out.println(i);
            }
        }
    }
}