package edu.eci.laboratorio.TranferenciaDeArchivos.entites;

public class TransferenciaDeArhivosException extends Exception {
	
	public static final String ERROR = "HUBO UN ERROR EN EL JUEGO";
	public static final String CLASE_NO_EXISTENTE = "LA CLASE NO EXISTE";
	public static final String mensajeBase = "... En construccion";
	public static final String EXTENSION_INVALIDA = "La extension del archivo es invalida";
	public static final String ERROR_GUARDAR = "ERROR AL GUARDAR";
	public static final String ARCHIVO_NO_ENCONTRADO = "EL ARCHIVO NO SE ENCONTRO";
	public static final String ERROR_ABRIR_ARCHIVO = "ERROR AL ABRIR EL ARCHIVO";
        public static final String ERROR_RECIBIR = "ERROR AL RECIBIR ARCHIVOS";
	//public static final String CLASE_INVALIDA = "LA CLASE ES INVALIDA";
	

	
	public  TransferenciaDeArhivosException(String msg){
		super(msg);
	}

}
