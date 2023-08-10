package Graficas;

import Conexion_BD.Conexion;
import Controladores.Ctrl_Clientes;
import Controladores.Reportes_pdf;

import com.toedter.calendar.JCalendar;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

import Graficas.Singenton;
import Modelos.Clientes;
import java.awt.HeadlessException;
import java.text.DecimalFormat;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Ramon
 */
public class Abonos_vista extends javax.swing.JPanel {

    Categoria_vista cat = new Categoria_vista();

    int obtenerIdCategoriaCombo;
    Clientes_vista cl = new Clientes_vista();
    int idciudad;
    Singenton instancia = Singenton.getInstancia();
    boolean compro = false;
    String ciudadActual;
    public static String valor = "";
    zapato z = new zapato();
    int a;
    public static String ciudadSeleccionada;
    Date fecha;
    String ciudad_sel;
    JCalendar jCalendar = new JCalendar();
    int prueba = 1;
    boolean comproc;
    int mora;

    int currentIndex;
    int totalItems;
    private Singlenton singleton = Singlenton.obtenerInstancia();
    int indiceClienteSeleccionado;
    int idClientes;

    public Abonos_vista() {
        initComponents();
        restringirSoloNumeros(txtabonos);
        restringirSoloNumeros(cfecha2);
        restringirSoloNumeros(ccelular);
        restringirSoloNumeros(cprestamo);
        restringirSoloNumeros(cintereses);
        restringirSoloNumeros(ccuotas);
        restringirSoloNumeros(cvalorc);
 txtganancia.setEnabled(false);
         txtganancia.setDisabledTextColor(Color.BLACK);
        txtnombre.setEnabled(false);
        clientes_tab.setVisible(false);
        cl_tab.setVisible(false);

//JPanel estado = new JPanel();
        txtnombre.setEnabled(false);
        txtprestamo.setEnabled(false);
        txt_infointeres.setEnabled(false);
        txtin.setEnabled(false);
        txteliminar.setEnabled(false);
        txtnumero.setEnabled(false);
        txtdir.setEnabled(false);
        txtnombre.setDisabledTextColor(Color.BLACK);
        txtprestamo.setDisabledTextColor(Color.BLACK);

        txt_infointeres.setDisabledTextColor(Color.BLACK);
        txtin.setDisabledTextColor(Color.BLACK);
        txteliminar.setDisabledTextColor(Color.BLACK);
        txtdir.setDisabledTextColor(Color.BLACK);
        txtnumero.setDisabledTextColor(Color.BLACK);
        desplazarClientesConEnter(clientes_combo, txtabonos, historial_abonos);

        this.cargarCiudadbox(ciudad_box);
        cargarMeses();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        ciudad_box = new javax.swing.JComboBox<>();
        cl_tab = new javax.swing.JScrollPane();
        clientes_tab = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historial_abonos = new javax.swing.JTable();
        txtprestamo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtabonos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clientes_combo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        insertar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_infointeres = new javax.swing.JTextField();
        txteliminar = new javax.swing.JTextField();
        eliminar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idCliente_combo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        txtin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cfecha2 = new javax.swing.JTextField();
        cnombre = new javax.swing.JTextField();
        cprestamo = new javax.swing.JTextField();
        ccelular = new javax.swing.JTextField();
        ccuotas = new javax.swing.JTextField();
        cvalorc = new javax.swing.JTextField();
        cintereses = new javax.swing.JTextField();
        cdireccion = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        id_eliminar = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cfecha = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        utilidad = new javax.swing.JLabel();
        utilidad2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        atraso = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtganancia = new javax.swing.JTextField();
        utilidad1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtestado = new javax.swing.JButton();

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton7.setText("jButton7");

        setPreferredSize(new java.awt.Dimension(1020, 700));

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setPreferredSize(new java.awt.Dimension(1020, 700));
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgMouseClicked(evt);
            }
        });
        bg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bgKeyPressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ciudad_box.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        ciudad_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ciudad_boxItemStateChanged(evt);
            }
        });
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
        bg.add(ciudad_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, 30));

        clientes_tab.setBackground(new java.awt.Color(255, 255, 255));
        clientes_tab.setForeground(new java.awt.Color(0, 0, 0));
        clientes_tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "FECHA", "PRESTAMO", "P.INTERES", "VALOR", "MORA", "DIR", "NUM", "CUOTAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientes_tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientes_tabMouseClicked(evt);
            }
        });
        cl_tab.setViewportView(clientes_tab);

        bg.add(cl_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 560, 510));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ciudad:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        historial_abonos.setBackground(new java.awt.Color(0, 153, 0));
        historial_abonos.setForeground(new java.awt.Color(255, 255, 255));
        historial_abonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Abono", "Quedan", "Fecha"
            }
        ));
        historial_abonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historial_abonosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(historial_abonos);
        if (historial_abonos.getColumnModel().getColumnCount() > 0) {
            historial_abonos.getColumnModel().getColumn(2).setMinWidth(100);
            historial_abonos.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 330, 320));

        txtprestamo.setBackground(new java.awt.Color(153, 153, 153));
        txtprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprestamoActionPerformed(evt);
            }
        });
        bg.add(txtprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 160, -1));

        txtnombre.setBackground(new java.awt.Color(153, 153, 153));
        txtnombre.setBorder(null);
        bg.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 180, 20));

        txtabonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtabonosActionPerformed(evt);
            }
        });
        txtabonos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtabonosKeyPressed(evt);
            }
        });
        bg.add(txtabonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 140, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prestamo:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CELULAR:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        clientes_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Cliente" }));
        clientes_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientes_comboActionPerformed(evt);
            }
        });
        bg.add(clientes_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 190, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-dinero-30.png"))); // NOI18N
        jLabel9.setText("Abono:");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, -1));

        insertar.setBackground(new java.awt.Color(0, 255, 51));
        insertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGREGAR");

        javax.swing.GroupLayout insertarLayout = new javax.swing.GroupLayout(insertar);
        insertar.setLayout(insertarLayout);
        insertarLayout.setHorizontalGroup(
            insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        insertarLayout.setVerticalGroup(
            insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        bg.add(insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Direccion:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 140, 30));
        bg.add(txt_infointeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 120, -1));
        bg.add(txteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 120, -1));

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ELIMINAR");

        javax.swing.GroupLayout eliminarLayout = new javax.swing.GroupLayout(eliminar);
        eliminar.setLayout(eliminarLayout);
        eliminarLayout.setHorizontalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        eliminarLayout.setVerticalGroup(
            eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 110, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nombre:");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-usuario-30.png"))); // NOI18N
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-nueva-york-35.png"))); // NOI18N
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));
        bg.add(idCliente_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1000, 60, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Prestamo Con Interes");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 140, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nro Celular");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 140, 30));
        bg.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 130, -1));
        bg.add(txtdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 130, -1));
        bg.add(txtin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 130, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha Carton");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 140, 30));
        bg.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 100, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Valor Cuota");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 140, 30));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Cliente:");
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("NOMBRE:");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("FECHA:");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("PRESTAMO");
        bg.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("P INTERES");
        bg.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("DIRECCION:");
        bg.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CUOTAS");
        bg.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, 30));

        cfecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfecha2ActionPerformed(evt);
            }
        });
        cfecha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cfecha2KeyPressed(evt);
            }
        });
        bg.add(cfecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 120, -1));

        cnombre.setBackground(new java.awt.Color(255, 255, 255));
        cnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnombreActionPerformed(evt);
            }
        });
        cnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnombreKeyPressed(evt);
            }
        });
        bg.add(cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 110, -1));

        cprestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cprestamoKeyPressed(evt);
            }
        });
        bg.add(cprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 110, -1));

        ccelular.setBackground(new java.awt.Color(255, 255, 255));
        ccelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ccelularKeyPressed(evt);
            }
        });
        bg.add(ccelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 110, -1));

        ccuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ccuotasKeyPressed(evt);
            }
        });
        bg.add(ccuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 110, -1));

        cvalorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvalorcActionPerformed(evt);
            }
        });
        cvalorc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvalorcKeyPressed(evt);
            }
        });
        bg.add(cvalorc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 110, -1));

        cintereses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cinteresesKeyPressed(evt);
            }
        });
        bg.add(cintereses, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 110, -1));

        cdireccion.setBackground(new java.awt.Color(255, 255, 255));
        cdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cdireccionKeyPressed(evt);
            }
        });
        bg.add(cdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 110, -1));

        jButton2.setBackground(new java.awt.Color(60, 225, 93));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("AGREGAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 90, 40));
        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 350, -1));
        bg.add(id_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 130, -1));

        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        bg.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 30));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setText("ELIMINAR C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 110, 30));

        jButton3.setText("IMPRIMIR CARTON");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        bg.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 150, -1));

        cfecha.setBackground(new java.awt.Color(255, 255, 255));
        cfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfechaActionPerformed(evt);
            }
        });
        cfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cfechaKeyPressed(evt);
            }
        });
        bg.add(cfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 110, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("FECHA:");
        bg.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jPanel1.setBackground(java.awt.SystemColor.window);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 255, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        utilidad.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        utilidad.setForeground(new java.awt.Color(0, 204, 0));
        utilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        utilidad.setText("UTILIDAD");
        utilidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        utilidad2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        utilidad2.setForeground(new java.awt.Color(0, 0, 0));
        utilidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        utilidad2.setText("UTILIDAD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(utilidad)
                    .addComponent(utilidad2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(utilidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utilidad)
                .addGap(31, 31, 31))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 110, 170));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("VALOR C");
        bg.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        atraso.setBackground(new java.awt.Color(204, 0, 51));
        atraso.setText("DIAS DE ATRASO: 0");
        bg.add(atraso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 150, 110));

        jButton6.setText("REFINANCIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        bg.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 150, 70));

        jButton8.setText("HISTORICO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        bg.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 150, 50));

        txtganancia.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txtganancia.setForeground(new java.awt.Color(0, 204, 0));
        txtganancia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(txtganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 160, 50));

        utilidad1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        utilidad1.setForeground(new java.awt.Color(0, 0, 0));
        utilidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        utilidad1.setText("GANANCIA ");
        bg.add(utilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 200, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setText("CLAVOS");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        bg.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 80, 40));

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setText("PAZ Y SALVO");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        bg.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 100, 40));

        txtestado.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        bg.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 340, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ciudad_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudad_boxActionPerformed

        String selectedItem = (String) ciudad_box.getSelectedItem();

        valor = selectedItem;

        txtabonos.requestFocus(true);
        cargarClienteBox(clientes_combo, ciudad_box);
        singleton.setMiVariable(selectedItem); // Asignar un valor
        System.out.println(valor);

    }//GEN-LAST:event_ciudad_boxActionPerformed

    private void clientes_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientes_comboActionPerformed
        cargaEstado( clientes_combo, txtestado, idCliente_combo, txtnombre, txt_infointeres, txtprestamo, txtnumero, txtdir, txtin, txtfecha, historial_abonos);
        txtabonos.requestFocus(true);
        indiceClienteSeleccionado = clientes_combo.getSelectedIndex();
        cargarMeses();
    }//GEN-LAST:event_clientes_comboActionPerformed

    private void insertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarMouseClicked
        txtabonos.requestFocus(true);

        realizarAbono(clientes_combo, txtabonos, a, fecha, cfecha2);
        cargarHistorial(clientes_combo, historial_abonos);
        String clienteSeleccionado = (String) clientes_combo.getSelectedItem();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement(
                    "SELECT estado FROM clientes WHERE nombre = ?"
            );
            consulta.setString(1, clienteSeleccionado);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                int estado1 = rs.getInt("estado");
                String textoEstado;

                switch (estado1) {
                    case 0:
                        textoEstado = "Activo";
                        break;
                    case 1:
                        textoEstado = "Paz y Salvo";
                        txtestado.setBackground(Color.GREEN);

                        break;
                    case 2:
                        textoEstado = "Clavo";
                        txtestado.setBackground(Color.RED);
                        break;
                    case 3:
                        textoEstado = "Inactivo";
                        break;
                    default:
                        textoEstado = "Desconocido";
                        break;
                }

                txtestado.setText("Estado: " + textoEstado);
            }

            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al obtener el estado del cliente: " + e);
            JOptionPane.showMessageDialog(null, "Error al obtener el estado del cliente.");
        }
    }//GEN-LAST:event_insertarMouseClicked

    private void historial_abonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historial_abonosMouseClicked
        int filaSeleccionada = historial_abonos.getSelectedRow();
        if (filaSeleccionada != -1) {

            String idClientes = historial_abonos.getValueAt(filaSeleccionada, 0).toString();

            txteliminar.setText(idClientes);

        }
    }//GEN-LAST:event_historial_abonosMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        txtabonos.requestFocus(true);

        int ELIMINAR = Integer.parseInt(txteliminar.getText());
        int id = Integer.parseInt(idCliente_combo.getText());

        try {
            Connection cn = Conexion.conectar();

            // Obtener el valor eliminado de prestamo_restante
            PreparedStatement consulta1 = cn.prepareStatement("SELECT monto FROM historial_abonos WHERE id = ?");
            consulta1.setInt(1, ELIMINAR);
            ResultSet rs = consulta1.executeQuery();

            if (rs.next()) {
                int prestamoRestanteEliminado = rs.getInt("monto");

                // Eliminar el registro del cliente en la tabla "historial_abonos"
                PreparedStatement consulta2 = cn.prepareStatement("DELETE FROM historial_abonos WHERE id = ?");
                consulta2.setInt(1, ELIMINAR);
                consulta2.executeUpdate();

                // Obtener el valor actual de prestamo_restante en la tabla "clientes"
                PreparedStatement consulta3 = cn.prepareStatement("SELECT prestamo_restante FROM clientes WHERE idclientes = ?");
                consulta3.setInt(1, id);
                ResultSet rs2 = consulta3.executeQuery();

                if (rs2.next()) {
                    int prestamoRestanteActual = rs2.getInt("prestamo_restante");

                    // Calcular el nuevo valor de prestamo_restante
                    int nuevoPrestamoRestante = prestamoRestanteActual + prestamoRestanteEliminado;

                    // Actualizar el valor de prestamo_restante en la tabla "clientes"
                    PreparedStatement consulta4 = cn.prepareStatement("UPDATE clientes SET prestamo_restante = ? WHERE idclientes = ?");
                    consulta4.setInt(1, nuevoPrestamoRestante);
                    consulta4.setInt(2, id);
                    consulta4.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
                }
            }

            cn.close();
        } catch (SQLException ex) {
            System.err.println("Error al eliminar el cliente: " + ex);
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente.");
        }
        cargarHistorial(clientes_combo, historial_abonos);
    }//GEN-LAST:event_eliminarMouseClicked

    private void txtabonosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtabonosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F) {
            cfecha2.requestFocus();
        }

        if (evt.getKeyChar() == 'c' || evt.getKeyChar() == 'C') {
            // Realiza aquí la acción que deseas cuando se presione la letra "c"
            System.out.println("La letra 'c' ha sido presionada");

            currentIndex = ciudad_box.getSelectedIndex();
            totalItems = ciudad_box.getItemCount();

            if (currentIndex < totalItems - 1) {
                // Incrementa el índice para desplazarte hacia abajo
                int newIndex = currentIndex + 1;
                ciudad_box.setSelectedIndex(newIndex);
            }
        } else if (evt.getKeyChar() == 'x' || evt.getKeyChar() == 'X') {
            // Realiza aquí la acción que deseas cuando se presione la letra "x"
            System.out.println("La letra 'x' ha sido presionada");

            currentIndex = ciudad_box.getSelectedIndex();
            if (currentIndex > 0) {
                // Decrementa el índice para desplazarte hacia arriba
                int newIndex = currentIndex - 1;
                ciudad_box.setSelectedIndex(newIndex);
            }
        } else if (evt.getKeyChar() == 't' || evt.getKeyChar() == 'T') {
            // Realiza aquí la acción que deseas cuando se presione la letra "t"
            System.out.println("La letra 't' ha sido presionada");

            if (!comproc) {
                clientes_tab.setVisible(true);
                cl_tab.setVisible(true);
                historial_abonos.setVisible(false);
                comproc = true;
                cl.CargarClientes(ciudad_box, clientes_tab);
            } else if (comproc) {
                historial_abonos.setVisible(true);

                clientes_tab.setVisible(false);
                cl_tab.setVisible(false);
                comproc = false;
            }
            evt.consume();
        }
        cl.desplazarClientesConEnter(clientes_combo, txtabonos, txtabonos);
    }//GEN-LAST:event_txtabonosKeyPressed

    private void txtabonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtabonosActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_txtabonosActionPerformed

    private void bgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgKeyPressed


    }//GEN-LAST:event_bgKeyPressed

    private void bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseClicked
        txtabonos.requestFocus(true);
    }//GEN-LAST:event_bgMouseClicked

    private void ciudad_boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudad_boxMouseClicked

    }//GEN-LAST:event_ciudad_boxMouseClicked

    private void ciudad_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ciudad_boxItemStateChanged
        String selectedItem = (String) ciudad_box.getSelectedItem();
        controlador.setSelectedItem(selectedItem);
        valor = selectedItem;
    }//GEN-LAST:event_ciudad_boxItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        agregar(cnombre, cfecha2, cprestamo, ccuotas, cdireccion, cvalorc, ccelular, cintereses, clientes_tab, ciudad_box);

        cargarClienteBox(clientes_combo, ciudad_box);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnombreActionPerformed

    }//GEN-LAST:event_cnombreActionPerformed

    private void cnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnombreKeyPressed
        cl.desplazarClientesConEnter(ciudad_box, cnombre, cfecha);

    }//GEN-LAST:event_cnombreKeyPressed

    private void cfecha2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfecha2KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_F) {
            txtabonos.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            String text = cfecha2.getText();
            int caretPosition = cfecha2.getCaretPosition();
            if (caretPosition > 0 && text.charAt(caretPosition - 1) == '/') {
                int slashCount = text.replaceAll("[^/]", "").length();
                if (slashCount < 2) {
                    // Eliminar el carácter "/" si se encuentra justo antes de la posición del cursor
                    text = text.substring(0, caretPosition - 1) + text.substring(caretPosition);
                    cfecha2.setText(text);
                    cfecha2.setCaretPosition(caretPosition - 1);
                }
            }
        } else {
            String text = cfecha2.getText();
            int numberCount = text.replaceAll("[^0-9]", "").length();
            int slashCount = text.replaceAll("[^/]", "").length();
            if (numberCount > 0 && numberCount % 2 == 0 && slashCount < 2 && numberCount <= 6) {
                text += "/";
                cfecha2.setText(text);
            }
            if (text.length() > 9) {
                text = text.substring(0, 9);
                cfecha2.setText(text);
            }
        }


    }//GEN-LAST:event_cfecha2KeyPressed

    private void cdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdireccionKeyPressed
        cl.desplazarClientesConEnter(ciudad_box, cdireccion, ccelular);

    }//GEN-LAST:event_cdireccionKeyPressed

    private void ccelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccelularKeyPressed
        cl.desplazarClientesConEnter(ciudad_box, ccelular, cprestamo);

    }//GEN-LAST:event_ccelularKeyPressed

    private void cprestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cprestamoKeyPressed
        cl.desplazarClientesConEnter(ciudad_box, cprestamo, cintereses);
    }//GEN-LAST:event_cprestamoKeyPressed

    private void cinteresesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinteresesKeyPressed
        cl.desplazarClientesConEnter(ciudad_box, cintereses, ccuotas);

    }//GEN-LAST:event_cinteresesKeyPressed

    private void ccuotasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccuotasKeyPressed
        cl.desplazarClientesConEnter(ciudad_box, ccuotas, cvalorc);

    }//GEN-LAST:event_ccuotasKeyPressed

    private void cvalorcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvalorcKeyPressed
        cl.desplazarClientesConEnter(ciudad_box, cvalorc, cnombre);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            agregar(cnombre, cfecha2, cprestamo, ccuotas, cdireccion, cvalorc, ccelular, cintereses, clientes_tab, ciudad_box);
        }


    }//GEN-LAST:event_cvalorcKeyPressed

    private void clientes_tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientes_tabMouseClicked

        int filaSeleccionada = clientes_tab.getSelectedRow();
        if (filaSeleccionada != -1) {

            String idClientes = clientes_tab.getValueAt(filaSeleccionada, 0).toString();
            String nombre = clientes_tab.getValueAt(filaSeleccionada, 1).toString();
            String apellido = clientes_tab.getValueAt(filaSeleccionada, 2).toString();
            int prestamo = Integer.parseInt(clientes_tab.getValueAt(filaSeleccionada, 3).toString());
            int plazo_dias = Integer.parseInt(clientes_tab.getValueAt(filaSeleccionada, 9).toString());
            int valor_cuota = Integer.parseInt(clientes_tab.getValueAt(filaSeleccionada, 5).toString());
            int prestamo_restante = Integer.parseInt(clientes_tab.getValueAt(filaSeleccionada, 4).toString());

            String direccion = clientes_tab.getValueAt(filaSeleccionada, 7).toString();
            String celular = clientes_tab.getValueAt(filaSeleccionada, 8).toString();

            id_eliminar.setText(idClientes);
            cnombre.setText(nombre);
            cfecha2.setText(apellido);
            cprestamo.setText((Integer.toString(prestamo)));
            ccuotas.setText((Integer.toString(plazo_dias)));
            cvalorc.setText((Integer.toString(valor_cuota)));
            cdireccion.setText(direccion);
            ccelular.setText(celular);
            cintereses.setText(Integer.toString(prestamo_restante));
            txtabonos.requestFocus(true);
        }
    }//GEN-LAST:event_clientes_tabMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

        if (a == 0) {
            a = 1;

            editar.setBackground(Color.GREEN);

        } else if (a == 1) {
            editar.setBackground(Color.WHITE);
            a = 0;

        }
    }//GEN-LAST:event_editarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cl.eliminarCliente(id_eliminar);
        txtabonos.requestFocus(true);
        cl.CargarClientes(ciudad_box, clientes_tab);
        cargarClienteBox(clientes_combo, ciudad_box);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cvalorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvalorcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvalorcActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        PazYSalvo Paz = new PazYSalvo();

        int cliente = Integer.parseInt(id_eliminar.getText().trim());
        String clienteN = (txtnombre.getText().trim());

        Reportes_pdf pdf = new Reportes_pdf();
        pdf.generarInformePDF(cliente, clienteN);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void cfecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfecha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfecha2ActionPerformed

    private void cfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfechaActionPerformed

    private void cfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfechaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            String text = cfecha.getText();
            int caretPosition = cfecha.getCaretPosition();
            if (caretPosition > 0 && text.charAt(caretPosition - 1) == '/') {
                // Eliminar el carácter "/" si se encuentra justo antes de la posición del cursor
                text = text.substring(0, caretPosition - 1) + text.substring(caretPosition);
                cfecha.setText(text);
                cfecha.setCaretPosition(caretPosition - 1);
            }
        } else {
            String text = cfecha.getText();
            int numberCount = text.replaceAll("[^0-9]", "").length();
            if (numberCount > 0 && numberCount % 2 == 0 && numberCount <= 6) {
                text += "/";
                cfecha.setText(text);
            }
            if (text.length() > 8) {
                text = text.substring(0, 8);
                cfecha.setText(text);
            }
        }
        cl.desplazarClientesConEnter(ciudad_box, cfecha, cdireccion);
    }//GEN-LAST:event_cfechaKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        obtenerCliente();
        
        Refinanciar r1 = new Refinanciar();
r1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprestamoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        
        Paz p1 = new Paz();
        p1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        
        Clavos2 cl = new Clavos2();
        
        cl.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atraso;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField ccelular;
    private javax.swing.JTextField ccuotas;
    private javax.swing.JTextField cdireccion;
    private javax.swing.JTextField cfecha;
    private javax.swing.JTextField cfecha2;
    private javax.swing.JTextField cintereses;
    public javax.swing.JComboBox<String> ciudad_box;
    private javax.swing.JScrollPane cl_tab;
    private javax.swing.JComboBox<String> clientes_combo;
    private javax.swing.JTable clientes_tab;
    private javax.swing.JTextField cnombre;
    private javax.swing.JTextField cprestamo;
    private javax.swing.JTextField cvalorc;
    private javax.swing.JButton editar;
    private javax.swing.JPanel eliminar;
    private javax.swing.JTable historial_abonos;
    private javax.swing.JTextField idCliente_combo;
    private javax.swing.JTextField id_eliminar;
    private javax.swing.JPanel insertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_infointeres;
    public javax.swing.JTextField txtabonos;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txteliminar;
    private javax.swing.JButton txtestado;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtganancia;
    private javax.swing.JTextField txtin;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtprestamo;
    private javax.swing.JLabel utilidad;
    private javax.swing.JLabel utilidad1;
    private javax.swing.JLabel utilidad2;
    // End of variables declaration//GEN-END:variables

    public void cargarClienteBox(JComboBox<String> clientes, JComboBox<String> ciudadBox) {
        try {
            Connection cn = Conexion.conectar();

             PreparedStatement consulta = cn.prepareStatement(
                    "SELECT nombre FROM clientes WHERE idCategorias = (SELECT idcategoria FROM categoria WHERE ciudad = ? ) AND estado IN (0, 2) ORDER BY orden"
            );

            consulta.setString(1, (String) ciudadBox.getSelectedItem());
            ResultSet rs = consulta.executeQuery();

            // Obtener el cliente seleccionado actualmente
            String clienteSeleccionado = (String) clientes.getSelectedItem();

            // Limpiar el JComboBox de clientes y agregar los nuevos valores obtenidos
            clientes.removeAllItems();
            List<String> listaClientes = new ArrayList<>();
            while (rs.next()) {
                String cliente = rs.getString("nombre");
                listaClientes.add(cliente);
            }

            // Agregar los clientes al JComboBox
            for (String cliente : listaClientes) {
                clientes.addItem(cliente);
            }

            // Establecer el cliente seleccionado anteriormente si aún está en la lista
            if (listaClientes.contains(clienteSeleccionado)) {
                clientes.setSelectedItem(clienteSeleccionado);
            }

            cn.close();

            // Actualizar visualmente el JComboBox de clientes
            clientes.repaint();

            // Verificar si hay un cliente seleccionado
            if (clientes.getItemCount() > 0) {
                // Obtener el cliente seleccionado del JComboBox
                clienteSeleccionado = (String) clientes.getSelectedItem();

                try {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement consulta2 = cn2.prepareStatement(
                            "SELECT estado FROM clientes WHERE nombre = ?"
                    );
                    consulta2.setString(1, clienteSeleccionado);
                    ResultSet rs2 = consulta2.executeQuery();

                    if (rs2.next()) {
                        int estado1 = rs2.getInt("estado");
                        String textoEstado;

                        switch (estado1) {
                            case 0:
                                textoEstado = "Activo";
                                break;
                            case 1:
                                textoEstado = "Paz y Salvo";
                                txtestado.setBackground(Color.GREEN);
                                break;
                            case 2:
                                textoEstado = "Clavo";
                                txtestado.setBackground(Color.RED);
                                break;
                            case 3:
                                textoEstado = "Inactivo";
                                break;
                            default:
                                textoEstado = "Desconocido";
                                break;
                        }

                        txtestado.setText("Estado: " + textoEstado);
                    }

                    cn2.close();
                } catch (SQLException e) {
                    System.err.println("Error al obtener el estado del cliente: " + e);
                    JOptionPane.showMessageDialog(null, "Error al obtener el estado del cliente.");
                }
            } else {
                // No hay clientes disponibles, se puede realizar alguna acción adicional si es necesario
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de clientes: " + e);
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de clientes.");
        }
    }

    public void cargarCiudadbox(JComboBox ciudadbox) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("SELECT ciudad FROM categoria");
            ResultSet rs = consulta.executeQuery();

            // Borrar los elementos existentes en el JComboBox
            ciudadbox.removeAllItems();

            // Agregar los nombres y apellidos de los clientes en el JComboBox
            while (rs.next()) {
                String ciudad = rs.getString("Ciudad");
                ciudadbox.addItem(ciudad);
            }

            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de ciudades: " + e);
            JOptionPane.showMessageDialog(null, "Error al obtener la lista de ciudades.");
        }
    }

    public void clientesBox(JComboBox clientes, JTextField txt, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JTextField txt7, JTextField txt8) {
        if (clientes.getSelectedItem() == null) {
            return;
        }

        String nombreCompleto = clientes.getSelectedItem().toString();

        // Buscar los datos del cliente en la base de datos
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("SELECT idClientes, nombre, apellido, prestamo,direccion,numero_celular, prestamo_interes,intereses,mora FROM clientes WHERE nombre = ?");
            consulta.setString(1, nombreCompleto);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                // Mostrar los datos del cliente en los JTextField correspondientes
                txt.setText(rs.getString("idClientes"));
                ResultSet resultado = consulta.executeQuery();
                if (resultado.next()) {
                    idClientes = resultado.getInt("idclientes");
                }

                txt2.setText(rs.getString("nombre"));

                txt4.setText(rs.getString("prestamo"));
                txt5.setText(rs.getString("numero_celular"));
                txt6.setText(rs.getString("direccion"));
                txt7.setText(rs.getString("prestamo_interes"));
                txt8.setText(rs.getString("apellido"));
                utilidad.setText(rs.getString("intereses"));
                String texto = rs.getString("intereses"); // Obtienes el valor del campo "intereses" de la consulta
                String textoAcortado = texto.substring(0, Math.min(texto.length(), 5)); // Acorta el texto a 5 caracteres como máximo
                utilidad.setText(textoAcortado);
                atraso.setText("DIAS DE ATRASO: " + rs.getString("mora"));

            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }

            cn.close();
        } catch (SQLException ex) {
            System.err.println("Error al obtener los datos del cliente: " + ex);
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente.");
        }
    }

    // Restar el monto abonado al valor actual de "prestamo_restante" del cliente
    public void realizarAbono(JComboBox clientes, JTextField txt, int a, Date fechaSel, JTextField txt2) {
        String nombreCompleto = clientes.getSelectedItem().toString();

        if (!txt.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números.");
            return;
        }

        // Obtener el monto abonado del textfield
        int montoAbono = 0;
        if (!txt.getText().isEmpty()) {
            montoAbono = Integer.parseInt(txt.getText());
        }

        try {
            // Conectar a la base de datos
            try (Connection cn = Conexion.conectar()) {

                // Obtener el id del cliente y su prestamo restante
                PreparedStatement consulta = cn.prepareStatement("SELECT idClientes, prestamo_restante, estado,plazo_dias,prestamo,idcategorias FROM clientes WHERE nombre = ?");
                consulta.setString(1, nombreCompleto);
                try (ResultSet rs = consulta.executeQuery()) {

                    if (rs.next()) {
                        int idCliente = rs.getInt("idClientes");
                        int prestamoRestante = rs.getInt("prestamo_restante");
                        int estadoCliente = rs.getInt("estado");
                        int prestamo = rs.getInt("prestamo");
                        int plazo_dias = rs.getInt("plazo_dias");
                        int ciudad = rs.getInt("idcategorias");
                        // Validar que el monto abonado no sea mayor al prestamo restante
                        if (montoAbono > prestamoRestante) {
                            System.out.println(montoAbono);
                            JOptionPane.showMessageDialog(null, "El monto abonado no puede ser mayor al prestamo restante.");
                            return;
                        }

                        // Restar el monto abonado al valor actual de "prestamo_restante" del cliente
                        prestamoRestante -= montoAbono;

                        // Actualizar el valor de "prestamo_restante" en la tabla "clientes"
                        PreparedStatement actualizacion = cn.prepareStatement("UPDATE clientes SET prestamo_restante = ? WHERE idClientes = ?");
                        actualizacion.setInt(1, prestamoRestante);
                        actualizacion.setInt(2, idCliente);
                        actualizacion.executeUpdate();

                        // Si el prestamo restante llega a cero, actualizar el estado del cliente a "1"
                        if (prestamoRestante == 0 && estadoCliente != 1) {
                            PreparedStatement actualizacionEstado = cn.prepareStatement("UPDATE clientes SET estado = 1 WHERE idClientes = ?");
                            actualizacionEstado.setInt(1, idCliente);
                            actualizacionEstado.executeUpdate();
                        }

                        // Insertar registro en la tabla "historial_abonos"
                        PreparedStatement insercion = cn.prepareStatement("INSERT INTO historial_abonos (idClientes, fecha, monto, abonado, prestamo_restante,ganancia,idcategoria) VALUES (?, ?, ?, ?, ?,?,?)");

                        insercion.setInt(1, idCliente);

                        java.sql.Date fechaSql;

                        if (!txt2.getText().isEmpty()) {
                            // Obtener la fecha del JTextField en formato "dd/mm/yyyy"
                            String fechaTexto = txt2.getText();
                            // Convertir la fecha de texto a objeto java.util.Date
                            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                            java.util.Date fechaUtil = format.parse(fechaTexto);
                            // Convertir java.util.Date a java.sql.Date
                            fechaSql = new java.sql.Date(fechaUtil.getTime());
                        } else {
                            // Usar la fecha de hoy
                            fechaSql = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                        }

                        insercion.setDate(2, fechaSql);
                        insercion.setInt(3, montoAbono);
                        insercion.setInt(4, montoAbono);
                        insercion.setInt(5, prestamoRestante);
                        double ganancia = montoAbono * plazo_dias - prestamo;
                        double ganancia2 = ganancia / plazo_dias;
                        insercion.setDouble(6, ganancia2);
                        insercion.setDouble(7, ciudad);

                        insercion.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Abono de hoy hecho");
                        cfecha2.setText("");
                        txtabonos.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                    }

                }
            }
        } catch (SQLException ex) {

            System.err.println("Error al actualizar el prestamo restante: " + ex);
            JOptionPane.showMessageDialog(null, "Error al actualizar el prestamo restante.");
        } catch (ParseException ex) {
            System.err.println("Error al analizar la fecha: " + ex);
            JOptionPane.showMessageDialog(null, "Error, fecha tiene que ser dd/mm/yyyy.");
        }

        cargarMeses();
    }

    public void cargarHistorial(JComboBox clientes, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Abono");
        modelo.addColumn("Queda");
        modelo.addColumn("Fecha");
        // Obtener el cliente seleccionado del combobox
        if (clientes.getSelectedItem() == null) {
            return;

        }

        String nombreCompleto = clientes.getSelectedItem().toString();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("SELECT idClientes FROM clientes WHERE nombre = ?");
            consulta.setString(1, nombreCompleto);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                int idCliente = rs.getInt("idClientes");

                PreparedStatement consultaHistorial = cn.prepareStatement("SELECT id,fecha, monto, prestamo_restante FROM historial_abonos WHERE idClientes = ?");
                consultaHistorial.setInt(1, idCliente);
                ResultSet rsHistorial = consultaHistorial.executeQuery();

                while (rsHistorial.next()) {
                    Object[] fila = new Object[4];
                    fila[0] = rsHistorial.getInt("id");
                    fila[3] = rsHistorial.getDate("fecha");
                    fila[1] = rsHistorial.getInt("monto");
                    fila[2] = rsHistorial.getInt("prestamo_restante");
                    modelo.addRow(fila);
                }

                tabla.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }

            cn.close();
        } catch (SQLException ex) {
            System.err.println("Error al cargar historial de abonos: " + ex);
            JOptionPane.showMessageDialog(null, "Error al cargar historial de abonos.");
        }
    }

    public void actualizarTabla(JTable tabla) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("SELECT clientes.nombre, clientes.apellido, historial_abonos.fecha, historial_abonos.id, historial_abonos.monto, clientes.prestamo_restante FROM historial_abonos INNER JOIN clientes ON historial_abonos.idClientes = clientes.idClientes");
            ResultSet rs = consulta.executeQuery();

            // Crear modelo de tabla con las columnas necesarias
            DefaultTableModel modeloTabla = new DefaultTableModel();

            modeloTabla.addColumn("ID");

            modeloTabla.addColumn("Monto");
            modeloTabla.addColumn("Queda");
            modeloTabla.addColumn("Fecha");
            // Iterar sobre los resultados de la consulta y agregarlos al modelo de tabla
            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getInt("ID");
                fila[3] = rs.getDate("fecha");
                fila[1] = rs.getInt("monto");
                fila[2] = rs.getInt("prestamo_restante");
                modeloTabla.addRow(fila);
            }

            // Actualizar el contenido del JTable con el modelo de tabla actualizado
            tabla.setModel(modeloTabla);

            cn.close();
        } catch (SQLException ex) {
            System.err.println("Error al actualizar la tabla: " + ex);
        }
    }

    public void desplazarClientesConEnter(JComboBox<String> clientes_combo, JTextField abono, JTable historial) {
        abono.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                int keyCode = e.getKeyCode();
                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) {
                    System.out.println("Control + Enter");
                    realizarAbono(clientes_combo, abono, a, fecha, cfecha2);
                    cargarHistorial(clientes_combo, historial);// Llamar al método realizarAbono()
                } else if (keyCode == KeyEvent.VK_ENTER) {

                    int selectedIndex = clientes_combo.getSelectedIndex();
                    int itemCount = clientes_combo.getItemCount();

                    if (selectedIndex >= 0 && selectedIndex < itemCount - 1) {
                        clientes_combo.setSelectedIndex(selectedIndex + 1);
                    } else if (selectedIndex == itemCount - 1) {
                        clientes_combo.setSelectedIndex(0);
                    }
                }
            }
        });

    }

    public void cargaEstado( JComboBox clientes, JButton txtes, JTextField txt, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JTextField txt7, JTextField txt8, JTable tabla) {

        clientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object selected = clientes.getSelectedItem();
                if (selected != null) {
                    String[] nombreApellido = selected.toString().split(" ");
                    try {
                        Connection cn = Conexion.conectar();
                        PreparedStatement consulta = cn.prepareStatement(
                                "SELECT estado FROM clientes WHERE nombre = ?"
                        );

                        consulta.setString(1, nombreApellido[0]);

                        ResultSet rs = consulta.executeQuery();

                        if (rs.next()) {
                            int estado1 = rs.getInt("estado");
                            switch (estado1) {
                                case 0:
                                    txtes.setText("Activo");
                                    txtes.setBackground(Color.GRAY);
                                    break;
                                case 1:
                                    txtes.setText("Paz y Salvo");
                                    txtes.setBackground(Color.GREEN);
                                    break;
                                case 2:
                                    txtes.setText("Clavo");
                                    txtes.setBackground(Color.RED);
                                    break;
                                case 3:
                                    txtes.setText("Inactivo");
                                    txtes.setBackground(Color.GRAY);

                                    break;
                                default:
                                    txtes.setText("Desconocido");
                            }
                        }

                        cn.close();
                    } catch (SQLException ex) {
                        System.err.println("Error al obtener el estado del cliente: " + ex);
                        JOptionPane.showMessageDialog(null, "Error al obtener el estado del cliente.");
                    }
                }

            }

        });

        this.clientesBox(clientes, txt, txt2, txt3, txt4, txt5, txt6, txt7, txt8);
        cargarHistorial(clientes, tabla);
    }

// Método para obtener la lista de clientes desde la base de datos
   
// Método para obtener la lista de clientes desde la base de datos
// Método para obtener la lista de clientes desde la base de datos
// Método para obtener la lista de clientes desde la base de datos
// Método para actualizar el JComboBox con la lista actualizada de clientes
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

    private void actualizarTabla(JTable clientes, JComboBox a, JTable b) {
        // Eliminar todos los registros de la tabla

        DefaultTableModel model = (DefaultTableModel) clientes.getModel();
        model.setRowCount(0);

        // Cargar los datos desde la base de datos en el modelo de tabla
        cl.CargarClientes(a, b);

        // Actualizar la tabla
        clientes.setModel(model);
    }

    private void restringirSoloNumeros(JTextField textField) {
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                String text = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
                if (!text.matches("[\\d/]*")) {  // Filtra solo números y "/"
                    return;
                }
                super.insertString(fb, offset, string, attr);
            }

            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                String newText = currentText.substring(0, offset) + text + currentText.substring(offset + length);
                if (!newText.matches("[\\d/]*")) {  // Filtra solo números y "/"
                    return;
                }
                super.replace(fb, offset, length, text, attrs);
            }
        });
    }
public void editarCliente() {
    
    
             int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro Quieres Editar el cliente?", "Pregunta", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
        
            
            try {
        Connection cn = Conexion.conectar();
        PreparedStatement consulta = cn.prepareStatement(
                "UPDATE clientes SET nombre = ?, apellido = ?, prestamo = ?, plazo_dias = ?, valor_cuota = ?, direccion = ?, numero_celular = ?, prestamo_interes = ? WHERE idclientes = ?"
        );
        
          String texto = cfecha.getText();
if (texto.isEmpty()) {
                        LocalDate fechaHoy = LocalDate.now();
                        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        String fecha = fechaHoy.format(formateador);
                             consulta.setString(2, fecha);
                    } else {
                               consulta.setString(2, cfecha.getText());

                    }
        consulta.setString(1, cnombre.getText());
        consulta.setInt(3, Integer.parseInt(cprestamo.getText()));
        consulta.setInt(4, Integer.parseInt(ccuotas.getText()));
        consulta.setDouble(5, Integer.parseInt(cvalorc.getText()));
        consulta.setString(6, cdireccion.getText());
        consulta.setString(7, ccelular.getText());
        consulta.setInt(8,Integer.parseInt(cintereses.getText()));
        consulta.setInt(9, Integer.parseInt(id_eliminar.getText()));

        int rowsUpdated = consulta.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Cliente actualizado exitosamente.");
           
 JOptionPane.showMessageDialog(null, "CLIENTE EDITADO", "Éxito", JOptionPane.INFORMATION_MESSAGE);



  
        } else {
            System.out.println("No se encontró el cliente con el ID especificado.");
        }
    } catch (SQLException e) {
        System.err.println("Error al editar el cliente: " + e.getMessage());
    }
            guardarOrden(clientes_combo);

}    
            
         
         else if (respuesta == JOptionPane.NO_OPTION) {
          
            // Código para cuando el usuario selecciona No.
        } else if (respuesta == JOptionPane.CLOSED_OPTION) {
            System.out.println("El usuario ha cerrado el diálogo.");
            // Código para cuando el usuario cierra el diálogo sin seleccionar una opción.
        }
      
    
    
}
            
               


   
    public void agregar(JTextField txt, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6, JTextField txt7, JTextField txt8, JTable clientes, JComboBox<String> b) {
        if (a == 1) {
editarCliente();
            this.actualizarTabla(clientes, b, clientes);
        } else {
            Clientes cliente = new Clientes();
            Ctrl_Clientes controlCliente = new Ctrl_Clientes();

            String categoria = "";
            categoria = b.getSelectedItem().toString().trim();
            String indice = clientes_combo.getSelectedItem().toString().trim();

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
                    cliente.setDireccion((txt5.getText().trim()));
                    cliente.setPrestamo_intereses(Integer.parseInt(txt8.getText().trim()));
                    cliente.setValor_cuota(Integer.parseInt(txt6.getText().trim()));
                    cliente.setNumero_celular((txt7.getText().trim()));
                    cliente.setPlazo_dias(Integer.parseInt(txt4.getText().trim()));
                    cliente.setMora(0);
                  
                    LocalDate fechaActual = LocalDate.now();
                    LocalDate fechaVencimiento = fechaActual.plusDays(Integer.parseInt(txt4.getText().trim()));
                    Date fechaVencimientoSql = java.sql.Date.valueOf(fechaVencimiento);
                    cliente.setFecha_vencimiento(fechaVencimientoSql);

                    this.IdCategoria();
                    cliente.setIdCategoria(obtenerIdCategoriaCombo);

                    if (controlCliente.guardar(cliente)) {
                        JOptionPane.showMessageDialog(null, "Registro Guardado");
                        txt.setBackground(Color.green);
                        txt2.setBackground(Color.green);
                        txt3.setBackground(Color.green);
                        txt4.setBackground(Color.green);
                        txt7.setBackground(Color.green);
                        txt5.setBackground(Color.green);
                        txt6.setBackground(Color.green);

                        cl.Limpiar(txt, txt2, txt3, txt4, txt5, txt6, txt7, txt8);

                        int indiceSeleccionado = clientes_combo.getSelectedIndex();
                        DefaultComboBoxModel<String> comboBoxModel = (DefaultComboBoxModel<String>) clientes_combo.getModel();
                        comboBoxModel.insertElementAt(cliente.getNombre(), indiceSeleccionado + 1);
                        clientes_combo.setSelectedIndex(indiceSeleccionado + 1);

                        actualizarTabla(clientes, clientes_combo, clientes);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Guardar");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println("Error en: " + e);
                }

            }
        }
        guardarOrden(clientes_combo);

    }

    public static void guardarOrden(JComboBox<String> comboBox) {
        // Conexión a la base de datos SQLite
        try (Connection connection = Conexion.conectar()) {
            // Obtener el orden actual del ComboBox
            List<String> orden = new ArrayList<>();
            for (int i = 0; i < comboBox.getItemCount(); i++) {
                orden.add(comboBox.getItemAt(i));
            }

            // Actualizar el orden en la base de datos
            String updateQuery = "UPDATE clientes SET orden = ? WHERE nombre = ?";
            try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
                for (int i = 0; i < orden.size(); i++) {
                    String item = orden.get(i);
                    statement.setInt(1, i + 1); // El orden comienza desde 1
                    statement.setString(2, item);
                    statement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  
// ...
    private void cargarMeses() {
        try {
            Connection cn = Conexion.conectar();

            // Obtener la fecha actual en milisegundos
            long inicioDia = LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long finDia = inicioDia + 24 * 60 * 60 * 1000;

            // Verificar si hay un cliente seleccionado
            // Consulta para cargar los datos de hoy
            String query2 = "SELECT SUM(ganancia) AS total FROM historial_abonos WHERE fecha >= ? AND fecha < ? AND ganancia >= 0 AND idclientes = ?";

            PreparedStatement psCargarDatos2 = cn.prepareStatement(query2);

            psCargarDatos2.setLong(1, inicioDia);
            psCargarDatos2.setLong(2, finDia);
            psCargarDatos2.setInt(3, idClientes);

            ResultSet rs2 = psCargarDatos2.executeQuery();

            // Procesar los resultados
            while (rs2.next()) {
                double gananciaTotal = rs2.getDouble("total");

                // Limitar el número de dígitos a 5
                DecimalFormat decimalFormat = new DecimalFormat("#.###");
                String gananciaTotalFormatted = decimalFormat.format(gananciaTotal);
                //      atraso.setText("DIAS DE ATRASO : " + mora);
                txtganancia.setText(gananciaTotalFormatted);
            }

            rs2.close();
            psCargarDatos2.close();

            cn.close();
        } catch (SQLException e) {
            // Manejar la excepción
        }
    }
  private void obtenerCliente() {
       String nombreCliente = clientes_combo.getSelectedItem().toString();

try {
    Connection cn = Conexion.conectar();

    PreparedStatement consulta = cn.prepareStatement("UPDATE usuario SET estado = ? WHERE 1 = 1");
    consulta.setString(1, nombreCliente);
    consulta.executeUpdate();
  
    // Cerrar el PreparedStatement y la conexión
    consulta.close();
    cn.close();
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error al insertar el nombre del cliente: " + e.getMessage());
}

}
}
