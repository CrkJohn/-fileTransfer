/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.laboratory.files.persistence;

import edu.eci.laboratory.files.entities.Classroom;
import edu.eci.laboratory.files.entities.Computer;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author GOMEZSOLANONICOLAS
 */
public class textPersistence implements GeneralPersistence {
    
    public textPersistence instance;
    public File file;
    
    public textPersistence getInstance(){
        if(instance==null)instance = new textPersistence();
        return instance;
    }
    
    private textPersistence(){
        file = new File(getClass().getResource("/edu/eci/laboratory/files/resources/persistence.txt").getFile());
    }

    @Override
    public boolean addComputer(Computer c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addClassroom(Classroom c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeComputerIP(String newIP, String oldIP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeComputerName(String oldName, String newName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeClassroomName(String oldName, String newName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Computer> getComputers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Classroom> getClassrooms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String getIDClassroom(String name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameClassroom(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteComputer(String Name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteClassroom(String Name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
