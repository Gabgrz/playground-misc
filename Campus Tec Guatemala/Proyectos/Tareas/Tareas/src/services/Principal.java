/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.SQLException;
import modelos.Tarea;
import modelos.conexion;

/**
 *
 * @author gab12
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        System.out.println("Hola");
        Tareas_servicios ts = new Tareas_servicios();
        Tarea t = new Tarea();
        t.setTitulo("Tarea no. 6");
        t.setDescripcion("Tarea no 6 descripción");
        t.setNivel_de_prioridad(2);
        t.setQueryID(6);
        ts.delete(conexion.obtener(), t);
     }
}