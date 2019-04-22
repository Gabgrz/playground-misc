    public void actualizar(Connection conexion, Tarea tarea) throws SQLException{
                try {
        PreparedStatement consulta;
            consulta = conexion.prepareStatement("UPDATE "
                    + this.tabla
                    + "SET titulo = ?, descripcion = ? WHERE id_tarea = ?;
        consulta.setString(1, tarea.getTitulo());
        consulta.setString(2, tarea.getDescripcion());
        consulta.setString(3, tarea.getId_tarea());
        consulta.executeUpdate();
    }

            catch(SQLException ex){
            throw new SQLException(ex);
        }
    }

    ----



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