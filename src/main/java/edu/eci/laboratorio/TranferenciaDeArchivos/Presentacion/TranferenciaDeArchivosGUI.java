package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import javax.swing.JFrame;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.Runtime;

public class TranferenciaDeArchivosGUI extends JFrame{
			
	public TranferenciaDeArchivosGUI() {
		
	}
	

	public static void main(String[] args) throws TransferenciaDeArhivosException, IOException {
		String url = "src\\main\\java\\edu\\eci\\laboratorio\\Archivos\\p.bat";
		PrintWriter writer = new PrintWriter(url, "UTF-8");
		
		writer.println("@echo off");
		writer.println("echo hello");
		writer.println("");
		
		writer.close();
		Runtime.getRuntime().exec("cmd /c start "+url+ " /V:OFF");
		System.out.println("Se logro");
		

		
	}
 
}
