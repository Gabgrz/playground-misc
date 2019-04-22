/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author gab12
 */
public class FibonacciNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 1;
        int n2 = 1  ;
        int fib = 1;
        
        System.out.println("A continuación los números Fibonacci menores a 300:");
        System.out.println("");
        System.out.println(n1);
        System.out.println(n2);
        while (fib < 300) {
            fib = n1+n2;
                if(fib < 300){
                    System.out.println(fib);
            }
                else{
                    System.out.println("");
                    System.out.println("Ya no hay más números que mostrar!");
                }
            n1 = n2;
            n2 = fib;
            
        }
        
    }
    
}
