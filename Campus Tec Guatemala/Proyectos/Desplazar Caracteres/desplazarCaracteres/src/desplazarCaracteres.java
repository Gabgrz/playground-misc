
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gab12
 */



public class desplazarCaracteres {

    /**
     * @param args the command line arguments
     */
    
        
        
    static int longitud = 1;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int pos;
        String text;
        int count = 0;
        int diff = 0;
        
        System.out.println(Arrays.toString(abc));
        System.out.print("");
        System.out.print("Ingresa el número de posiciones a desplazar: ");
        Scanner input = new Scanner(System.in);
        pos = input.nextInt();
        System.out.println("Ahora ingresa el texto a desplazar:");
        Scanner input2 = new Scanner(System.in);
        text = input2.nextLine();
        String[] textArray = text.split("");
        System.out.println(Arrays.toString(textArray));
        String[] newArray = new String[textArray.length];
        
        for (int i = 0; i < textArray.length; i++){
            for (int x = 0; x < abc.length; x++){
                
                if(textArray[i].equals(abc[x])){
                    longitud = x+pos+1;
                    if (longitud <= abc.length){
                        System.out.println(longitud);
                        System.out.println(abc.length);
                        newArray[i] = abc[x + pos];
                    }
                    else{
                      
                        diff = longitud - abc.length;
                        newArray[i] = abc[diff-1];
                    }
                }
            }
        }
        String newString = String.join("",newArray);
        System.out.println(newString);
    }
}