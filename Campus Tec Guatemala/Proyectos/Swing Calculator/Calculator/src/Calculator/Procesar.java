
package Calculator;

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

        n1 = Double.parseDouble(calcView.jNum1.getText());
        n2 = Double.parseDouble(calcView.jNum2.getText());
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
        
        JOptionPane.showMessageDialog(null, result, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}