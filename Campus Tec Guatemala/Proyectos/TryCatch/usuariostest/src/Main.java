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
public class Main {
    public static void main(String[] args){
        String user, password, repassword;
        user = "alejandropr1";
        password = "12345678";
        repassword = "5675";
        
        MyHelper h = new MyHelper();
        
        try{
            h.validatePassword(password, repassword);
        }
        catch(CustomException e){
          e.printStackTrace();
          System.out.println("No se puede registrar un usuario porque "+e.getMessage());
        }        
    }
}