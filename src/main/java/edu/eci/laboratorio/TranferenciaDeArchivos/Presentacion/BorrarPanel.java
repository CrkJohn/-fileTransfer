package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Computador;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.Salon;
import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import edu.eci.laboratorio.TranferenciaDeArchivos.samples.services.impl.ServicesTranferenciaDeArchivosImpl;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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

public class BorrarPanel extends JPanel {

    private ServicesTranferenciaDeArchivosImpl services;
    private TranferenciaDeArchivosGUI frame;
    private Image fondo;

    public BorrarPanel(TranferenciaDeArchivosGUI frame) throws SQLException {
        initComponents();
        this.frame = frame;
        services = new ServicesTranferenciaDeArchivosImpl();
        prepareElementos();
        prepareAcciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminarPCS = new javax.swing.JButton();
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
        eliminarDePc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        eliminarPCS.setText("Borar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Borrar de un salon");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibir.jpg"))); // NOI18N

        jLabel3.setText(
                "Si deseas solo borrar de un computador especifico, selecciona el salon que estas y el número del computador.");

        jLabel4.setText("Lista de salones");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoEci.gif"))); // NOI18N

        regresar.setText("Regresar");

        jLabel5.setText("Lista de salones");

        jLabel7.setText("Numero del computador");

        eliminarDePc.setText("Borrar de computador");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Ingeniería de sistemas - Laboratorio de sistemas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(46, 46, 46).addComponent(jLabel2,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addGap(90, 90, 90).addComponent(regresar,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup().addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(233, 233, 233)
                                                .addComponent(jLabel5).addGap(18, 18, 18)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(eliminarPCS))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 528,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup().addGap(12, 12, 12).addGroup(layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup().addComponent(jLabel4)
                                                .addGap(32, 32, 32)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34).addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputComputador, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(eliminarDePc))))
                                .addContainerGap(45, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jLabel6)
                                        .addGap(25, 25, 25))))
                .addGroup(layout.createSequentialGroup().addGap(29, 29, 29).addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eliminarPCS).addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4).addComponent(jLabel7)
                                .addComponent(inputComputador, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarDePc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6).addGap(22, 22, 22))
                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(regresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
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
    private javax.swing.JButton eliminarDePc;
    private javax.swing.JButton eliminarPCS;
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

        ActionListener eliminarSalones = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    eliminarPCSMetodo();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(BorrarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(BorrarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(BorrarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        eliminarPCS.addActionListener(eliminarSalones);
        ActionListener eliminarDePcAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputComputador.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "No ha ingresado ningún computador.", "Advertencia",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    eliminarDePcMetodo();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(BorrarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(BorrarPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        eliminarDePc.addActionListener(eliminarDePcAction);
    }

    private boolean existPC(Salon salon, int id) {
        for (Computador s : salon.getPcs()) {
            if (s.getId() == id)
                return true;
        }
        return false;
    }

    // Teoricamente permite mas de un pc, sin embargo no se ha finalizado la
    // implementación.
    private void eliminarDePcMetodo() throws FileNotFoundException, UnsupportedEncodingException, SQLException {
        String salonNombre = jComboBox2.getSelectedItem().toString();
        Salon salon = frame.ideasServices.getSalonNombre(salonNombre);
        StringBuilder commandPCs = new StringBuilder("@(");
        try {
            String[] computadores = inputComputador.getText().split(",");
            for (String pc : computadores) {
                int id_pc = Integer.parseInt(pc);
                if (existPC(salon, id_pc)) {
                    if (id_pc < 10) {
                        commandPCs.append("'Sistemas0" + id_pc + "',");
                    } else {
                        commandPCs.append("'Sistemas" + id_pc + "',");
                    }

                }
            }
            // Control de la ultima string de equipos
            commandPCs.deleteCharAt(commandPCs.length() - 1);
            commandPCs.append(")");
            // Final del control
            String commandPcs = commandPCs.toString();
            System.out.println(commandPcs);
            String command = getCommand(commandPcs);
            System.out.println(command);
            Process powerShellProcess = Runtime.getRuntime().exec(command);
            powerShellProcess.getOutputStream().close();
            String line;
            System.err.println("Standard Output:");
            BufferedReader stdout = new BufferedReader(new InputStreamReader(powerShellProcess.getInputStream()));
            while ((line = stdout.readLine()) != null) {
                System.err.println(line);
            }
            stdout.close();
            System.err.println("Standard Error:");
            BufferedReader stderr = new BufferedReader(new InputStreamReader(powerShellProcess.getErrorStream()));
            while ((line = stderr.readLine()) != null) {
                System.err.println(line);
            }
            stderr.close();
            System.err.println("Done");
        } catch (Exception e) {
            System.out.println("Cancelado");
        }
    }

    private void eliminarPCSMetodo() throws IOException, TransferenciaDeArhivosException {
        String salon = jComboBox1.getSelectedItem().toString();
        String commandPcs = "@(";
        try {
            Salon salones = frame.ideasServices.getSalonNombre(salon);
            ArrayList<Computador> pcs = salones.getPcs();
            int cntSalones = pcs.size();
            for (int i = 0; i < cntSalones - 1; i++) {
                Computador s = pcs.get(i);
                commandPcs += ("'" + s.getNombre() + "',");
            }
            commandPcs += ("'" + pcs.get(cntSalones - 1).getNombre() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(InicialPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Cancelado");
        }

        String command = getCommand(commandPcs);
        System.out.println(command);
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        powerShellProcess.getOutputStream().close();
        String line;
        System.err.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.err.println(line);
        }
        stdout.close();
        System.err.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.err.println(line);
        }
        stderr.close();
        System.err.println("Done");
    }

    private String getCommand(String pcs) {
        // " Invoke-Command -computerName $computer -ScriptBlock{py
        // C:\\Temp\\l4b3c1.py}; " + "\n" +

        String command = "powershell.exe \n" + "$computers= " + pcs + ";\n" + "ForEach ($COMPUTER in ($computers)){ "
                + "\n" + "if(!(Test-Connection -Cn $computer  -Count 1 -ea 0 -quiet)){ " + "\n" + "Write-host " + '"'
                + "Cannot reach $computer its offline" + '"' + "\n" + "} " + "\n" + "else{ " + "\n" + "TRY{ " + "\n"
                + "Remove-Item " + '"' + "\\\\$computer\\c$\\Temp\\*" + '"' + " -Recurse -Confirm:$false -Force\n"
                + " }Catch{ " + "\n" + "      $error[0].exception.message;   " + "\n" + "      Write-Host " + '"'
                + "Failed copied on $computer" + '"' + "\n" + " } " + "\n" + " } " + "\n" + " }";
        return command;

    }

    private void regresarMetodo() {
        try {
            frame.irPanel("Principal");
        } catch (TransferenciaDeArhivosException ex) {
            Logger.getLogger(EnviarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
