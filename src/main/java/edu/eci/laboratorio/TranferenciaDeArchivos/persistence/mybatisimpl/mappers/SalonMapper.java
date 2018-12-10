package edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.mappers;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.exceptions.PersistenceException;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;

public interface SalonMapper {
    public boolean agregarSalon(@Param("salon") Salon c) throws PersistenceException; 
    public void cambiarNombreSalon(@Param("oldName")String oldName,@Param("newName")String newName)throws PersistenceException;    
    public ArrayList<Salon> getSalones() throws PersistenceException;    
    public Salon getSalonNombre(@Param("id") String id) throws PersistenceException;
}
