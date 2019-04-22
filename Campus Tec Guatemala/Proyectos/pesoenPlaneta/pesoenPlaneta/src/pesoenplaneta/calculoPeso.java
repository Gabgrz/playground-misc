package pesoenplaneta;

/**
 * @author gab12
 */
public class calculoPeso {
 
    public calculoPeso(){}
    
    static double calcgravedadOrigen = PesoenPlaneta.gravedadOrigen;
    static double calcPeso = PesoenPlaneta.peso;
    static double calcgravedadDestino = PesoenPlaneta.gravedadDestino;
    
    public double calculoFinal (){
        
        double calculo = (calcPeso / calcgravedadOrigen) * calcgravedadDestino;
        return calculo;
    }
}