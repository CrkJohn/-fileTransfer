package edu.eci.laboratorio.TranferenciaDeArchivos.entites;

public class Computador {
	
	String nombre;
	int id;

	public Computador(String nombre, int id) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
