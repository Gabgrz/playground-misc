/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielclase;

import java.util.Scanner;



/**
 *
 * @author gab12
 */
public class GabrielClase {


    public static void main(String[] args) {
        
        System.out.print("Hola, ingresa el número límite: ");
        Scanner input = new Scanner(System.in);
        int limit;
        limit = input.nextInt();
        
        System.out.print("Ahora ingresa el número de inicio: ");
        Scanner input2 = new Scanner(System.in);
        int numero;
        numero = input2.nextInt(); 
        
        while(numero<=limit){
        boolean esImpar = impar(numero);
        if(esImpar){
            System.out.println(numero);
        }
        numero++;
        }
    }
    
    public static boolean impar (int numero){
        int entero = 1;
        boolean ret = false;
            
            if (numero%2==entero){
                ret = true;
            }
            return ret;
    }
    
    
    
}
