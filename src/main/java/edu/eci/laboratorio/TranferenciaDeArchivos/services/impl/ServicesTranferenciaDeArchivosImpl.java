package edu.eci.laboratorio.TranferenciaDeArchivos.services.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.*;
import edu.eci.laboratorio.TranferenciaDeArchivos.services.ServicesTranferenciaDeArchivos;

public class ServicesTranferenciaDeArchivosImpl implements ServicesTranferenciaDeArchivos{
	
	@Inject
	private ComputadorDAO computadorDAO;
	@Inject
	private SalonDAO salonDAO;
	@Inject
	private ProfesorDAO profesorDAO;
	
	

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

	public void eliminarSalon(String Name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Salon> getSalones() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSalonNombre(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Computador> getComputadores() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarComputador(String Name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
