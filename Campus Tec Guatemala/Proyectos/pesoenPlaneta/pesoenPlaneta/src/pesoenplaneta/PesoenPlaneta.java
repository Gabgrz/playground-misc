
package pesoenplaneta;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author gab12
 */
public class PesoenPlaneta {

    public static String nombre;
    public static double peso;
    public static int edad;
    public static double gravedadOrigen;
    public static double gravedadDestino;
    
    public static void main(String[] args) {
         
        int choice = 1;
        int planetaOrigen;
        int pesoMedida;  
        int planetaDestino;
        DecimalFormat df = new DecimalFormat("0.##");
        String nomplanetaOrigen = "";
        String nomplanetaDestino = "";
                
        // Ingreso de datos

        System.out.printf("%s\n\n", "Hola, este programa te permite calcular el peso de una persona en un objeto astronómico.");
        while (choice == 1) {
        System.out.printf("%s\n\n", "Ingresa los datos de la persona.");
        System.out.print("Nombre: ");
        Scanner input1 = new Scanner(System.in);
        nombre = input1.nextLine();
        System.out.print("Edad: ");
        Scanner input2 = new Scanner(System.in);
        edad = input2.nextInt();
        System.out.println("");
        System.out.println("¿En qué lugar se encuentra actualmente? (elige un número)");
        System.out.println("1 - En la Tierra");
        System.out.println("2 - En la Luna ");
        System.out.printf("%s\n\n","3 - En Marte");   
        Scanner input3 = new Scanner(System.in);
        planetaOrigen = input3.nextInt();
        
        Tierra tierra = new Tierra();
        Luna luna = new Luna();
        Marte marte = new Marte();
        
        if (planetaOrigen == 1){
            gravedadOrigen = tierra.GRAVEDAD;
            nomplanetaOrigen = tierra.NOMBRE;
        }
        if (planetaOrigen == 2){
            gravedadOrigen = luna.GRAVEDAD;
            nomplanetaOrigen = luna.NOMBRE;
        }
        if (planetaOrigen == 3) {
            gravedadOrigen = marte.GRAVEDAD;
            nomplanetaOrigen = marte.NOMBRE;
        }
        
        System.out.println("");
        System.out.println("¿Quieres calcular el peso en libras o kilogramos? (Ingresa un número)");
        System.out.println("1 - Libras");
        System.out.printf("%s\n\n", "2 - Kilogramos");        
        Scanner input4 = new Scanner(System.in);
        pesoMedida = input4.nextInt();
        System.out.println("");
        System.out.print("Ingresa el peso actual de la persona: ");
        Scanner input5 = new Scanner(System.in);
        peso = input5.nextDouble();
        System.out.println("");
        System.out.println("¿En dónde quieres conocer su peso? (elige un número)");
        
        switch (planetaOrigen) {
            case 1:
                System.out.println("1 - "+luna.NOMBRE);
                System.out.println("2 - "+marte.NOMBRE);
                System.out.println("");
                Scanner input6a = new Scanner(System.in);
                planetaDestino = input6a.nextInt();
                if (planetaDestino == 1) {
                    gravedadDestino = luna.GRAVEDAD;
                    nomplanetaDestino = luna.NOMBRE;
                }
                if (planetaDestino == 2) {
                    gravedadDestino = marte.GRAVEDAD;
                    nomplanetaDestino = marte.NOMBRE;
                }
                break;
            case 2:
                System.out.println("1 - "+tierra.NOMBRE);
                System.out.println("2 - "+marte.NOMBRE);
                System.out.println("");
                Scanner input6b = new Scanner(System.in);
                planetaDestino = input6b.nextInt();
                if (planetaDestino == 1) {
                    gravedadDestino = tierra.GRAVEDAD;
                    nomplanetaDestino = tierra.NOMBRE;
                }
                if (planetaDestino == 2) {
                    gravedadDestino = marte.GRAVEDAD;
                    nomplanetaDestino = marte.NOMBRE;
                }
                break;
            case 3:
                System.out.println("1 - "+tierra.NOMBRE);
                System.out.println("2 - "+luna.NOMBRE);
                System.out.println("");
                Scanner input6c = new Scanner(System.in);
                planetaDestino = input6c.nextInt();
                if (planetaDestino == 1) {
                    gravedadDestino = tierra.GRAVEDAD;
                    nomplanetaDestino = tierra.NOMBRE;
                }
                if (planetaDestino == 2) {
                    gravedadDestino = luna.GRAVEDAD;
                    nomplanetaDestino = luna.NOMBRE;
                }
                break;
        }
        

        calculoFinal calcc;
            calcc = new calculoFinal();
            calculoFinal resultadoFinal = calcc;
        
        Persona persona = new Persona();
                
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("RESULTADO");
        System.out.println("");
        if(pesoMedida == 1){
        System.out.println(persona.nombre+" pesa "+persona.getPeso()+" libras en el objeto astronómico "+nomplanetaOrigen+", por lo que pesaría "+df.format(resultadoFinal)+" libras en el objeto "+nomplanetaDestino+".");
        }
        if(pesoMedida == 2){
        System.out.println(persona.nombre+" pesa "+persona.getPeso()+" kilogramos en el objeto astronómico "+nomplanetaOrigen+", por lo que pesaría "+df.format(resultadoFinal)+" kilogramos en el objeto "+nomplanetaDestino+"."); 
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("¿Deseas hacer un nuevo cáculo? (elige un número)");
        System.out.println("1 - Si");
        System.out.println("2 - No");
        Scanner input7 = new Scanner(System.in);
        choice = input7.nextInt();
        while (choice != 1 && choice != 2) {
                System.out.print("Opción inválida, por favor elige 1 o 2: ");
                Scanner altinput7 = new Scanner(System.in);
                choice = altinput7.nextInt();}
        }
    }
}