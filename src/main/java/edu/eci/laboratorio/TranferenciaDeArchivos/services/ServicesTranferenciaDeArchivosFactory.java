package edu.eci.laboratorio.TranferenciaDeArchivos.services;


import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;


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
                  /*bind(UsuarioDAO.class).to(MyBATISUsuarioDAO.class);
                  bind(IniciativaDAO.class).to(MyBATISIniciativaDAO.class);
                  bind(InteresDAO.class).to(MyBATISInteresDAO.class);
                  bind(ComentarioDAO.class).to(MyBATISComentarioDAO.class);
                  bind(ServicesIdeas.class).to(ServicesIdeasImpl.class);*/
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

    public ServicesTranferenciaDeArchivos getIdeasServices(){
        return injector.getInstance(ServicesTranferenciaDeArchivos.class);   
    }
   
    public static ServicesTranferenciaDeArchivosFactory getInstance(){
        return instance;
    }

}