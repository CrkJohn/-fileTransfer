package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import com.google.inject.Inject;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.impl.ServicesTranferenciaDeArchivosImpl;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
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
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void prepareElementos() throws SQLException {
        fondo = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/transert.jpg"));
		
         System.out.println("Aqui");
        ArrayList<Salon> laboratorios = frame.ideasServices.getSalones();
        System.out.println(laboratorios);
         System.out.println("Aqui");

        for (Iterator<Salon> iterator = laboratorios.iterator(); iterator.hasNext();) {
            Salon next = iterator.next();
            jComboBox1.addItem(next.getNombre());
        }
    }
    @Override
        protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.drawImage(fondo,0,0,frame.getWidth(), frame.getHeight(), this);
      }

  
}
