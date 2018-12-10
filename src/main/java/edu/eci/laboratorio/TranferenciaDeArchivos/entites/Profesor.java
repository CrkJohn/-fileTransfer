package edu.eci.laboratorio.TranferenciaDeArchivos.entites;

import java.util.ArrayList;

public class Profesor{
		
	ArrayList<Salon> salones;
	String nombre;
	String documento;
	public ArrayList<Salon> getSalones() {
		return salones;
	}
	public void setSalones(ArrayList<Salon> salones) {
		this.salones = salones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}	

        @Override
        public String toString() {
            return "Profesor{" + "salones=" + salones + ", nombre=" + nombre + ", documento=" + documento + '}';
        }
        
        
}
	