
package charrepetidos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gab12
 */

public class CharRepetidos {

    public static String charRepetido;
    static int charComparado;
    static int primerChar = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        
        String text;
        int charCount = 0;
        
        System.out.println("Ingresa un texto y el programa te mostrará si existen caracteres repetidos");
        Scanner input = new Scanner (System.in);
        text = input.nextLine();
        System.out.println("");

        for (int i = 1; i < text.length(); i++){
            
            charComparado = primerChar+1;
            
            for (int x = (text.length()); x > 1 && charComparado != text.length(); x--){
                
                if (text.charAt(primerChar) == text.charAt(charComparado)){
                    charRepetido = String.valueOf(text.charAt(primerChar));
                    charCount++;
                }
                charComparado++;
            }
            primerChar++;
        }
        
        System.out.println("------------");
        if (charCount != 0){
            System.out.println("Se encontró uno o varios caracteres repetidos.");
            System.out.println("");
            System.out.println("El último caracter repetido es: "+charRepetido);
        }
        else {
            System.out.println("No se encontraron caracteres repetidos");
        }
    }
}