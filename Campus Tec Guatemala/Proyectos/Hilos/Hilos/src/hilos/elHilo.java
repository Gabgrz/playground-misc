/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author gab12
 */


public class elHilo implements Runnable{

    Thread t;
    String nombre;
    
    public elHilo(){
        t = new Thread(this,"Hilo 1");
      //  t.start();
    }
    
    public elHilo(String nombre){
        this.nombre = nombre;
        t = new Thread(this,"Hilo 1");
        // t.start();
    }
        
    public void start(){
        this.t.start();
    }
    
    @Override
    public void run() {
        
        try {
        
            for (int i = 0; i<200; i++){
            System.out.println("Mi valor es: "+i);
            Thread.sleep(500);
            }
            
        }
        catch(InterruptedException e){
        
        }
    }
}