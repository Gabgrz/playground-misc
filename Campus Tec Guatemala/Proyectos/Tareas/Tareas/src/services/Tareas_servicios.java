/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        public void actualizar(Connection conexion, Tarea tarea) throws SQLException{
                try {
                        PreparedStatement consulta;
                            consulta = conexion.prepareStatement("UPDATE "
                                    + this.tabla
                                    + " SET titulo = ?, descripcion = ? WHERE id_tarea = ?");
                        consulta.setString(1, tarea.getTitulo());
                        consulta.setString(2, tarea.getDescripcion());
                        consulta.setInt(3, tarea.getQueryID());
                        consulta.executeUpdate();
                    }

            catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
        public void delete(Connection conexion, Tarea tarea) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM "
                    + this.tabla
                    + " WHERE id_tarea = ?");
            consulta.setInt(1, tarea.getQueryID());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
    public List<Tarea> recuperarTodas(Connection conexion) throws SQLException{
        ArrayList<Tarea> listaTareas = new ArrayList<>();
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+this.tabla);
        ResultSet r = consulta.executeQuery();
        while (r.next()){
            listaTareas.add(new Tarea(r.getInt("id_tarea"),r.getString("titulo"),r.getString("descripción"),r.getInt("nivel_de_prioridad")));
        }
        return listaTareas;
    }
}