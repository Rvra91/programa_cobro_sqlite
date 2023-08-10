/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import Conexion_BD.Conexion;
import Controladores.Ctrl_Clientes;
import Modelos.Clientes;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramon
 */
public class inter_cliente extends javax.swing.JFrame {
     private Abonos_vista abonos_vista;

Abonos_vista ab = new Abonos_vista();
    Clientes_vista obclientes = new Clientes_vista();
int obtenerIdCategoriaCombo;
 int a;
 String vv;


    public inter_cliente() {

        initComponents();

        setTitle("Agregar Cliente");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
   cargarCiudadBox(ciudad_box);
   yaFuncionaPorDiosTeLoRuego();
            txtnombre.requestFocus(true);
            
   model = (DefaultTableModel) tabla_clientes.getModel();
    }
 DefaultTableModel model;
    Connection connect;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        INTERES = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txtprestamo = new javax.swing.JTextField();
        txtvalorcuota = new javax.swing.JTextField();
        txtplazo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ciudad_box = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtprestamo_interes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CIUDAD");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VALOR");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PLAZO");

        INTERES.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        INTERES.setForeground(new java.awt.Color(255, 255, 255));
        INTERES.setText("P.INTERES");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIRECCION");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CELULAR");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FECHA");

        txtcelular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcelularKeyPressed(evt);
            }
        });

        txtnombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
        });

        txtapellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
        });

        txtdir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdirKeyPressed(evt);
            }
        });

        txtprestamo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprestamoActionPerformed(evt);
            }
        });
        txtprestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprestamoKeyPressed(evt);
            }
        });

        txtvalorcuota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtvalorcuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorcuotaActionPerformed(evt);
            }
        });
        txtvalorcuota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvalorcuotaKeyPressed(evt);
            }
        });

        txtplazo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtplazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtplazoKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ciudad_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1231" }));
        ciudad_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciudad_boxMouseClicked(evt);
            }
        });
        ciudad_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudad_boxActionPerformed(evt);
            }
        });

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "FECHA", "PRESTAMO", "P.INTERES", "PLAZO"
            }
        ));
        tabla_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_clientes);
        if (tabla_clientes.getColumnModel().getColumnCount() > 0) {
            tabla_clientes.getColumnModel().getColumn(0).setPreferredWidth(12);
            tabla_clientes.getColumnModel().getColumn(5).setPreferredWidth(35);
        }

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtprestamo_interes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprestamo_interesKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRESTAMO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(INTERES))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtcelular)
                            .addComponent(txtdir, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtplazo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtvalorcuota, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(ciudad_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtprestamo_interes))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addContainerGap(231, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ciudad_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprestamo_interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INTERES))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtplazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtvalorcuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        agregar(txtnombre, txtapellido, txtprestamo, txtplazo, txtdir, txtvalorcuota, txtcelular, txtprestamo_interes,tabla_clientes,ciudad_box);
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
              obclientes.desplazarClientesConEnter(ciudad_box,txtnombre,txtapellido);

    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
                   obclientes.desplazarClientesConEnter(ciudad_box,txtapellido,txtcelular);

    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtcelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyPressed
                     obclientes.desplazarClientesConEnter(ciudad_box,txtcelular,txtdir);

    }//GEN-LAST:event_txtcelularKeyPressed

    private void txtdirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdirKeyPressed
                     obclientes.desplazarClientesConEnter(ciudad_box,txtdir,txtprestamo);

    }//GEN-LAST:event_txtdirKeyPressed

    private void txtprestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprestamoKeyPressed
                 obclientes.desplazarClientesConEnter(ciudad_box,txtprestamo,txtprestamo_interes);

    }//GEN-LAST:event_txtprestamoKeyPressed

    private void txtplazoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplazoKeyPressed
                     obclientes.desplazarClientesConEnter(ciudad_box,txtplazo,txtvalorcuota);

    }//GEN-LAST:event_txtplazoKeyPressed

    private void txtvalorcuotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorcuotaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            
            agregar(txtnombre, txtapellido, txtprestamo, txtplazo, txtdir, txtvalorcuota, txtcelular,txtprestamo_interes, tabla_clientes,ciudad_box);
              obclientes.desplazarClientesConEnter(ciudad_box,txtvalorcuota,txtnombre);

        }
    }//GEN-LAST:event_txtvalorcuotaKeyPressed

    private void ciudad_boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudad_boxMouseClicked

    }//GEN-LAST:event_ciudad_boxMouseClicked

    private void ciudad_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudad_boxActionPerformed
        //    CargarClientes(ciudad_box, tabla_clientes);

        obclientes.desplazarClientesConEnter(ciudad_box,txtcelular,txtdir);
    }//GEN-LAST:event_ciudad_boxActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtvalorcuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorcuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorcuotaActionPerformed

    private void txtprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprestamoActionPerformed
      
        
    }//GEN-LAST:event_txtprestamoActionPerformed

    private void txtprestamo_interesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprestamo_interesKeyPressed
        obclientes.desplazarClientesConEnter(ciudad_box,txtprestamo_interes,txtplazo);
    }//GEN-LAST:event_txtprestamo_interesKeyPressed

    private void tabla_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clientesMouseClicked
        int filaSeleccionada = tabla_clientes.getSelectedRow();
        if (filaSeleccionada != -1) {

            String idClientes = tabla_clientes.getValueAt(filaSeleccionada, 0).toString();
            

            id.setText(idClientes);
           
        
    }                     
    }//GEN-LAST:event_tabla_clientesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       eliminarCliente();
        this.actualizarTabla(tabla_clientes,ciudad_box,tabla_clientes);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(inter_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inter_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inter_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inter_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inter_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INTERES;
    private javax.swing.JComboBox<String> ciudad_box;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtplazo;
    private javax.swing.JTextField txtprestamo;
    private javax.swing.JTextField txtprestamo_interes;
    private javax.swing.JTextField txtvalorcuota;
    // End of variables declaration//GEN-END:variables
private int IdCategoria() {
        String sql = "select * from categoria where ciudad = '" + this.ciudad_box.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");;

            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }

 public void agregar(JTextField txt, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JTextField txt7, JTextField txt8, JTable clientes, JComboBox<String> b) {
    if (a == 1) {
        actualizarTabla(clientes, b, clientes);
    } else {
        Clientes cliente = new Clientes();
        Ctrl_Clientes controlCliente = new Ctrl_Clientes();

        String categoria = b.getSelectedItem().toString().trim();
        if (txt.getText().equals("") || txt3.getText().equals("") || txt4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txt.setBackground(Color.red);
            txt2.setBackground(Color.red);
            txt3.setBackground(Color.red);
            txt4.setBackground(Color.red);
            txt5.setBackground(Color.red);
            txt6.setBackground(Color.red);
            txt7.setBackground(Color.red);
        } else {
            try {
                String texto = txt2.getText();
                if (texto.isEmpty()) {
                    LocalDate fechaHoy = LocalDate.now();
                    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String fecha = fechaHoy.format(formateador);
                    cliente.setApellido(fecha);
                } else {
                    cliente.setApellido(txt2.getText().trim());
                }

                cliente.setNombre(txt.getText().trim());
                cliente.setPrestamo(Integer.parseInt(txt3.getText().trim()));
                cliente.setPrestamo_intereses(Integer.parseInt(txt8.getText().trim()));
                cliente.setPrestamo_restante(Integer.parseInt(txt8.getText().trim()));
                cliente.setDireccion(txt5.getText().trim());
                cliente.setPrestamo_intereses(Integer.parseInt(txt8.getText().trim()));
                cliente.setValor_cuota(Integer.parseInt(txt6.getText().trim()));
                cliente.setNumero_celular(txt7.getText().trim());
                cliente.setPlazo_dias(Integer.parseInt(txt4.getText().trim()));
                cliente.setMora(0);

                LocalDate fechaActual = LocalDate.now();
                LocalDate fechaVencimiento = fechaActual.plusDays(Integer.parseInt(txt4.getText().trim()));
                Date fechaVencimientoSql = java.sql.Date.valueOf(fechaVencimiento);
                cliente.setFecha_vencimiento(fechaVencimientoSql);

                this.IdCategoria();
                cliente.setIdCategoria(obtenerIdCategoriaCombo);

                int indiceClienteSeleccionado = b.getSelectedIndex();

                // Agregar el nuevo cliente a la base de datos
                if (controlCliente.guardar(cliente)) {
                    // Actualizar el JComboBox con la lista de clientes
                    if (abonos_vista != null) {
   
}

                    

                    // Obtener el nuevo índice del cliente seleccionado
                    int nuevoIndiceClienteSeleccionado = indiceClienteSeleccionado + 1;

                    // Establecer el nuevo índice seleccionado en el JComboBox
                    b.setSelectedIndex(nuevoIndiceClienteSeleccionado);

                    // Realizar cualquier otra acción adicional
                    JOptionPane.showMessageDialog(null, "Registro Guardado");

                    obclientes.Limpiar(txt, txt2, txt3, txt4, txt5, txt6, txt7, txt8);
                } else {
                    System.out.println("registro guardado");
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }

            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error en: " + e);
            }
        }
    }

    this.actualizarTabla(clientes, b, clientes);

    }
 private void actualizarTabla(JTable clientes,JComboBox a, JTable b) {
        // Eliminar todos los registros de la tabla

        DefaultTableModel model = (DefaultTableModel) clientes.getModel();
        model.setRowCount(0);

        // Cargar los datos desde la base de datos en el modelo de tabla
        obclientes.CargarClientes(a, b);

        // Actualizar la tabla
        clientes.setModel(model);
    }
  private void eliminarCliente() {
        int idCliente = Integer.parseInt(id.getText());

        // Eliminar el registro del cliente en la tabla "clientes"
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM clientes WHERE idClientes = ?");
            PreparedStatement consulta2 = cn.prepareStatement("DELETE FROM historial_abonos WHERE idClientes = ?");

            consulta.setInt(1, idCliente);
            consulta2.setInt(1, idCliente);
            consulta.executeUpdate();
            consulta2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
            cn.close();
        } catch (SQLException ex) {
            System.err.println("Error al eliminar el cliente: " + ex);
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente.");
        }

    }
 
private void cargarCiudadBox(JComboBox ciudadBox) {

    try {
        Connection cn = Conexion.conectar();
        PreparedStatement consulta = cn.prepareStatement("SELECT ciudad FROM categoria");
        ResultSet rs = consulta.executeQuery();

        // Limpiar el JComboBox antes de cargar los nuevos datos
        ciudadBox.removeAllItems();

        // Agregar las ciudades al JComboBox
        while (rs.next()) {
            String ciudad = rs.getString("ciudad");
            ciudadBox.addItem(ciudad);
        }
    

         cn.close();
    } catch (SQLException e) {
        System.err.println("Error al obtener la lista de ciudades: " + e);
        JOptionPane.showMessageDialog(null, "Error al obtener la lista de ciudades.");
    }
}
  
 
    public void CargarClientes(JComboBox ciudadbox, JTable tabla) {
        // Consulta SQL para obtener los clientes de la ciudad seleccionada

        try {
            Connection conexion = Conexion.conectar();
            String ciudadSeleccionada = ciudadbox.getSelectedItem().toString();
            String consulta = "SELECT c.idClientes, c.nombre, c.apellido, c.prestamo, c.intereses, c.plazo_dias, c.mora,c.valor_cuota,c.direccion,c.numero_celular,c.prestamo_interes "
                    + "FROM clientes c "
                    + "INNER JOIN categoria ca ON c.idCategorias = ca.idcategoria "
                    + "WHERE ca.ciudad = ?";
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setString(1, ciudadSeleccionada);
            ResultSet rs = ps.executeQuery();

            // Limpiar la tabla antes de cargar los nuevos datos
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] fila = new Object[10];
                fila[0] = rs.getInt("idClientes");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellido");
                fila[3] = rs.getInt("prestamo");
                fila[4] = rs.getInt("plazo_dias");
                fila[5] = rs.getInt("valor_cuota");
                fila[6] = rs.getInt("mora");
                fila[7] = rs.getString("direccion");
                fila[8] = rs.getString("numero_celular");
 fila[9] = rs.getString("prestamo_interes");
                model.addRow(fila);
            }

            rs.close();
            ps.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

   
  public static void seleccionarCiudad(JComboBox<String> comboBox, String ciudad) {
        comboBox.setSelectedItem(ciudad);
        System.out.println(ciudad);
    }
  public void seleccionarItem(String item) {
      System.out.println(item);
        ciudad_box.setSelectedItem(item);
    }

    public String getVv() {
        return vv;
    }

    public void setVv(String vv) {
        this.vv = vv;
    }
  public void yaFuncionaPorDiosTeLoRuego(){
      
      System.out.println(ab.valor);
       ciudad_box.setSelectedItem(ab.valor);
  }
  
}
