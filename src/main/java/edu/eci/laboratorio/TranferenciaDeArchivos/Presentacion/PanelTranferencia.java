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
	private Thread t;
	private boolean duckDead[];
	private KeyListener m;

	public PanelTranferencia(TranferenciaDeArchivosGUI tranferenciaDeArchivosGUI) {
		super();
		
		this.frame = frame;
		setLayout(new BorderLayout());
		
		preparandoMenu();
		prepareAcciones();
		setOpaque(false);
		
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
