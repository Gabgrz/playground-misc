/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gab12
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.print("Ingrese un número: ");
         Scanner input = new Scanner (System.in);
         
         try{
            int num1 = input.nextInt();
            System.out.println("El número ingresado es: "+num1);
            System.out.print("Ingrese un segundo número: ");
            Scanner input2 = new Scanner (System.in);
            int num2 = input.nextInt();
            System.out.println("El número ingresado es: "+num2);
            
            if(num1>=num2){
                
                System.out.println("La suma de los dos números es: "+(num1+num2));
            }
            
         }
         catch(Exception e){
             e.printStackTrace();
             System.out.println("Tiene que ingresar un número, no un texto");
         }
         catch(InputMismatchException ex){
             System.out.println("No estás ingresando un número válido");
         }
         
         finally{
             System.out.println("Este código se ejecuta no importando qué sucede arriba");
         }
    }
}