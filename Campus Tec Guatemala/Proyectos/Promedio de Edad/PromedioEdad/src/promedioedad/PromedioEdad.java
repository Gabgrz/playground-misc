
package promedioedad;

import java.util.Scanner;

/**
 *
 * @author gab12
 */
public class PromedioEdad {

public static void main(String[] args) {
    
        int num;       // integer will be stored in this variable    
        int sumPromedio = 0;
        double promedio;
        int count1 = 0;
        int count2 = 0;
        int numPersonas;
        int counter = 0;
        
        System.out.println("Este programa te permite ");
        System.out.print("Indique la cantidad de personas a calcular: ");
        Scanner input1 = new Scanner (System.in);
        numPersonas = input1.nextInt();
        
        int[] List = new int[numPersonas];
        
        for (int i = 0; i < numPersonas; i++){
              counter++;
              System.out.println(" Indique la edad de la persona "+counter);
              Scanner input = new Scanner (System.in);
              List[i] = input.nextInt();
              sumPromedio += List[i];
        }
        
        promedio = sumPromedio/numPersonas;
        System.out.println("El promedio es: "+promedio);
        for (int i = 0; i < numPersonas; i++){
            if (List[i] > promedio){
                count1++;
            }
            else
                if(List[i] < promedio)
            { count2++;}
        }
        System.out.println("El número de personas mayor al promedio es: "+count1);
        System.out.println("El número de personas menor al promedio es: "+count2);
    }
}