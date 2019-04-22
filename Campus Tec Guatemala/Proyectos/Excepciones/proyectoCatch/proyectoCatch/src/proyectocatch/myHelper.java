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
public class myHelper {
    
    myHelper(){
    }
    
    public void validatePassword() throws customException{}
        if(password != repassword){
            throws new customException  ("Los campos de password no son iguales");
        }
    
    public boolean validarPassword(String password, String repassword){
        if(password != repassword){
            return false;
            }
        if (password.length() < 8) {
            return false;
        }
        return true;        
        }
    }