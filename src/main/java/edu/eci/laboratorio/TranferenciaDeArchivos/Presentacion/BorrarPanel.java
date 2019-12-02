package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;

/**
 * BorrarPanel
 */
public class BorrarPanel extends JPanel {

    private TranferenciaDeArchivosGUI frame;
    private JTextField inputComputer;
    private JComboBox salones;
    private JLabel eliminarTemp;
    private JLabel eliminarPCS;
    private JButton eliminarSalon;
    private JButton eliminarPcs;
    private JButton regresar;

    public BorrarPanel(TranferenciaDeArchivosGUI frame) throws SQLException{
        this.frame = frame;
        initComponents();

    }

    private void initComponents() throws SQLException{
        prepareElementos();
        prepareAcciones();
    }

    private void prepareElementos() throws SQLException{
        prepareSalones();
        preparePCS();
    }

    private void prepareSalones() throws SQLException {
        eliminarTemp = new JLabel("Seleccione el laboratorio al que desea eliminar los temporales: ");
        ArrayList<Salon> laboratorios = frame.ideasServices.getSalones();
        for(Salon next : laboratorios){
            salones.addItem(next.getNombre());
        }
        this.add(eliminarTemp);
        this.add(salones);
    }

    private void preparePCS(){
        eliminarPCS = new JLabel("O si no, escriba aquí los equipos a los que desea borrarles el temporal separados por comas:");
        inputComputer = new JTextField(10);
        this.add(eliminarPCS);
        this.add(inputComputer);
    }

    private void prepareAcciones(){
        return;
    }
}   