/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Tarea;

/**
 *
 * @author gab12
 */
public class Tareas_servicios {
    
    private final String tabla = "tareas";
    
    public void guardar(Connection conexion, Tarea tarea) throws SQLException{
                try {
        PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO "
                    + this.tabla
                    + "(titulo, descripcion, nivel_de_prioridad) "
                    + "VALUES (?,?,?)");
        consulta.setString(1, tarea.getTitulo());
        consulta.setString(2, tarea.getDescripcion());
        consulta.setInt(3, tarea.getNivel_de_prioridad());
        consulta.executeUpdate();
    }
        catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
}