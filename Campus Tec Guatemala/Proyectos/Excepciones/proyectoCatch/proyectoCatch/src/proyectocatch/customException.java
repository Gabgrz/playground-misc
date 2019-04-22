/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocatch;

/**
 *
 * @author gab12
 */
public class customException extends Exception{
    public static final long serialVersionUID = 7001;
    
    public customException(String mensaje){
        super(mensaje);
    }
}