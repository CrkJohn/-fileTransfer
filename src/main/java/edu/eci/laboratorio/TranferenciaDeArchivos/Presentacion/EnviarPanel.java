/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author rescate
 */
public class EnviarPanel extends javax.swing.JPanel {

    JFileChooser chooser;
    String choosertitle;

    private TranferenciaDeArchivosGUI frame;
    private String urlCarpeta,urlArchivo;

    public EnviarPanel(TranferenciaDeArchivosGUI frame) {
        this.frame = frame;
        initComponents();
        prepararActiones();
        prepareElementos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        archivo = new javax.swing.JButton();
        escogerCarpeta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Enviar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/envio.jpg"))); // NOI18N

        jLabel2.setText("Archivo");

        jLabel3.setText("Carpeta");

        archivo.setText("Escoger Archivo");

        escogerCarpeta.setText("Escoger Carpeta");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoEci.gif"))); // NOI18N

        Enviar.setText("Enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(archivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escogerCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Enviar)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(archivo))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(escogerCarpeta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enviar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JButton archivo;
    private javax.swing.JButton escogerCarpeta;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void prepararActiones() {
        ActionListener archivoAcc = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                archivoAccion();
            }
        };
        archivo.addActionListener(archivoAcc);
        ActionListener escogerCarpetaAccion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                escogerCarpetaAccionMe();
            }
        };
        escogerCarpeta.addActionListener(escogerCarpetaAccion);
        
         ActionListener EnviarAccion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    EnviarAccionMe();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

          
        };
        Enviar.addActionListener(EnviarAccion);

        
    }

    private void archivoAccion() {
        
    }

    public void escogerCarpetaAccionMe(){
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);        
        chooser.setAcceptAllFileFilterUsed(false);
        urlCarpeta = "";
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): "
                    + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : "
                    + chooser.getSelectedFile());
            urlCarpeta = chooser.getSelectedFile().toString();
            urlArchivo="";
            System.out.println("archivo funciono "+urlCarpeta);
            
        } else {
            JOptionPane.showMessageDialog(null,"No escogio ninguna carpeta","Advertencia",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void prepareElementos() {
        try {
            ArrayList<Salon> laboratorios = frame.ideasServices.getSalones();            
            for(Iterator<Salon> iterator = laboratorios.iterator(); iterator.hasNext();) {
                Salon next = iterator.next();
                jComboBox2.addItem(next.getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void EnviarAccionMe() throws FileNotFoundException, UnsupportedEncodingException, SQLException {
            if(urlArchivo.isEmpty() && urlCarpeta.isEmpty() ){          
             JOptionPane.showMessageDialog(null,"No a escogido ni archivo ni carpeta a enviar","ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
  
            }else if(urlArchivo.equals("")){
                System.out.println("Entreamos");
                String salon = jComboBox2.getSelectedItem().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                Date now = new Date();
                String strDate = sdf.format(now);                
                 
                String url = "\\src\\main\\java\\edu\\eci\\laboratorio\\TranferenciaDeArchivos\\images\\x.bat";
                PrintWriter writer = new PrintWriter("x.bat", "UTF-8");		
		writer.println("@echo off");
                Salon salones = frame.ideasServices.getSalonNombre(salon);		
                //String = copy /b C:\Users\rescate\Documents\CarpetaPRUEB\jaja.txt \\SISTEMAS70\Sistemas\Temp
                for(Computador c : salones.getPcs()){
                        String tmp = String.format("xcopy /b %s \\\\%s\\Sistemas\\Temp",urlCarpeta,c.getNombre());
                        writer.println(tmp);		
                }
                writer.close();
                try {
                    Runtime.getRuntime().exec("cmd /c start "+url+ " ");
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null,"problemas al transferir el archivo","ERROR",JOptionPane.ERROR_MESSAGE);   
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                System.out.println("Entre");
            }
      }
    
}
