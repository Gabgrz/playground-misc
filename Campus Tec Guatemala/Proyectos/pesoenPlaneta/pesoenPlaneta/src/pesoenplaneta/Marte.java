/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoenplaneta;

/**
 *
 * @author gab12
 */
public class Marte extends objetoAstro {

    String NOMBRE = "Marte";
    double GRAVEDAD = 3.71;

    public Marte() {}
    
    @Override
    public String getNombre() {
        return this.NOMBRE;
    }
}