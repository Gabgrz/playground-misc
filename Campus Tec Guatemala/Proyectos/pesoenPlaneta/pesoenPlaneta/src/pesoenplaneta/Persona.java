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
public class Persona {
    
     Persona(){}
    
    double peso = PesoenPlaneta.peso;
    String nombre = PesoenPlaneta.nombre;
    int edad = PesoenPlaneta.edad;
        
    public String getNombre (){
        return this.nombre;
    }
    
    public double getPeso() {
        return this.peso;
    }
}