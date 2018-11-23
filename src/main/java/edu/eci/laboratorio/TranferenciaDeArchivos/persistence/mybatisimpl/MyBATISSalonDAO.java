package edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl;

import java.util.ArrayList;

import org.apache.ibatis.exceptions.PersistenceException;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.SalonDAO;

public class MyBATISSalonDAO implements SalonDAO{

	public boolean agregarSalon(Salon c) throws PersistenceException {
		// TODO Auto-generated method stub
		return false;
	}

	public void cambiarNombreSalon(String oldName, String newName) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void eliminarSalon(String Name) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Salon> getSalones() throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSalonNombre(String id) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

}
