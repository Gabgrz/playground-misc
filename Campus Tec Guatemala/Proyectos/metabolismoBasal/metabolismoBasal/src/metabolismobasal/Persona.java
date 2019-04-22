package metabolismobasal;

/**
 *
 * @author gab12
 */
public class Persona {
    private double peso;
    private String nombre;
    private int estatura;
    public int varSexo;
    private int edad;
    private double actividad;
    private int sexo;

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }   
    
    public int getEstatura() {
        return estatura;
    }
    
    public void setVarSexo(int varSexo) {
        this.varSexo = varSexo;
    }

    public int getVarSexo() {
        return varSexo;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setActividad(double actividad) {
        this.actividad = actividad;
    }

    public double getActividad() {
        return actividad;
    }
    
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getSexo() {
        return sexo;
    }
}