package edu.eci.laboratorio.TranferenciaDeArchivos.entites;

import java.util.ArrayList;

public class Salon{
	
	
	int id;
	String nombre;
	String descripcion;
	ArrayList<Computador> pcs;
	
	public ArrayList<Computador> getPcs() {
		return pcs;
	}

	public void setPcs(ArrayList<Computador> pcs) {
		this.pcs = pcs;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
