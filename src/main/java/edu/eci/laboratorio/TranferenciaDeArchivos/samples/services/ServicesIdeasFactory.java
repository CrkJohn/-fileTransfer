package edu.eci.laboratorio.TranferenciaDeArchivos.samples.services;


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
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.ServicesIdeas;
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.impl.ServicesTranferenciaDeArchivosImpl;


public class ServicesIdeasFactory {

    
    private static ServicesIdeasFactory instance = new ServicesIdeasFactory();
     
    private static Injector injector;

    private  ServicesIdeasFactory() {
    	  injector = createInjector(new XMLMyBatisModule() {
              @Override
              protected void initialize() {
                  install(JdbcHelper.PostgreSQL);                        
                  setClassPathResource("mybatis-config.xml");         
                  bind(ComputadorDAO.class).to(MyBATISComputadorDAO.class);
                  bind(SalonDAO.class).to(MyBATISSalonDAO.class); 
                  bind(ProfesorDAO.class).to(MyBATISProfesorDAO.class);
                  bind(ServicesIdeas.class).to(ServicesTranferenciaDeArchivosImpl.class);
                                  
              }
          }
          
    );
  
    	
    	 
    }

    public ServicesIdeas getIdeasServices(){
        return injector.getInstance(ServicesIdeas.class);   
    }
   
    public static ServicesIdeasFactory getInstance(){
        return instance;
    }

}