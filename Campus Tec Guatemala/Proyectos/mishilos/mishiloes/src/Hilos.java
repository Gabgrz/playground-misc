/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mishilos;

/**
 *
 * @author ap
 */

public class Hilos implements Runnable{
    
    Thread t;
    String nombre;
    int time;
    
    public Hilos(){
        t = new Thread(this,"Hilo 1");
        this.nombre = "constructor sin parametro";
        this.time = 500;
        // t.start();
    }
    
    public Hilos(String nombre,int time){
        this.nombre = nombre;
        this.time = time;
        t = new Thread(this,"Hilo 1");
        // t.start();
    }
    
    public void start(){
        this.t.start();
    }
    
    public void run(){
        try{
            for(int i =0; i<20; i++){
                System.out.println(this.nombre+" Mi valor es: "+i);
                Thread.sleep(this.time);
            }
        }
        catch(InterruptedException e){};
    }
}