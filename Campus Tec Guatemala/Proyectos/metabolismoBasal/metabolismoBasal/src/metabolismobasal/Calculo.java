package metabolismobasal;

/**
 * @author gab12
 */
public class Calculo {

    /* 
    Clase que hace el cálculo de la tasa metabólica basal, utilizando la fórmula 
     (10 x peso en kg) + (6,25 × altura en cm) – (5 × edad en años) + 5 
    */
    
 public Calculo(){}
 
 public double Calcular(double peso,int altura,int edad,int varSexo, double actividad) {
     double tmb = ((10 * peso) + (6.25 * altura) - (5 * edad) + varSexo) * actividad;
     return tmb;
    }
}