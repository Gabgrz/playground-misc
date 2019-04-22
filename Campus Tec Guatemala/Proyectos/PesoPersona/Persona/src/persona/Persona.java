package persona;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author gab12
 */
public class Persona {

      private static double peso;
           
      public static void main(String[] args) {
          
        String nombre;
        int edad;
        DecimalFormat df = new DecimalFormat("0.##");
        
        // Saludar, pedir datos
        
        System.out.printf("%s\n\n","Hola, este programa te permite calcular el peso de una persona en Marte y la Luna");
        System.out.printf("%s\n\n","Ingresa los datos de la persona");
        System.out.print("Nombre: ");
        Scanner input1 = new Scanner(System.in);
        nombre = input1.nextLine();
        System.out.print("Edad: ");
        Scanner input2 = new Scanner(System.in);
        edad = input2.nextInt();      
        System.out.print("Peso en libras: ");
        Scanner input3 = new Scanner(System.in);
        peso = input3.nextDouble();
       
        // Impresión del peso en la Luna y Marte usando el método "pesoMethod" de la clase "Peso"
        
        double[] pesoprintLuna = Peso.pesoMethod(peso);
        double[] pesoprintMarte = Peso.pesoMethod(peso);
        
        System.out.println("");
        System.out.print("Este es el peso calculado en la Luna: ");        
        System.out.print(df.format(pesoprintLuna[0]));
        System.out.println(" lb.");
        System.out.println("");
        System.out.print("Este es el peso calculado en Marte: ");        
        System.out.print(df.format(pesoprintMarte[1]));
        System.out.println(" lb.");
    }
}