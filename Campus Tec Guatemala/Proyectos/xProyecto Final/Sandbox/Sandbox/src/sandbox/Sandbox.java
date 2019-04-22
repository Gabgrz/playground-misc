/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author gab12
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int filas = 2;
        int columnas = 3;
        String nombre;
        Asientos[] newAsientos;

        String[] idLetras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int countAsiento = 0;
        
        int totalAsientos = filas * columnas;
        Asientos[] misAsientos = new Asientos[totalAsientos];

        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < columnas; x++) {
                
                misAsientos[countAsiento] = new Asientos();
                misAsientos[countAsiento].setId(idLetras[i] + (x+1));
                System.out.println(misAsientos[countAsiento].getId());
                countAsiento++;
                System.out.println(countAsiento);
                System.out.println(misAsientos.length);
                System.out.println("");
            }
        }
        
        newAsientos = misAsientos;
    }
}