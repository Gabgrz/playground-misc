/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author gab12
 */
public class Procesar {
    
    double n1 = 0;
    double n2 = 0;
    double result = 0;
    
    public Procesar (){}
    
    public void capturaDatos () {

        n1 = Integer.parseInt(calcView.jNum1.getText());
        n2 = Integer.parseInt(calcView.jNum2.getText());
    }
    
    public void Suma (){
        result = n1+n2;
    }
    
    public void Resta() {
        result = n1 - n2;
    }
    
    public void Multiplicacion() {
        result = n1 * n2;
    }
    
    public void Division() {
        result = n1 / n2;
    }
    
    public void imprimirDatos() {
        
        JOptionPane.showMessageDialog(null, "El resultado es: "+result, "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
}