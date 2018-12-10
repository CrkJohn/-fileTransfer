package edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl;

import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.ProfesorDAO;

import org.apache.ibatis.exceptions.PersistenceException;
import com.google.inject.Inject;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.mappers.ProfesorMapper;
public class MyBATISProfesorDAO  implements ProfesorDAO{
    
    @Inject
    ProfesorMapper profesorMapper;

}
