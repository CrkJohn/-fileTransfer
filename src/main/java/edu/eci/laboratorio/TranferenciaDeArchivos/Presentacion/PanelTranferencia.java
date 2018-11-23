package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;


import java.util.*;
import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.*;
import java.lang.reflect.Modifier;

import javax.naming.directory.ModificationItem;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;

public class PanelTranferencia extends JPanel{
	private TranferenciaDeArchivosGUI frame;
	private ImageIcon imagenCursor;

	private static boolean isRun;
	private JMenuBar menuBar;
	private JMenu menuComputador;
	private JMenuItem agregar;
	private JMenuItem modificar;
	private JMenuItem eliminar;
	private JMenu menuLaboratorio;
	
	
	private JMenuItem agregarLaboratorio;
	private JMenuItem modificarLaboratorio;
	private JMenuItem elimniarLaboratorio;
	private JFileChooser newFile;
	private JMenu enviarArchivo;
	private JMenuItem enviarArchivos;
	private JMenuItem enviarCarpeta;
	private JMenu traerComponente;
	private JMenuItem traerArchivos;
	private JMenuItem traerCarpeta;
	private Image fondo;
	
	public PanelTranferencia(TranferenciaDeArchivosGUI tranferenciaDeArchivosGUI) {
		super();
		System.out.println("Entro");
		this.frame = frame;
		prepareElementos();
		setLayout(new BorderLayout());
		preparandoMenu();
		prepareAcciones();
		setOpaque(false);
		
	}


	private void prepareElementos() {
		fondo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/fondo.png"));
	}
	

	@Override
	public void paint(Graphics g) {
		//g.drawImage(fondo, 0, 0, frame.getWidth(), frame.getHeight(), this);
		super.paint(g);
	}

	public void preparandoMenu() {
		newFile = new JFileChooser();
		menuBar = new JMenuBar();
		Font fuenteMenu = new Font("Times New Roman", Font.BOLD, 15);	
		//Computador
		menuComputador = new JMenu("Computador");
		menuComputador.setFont(fuenteMenu);
		agregar = new JMenuItem("Agregar");
		agregar.setFont(fuenteMenu);
		modificar = new JMenuItem("Modificar");
		modificar.setFont(fuenteMenu);
		eliminar = new JMenuItem("Eliminar");
		eliminar.setFont(fuenteMenu);
		menuComputador.add(agregar);
		menuComputador.add(modificar);
		menuComputador.add(eliminar);
		menuBar.add(menuComputador);
		
		
		//Laboratorio
		menuLaboratorio = new JMenu("Laboratorio");
		menuLaboratorio.setFont(fuenteMenu);
		agregarLaboratorio = new JMenuItem("Agregar");
		agregarLaboratorio.setFont(fuenteMenu);
		modificarLaboratorio = new JMenuItem("Modificar");
		modificarLaboratorio.setFont(fuenteMenu);
		elimniarLaboratorio = new JMenuItem("Eliminar");
		elimniarLaboratorio.setFont(fuenteMenu);
		menuLaboratorio.add(agregarLaboratorio);
		menuLaboratorio.add(modificarLaboratorio);
		menuLaboratorio.add(elimniarLaboratorio);		
		menuBar.add(menuLaboratorio);
		
		
		//Envio
		enviarArchivo = new JMenu("Enviar");
		enviarArchivo.setFont(fuenteMenu);
		enviarArchivos = new JMenuItem("Envio de archivos");
		enviarArchivos.setFont(fuenteMenu);
		enviarCarpeta = new JMenuItem("Envio de carpeta");
		enviarCarpeta.setFont(fuenteMenu);
		enviarArchivo.add(enviarArchivos);
		enviarArchivo.add(enviarCarpeta);
		menuBar.add(enviarArchivo);
		
		//Traer componente
		traerComponente = new JMenu("Traer");
		traerComponente.setFont(fuenteMenu);
		traerArchivos = new JMenuItem("Traer  archivos");
		traerArchivos.setFont(fuenteMenu);
		traerCarpeta = new JMenuItem("Traer carpetas");
		traerCarpeta.setFont(fuenteMenu);
		traerComponente.add(traerArchivos);
		traerComponente.add(traerCarpeta);
		menuBar.add(traerComponente);

		
		
		
		add(menuBar, BorderLayout.NORTH);
	}

	@SuppressWarnings("deprecation")
	private void prepareAcciones() {

	

		/*ActionListener oyenteBotonImportar = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionImportar();
			}
		};
		importar.addActionListener(oyenteBotonImportar);

	

		ActionListener oyenteBotonExportar = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionExportar();
			}
		};*/
		

	

	}


	
	
}
