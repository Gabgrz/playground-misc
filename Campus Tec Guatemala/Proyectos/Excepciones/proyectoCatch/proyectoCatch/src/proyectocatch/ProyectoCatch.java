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
public class ProyectoCatch {

    /**
     * @param args the command line arguments
     */
 
        public static void main(String[] args) {
        // TODO code application logic here
            String user, password, repassword;
            user = "gabgrz";
            password = "mypass";
            repassword = "1234";
            
            myHelper h = new myHelper();
            try{
               h.validarPassword(password, repassword);
            }
            catch (Exception e){
            }
    }
}