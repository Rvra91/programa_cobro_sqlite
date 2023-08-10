/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import Conexion_BD.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramon
 */
public class Paz extends javax.swing.JFrame {
Clientes_vista c1 = new Clientes_vista();

boolean compro=false;
    /**
     * Creates new form Paz
     */
    public Paz() {
        initComponents();
        
             setSize(900, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
cargarCiudadbox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cpazs = new javax.swing.JScrollPane();
        cpaz = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        prestamo = new javax.swing.JTextField();
        cuotas = new javax.swing.JTextField();
        intereses = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        valor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ciudadbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        paz = new javax.swing.JTextField();
        clavo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historcio_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpaz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Prestamo", "Plazo", "Intereses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cpaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpazMouseClicked(evt);
            }
        });
        cpazs.setViewportView(cpaz);

        jPanel2.add(cpazs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 350));

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REACTIVAR");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 110, 70));

        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 77, 80, -1));

        prestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prestamoKeyPressed(evt);
            }
        });
        jPanel2.add(prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 119, 80, -1));

        cuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuotasKeyPressed(evt);
            }
        });
        jPanel2.add(cuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 80, -1));

        intereses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                interesesKeyPressed(evt);
            }
        });
        jPanel2.add(intereses, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 161, 80, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FECHA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 110, 70));

        jLabel8.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PRESTAMO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, 70));

        jLabel9.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("P.INTERES");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 70));

        jLabel10.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CUOTAS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 110, 70));

        jLabel11.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VALOR");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 110, 70));

        jButton4.setText("REFINANCIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorKeyPressed(evt);
            }
        });
        jPanel2.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 80, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(102, 255, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 370));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 540, 370));

        ciudadbox.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ciudadbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadboxActionPerformed(evt);
            }
        });
        jPanel1.add(ciudadbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAZ Y SALVOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 250, 70));

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAZ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 120, 50));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 180, 40));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 130, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setText("ELIMINAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 110, 40));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));
        jPanel1.add(paz, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 120, -1));
        jPanel1.add(clavo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 110, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CLAVO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 110, 70));

        historcio_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(historcio_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 310));

        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jButton3.setText("REACTIVAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, 40));

        jLabel6.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CIUDAD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciudadboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadboxActionPerformed
this.cargarDeudos(1, ciudadbox, cpaz);        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadboxActionPerformed

    private void cpazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpazMouseClicked
        tabla(cpaz,txt_nombre,txt_id);
mostrarN(txt_id,clavo,paz);

 pasarHistorial(txt_id,paz,clavo,historcio_table);
    }//GEN-LAST:event_cpazMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

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
actualizarTabla(1,ciudadbox, cpaz);        


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      pasarHistorial(txt_id,paz,clavo,historcio_table);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

   
     if (compro==false){
         
         
          cpaz.setVisible(true);
         cpazs.setVisible(true);
         compro=true;
     }else{
         
         
         
          cpaz.setVisible(false);
         cpazs.setVisible(false);
         compro=false;
     }

        
        
        /*
    Refinanciar r1 = new Refinanciar();
if (txt_nombre.getText().isEmpty()) {

    
     JOptionPane.showMessageDialog(null, "CLIENTE NO SELECCIONADO");
    
}else{
    
    
     obtenerCliente();     
     obtenerCliente();   
         r1.setVisible(true);

}*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

           if (prestamo.getText().equals("") || intereses.getText().equals("") || cuotas.getText().equals("") || valor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
                prestamo.setBackground(Color.red);
                intereses.setBackground(Color.red);
                cuotas.setBackground(Color.red);
                valor.setBackground(Color.red);
               
            } else {
               
               int idClientes = Integer.parseInt(txt_id.getText());

 try {
        Connection cn = Conexion.conectar();

PreparedStatement consulta2 = cn.prepareStatement("DELETE FROM historial_abonos WHERE idClientes = ?");

                consulta2.setInt(1, idClientes);


        consulta2.executeUpdate();

        JOptionPane.showMessageDialog(null, "Cliente Activado.");
        
         prestamo.setBackground(Color.green);
                         fecha.setBackground(Color.green);

                intereses.setBackground(Color.green);
                cuotas.setBackground(Color.green);
                valor.setBackground(Color.green);
        cn.close();
    } catch (SQLException ex) {
        System.err.println("Error al activar cliente: " + ex);
        JOptionPane.showMessageDialog(null, "Error al asignar estado cero al cliente.");
    }

actualizarTabla(1,ciudadbox, cpaz);
                    refinanciar();
                    
                    
                    
           }
           
   


  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        c1.desplazarClientesConEnter(ciudadbox, fecha, prestamo);

    }//GEN-LAST:event_fechaKeyPressed

    private void prestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prestamoKeyPressed
       c1.desplazarClientesConEnter(ciudadbox, prestamo, intereses);
       // TODO add your handling code here:
    }//GEN-LAST:event_prestamoKeyPressed

    private void interesesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interesesKeyPressed
         c1.desplazarClientesConEnter(ciudadbox, intereses, cuotas);
    // TODO add your handling code here:
    }//GEN-LAST:event_interesesKeyPressed

    private void cuotasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotasKeyPressed
          c1.desplazarClientesConEnter(ciudadbox, cuotas, valor);
    // TODO add your handling code here:
    }//GEN-LAST:event_cuotasKeyPressed

    private void valorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorKeyPressed

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
            java.util.logging.Logger.getLogger(Paz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ciudadbox;
    private javax.swing.JTextField clavo;
    private javax.swing.JTable cpaz;
    private javax.swing.JScrollPane cpazs;
    private javax.swing.JTextField cuotas;
    private javax.swing.JTextField fecha;
    private javax.swing.JTable historcio_table;
    private javax.swing.JTextField intereses;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField paz;
    private javax.swing.JTextField prestamo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables





public void cargarDeudos(int estado1, JComboBox combo, JTable tabla){
    int estado = estado1;
   try {
    Connection conexion = Conexion.conectar();
    String ciudadSeleccionada = combo.getSelectedItem().toString();
    String consulta = "SELECT c.idClientes, c.nombre, c.apellido, c.prestamo, c.intereses, c.plazo_dias, c.mora "
                 + "FROM clientes c "
                 + "INNER JOIN categoria ca ON c.idCategorias = ca.idcategoria "
                 + "WHERE ca.ciudad = ? AND c.estado = ?";
    PreparedStatement ps = conexion.prepareStatement(consulta);
    ps.setString(1, ciudadSeleccionada);
        ps.setInt(2, estado);

    ResultSet rs = ps.executeQuery();

    // Limpiar la tabla antes de cargar los nuevos datos
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    model.setRowCount(0);

    while (rs.next()) {
        Object[] fila = new Object[7];
        fila[0] = rs.getInt("idClientes");
        fila[1] = rs.getString("nombre");
        fila[2] = rs.getString("apellido");
        fila[3] = rs.getInt("prestamo");
        fila[4] = rs.getInt("plazo_dias");
        fila[5] = rs.getInt("intereses");
        fila[6] = rs.getInt("mora");
        model.addRow(fila);
    }

    rs.close();
    ps.close();
    conexion.close();
} catch (SQLException e) {
    e.printStackTrace();
}
}


public void cargarCiudadbox(){
    
    
    
try {
    Connection cn = Conexion.conectar();
    PreparedStatement consulta = cn.prepareStatement("SELECT ciudad FROM categoria");
    ResultSet rs = consulta.executeQuery();

    // Agregar los nombres y apellidos de los clientes en el JComboBox
    while (rs.next()) {
        String ciudad = rs.getString("Ciudad");
        ciudadbox.addItem(ciudad);
               

    }

    cn.close();
} catch (SQLException e) {
    System.err.println("Error al obtener la lista de clientes: " + e);
    JOptionPane.showMessageDialog(null, "Error al obtener la lista de ciudades.");
}
}


public void actualizarTabla(int estado1, JComboBox combo, JTable panel) {
    // Eliminar todos los registros de la tabla
 
   DefaultTableModel model = (DefaultTableModel) panel.getModel();
    model.setRowCount(0);

    // Cargar los datos desde la base de datos en el modelo de tabla
    cargarDeudos(estado1,combo, panel);

    // Actualizar la tabla
    cpaz.setModel(model);
}

public void tabla (JTable tabla, JTextField txt, JTextField txt2){
    
         int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada
                        String idClientes = tabla.getValueAt(filaSeleccionada, 0).toString();

            String nombre = tabla.getValueAt(filaSeleccionada, 1).toString();
         

            // Asignar los datos a los campos correspondientes
            txt.setText(nombre);
          txt2.setText(idClientes);
            
        }
    
    
}



public void mostrarN(JTextField txt,JTextField txt2,JTextField txt3){
    
     int idClientes = Integer.parseInt(txt.getText());
       try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("SELECT contador_estado, contador_estado_paz FROM clientes WHERE idclientes = ?");
            consulta.setInt(1, idClientes);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
               

                txt2.setText(rs.getString("contador_estado"));
                txt3.setText(rs.getString("contador_estado_paz"));

          
                
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }

            cn.close();
        } catch (SQLException ex) { 
            System.err.println("Error al obtener los datos del cliente: " + ex);
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente.");
        }
    
}

public void pasarHistorial( JTextField txt,JTextField txt2
        ,JTextField txt3,JTable tabla){
  
            int idcliente = Integer.parseInt(txt.getText());

       try {
    Connection cn = Conexion.conectar();
    // Copiar datos de historial_abonos a historial_abonos_respaldo
PreparedStatement copiarDatos = cn.prepareStatement("INSERT INTO historial_abonos_respaldo (id, idClientes, fecha, monto, prestamo_restante, intereses,ganancia,idcategoria) SELECT id, idClientes, fecha, monto, prestamo_restante, intereses,ganancia,idcategoria FROM historial_abonos WHERE idClientes = ? AND id NOT IN (SELECT id FROM historial_abonos_respaldo)");
    copiarDatos.setInt(1, idcliente);
    copiarDatos.executeUpdate();

    cn.close();
} catch (SQLException ex) {
    System.err.println("Error al copiar datos a historial_abonos_respaldo: " + ex);
   
}

       cargarHistorial(txt,tabla) ;
      mostrarN(txt,txt2,txt3);
}

private void cargarHistorial(JTextField txt, JTable panel) {
    DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("Fecha");
    modelo.addColumn("Monto abonado");
    modelo.addColumn("Queda");

    modelo.addColumn("Intereses");

    // Obtener el ID del cliente del JTextField
    int idCliente = Integer.parseInt(txt.getText());

    try {
        Connection cn = Conexion.conectar();

        // Consultar el historial de abonos del cliente
        PreparedStatement consultaHistorial = cn.prepareStatement("SELECT id, fecha, monto, prestamo_restante,intereses FROM historial_abonos_respaldo WHERE idClientes = ?");
        consultaHistorial.setInt(1, idCliente);
        ResultSet rsHistorial = consultaHistorial.executeQuery();

        while (rsHistorial.next()) {
            Object[] fila = new Object[4];
         
            fila[0] = rsHistorial.getDate("fecha");
            fila[1] = rsHistorial.getInt("monto");
            fila[2] = rsHistorial.getInt("prestamo_restante");
                        fila[3] = rsHistorial.getInt("intereses");

            modelo.addRow(fila);
        }

        panel.setModel(modelo);
        cn.close();
    } catch (SQLException ex) {
        System.err.println("Error al cargar historial de abonos: " + ex);
        JOptionPane.showMessageDialog(null, "Error al cargar historial de abonos.");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.");
    }
}

  


  private void refinanciar() {
  
      
      
        try {
            
            
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("UPDATE clientes SET apellido = ?, prestamo = ?, prestamo_interes = ?, valor_cuota = ?, plazo_dias = ?,fecha_vencimiento =?,estado=0,prestamo_restante=? WHERE nombre = ?");
         
           String texto= fecha.getText();
              if (texto.isEmpty()) {
                        LocalDate fechaHoy = LocalDate.now();
                        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        String fecha2 = fechaHoy.format(formateador);
                                            consulta.setString(1, fecha2);


                    } else {
                      consulta.setString(1, fecha.getText());
                    }
              
              
            consulta.setInt(2, Integer.parseInt(prestamo.getText()));
            consulta.setInt(3, Integer.parseInt(intereses.getText()));
            consulta.setInt(4, Integer.parseInt(valor.getText()));
            consulta.setInt(5, Integer.parseInt(cuotas.getText()));
      
                consulta.setString(7, intereses.getText());
                            consulta.setString(8, txt_nombre.getText());

            
              LocalDate fechaActual = LocalDate.now();
                    LocalDate fechaVencimiento = fechaActual.plusDays(Integer.parseInt(cuotas.getText().trim()));
                    Date fechaVencimientoSql = java.sql.Date.valueOf(fechaVencimiento);
                    consulta.setDate(6,fechaVencimientoSql);
                     consulta.executeUpdate();
            // Cerrar el PreparedStatement y la conexión
            consulta.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los valores del cliente: " + e.getMessage());
        }

    }
}
