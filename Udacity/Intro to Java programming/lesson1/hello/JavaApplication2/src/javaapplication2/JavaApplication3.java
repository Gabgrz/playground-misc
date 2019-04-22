/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author gab12
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y = 15;
        int z = 20;
        String miNombre = "Gabriel";
        int edad = 25;
        
        System.out.println("Hello World!");
        System.out.println("Mi nombre es: "+miNombre);
        System.out.println("Mi edad es: "+edad);
        
        if(edad>25){
            System.out.println("Ya estas grande");}
        else{
            System.out.println("Sos un nene");}
        
        if(y>z){
            System.out.println("El número mayor es: "+y);}
        else{
            System.out.println("El número mayor es: "+z);}
        for (int i = 0; i < 10; i++) {
            System.out.println("El número es: "+i);
        }
        
      }
 }