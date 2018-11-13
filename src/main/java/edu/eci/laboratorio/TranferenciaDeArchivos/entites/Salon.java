package edu.eci.laboratorio.TranferenciaDeArchivos.entites;

import java.util.ArrayList;

public class Salon{
	
	ArrayList<Computador> computadoras;
	int id;
	String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Salon(ArrayList<Computador> computadoras, int id){
		this.id = id;
		this.computadoras = computadoras;
	}

	public ArrayList<Computador> getComputadoras() {
		return computadoras;
	}

	public void setComputadoras(ArrayList<Computador> computadoras) {
		this.computadoras = computadoras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
