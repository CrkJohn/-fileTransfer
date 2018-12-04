package edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.SalonDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.mappers.SalonMapper;
import java.util.ArrayList;

public class MyBATISSalonDAO implements SalonDAO{
    
        @Inject
        private SalonMapper salonMapper;

	public boolean agregarSalon(Salon c) throws PersistenceException {
		// TODO Auto-generated method stub
		return false;
	}

	public void cambiarNombreSalon(String oldName, String newName) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}



	public ArrayList<Salon> getSalones() throws PersistenceException {
		return salonMapper.getSalones();
	}

	public String getSalonNombre(String id) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

}
