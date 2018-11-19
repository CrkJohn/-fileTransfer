package edu.eci.laboratorio.TranferenciaDeArchivos.persistence;


import edu.eci.laboratorio.TranferenciaDeArchivos.entites.*;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;


public class textPersistence implements GeneralPersistence {
    
    public textPersistence instance;
    public File file;
    
    public textPersistence getInstance(){
        if(instance==null)instance = new textPersistence();
        return instance;
    }
    
    private textPersistence(){
        file = new File(getClass().getResource("/edu/eci/laboratorio/resources/persistence.txt").getFile());
    }

	public boolean agregarComputador(Computador c) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean agregarSalon(Salon c) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void cambiarNombreSalon(String oldName, String newName) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Computador> getComputadores() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Salon> getSalones() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSalonNombre(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarComputador(String Name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void eliminarSalon(String Name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

    

    
}
