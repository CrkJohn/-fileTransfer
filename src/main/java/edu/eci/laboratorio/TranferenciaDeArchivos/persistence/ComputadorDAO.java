package edu.eci.laboratorio.TranferenciaDeArchivos.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.exceptions.PersistenceException;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;

public interface  ComputadorDAO {
    public ArrayList<Computador> getComputadores() throws PersistenceException;    
}
