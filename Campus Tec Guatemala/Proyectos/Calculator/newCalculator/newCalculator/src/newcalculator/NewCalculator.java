/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NewCalculator {
    

    public static void main(String[] args) {

        
        int choice = 1;
        double n1 = 1;
        double n2 = 1;
        
        System.out.println("Este programa te permite realizar operaciones aritméticas con dos variables.");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("");
            System.out.print("¿Qué operación quieres realizar? (elige una opción del 1 al 4): ");
            Scanner input1 = new Scanner (System.in);
            choice = input1.nextInt();        
            while (choice !=1 && choice !=2 && choice !=3 && choice !=4){
                System.out.print("Opción inválida, por favor elige del 1 al 4: ");
                Scanner altinput1 = new Scanner (System.in);
                choice = altinput1.nextInt(); 
                }
            System.out.println("");        
            System.out.println("Muy bien, ahora ingresa dos números");
            System.out.println("");
            System.out.print("Primer número: ");
            Scanner input2 = new Scanner (System.in);
            n1 = input2.nextDouble();
            System.out.print("Segundo número: ");
            Scanner input3 = new Scanner (System.in);
            n2 = input3.nextDouble();
        
        switch(choice){
            case 1:
                double resultado1 = sumar(5,4);
                System.out.println(resultado);
            case 2:
                double resultado2 = restar(5,4);
                System.out.println(resultado);
            case 3:
                double resultad3 = multiplicar(5,4);
                System.out.println(resultado);
            case 4:
                double resultado4 = dividir(5,4);
                System.out.println(resultado);
                
        } 
        

                               
    }
        public static double sumar(double n1, double n2){        
        
            double result = 11;
            result = n1+n2;         
            return result;
        }
        public static double restar(double n1, double n2){        

            double result = 1;
            result = n1-n2;         
            return result;
        }
        public static double multiplicar(double n1, double n2){        

            double result = 1;
            result = n1*n2;         
            return result;
        }
        public static double dividir(double n1, double n2){        

            double result = 1;
            result = n1/n2;         
            return result;
        }
}