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
public class Luna extends objetoAstro {

    String NOMBRE = "Luna";
    double GRAVEDAD = 1.62;

    public Luna() {}
    
    @Override
    public String getNombre() {
        return this.NOMBRE;
    }
}