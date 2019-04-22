/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gab12
 */
public class conexion {
    
    private static Connection cnx = null;
    public static Connection obtener() throws SQLException, ClassNotFoundException{
    
        if (cnx == null){
            // Se hace la conexión
            try{
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/java_mysql","root","GGsql120");
            }
            catch(SQLException ex){
                throw new SQLException(ex);
            }
            catch(ClassNotFoundException ex){
                throw new ClassNotFoundException(ex.getLocalizedMessage());
            }
        }    
        return cnx;
    }   
}