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

public class PanelAgregarSalon extends JPanel{
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
	
	public PanelAgregarSalon(TranferenciaDeArchivosGUI tranferenciaDeArchivosGUI) {
		super();
		this.frame = frame;
		prepareElementos();
		setLayout(new BorderLayout());

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
