/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariostest;

/**
 *
 * @author ap
 */
public class MyHelper {
    MyHelper(){
    
    }
    
    public void validatePassword(String password, String repassword) throws CustomException{
        if(password != repassword){
            throw new CustomException("Los campos de password no son iguales");
        }
        if(password.length() < 8){
            throw new CustomException("El password debe de tener al menos 8 carracteres");
        }
    }
}