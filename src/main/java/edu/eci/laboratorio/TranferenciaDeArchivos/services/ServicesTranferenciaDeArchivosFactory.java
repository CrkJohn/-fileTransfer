package edu.eci.laboratorio.TranferenciaDeArchivos.services;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;


import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.ComputadorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.ProfesorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.SalonDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.MyBATISComputadorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.MyBATISProfesorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.MyBATISSalonDAO;



public class ServicesTranferenciaDeArchivosFactory {

    
    private static ServicesTranferenciaDeArchivosFactory instance = new ServicesTranferenciaDeArchivosFactory();
     
    private static Injector injector;
    private static Injector testingInjector;

    private  ServicesTranferenciaDeArchivosFactory() {
    	  injector = createInjector(new XMLMyBatisModule() {
             @Override
              protected void initialize() {
                  install(JdbcHelper.PostgreSQL);                        
                  setClassPathResource("mybatis-config.xml");         
                  bind(ComputadorDAO.class).to(MyBATISComputadorDAO.class);
                  bind(SalonDAO.class).to(MyBATISSalonDAO.class);
                  bind(ProfesorDAO.class).to(MyBATISProfesorDAO.class);
                 
              }
          }
          
    );
  
    	
    	 /*testingInjector = createInjector(new XMLMyBatisModule() {
             @Override
             protected void initialize() {
                 install(JdbcHelper.MySQL);                        
                 setClassPathResource("mybatis-config-h2.xml");                        
                 //bind(ServiciosSuscripciones.class).to(ServiciosSuscripcionesImpl.class);
                 //bind(DaoComentario.class).to(MyBatisDaoComentario.class);
                 
             }
         });*/
    }

    public ServicesTranferenciaDeArchivos getTranferenciaServices(){
        return injector.getInstance(ServicesTranferenciaDeArchivos.class);   
    }
   
    public static ServicesTranferenciaDeArchivosFactory getInstance(){
        return instance;
    }

}