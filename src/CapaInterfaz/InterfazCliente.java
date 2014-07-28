/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaInterfaz;

import CapaDatos.Conexionbd;
import Gestiones.GestionCliente;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROFESORES
 */
public class InterfazCliente extends javax.swing.JFrame {
DefaultTableModel dta;
    GestionCliente cliente = new GestionCliente ();
    
   
    /**
     * Creates new form Interfaz
     */
    public InterfazCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCod_Per = new javax.swing.JTextField();
        txtCod_Suc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Datos = new javax.swing.JTable();
        btnConsul = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        btnElimiinar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnInser = new javax.swing.JButton();
        jbtconsulta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("Codigo");

        jLabel2.setText("Cod_Per");

        jLabel3.setText("Cod_Suc");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        Tabla_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_DatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_Datos);

        btnConsul.setText("Consultar por Id");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });

        btnModi.setText("Modificar");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnElimiinar.setText("Eliminar");
        btnElimiinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiinarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnInser.setText("Insertar");
        btnInser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserActionPerformed(evt);
            }
        });

        jbtconsulta.setText("Consulta por tabla");
        jbtconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtconsultaActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod_Per, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCod_Suc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElimiinar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(229, 229, 229))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jbtconsulta)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod_Per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod_Suc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModi)
                        .addGap(8, 8, 8)
                        .addComponent(btnElimiinar)))
                .addGap(69, 69, 69)
                .addComponent(jbtconsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserActionPerformed
        cliente.getCliente().setCodigoCliente(Integer.parseInt(txtId.getText()));
        cliente.getCliente().setCodigoPersona(Integer.parseInt(txtCod_Per.getText()));
        cliente.getCliente().setCodigoSucursal(Integer.parseInt(txtCod_Suc.getText()));
        cliente.getCliente().setEstadoCliente(txtEstado.getText());
         try {
        cliente.Insertar();
         JOptionPane.showMessageDialog(this, "Dato insertado correctamente");
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnInserActionPerformed

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        // TODO add your handling code here:
//        usuario.getUsuario().setId(txtId.getText());
        cliente.getCliente().setCodigoCliente(Integer.parseInt(txtId.getText()));
        try
        {
            cliente.Consultar();
            JOptionPane.showMessageDialog(this, "EL DATO ENCONTRADO");
            txtId.setText(Integer.toString(cliente.getCliente().getCodigoCliente()));
            txtCod_Per.setText(Integer.toString(cliente.getCliente().getCodigoPersona()));
            txtCod_Suc.setText(Integer.toString(cliente.getCliente().getCodigoSucursal()));
            txtEstado.setText(cliente.getCliente().getEstadoCliente());
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
       

       
    }//GEN-LAST:event_btnConsulActionPerformed

    private void Tabla_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_DatosMouseClicked
        // TODO add your handling code here:
        int row = Tabla_Datos.getSelectedRow();
        this.txtId.setText(Tabla_Datos.getModel().getValueAt(row, 0).toString());
        this.txtCod_Per.setText(Tabla_Datos.getModel().getValueAt(row, 1).toString());
        this.txtCod_Suc.setText(Tabla_Datos.getModel().getValueAt(row, 2).toString());
        this.txtEstado.setText(Tabla_Datos.getModel().getValueAt(row, 3).toString());
       
              
        

//        this.txtDesc.setText(Tabla_datos.getModel().getValueAt(row, 2).toString());
//        this.txtCod_Mar.setText(Tabla_datos.getModel().getValueAt(row, 3).toString());
    }//GEN-LAST:event_Tabla_DatosMouseClicked

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
        // TODO add your handling code here:
        
        {
        cliente.getCliente().setCodigoPersona(Integer.parseInt(txtCod_Per.getText()));
        cliente.getCliente().setCodigoSucursal(Integer.parseInt(txtCod_Suc.getText()));
        cliente.getCliente().setEstadoCliente(txtEstado.getText());
        try
        {
            cliente.Modificar();
            JOptionPane.showMessageDialog(this, "El dato se modificó correctamente");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnModiActionPerformed

    private void btnElimiinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiinarActionPerformed
        // TODO add your handling code here:
        
        {
        cliente.getCliente().setCodigoCliente(Integer.parseInt(txtId.getText()));
        cliente.getCliente().setCodigoPersona(Integer.parseInt(txtCod_Per.getText()));
        cliente.getCliente().setCodigoSucursal(Integer.parseInt(txtCod_Suc.getText()));
        cliente.getCliente().setEstadoCliente(txtCod_Suc.getText());
        
        try
        {
            cliente.Eliminar();
            JOptionPane.showMessageDialog(this, "El dato se eliminó correctamente");
            
            }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnElimiinarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtId.setText(Integer.toString(cliente.getCliente().getCodigoCliente()));
        txtCod_Per.setText(Integer.toString(cliente.getCliente().getCodigoPersona()));
        txtCod_Suc.setText(Integer.toString(cliente.getCliente().getCodigoSucursal()));
        txtEstado.setText(cliente.getCliente().getEstadoCliente());
         
//      Tabla_datos.setModel(new DefaultTableModel());
       
            cliente.Nuevo();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jbtconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtconsultaActionPerformed
    try {
        // TODO add your handling code here:
  
        this.Tabla_Datos.setModel(cliente.cargarTabla());
    } catch (SQLException ex) {
        Logger.getLogger(InterfazCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jbtconsultaActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtIdKeyTyped
    
   
    

    /**     * @param args the command line arguments

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
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Datos;
    private javax.swing.JButton btnConsul;
    private javax.swing.JButton btnElimiinar;
    private javax.swing.JButton btnInser;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtconsulta;
    private javax.swing.JTextField txtCod_Per;
    private javax.swing.JTextField txtCod_Suc;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
