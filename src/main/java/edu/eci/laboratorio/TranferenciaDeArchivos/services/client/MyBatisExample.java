package edu.eci.laboratorio.TranferenciaDeArchivos.services.client;


import edu.eci.laboratorio.TranferenciaDeArchivos.persistence.mybatisimpl.mappers.*;
import edu.eci.laboratorio.TranferenciaDeArchivos.services.ServicesTranferenciaDeArchivos;
import edu.eci.laboratorio.TranferenciaDeArchivos.services.ServicesTranferenciaDeArchivosFactory;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyBatisExample {
	
	
	
	public static SqlSessionFactory getSqlSessionFactory() {
		SqlSessionFactory sqlSessionFactory = null;
		if (sqlSessionFactory == null) {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				throw new RuntimeException(e.getCause());
			}
		}
		return sqlSessionFactory;
	}

	public static void main(String[] args) {
		
            SqlSessionFactory sessionfact = getSqlSessionFactory();
	    SqlSession sqlss = sessionfact.openSession();      
	    ServicesTranferenciaDeArchivosFactory servicesFactory = ServicesTranferenciaDeArchivosFactory.getInstance();
	    ServicesTranferenciaDeArchivos ideasServices = servicesFactory.getTranferenciaServices();
	    SalonMapper usrMapper =  sqlss.getMapper(SalonMapper.class);
            System.out.println("aca");
            System.out.println(usrMapper.getSalones().toString());
             
            sqlss.commit();
	    sqlss.close();
		
		
	
	}
}