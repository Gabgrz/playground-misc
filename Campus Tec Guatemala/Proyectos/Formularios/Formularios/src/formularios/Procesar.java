/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author gab12
 */
public class Procesar {
    
    String name = "";
    String email = "";
    int edad = 0;
    
    public Procesar(){
    
    }
    

    
        public void capturarDatos(){
            
            
            name = ventana.nombre.getText();
            email = ventana.email.getText();
            edad = Integer.parseInt(ventana.edad.getText());
        }
        
        public void imprimirDatos(){
            JOptionPane.showMessageDialog(null, "El nombre capturado es: "+name
                    +".\nLa edad capturada es: "+edad
                    +".\nEl email capturado es: "+email, "Mensaje", JOptionPane.PLAIN_MESSAGE);
        }
}