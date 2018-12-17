package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.impl.ServicesTranferenciaDeArchivosImpl;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
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
import javax.swing.*;

public class RecibirPanel extends JPanel {
   
    private ServicesTranferenciaDeArchivosImpl services; 
    private TranferenciaDeArchivosGUI frame;
    private Image fondo;
    
    public RecibirPanel(TranferenciaDeArchivosGUI frame) throws SQLException {
        initComponents();
        this.frame = frame;
        services = new ServicesTranferenciaDeArchivosImpl();        
        prepareElementos();      
        prepareAcciones();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recibirPCS = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputComputador = new javax.swing.JTextField();
        recibirDePc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        recibirPCS.setText("Recibir");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Recibir de un salon");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibir.jpg"))); // NOI18N

        jLabel3.setText("Si deseas solo traer de un computador especifico, selecciona el salon que estas y el número del computador.");

        jLabel4.setText("Lista de salones");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoEci.gif"))); // NOI18N

        regresar.setText("Regresar");

        jLabel5.setText("Lista de salones");

        jLabel7.setText("Numero del computador");

        recibirDePc.setText("Recibir de computador");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Ingeniería de sistemas - Laboratorio de sistemas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(233, 233, 233)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(recibirPCS))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(32, 32, 32)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(recibirDePc))))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibirPCS)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(inputComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recibirDePc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputComputador;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton recibirDePc;
    private javax.swing.JButton recibirPCS;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

    private void prepareElementos() throws SQLException {
        fondo = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/transert.jpg"));
        ArrayList<Salon> laboratorios = frame.ideasServices.getSalones();       
        for (Iterator<Salon> iterator = laboratorios.iterator(); iterator.hasNext();) {
            Salon next = iterator.next();
            jComboBox1.addItem(next.getNombre());
            jComboBox2.addItem(next.getNombre());
        }
    }

    private void prepareAcciones() {
        ActionListener volver = new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
                   regresarMetodo();
            }
        };
        regresar.addActionListener(volver);      
       
        ActionListener recibirSalones = new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
                try {
                    recibirPCSMetodo();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RecibirPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(RecibirPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RecibirPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }           
        };
        recibirPCS.addActionListener(recibirSalones);        
         ActionListener recibirDePcAction = new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
                try {
                    recibirDePcMetodo();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RecibirPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(RecibirPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RecibirPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        };
        recibirDePc.addActionListener(recibirDePcAction);
    }
    
    private void recibirDePcMetodo()  throws FileNotFoundException, UnsupportedEncodingException, SQLException {
                String salon = jComboBox1.getSelectedItem().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                Date now = new Date();
                String strDate = sdf.format(now);                
                String url = "src\\main\\java\\edu\\eci\\laboratorio\\TranferenciaDeArchivos\\images\\"+strDate+".bat";
                PrintWriter writer = new PrintWriter(url, "UTF-8");	                
		writer.println("@echo off");
                Salon salones = frame.ideasServices.getSalonNombre(salon);		
                String numeroComputador = inputComputador.getText().toString();
                String tmp = String.format("echo Y|xcopy /s /b \\\\Sistemas%s\\Sistemas\\Temp C:\\Temp /Y",numeroComputador);
                writer.println(tmp);		
                writer.println("exit 0");
                writer.close();
                Runtime rt = Runtime.getRuntime();
                try {
                   rt.exec("cmd /c start "+url+ " ");                      
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null,"problemas al transferir el archivo","ERROR",JOptionPane.ERROR_MESSAGE);   
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    private void recibirPCSMetodo() throws FileNotFoundException, UnsupportedEncodingException, SQLException {
                String salon = jComboBox1.getSelectedItem().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                Date now = new Date();
                String strDate = sdf.format(now);                
                System.out.println(strDate);
                strDate = strDate.replaceAll("-","");              
                strDate = strDate.replaceAll(".","");  
                strDate = strDate.replaceAll(" ","");              
                strDate = strDate.replaceAll(":","");               
                String url = "src\\main\\java\\edu\\eci\\laboratorio\\TranferenciaDeArchivos\\images\\"+strDate+".bat";
                PrintWriter writer = new PrintWriter(url, "UTF-8");	                
		writer.println("@echo off");
                Salon salones = frame.ideasServices.getSalonNombre(salon);		
                //String = copy /b C:\Users\rescate\Documents\CarpetaPRUEB\jaja.txt \\SISTEMAS70\Sistemas\Temp
                for(Computador c : salones.getPcs()){
                    String tmp;
                        if(c.getId()<10){
                            
                            tmp = String.format("echo Y|xcopy /s /b \\\\Sistemas0%d\\Sistemas\\Temp C:\\Temp /Y",c.getId());
                        }else{
                            tmp = String.format("echo Y|xcopy /s /b \\\\%s\\Sistemas\\Temp C:\\Temp /Y",c.getNombre());
                        }
                        writer.println(tmp);		
                }
                writer.close();
                try {
                   Runtime.getRuntime().exec("cmd /c start "+url+ " ");
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null,"problemas al transferir el archivo","ERROR",JOptionPane.ERROR_MESSAGE);   
                    Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }    
    }
    
    private void regresarMetodo() {
        try {
            frame.irPanel("Principal");
        } catch (TransferenciaDeArhivosException ex) {
            Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
