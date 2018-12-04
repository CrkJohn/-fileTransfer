package edu.eci.pdsw.guice;
/*
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.ComputadorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.ProfesorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.SalonDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.MyBATISComputadorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.MyBATISProfesorDAO;
import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.MyBATISSalonDAO;

*/


public class GuiceContextListener /*
        implements ServletContextListener */
    {

	/*public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
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
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}*/
}