package edu.eci.laboratorio.TranferenciaDeArchivos.persistence;



import edu.eci.laboratorio.TranferenciaDeArchivos.entites.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author GOMEZSOLANONICOLAS
 */
public class SQLPersistence implements GeneralPersistence {
    
    public static SQLPersistence instance;
    private final HashMap<String, String> configMap;
    private final Connection con;
    
    public static SQLPersistence getInstance() throws IOException, ClassNotFoundException, SQLException{
        if(instance==null)instance = new SQLPersistence();
        return instance;
    }
    
    @SuppressWarnings("empty-statement")
    private SQLPersistence() throws IOException, ClassNotFoundException, SQLException{
        File jarPath=new File(SQLPersistence.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
        File prop = new File(propertiesPath+"/config.ini");
        BufferedReader br = new BufferedReader(new FileReader(prop));
        String line;
        configMap = new HashMap<String, String>();
        while((line = br.readLine()).startsWith("#"));
        configMap.put(line.split("=")[0], line.split("=")[1]);
        while((line = br.readLine()).startsWith("#"));
        configMap.put(line.split("=")[0], line.split("=")[1]);
        while((line = br.readLine()).startsWith("#"));
        configMap.put(line.split("=")[0], line.split("=")[1]);
        while((line = br.readLine()).startsWith("#"));
        configMap.put(line.split("=")[0], line.split("=")[1]);
        while((line = br.readLine()).startsWith("#"));
        configMap.put(line.split("=")[0], line.split("=")[1]);
        String dbhost = configMap.get("dbhost");
        String dbport = configMap.get("dbport");
        String dbname = configMap.get("dbname");
        String dbuser = configMap.get("dbuser");
        String dbpassword = configMap.get("dbpassword");
        Class.forName("com.mysql.jdbc.Driver");
        //System.out.println(dbhost+" "+dbport+" "+dbname+" "+dbpassword);
        con = DriverManager.getConnection ("jdbc:mysql://"+dbhost+":"+dbport,dbuser, dbpassword);
        con.createStatement().execute("use "+dbname+";");
    }

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

	public ArrayList<Computador> getComputers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Salon> getClassrooms() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getIDClassroom(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNameClassroom(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteComputer(String Name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteClassroom(String Name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

    /*
     * @Override
    public boolean agregarComputador(Computador c) throws SQLException{
        Statement s = con.createStatement(); 
        boolean resp = false;
        if(!computerExists(c)){
            String text;
            if(c.getCRoom() == null){
                text = "INSERT INTO computer (ip, name) VALUES ('"+c.getIP()+"','"+c.getName()+"')";
            }else{
                text = "INSERT INTO computer (ip, name, idclass) VALUES ('"+c.getIP()+"','"+c.getName()+"','"+c.getCRoom()+"')";
            }
            s.executeUpdate(text);
            resp = true;
        }
        return resp;
    }

    @Override
    public boolean addClassroom(Classroom c) throws SQLException{
        Statement s = con.createStatement(); 
        boolean resp = false;
        if(!classroomExists(c)){
            s.executeUpdate("INSERT INTO classroom (name) VALUES ('"+c.getName()+"');");
            resp = true;
            for(Computer comp : c.getComputers()){
                addComputer(comp);
            }
        }
        return resp;
    }

    @Override
    public void changeComputerIP(String oldIP, String newIP) throws SQLException{
        Statement s = con.createStatement(); 
        s.executeUpdate("UPDATE FROM computer SET ip = '"+newIP+"' WHERE ip = '"+oldIP+"';");
    }

    @Override
    public void changeComputerName(String oldName, String newName) throws SQLException{
        Statement s = con.createStatement(); 
        s.executeUpdate("UPDATE FROM computer SET name = '"+newName+"' WHERE name = '"+oldName+"';");
    }
    
    public void changeComputerClassroomName(String oldName, String newName) throws SQLException{
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT id FROM classroom WHERE name = '"+oldName+"';");
        String idViejo = rs.getString("id");
        rs.close();
        rs = s.executeQuery("SELECT id FROM classroom WHERE name = '"+newName+"';");
        String idNuevo = rs.getString("id");
        rs.close();
        s.executeUpdate("UPDATE FROM computer SET idclass = "+idNuevo+" WHERE idclass = "+idViejo+";");
    }

    @Override
    public void changeClassroomName(String oldName, String newName) throws SQLException{
        Statement s = con.createStatement(); 
        s.executeUpdate("UPDATE classroom SET name = '"+newName+"' WHERE name = '"+oldName+"';");
    }
    
     public void changeComputer(String oldName, String newName, String ip, String lab) throws SQLException { 
        Statement s = con.createStatement(); 
        s.executeUpdate("UPDATE computer SET name = '"+newName+"', ip = '"+ip+"', idclass = '"+lab+"' WHERE name = '"+oldName+"';");
    }

    /**
     *
     * @return
     * @throws SQLException
     
    @Override
    public ArrayList<Computer> getComputers() throws SQLException{
        ArrayList<Computer> computers = new ArrayList<>();
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT * FROM computer;");
        while(rs.next()){
            String ip = rs.getString("ip");
            String name = rs.getString("name");
            String idclass = rs.getString("idclass");
            computers.add(new Computer(ip,name,idclass));
        }
	return computers;
    }

    @Override
    public ArrayList<Classroom> getClassrooms() throws SQLException{
        ArrayList<Classroom> classrooms = new ArrayList<>();
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT * FROM classroom;");
        while(rs.next()){
            String name = rs.getString("name");
            classrooms.add(new Classroom(name,getComputersByClassroom(name)));
        }
	return classrooms;
    }
    
    @Override
    public String getIDClassroom(String name) throws SQLException{
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT * FROM classroom where name = '"+name+"';");
        String id = null;
        if(rs.next()){
            id = rs.getString("id");
        }
	return id;
    }
    
    @Override
    public String getNameClassroom(String id) throws SQLException{
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT * FROM classroom where id = '"+id+"';");
        String Name = null;
        if(rs.next()){
            Name = rs.getString("name");
        }
	return Name;
    }
    
    public ArrayList<Computer> getComputersByClassroom(String classRoomName) throws SQLException{
        ArrayList<Computer> computers = new ArrayList<>();
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT id FROM classroom WHERE name = '"+classRoomName+"';");
        rs.next();
        String id = rs.getString("id");
        rs.close();
        rs = s.executeQuery("SELECT * FROM computer where idclass = "+id+";");
        while(rs.next()){
            String ip = rs.getString("ip");
            String name = rs.getString("name");
            String idclass = rs.getString("idclass");
            computers.add(new Computer(ip,name,idclass));
        }
	return computers;
    }

    public boolean computerExists(Computer c) throws SQLException{
        Statement s = con.createStatement(); 
	ResultSet rs = s.executeQuery("SELECT * FROM computer WHERE ip = '"+c.getIP()+"' or name = '"+c.getName()+"';");
        return rs.next();
    }

    public boolean classroomExists(Classroom c) throws SQLException {
        Statement s = con.createStatement(); 
	ResultSet rs = s.executeQuery("SELECT * FROM classroom WHERE name = '"+c.getName()+"';");
        return rs.next();
    }

    public Computer getComputerByIP(String IP) throws SQLException, FilesException {
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT * FROM computer WHERE ip = '"+IP+"';");
        if(!rs.next()){
            throw new FilesException(FilesException.INVALID_COMPUTER);
        }
        String ip = rs.getString("ip");
        String name = rs.getString("name");
        String idclass = rs.getString("idclass");
        return new Computer(ip,name,idclass);
    }
    
    public Computer getComputerByName(String name) throws SQLException, FilesException {
        Statement s = con.createStatement(); 
        ResultSet rs = s.executeQuery("SELECT * FROM computer WHERE name = '"+name+"';");
        if(!rs.next()){
            throw new FilesException(FilesException.INVALID_COMPUTER);
        }
        String ip = rs.getString("ip");
        String idclass = rs.getString("idclass");
        return new Computer(ip,name,idclass);
    }
    
    public Classroom getClassroomByName(String name) throws SQLException, FilesException {
        ArrayList<Computer> computadores = getComputersByClassroom(name);
        Classroom c = new Classroom(name, computadores);
        return c;
    }

    @Override
    public void deleteComputer(String name) throws SQLException {
        Statement s = con.createStatement(); 
        s.executeUpdate("DELETE FROM computer WHERE name = '"+name+"';");
    }

    @Override
    public void deleteClassroom(String name) throws SQLException {
        Statement s = con.createStatement(); 
        s.executeUpdate("DELETE FROM classroom WHERE name = '"+name+"';");
    }
     */ 
     
	
	
}
