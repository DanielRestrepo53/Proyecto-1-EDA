/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class Servicios extends javax.swing.JFrame {

    Mecanico[] mecanicos;
    Cliente[] clientes;

    /**
     * Creates new form InflarLlantas
     */
    public Servicios() {
        initComponents();

        clientes = new Cliente[0];
        mecanicos = new Mecanico[0];

        cargarFicheros();
        botonAplicar.setEnabled(false);
    }

    public void cargarFicheros() {
        try {
            FileInputStream fis = new FileInputStream("Clientes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            clientes = (Cliente[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("Mecanicos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            mecanicos = (Mecanico[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarFicheros() {
        try {
            FileOutputStream fos = new FileOutputStream("Clientes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clientes);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileOutputStream fos = new FileOutputStream("Mecanicos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mecanicos);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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
        clientePlaca = new javax.swing.JTextField();
        checkAceite = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        km = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idMecAceite = new javax.swing.JTextField();
        checkFrenos = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        idMecFrenos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        clienteCedula = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        checkInflar = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        idMecInflar = new javax.swing.JTextField();
        checkLavado = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        idMecLavado = new javax.swing.JTextField();
        checkPintura = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idMecPintura = new javax.swing.JTextField();
        pinturaColor = new javax.swing.JTextField();
        checkEspecial = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        idMecEspecial = new javax.swing.JTextField();
        especialDetalle = new javax.swing.JTextField();
        especialPrecio = new javax.swing.JTextField();
        botonAplicar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SERVICIOS");

        jLabel2.setText("Placa:");

        clientePlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientePlacaActionPerformed(evt);
            }
        });

        checkAceite.setText("Cambio de Aceite");

        jLabel3.setText("Kilometraje:");

        jLabel4.setText("Mecánico (ID):");

        idMecAceite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMecAceiteActionPerformed(evt);
            }
        });

        checkFrenos.setText("Cambio de Pastas de Frenos");
        checkFrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFrenosActionPerformed(evt);
            }
        });

        jLabel6.setText("Mecánico (ID):");

        jLabel7.setText("Número de Cédula:");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        checkInflar.setText("Inflar Llantas");

        jLabel5.setText("Mecánico (ID):");

        checkLavado.setText("Lavado");

        jLabel8.setText("Mecánico (ID):");

        checkPintura.setText("Cambio de Pintura:");

        jLabel9.setText("Mecánico (ID):");

        jLabel10.setText("Color:");

        checkEspecial.setText("Especial");

        jLabel11.setText("Mecánico (ID):");

        jLabel12.setText("Detalle:");

        jLabel13.setText("Precio:");

        botonAplicar.setText("Aplicar");
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonBuscar)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkFrenos)
                                    .addComponent(checkAceite)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idMecAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(checkPintura)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(idMecFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(idMecPintura)
                                                .addComponent(pinturaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(checkInflar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idMecInflar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(checkLavado)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idMecLavado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(checkEspecial)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idMecEspecial)
                                .addComponent(especialDetalle)
                                .addComponent(especialPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(clienteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAplicar)
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clientePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(clienteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkAceite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(idMecAceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(checkFrenos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(idMecFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkInflar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(idMecInflar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(checkLavado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(idMecLavado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPintura)
                    .addComponent(checkEspecial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idMecPintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(idMecEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pinturaColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(especialDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(especialPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botonAplicar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientePlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientePlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientePlacaActionPerformed

    private void checkFrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFrenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkFrenosActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        String placa = clientePlaca.getText().trim();
        String cedula = clienteCedula.getText().trim();

        Administrador a = new Administrador();

        try {
            if (a.existeCedula(cedula)) {
                if (a.existeVehiculo(placa)) {
                    clientePlaca.setEditable(false);
                    clienteCedula.setEditable(false);
                    jLabel14.setText("Datos confirmados.");
                    botonAplicar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Vehículo no encontrado: " + placa);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado: CC" + cedula);
            }
        } catch (Administrador.EYaExiste ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarActionPerformed
        // TODO add your handling code here:
        int kilometraje = Integer.parseInt(km.getText().trim());
        String cedula = clienteCedula.getText().trim();
        String placa = clientePlaca.getText().trim();
        Administrador a = new Administrador();

        if (checkAceite.isSelected()) {
            if (!km.getText().isEmpty()) {
                if (!idMecAceite.getText().isEmpty()) {
                    String idMecanico = idMecAceite.getText().trim();
                    try {
                        a.cambioAceite(cedula, placa, idMecanico, kilometraje);
                    } catch (Administrador.ENoExiste ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (Administrador.EVectorNulo ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del mecánico (Aceite)");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor complete el campo de Kilometraje");
            }
        }

        if (checkFrenos.isSelected()) {
            if (!km.getText().isEmpty()) {
                if (!idMecFrenos.getText().isEmpty()) {
                    String idMecanico = idMecFrenos.getText().trim();
                    try {
                        a.cambioPastas(cedula, placa, idMecanico, kilometraje);
                    } catch (Administrador.ENoExiste ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (Administrador.EVectorNulo ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del mecánico (Frenos)");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor complete el campo de Kilometraje");
            }
        }

        if (checkInflar.isSelected()) {
            if (!idMecInflar.getText().isEmpty()) {
                String idMecanico = idMecInflar.getText().trim();
                try {
                    a.inflarLlantas(cedula, placa, idMecanico);
                } catch (Administrador.ENoExiste ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (Administrador.EVectorNulo ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del mecánico (Inflar)");
            }
        }

        if (checkLavado.isSelected()) {
            if (!idMecLavado.getText().isEmpty()) {
                String idMecanico = idMecLavado.getText().trim();
                try {
                    a.lavadoVehiculo(cedula, placa, idMecanico);
                } catch (Administrador.ENoExiste ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (Administrador.EVectorNulo ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el ID del mecánico (Lavado)");
            }
        }

        if (checkPintura.isSelected()) {
            if (!idMecPintura.getText().isEmpty() || !pinturaColor.getText().isEmpty()) {
                String idMecanico = idMecPintura.getText().trim();
                String color = pinturaColor.getText().trim();
                try {
                    a.cambioPintura(cedula, placa, idMecanico, color);
                } catch (Administrador.ENoExiste ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (Administrador.EVectorNulo ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor complete todos los campos (Pintura)");
            }
        }

        if (checkEspecial.isSelected()) {
            if (!idMecEspecial.getText().isEmpty() || !especialDetalle.getText().isEmpty() || !especialPrecio.getText().isEmpty()) {
                String idMecanico = idMecEspecial.getText().trim();
                String detalles = especialDetalle.getText().trim();
                double precio = Double.parseDouble(especialPrecio.getText().trim());
                try {
                    a.servicioEspecial(cedula, placa, idMecanico, detalles, precio);
                } catch (Administrador.ENoExiste ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (Administrador.EVectorNulo ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor complete todos los campos (Especial)");
            }

        }
    }//GEN-LAST:event_botonAplicarActionPerformed

    private void idMecAceiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMecAceiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMecAceiteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAplicar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JCheckBox checkAceite;
    private javax.swing.JCheckBox checkEspecial;
    private javax.swing.JCheckBox checkFrenos;
    private javax.swing.JCheckBox checkInflar;
    private javax.swing.JCheckBox checkLavado;
    private javax.swing.JCheckBox checkPintura;
    private javax.swing.JTextField clienteCedula;
    private javax.swing.JTextField clientePlaca;
    private javax.swing.JTextField especialDetalle;
    private javax.swing.JTextField especialPrecio;
    private javax.swing.JTextField idMecAceite;
    private javax.swing.JTextField idMecEspecial;
    private javax.swing.JTextField idMecFrenos;
    private javax.swing.JTextField idMecInflar;
    private javax.swing.JTextField idMecLavado;
    private javax.swing.JTextField idMecPintura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField km;
    private javax.swing.JTextField pinturaColor;
    // End of variables declaration//GEN-END:variables
}
