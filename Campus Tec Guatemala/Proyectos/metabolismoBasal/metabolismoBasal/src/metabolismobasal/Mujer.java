
package metabolismobasal;

/**
 *
 * @author gab12
 */
public class Mujer extends Persona{
    
    public Mujer(){
        this.setVarSexo(-161);
    };

    @Override
    public void setVarSexo(int varSexo) {
        this.varSexo = varSexo;
    }

    @Override
    public int getVarSexo() {
        return varSexo;
    }

    @Override
    public double getActividad() {
        return super.getActividad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setActividad(double actividad) {
        super.setActividad(actividad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEstatura() {
        return super.getEstatura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEstatura(int estatura) {
        super.setEstatura(estatura); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPeso() {
        return super.getPeso(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso); //To change body of generated methods, choose Tools | Templates.
    }
}