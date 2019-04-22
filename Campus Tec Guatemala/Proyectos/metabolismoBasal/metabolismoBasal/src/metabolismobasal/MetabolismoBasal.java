
package metabolismobasal;

import java.util.Scanner;

/**
 * @author gab12
 */

public class MetabolismoBasal {

    public static void main(String[] args) {
        
        String nombre;
        int sexo;
        int tipoPeso;
        double peso;
        int estatura;
        int edad;
        int actividad;
        double xacti = 1;
 
        System.out.println("Hola, este programa te permite calcular tu metabolismo basal");
        System.out.println("");
        System.out.println("Ingresa la siguiente información");

        System.out.println("");
        System.out.println("Sexo");
        System.out.println("1 - Hombre");
        System.out.println("2 - Mujer");
        Scanner input1 = new Scanner(System.in);
        sexo = input1.nextInt();
        
        System.out.println("");
        System.out.println("Tu nombre: ");
        Scanner input0 = new Scanner (System.in);
        nombre = input0.nextLine();
        
        System.out.println("");
        System.out.println("¿Quieres hacer el cálculo con el peso en kilos o libras?");
        System.out.println("1 - Kilos");
        System.out.println("2 - Libras");
        Scanner input2 = new Scanner(System.in);
        tipoPeso = input2.nextInt();
        System.out.println("");
        System.out.println("Ahora ingresa tu peso");
        Scanner input3 = new Scanner(System.in);
        peso = input3.nextDouble();
        
        if (tipoPeso == 2){
            peso = peso / 2.2046;
        }
      
        System.out.println("");
        System.out.println("Ingresa tu estatura en centímetros");
        Scanner input4 = new Scanner(System.in);
        estatura = input4.nextInt();
        
        System.out.println("");
        System.out.println("¿Cuál es tu edad?");
        Scanner input5 = new Scanner(System.in);
        edad = input5.nextInt();

        System.out.println("");
        System.out.println("¿Cuál es tu nivel de actividad?");
        System.out.println("1 - Sedentario");
        System.out.println("2 - Actividad ligera");
        System.out.println("3 - Actividad moderada");
        System.out.println("4 - Actividad intensa");
        System.out.println("5 - Actividad muy intensa");
        Scanner input6 = new Scanner(System.in);
        actividad = input6.nextInt();
        
        if (actividad == 1){
            Actividad acti = new Actividad();
            acti.setActividad1();
            xacti = acti.getActividad1();
        }
        if (actividad == 2){
            Actividad acti = new Actividad();
            acti.setActividad2();
            xacti = acti.getActividad2();
        }
        if (actividad == 3){
            Actividad acti = new Actividad();
            acti.setActividad3();
            xacti = acti.getActividad3();
        }
        if (actividad == 4){
            Actividad acti = new Actividad();
            acti.setActividad4();
            xacti = acti.getActividad4();
        }
        if (actividad == 5){
            Actividad acti = new Actividad();
            acti.setActividad5();
            xacti = acti.getActividad5();
        }
        
        if (sexo == 2){
            Mujer mujer = new Mujer();
                mujer.setSexo(sexo);
                mujer.setNombre(nombre);
                mujer.setPeso(peso);
                mujer.setEstatura(estatura);
                mujer.setEdad(edad);
                mujer.setActividad(xacti);
                Calculo calc = new Calculo();
                double tmb = calc.Calcular(mujer.getPeso(), mujer.getEstatura(), mujer.getEdad(), mujer.getVarSexo(),mujer.getActividad());
                System.out.println("");
                System.out.println("Tu metabolismo basal es de: "+(tmb/mujer.getActividad()));
                System.out.println("Las calorías necesarias para mantener tu peso es: "+tmb);
        }
        if (sexo == 1){
            Hombre hombre = new Hombre();
                hombre.setSexo(sexo);
                hombre.setNombre(nombre);
                hombre.setPeso(peso);
                hombre.setEstatura(estatura);
                hombre.setEdad(edad);
                hombre.setActividad(xacti);
                Calculo calc = new Calculo();
                double tmb = calc.Calcular(hombre.getPeso(), hombre.getEstatura(), hombre.getEdad(), hombre.getVarSexo(),hombre.getActividad());
                System.out.println("");
                System.out.println("Tu metabolismo basal es de: "+(tmb/hombre.getActividad()));
                System.out.println("Las calorías necesarias para mantener tu peso es: "+tmb);
        }
    }
}