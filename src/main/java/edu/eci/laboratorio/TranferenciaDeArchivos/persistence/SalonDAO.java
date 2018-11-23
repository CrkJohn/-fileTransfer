package edu.eci.laboratorio.TranferenciaDeArchivos.persistence;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.exceptions.PersistenceException;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;

public interface SalonDAO{
    public boolean agregarSalon(Salon c) throws SQLException; 
    public void cambiarNombreSalon(String oldName, String newName) throws SQLException;    
    public void eliminarSalon(String Name) throws SQLException;
    public ArrayList<Salon> getSalones() throws SQLException;    
    public String getSalonNombre(String id) throws SQLException;
}
