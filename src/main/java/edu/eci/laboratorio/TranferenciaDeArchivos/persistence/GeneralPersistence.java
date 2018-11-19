/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.laboratorio.TranferenciaDeArchivos.persistence;


import java.util.ArrayList;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.*;
import java.sql.SQLException;

public interface GeneralPersistence {
    
    public boolean agregarComputador(Computador c) throws SQLException;
    
    public boolean agregarSalon(Salon c) throws SQLException;
  
    
    public void cambiarNombreSalon(String oldName, String newName) throws SQLException;
    
    public ArrayList<Computador> getComputers() throws SQLException;
    
    public ArrayList<Salon> getClassrooms() throws SQLException;
    
    public String getIDClassroom(String name) throws SQLException;
    
    public String getNameClassroom(String id) throws SQLException;
    
    public void deleteComputer(String Name) throws SQLException;
    
    public void deleteClassroom(String Name) throws SQLException;
}
