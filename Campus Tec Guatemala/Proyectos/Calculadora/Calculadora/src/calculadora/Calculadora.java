
package calculadora;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author gab12
 */
public class Calculadora {
    
        public static void main(String[] args) {        
        
        int choice = 1;
        double n1;
        double n2;
        int finale;
        DecimalFormat df = new DecimalFormat("0.###");
                
        System.out.println("Este programa te permite realizar operaciones aritméticas con dos variables.");
        System.out.println("");        
        System.out.println("Ingresa dos números");
        System.out.println("");
        System.out.print("Primer número: ");
        Scanner input2 = new Scanner (System.in);
        n1 = input2.nextDouble();
        System.out.print("Segundo número: ");
        Scanner input3 = new Scanner (System.in);
        n2 = input3.nextDouble();
        System.out.println("");
        
        finale = menu(choice);
        
        switch(finale){
            case 1:
                double resultado1 = sumar(n1,n2);
                System.out.println("");
                System.out.print("El Resultado de la operación es: ");
                System.out.println(df.format(resultado1));
                break;
            case 2:
                double resultado2 = restar(n1,n2);
                System.out.println("");
                System.out.print("El Resultado de la operación es: ");
                System.out.println(df.format(resultado2));
                break;
            case 3:
                double resultado3 = multiplicar(n1,n2);
                System.out.println("");
                System.out.print("El Resultado de la operación es: ");
                System.out.println(df.format(resultado3));
                break;
            case 4:
                double resultado4 = dividir(n1,n2);
                System.out.println("");
                System.out.print("El Resultado de la operación es: ");
                System.out.println(df.format(resultado4));
                break;
                
        }
        }
        /**
     *
     * @param choice the option selected
     * @return the option selected
     * 
     */
    
    public static int menu (int choice){
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
        return choice;
        }

        public static double sumar(double n1, double n2){        
        
            double result;
            result = n1+n2;
            return result;
        }
        public static double restar(double n1, double n2){        

            double result;
            result = n1-n2;         
            return result;
        }
        public static double multiplicar(double n1, double n2){        

            double result;
            result = n1*n2;         
            return result;
        }
        public static double dividir(double n1, double n2){        

            double result;
            result = n1/n2;         
            return result;
        }
}