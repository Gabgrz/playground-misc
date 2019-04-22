package planetahabitable;

public abstract class Animales {

        
    Boolean vivo;
    String nombre;
    String tamaño;
    double peso;
   
    Animales(){
        this.vivo = true;
    }
    
    public abstract void moverse();
    public abstract void reproducirse();
    public abstract void comer();
}