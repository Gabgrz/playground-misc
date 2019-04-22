/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetahabitable;

/**
 *
 * @author gab12
 */
public class Zanate extends Animales{
    
    Zanate() {
    }

    @Override
    public void moverse() {
    System.out.println("El animal está volando");

    }

    @Override
    public void comer() {
    System.out.println("El zanate está comiendo");
    }
    
    @Override
    public void reproducirse() {
        System.out.println("El zanate se está reproduciendo");
    }
}