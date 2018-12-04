package edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.ComputadorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.mappers.ComputadorMapper;


public class MyBATISComputadorDAO implements ComputadorDAO{

	
	@Inject
	private ComputadorMapper computadorMapper;
	
	
	public ArrayList<Computador> getComputadores() throws PersistenceException {
		return computadorMapper.getComputadores();
	}

	
	
}