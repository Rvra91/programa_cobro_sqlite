/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import Conexion_BD.Conexion;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramon
 */
public class Clavos extends javax.swing.JPanel {

       PazYSalvo objeto = new PazYSalvo();
              PazYSalvo objeto2 = new PazYSalvo();

    public Clavos() {
        initComponents();
         model = (DefaultTableModel) tabla_clavos.getModel();
        objeto.cargarDeudos(2,combo_categoria,tabla_clavos);
        cargarCiudadbox();
     txt_id.setEnabled(false);
          npaz.setEnabled(false);

               nclavo.setEnabled(false);

    }
     DefaultTableModel model;
    Connection connect;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clavos = new javax.swing.JTable();
        eliminar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_categoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        historial = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        reactivar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        q = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalle_paz = new javax.swing.JTable();
        q2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtplazo = new javax.swing.JTextField();
        txtprestamo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nclavo = new javax.swing.JTextField();
        npaz = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HISTORIAL");

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_clavos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Prestamo", "Plazo", "Intereses"
            }
        ));
        tabla_clavos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clavosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_clavos);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 360, 360));

        eliminar.setBackground(new java.awt.Color(204, 204, 204));
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-eliminar-35.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ELIMINAR");

        javax.swing.GroupLayout eliminarLayout = new javax.swing.GroupLayout(eliminar);
        eliminar.setLayout(eliminarLayout);
        eliminarLayout.setHorizontalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        eliminarLayout.setVerticalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarLayout.createSequentialGroup()
                .addGroup(eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(eliminarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bg.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 150, 40));

        combo_categoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        combo_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Ciudad" }));
        combo_categoria.setBorder(null);
        combo_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_categoriaActionPerformed(evt);
            }
        });
        bg.add(combo_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 30));

        historial.setBackground(new java.awt.Color(204, 204, 204));
        historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HISTORIAL");

        javax.swing.GroupLayout historialLayout = new javax.swing.GroupLayout(historial);
        historial.setLayout(historialLayout);
        historialLayout.setHorizontalGroup(
            historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        historialLayout.setVerticalGroup(
            historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 120, 30));
        bg.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 170, -1));
        bg.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 190, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLAVOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CIUDAD:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-nueva-york-35.png"))); // NOI18N
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 40, 40));

        reactivar.setBackground(new java.awt.Color(204, 204, 204));
        reactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reactivarMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ACTIVAR");

        javax.swing.GroupLayout reactivarLayout = new javax.swing.GroupLayout(reactivar);
        reactivar.setLayout(reactivarLayout);
        reactivarLayout.setHorizontalGroup(
            reactivarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reactivarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        reactivarLayout.setVerticalGroup(
            reactivarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reactivarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(reactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        q.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout qLayout = new javax.swing.GroupLayout(q);
        q.setLayout(qLayout);
        qLayout.setHorizontalGroup(
            qLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        qLayout.setVerticalGroup(
            qLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        bg.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 310, 350));

        detalle_paz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Pagos", "Intereses", "Plazo"
            }
        ));
        jScrollPane2.setViewportView(detalle_paz);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 300, 340));

        q2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout q2Layout = new javax.swing.GroupLayout(q2);
        q2.setLayout(q2Layout);
        q2Layout.setHorizontalGroup(
            q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        q2Layout.setVerticalGroup(
            q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        bg.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 240, 260));

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PAZ Y SALVO");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 130, 49));
        bg.add(txtplazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 120, -1));
        bg.add(txtprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 120, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Plazo");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 100, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Prestamo");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 100, 30));

        ok.setText("Ok");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        bg.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 70, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("N veces paz y salvo");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 120, 40));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("N veces clavo:");
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 90, 20));
        bg.add(nclavo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 140, -1));
        bg.add(npaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
 
          int idCliente = Integer.parseInt(txt_id.getText());

    // Eliminar el registro del cliente en la tabla "clientes"
    try {
        Connection cn = Conexion.conectar();
        PreparedStatement consulta = cn.prepareStatement("DELETE FROM clientes WHERE idClientes = ?");
        consulta.setInt(1, idCliente);
        consulta.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
        cn.close();
    } catch (SQLException ex) {
        System.err.println("Error al eliminar el cliente: " + ex);
        JOptionPane.showMessageDialog(null, "Error al eliminar el cliente.");
    }
        objeto.actualizarTabla(1,combo_categoria, tabla_clavos);

        
    }//GEN-LAST:event_eliminarMouseClicked

    private void historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseClicked
   objeto.pasarHistorial(q,txt_id,npaz,nclavo,detalle_paz);
   objeto.mostrarN(txt_id,npaz,nclavo);

    }//GEN-LAST:event_historialMouseClicked

    private void combo_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_categoriaActionPerformed
       objeto.cargarDeudos(2,combo_categoria,tabla_clavos);
    }//GEN-LAST:event_combo_categoriaActionPerformed

    private void tabla_clavosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clavosMouseClicked
objeto.tabla(tabla_clavos, txt_nombre, txt_id);
      
    }//GEN-LAST:event_tabla_clavosMouseClicked

    private void reactivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reactivarMouseClicked
    int idClientes = Integer.parseInt(txt_id.getText());
objeto.pasarHistorial(q2,txt_id,npaz,nclavo,detalle_paz);
 try {
        Connection cn = Conexion.conectar();
PreparedStatement consulta = cn.prepareStatement("UPDATE clientes SET estado = 0, prestamo = 0, intereses = 0, plazo_dias = 0, mora = 0 WHERE idClientes = ?");
PreparedStatement consulta2 = cn.prepareStatement("DELETE FROM historial_abonos WHERE idClientes = ?");

        consulta.setInt(1, idClientes);
                consulta2.setInt(1, idClientes);

        consulta.executeUpdate();
        consulta2.executeUpdate();

        JOptionPane.showMessageDialog(null, "Cliente Activado.");
        cn.close();
    } catch (SQLException ex) {
        System.err.println("Error al activar cliente: " + ex);
        JOptionPane.showMessageDialog(null, "Error al asignar estado cero al cliente.");
    }

objeto.actualizarTabla(1,combo_categoria, tabla_clavos);


    }//GEN-LAST:event_reactivarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      PazYSalvo d1 = new PazYSalvo();
      
      cambiarAotroPanel(d1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
int idClientes = Integer.parseInt(txt_id.getText());
int prestamo = Integer.parseInt(txtprestamo.getText());
int plazo = Integer.parseInt(txtplazo.getText());
try {
        Connection cn = Conexion.conectar();
    PreparedStatement consulta = cn.prepareStatement("UPDATE clientes SET prestamo = ?, plazo_dias = ?, prestamo_restante=? WHERE idClientes = ?");
       

        consulta.setInt(1, prestamo);
             

        consulta.setInt(2, plazo);
        
        consulta.setInt(4, idClientes);
                consulta.setInt(3, prestamo);
 

        consulta.executeUpdate();
       

        JOptionPane.showMessageDialog(null, "Cliente Activado.");
        cn.close();
    } catch (SQLException ex) {
        System.err.println("Error al activar cliente: " + ex);
        JOptionPane.showMessageDialog(null, "Error al asignar estado-");
    }
q2.setVisible(true);

    }//GEN-LAST:event_okMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> combo_categoria;
    private javax.swing.JTable detalle_paz;
    private javax.swing.JPanel eliminar;
    private javax.swing.JPanel historial;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nclavo;
    private javax.swing.JTextField npaz;
    private javax.swing.JButton ok;
    private javax.swing.JPanel q;
    private javax.swing.JPanel q2;
    private javax.swing.JPanel reactivar;
    private javax.swing.JTable tabla_clavos;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txtplazo;
    private javax.swing.JTextField txtprestamo;
    // End of variables declaration//GEN-END:variables


private void cargarCiudadbox(){
    
    
    
try {
    Connection cn = Conexion.conectar();
    PreparedStatement consulta = cn.prepareStatement("SELECT ciudad FROM categoria");
    ResultSet rs = consulta.executeQuery();

    // Agregar los nombres y apellidos de los clientes en el JComboBox
    while (rs.next()) {
        String ciudad = rs.getString("Ciudad");
        combo_categoria.addItem(ciudad);
               

    }

    cn.close();
} catch (SQLException e) {
    System.err.println("Error al obtener la lista de clientes: " + e);
    JOptionPane.showMessageDialog(null, "Error al obtener la lista de ciudades.");
}
}




private void cambiarAotroPanel(JPanel nuevoPanel) {
    // Obtener la referencia al JFrame principal
    Menu frame = (Menu) SwingUtilities.getWindowAncestor(this);
    // Llamar al método cambiarContenido() del JFrame principal
    frame.cambiarContenido(nuevoPanel);
}

    
}


