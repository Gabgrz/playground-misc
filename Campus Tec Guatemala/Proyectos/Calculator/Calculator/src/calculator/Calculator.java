/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author gab12
 */
public class Calculator {
    
    private static int choice;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1 = 0;
        double n2 = 0;
        int otra = 1;
        
        calcView view = new calcView();
        view.setTitle("Título de la ventana");
        view.setVisible(true);
        
        System.out.println("Este programa te permite realizar operaciones aritméticas con dos variables.");
        while(otra == 1){
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
            System.out.println("");
            System.out.println("----------------------");
            System.out.print("El resultado es: ");
            double resultado;
            resultado = oper(n1,n2);
            DecimalFormat df = new DecimalFormat("0.###");
            System.out.println(df.format(resultado));            
            System.out.println("----------------------");
            System.out.println("");
            System.out.print("¿Quieres realizar una nueva operación? (ingresa 1 para 'si' o 2 para 'no': ");
            Scanner input4 = new Scanner (System.in);
            otra = input4.nextInt();
            while (otra !=1 && otra !=2){
                System.out.print("");
                System.out.print("Opción inválida, por favor elige 1 para 'si' o 2 para 'no': ");
                Scanner altinput4 = new Scanner (System.in);
                otra = altinput4.nextInt(); 
                }
            System.out.println("");
        }
            System.out.println("Gracias por usar la calculadora.");                      
    }
        public static double oper(double n1, double n2){        
        
            double result = 1;
            
            switch(choice){
                case 1:
                    result = n1+n2;
                    break;
                case 2:
                    result = n1-n2;
                    break;
                case 3:
                    result = n1*n2;
                    break;
                case 4:
                    result = n1/n2;
            }              
              return result;
        }
}