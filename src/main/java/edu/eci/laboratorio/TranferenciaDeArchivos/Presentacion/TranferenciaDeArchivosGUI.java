package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.Runtime;

public class TranferenciaDeArchivosGUI extends JFrame{
	public static final Dimension sreenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static final Dimension sreenMinimo = new Dimension(1281, 744);
	private CardLayout layout;
	private JPanel menu;
	private JPanel principal;
	private JPanel  panelInicial;
	private PanelAgregarComputador panelJuego;
	private PanelAgregarSalon panelOpciones;
	private PanelAgregarProfesor panelJuegoMultiplayer;
	private PanelTranferencia panelTranferencia;

	
	
	private TranferenciaDeArchivosGUI() throws TransferenciaDeArhivosException {
			prepareElementos();
			prepareAcciones();
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setVisible(true);
	}
	
	
	private void prepareElementos() throws TransferenciaDeArhivosException {
		setTitle("Tranferencia de archivos");
		layout = new CardLayout();
		this.getContentPane().setLayout(new CardLayout());
		super.setMinimumSize(sreenMinimo);
		principal = new JPanel(layout);
		setLocationRelativeTo(null);
		add(principal);
		panelTranferencia =  new PanelTranferencia(this);
		/*panelOpciones = new PanelOpciones(this);
		controles = new Controles(this);
		panelJuego = new PanelJuego(this); 
		panelJuegoMultiplayer  = new PanelJuegoMultiplayer(this);
 		*/
		principal.add(panelTranferencia,"Principal");
		/*principal.add(panelJuegoMultiplayer, "Multiplayer");
		principal.add(controles,"Controles");
		principal.add(panelJuego, "Juego");
		principal.add(panelOpciones, "Opciones");
 		*/
		centro();


		setResizable(false);
		IniciarTA();
		setFocusable(false);
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
	
	}
	
	private void centro() {
		int xEsquina = 1000, yEsquina = 750;
		setSize(xEsquina, yEsquina);
		setLocationRelativeTo(null);
	}
 
	
	private void IniciarTA() throws TransferenciaDeArhivosException {
		irPanel("Principal");
	}

 
	public void irPanel(String src) throws TransferenciaDeArhivosException {
		layout.show(principal,src);
	}
 
 
 
	private void prepareAcciones() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				salir();
			}
		});
	}

	public void salir() {
		if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "Salir",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			setVisible(false);
			System.exit(0);
 
		}
	}
 
	
	
	
	
	public void prepareElementosMenu(){
		
	}

	public static void main(String[] args) throws TransferenciaDeArhivosException, IOException {
		
		TranferenciaDeArchivosGUI tfGUI = new TranferenciaDeArchivosGUI();
		/*String url = "src\\main\\java\\edu\\eci\\laboratorio\\Archivos\\p.bat";
		PrintWriter writer = new PrintWriter(url, "UTF-8");
		
		writer.println("@echo off");
		writer.println("echo hello");
		writer.println("");
		
		writer.close();
		Runtime.getRuntime().exec("cmd /c start "+url+ " ");
		System.out.println("Se logro");*/
		

		
	}
 
}
