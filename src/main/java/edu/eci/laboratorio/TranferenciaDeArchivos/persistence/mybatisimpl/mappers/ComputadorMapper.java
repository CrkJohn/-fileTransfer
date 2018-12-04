package edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.mappers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.exceptions.PersistenceException;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;

public interface ComputadorMapper {
    public ArrayList<Computador> getComputadores() throws PersistenceException;    
}