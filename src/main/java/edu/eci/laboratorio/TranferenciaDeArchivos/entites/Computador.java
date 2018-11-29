package edu.eci.laboratorio.TranferenciaDeArchivos.entites;

public class Computador {
	
	String nombre;
	int id;
	Salon salon;


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
	

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}
}
