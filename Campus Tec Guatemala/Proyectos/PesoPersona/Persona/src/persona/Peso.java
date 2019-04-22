
package persona;

/**
 *
 * @author gab12
 */
public class Peso {
              
       public static double[] pesoMethod(double pesoCalc) {
   
            // Este es el método para el cálculo del peso en la Luna y Marte
            // Peso en Luna = (Peso en la Tierra/9,81m/s2) * 1,622m/s2
            // Peso en Marte = (Peso en la Tierra/9.81m/s2) * 3.711m/s2

            double pesoLuna;
            double pesoMarte;
            pesoLuna = (pesoCalc / 9.81) * 1.622;
            pesoMarte = (pesoCalc / 9.81) * 3.711;
            double[] pesoCalculado = {pesoLuna,pesoMarte};
            return pesoCalculado;
    }
}