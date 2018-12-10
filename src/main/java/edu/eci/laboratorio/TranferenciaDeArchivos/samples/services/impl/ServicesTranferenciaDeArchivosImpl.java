package edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.*;
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.ServicesIdeas;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicesTranferenciaDeArchivosImpl implements ServicesIdeas {

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

    public ArrayList<Salon> getSalones() {
        
        try {
            System.err.println(salonDAO==null);
            return salonDAO.getSalones();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return null;
    }

    public Salon getSalonNombre(String id) throws SQLException {
        return salonDAO.getSalonNombre(id);
    }

    public ArrayList<Computador> getComputadores() throws SQLException {
        return computadorDAO.getComputadores();
            
    }

    public void eliminarComputador(String Name) throws SQLException {
        // TODO Auto-generated method stub

    }

}
