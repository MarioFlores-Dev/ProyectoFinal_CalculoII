/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

/**
 *
 * @author MARIO
 */
public class Formulario extends javax.swing.JFrame {
    
    int xMouse, yMouse;

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        
        CentrosdeMasayCentroides contenido = new CentrosdeMasayCentroides();
        contenido.setSize(760,700);
        contenido.setLocation(0,0);
        
        content.removeAll();
        content.add(contenido, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        //Método para centrar la ventana
        centreWindow(this);
    }

    //Metodo para centrar la ventana
    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        btnCentrosMasaYCentroides = new javax.swing.JPanel();
        txtCentrosMasayCentroides = new javax.swing.JLabel();
        btnIntegracionPorSustitucion = new javax.swing.JPanel();
        txtIntegracionPorSustitucion = new javax.swing.JLabel();
        btnForm1 = new javax.swing.JPanel();
        txtFuerzayPresion = new javax.swing.JLabel();
        btnFuerzayPresion1 = new javax.swing.JPanel();
        txtFuerzayPresion1 = new javax.swing.JLabel();
        btnForm2 = new javax.swing.JPanel();
        txtFuerzayPresion2 = new javax.swing.JLabel();
        btnIntegralMRU = new javax.swing.JPanel();
        txtFuerzayPresion3 = new javax.swing.JLabel();
        btnTrabajo = new javax.swing.JPanel();
        txtFuerzayPresion4 = new javax.swing.JLabel();
        btnAreaSuperficie = new javax.swing.JPanel();
        txtFuerzayPresion5 = new javax.swing.JLabel();
        btnVolumenes = new javax.swing.JPanel();
        txtFuerzayPresion6 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setPreferredSize(new java.awt.Dimension(1040, 750));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(239, 75, 76));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/btnClose.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/btnMini.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/btnReturn.png"))); // NOI18N
        jLabel1.setText("  REGRESAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CÁLCULO II - FORMULARIO");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(279, 279, 279)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMinimize)
                    .addComponent(btnClose)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 50));

        menuLateral.setBackground(new java.awt.Color(239, 75, 76));

        btnCentrosMasaYCentroides.setBackground(new java.awt.Color(52, 177, 208));
        btnCentrosMasaYCentroides.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCentrosMasaYCentroides.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCentrosMasaYCentroidesMouseClicked(evt);
            }
        });

        txtCentrosMasayCentroides.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCentrosMasayCentroides.setForeground(new java.awt.Color(255, 255, 255));
        txtCentrosMasayCentroides.setText("Centros de masa y Centroides");
        txtCentrosMasayCentroides.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnCentrosMasaYCentroidesLayout = new javax.swing.GroupLayout(btnCentrosMasaYCentroides);
        btnCentrosMasaYCentroides.setLayout(btnCentrosMasaYCentroidesLayout);
        btnCentrosMasaYCentroidesLayout.setHorizontalGroup(
            btnCentrosMasaYCentroidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCentrosMasaYCentroidesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCentrosMasayCentroides)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnCentrosMasaYCentroidesLayout.setVerticalGroup(
            btnCentrosMasaYCentroidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCentrosMasaYCentroidesLayout.createSequentialGroup()
                .addComponent(txtCentrosMasayCentroides, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnIntegracionPorSustitucion.setBackground(new java.awt.Color(52, 177, 208));
        btnIntegracionPorSustitucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIntegracionPorSustitucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntegracionPorSustitucionMouseClicked(evt);
            }
        });

        txtIntegracionPorSustitucion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtIntegracionPorSustitucion.setForeground(new java.awt.Color(255, 255, 255));
        txtIntegracionPorSustitucion.setText("Integración por Sustitución");
        txtIntegracionPorSustitucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnIntegracionPorSustitucionLayout = new javax.swing.GroupLayout(btnIntegracionPorSustitucion);
        btnIntegracionPorSustitucion.setLayout(btnIntegracionPorSustitucionLayout);
        btnIntegracionPorSustitucionLayout.setHorizontalGroup(
            btnIntegracionPorSustitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIntegracionPorSustitucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIntegracionPorSustitucion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnIntegracionPorSustitucionLayout.setVerticalGroup(
            btnIntegracionPorSustitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIntegracionPorSustitucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIntegracionPorSustitucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnForm1.setBackground(new java.awt.Color(52, 177, 208));
        btnForm1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForm1.setPreferredSize(new java.awt.Dimension(247, 47));
        btnForm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnForm1MouseClicked(evt);
            }
        });

        txtFuerzayPresion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFuerzayPresion.setForeground(new java.awt.Color(255, 255, 255));
        txtFuerzayPresion.setText("Formulario General 1");
        txtFuerzayPresion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnForm1Layout = new javax.swing.GroupLayout(btnForm1);
        btnForm1.setLayout(btnForm1Layout);
        btnForm1Layout.setHorizontalGroup(
            btnForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnForm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnForm1Layout.setVerticalGroup(
            btnForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnForm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnFuerzayPresion1.setBackground(new java.awt.Color(52, 177, 208));
        btnFuerzayPresion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuerzayPresion1.setPreferredSize(new java.awt.Dimension(247, 47));
        btnFuerzayPresion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuerzayPresion1MouseClicked(evt);
            }
        });

        txtFuerzayPresion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFuerzayPresion1.setForeground(new java.awt.Color(255, 255, 255));
        txtFuerzayPresion1.setText("Fuerza y Presión");
        txtFuerzayPresion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnFuerzayPresion1Layout = new javax.swing.GroupLayout(btnFuerzayPresion1);
        btnFuerzayPresion1.setLayout(btnFuerzayPresion1Layout);
        btnFuerzayPresion1Layout.setHorizontalGroup(
            btnFuerzayPresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFuerzayPresion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFuerzayPresion1Layout.setVerticalGroup(
            btnFuerzayPresion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFuerzayPresion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnForm2.setBackground(new java.awt.Color(52, 177, 208));
        btnForm2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForm2.setPreferredSize(new java.awt.Dimension(247, 47));
        btnForm2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnForm2MouseClicked(evt);
            }
        });

        txtFuerzayPresion2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFuerzayPresion2.setForeground(new java.awt.Color(255, 255, 255));
        txtFuerzayPresion2.setText("Formulario General 2");
        txtFuerzayPresion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnForm2Layout = new javax.swing.GroupLayout(btnForm2);
        btnForm2.setLayout(btnForm2Layout);
        btnForm2Layout.setHorizontalGroup(
            btnForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnForm2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnForm2Layout.setVerticalGroup(
            btnForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnForm2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnIntegralMRU.setBackground(new java.awt.Color(52, 177, 208));
        btnIntegralMRU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIntegralMRU.setPreferredSize(new java.awt.Dimension(247, 47));
        btnIntegralMRU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntegralMRUMouseClicked(evt);
            }
        });

        txtFuerzayPresion3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFuerzayPresion3.setForeground(new java.awt.Color(255, 255, 255));
        txtFuerzayPresion3.setText("Integral MRU");
        txtFuerzayPresion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnIntegralMRULayout = new javax.swing.GroupLayout(btnIntegralMRU);
        btnIntegralMRU.setLayout(btnIntegralMRULayout);
        btnIntegralMRULayout.setHorizontalGroup(
            btnIntegralMRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIntegralMRULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnIntegralMRULayout.setVerticalGroup(
            btnIntegralMRULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIntegralMRULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnTrabajo.setBackground(new java.awt.Color(52, 177, 208));
        btnTrabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrabajo.setPreferredSize(new java.awt.Dimension(247, 47));
        btnTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrabajoMouseClicked(evt);
            }
        });

        txtFuerzayPresion4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFuerzayPresion4.setForeground(new java.awt.Color(255, 255, 255));
        txtFuerzayPresion4.setText("Trabajo");
        txtFuerzayPresion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnTrabajoLayout = new javax.swing.GroupLayout(btnTrabajo);
        btnTrabajo.setLayout(btnTrabajoLayout);
        btnTrabajoLayout.setHorizontalGroup(
            btnTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnTrabajoLayout.setVerticalGroup(
            btnTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnAreaSuperficie.setBackground(new java.awt.Color(52, 177, 208));
        btnAreaSuperficie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAreaSuperficie.setPreferredSize(new java.awt.Dimension(247, 47));
        btnAreaSuperficie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAreaSuperficieMouseClicked(evt);
            }
        });

        txtFuerzayPresion5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFuerzayPresion5.setForeground(new java.awt.Color(255, 255, 255));
        txtFuerzayPresion5.setText("Área de una Superficie");
        txtFuerzayPresion5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnAreaSuperficieLayout = new javax.swing.GroupLayout(btnAreaSuperficie);
        btnAreaSuperficie.setLayout(btnAreaSuperficieLayout);
        btnAreaSuperficieLayout.setHorizontalGroup(
            btnAreaSuperficieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAreaSuperficieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAreaSuperficieLayout.setVerticalGroup(
            btnAreaSuperficieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAreaSuperficieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnVolumenes.setBackground(new java.awt.Color(52, 177, 208));
        btnVolumenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolumenes.setPreferredSize(new java.awt.Dimension(247, 47));
        btnVolumenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolumenesMouseClicked(evt);
            }
        });

        txtFuerzayPresion6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFuerzayPresion6.setForeground(new java.awt.Color(255, 255, 255));
        txtFuerzayPresion6.setText("Volúmenes");
        txtFuerzayPresion6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnVolumenesLayout = new javax.swing.GroupLayout(btnVolumenes);
        btnVolumenes.setLayout(btnVolumenesLayout);
        btnVolumenesLayout.setHorizontalGroup(
            btnVolumenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolumenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnVolumenesLayout.setVerticalGroup(
            btnVolumenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolumenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuerzayPresion6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCentrosMasaYCentroides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIntegracionPorSustitucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btnFuerzayPresion1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btnForm2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btnIntegralMRU, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btnTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btnAreaSuperficie, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btnVolumenes, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addComponent(btnForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCentrosMasaYCentroides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIntegracionPorSustitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFuerzayPresion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolumenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIntegralMRU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAreaSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        bg.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 700));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 760, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Principal inicio = new Principal();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void btnCentrosMasaYCentroidesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCentrosMasaYCentroidesMouseClicked
        CentrosdeMasayCentroides contenido = new CentrosdeMasayCentroides();
        contenido.setSize(760,700);
        contenido.setLocation(0,0);
        
        content.removeAll();
        content.add(contenido, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnCentrosMasaYCentroidesMouseClicked

    private void btnIntegracionPorSustitucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntegracionPorSustitucionMouseClicked
        IntegracionPorSustitucion integracionSustitucion = new IntegracionPorSustitucion();
        integracionSustitucion.setSize(760,700);
        integracionSustitucion.setLocation(0,0);
        
        content.removeAll();
        content.add(integracionSustitucion, BorderLayout.CENTER );
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnIntegracionPorSustitucionMouseClicked

    private void btnForm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForm1MouseClicked
        FormularioGeneral1 fG1 = new FormularioGeneral1();
        fG1.setSize(760,700);
        fG1.setLocation(0,0);
        
        content.removeAll();
        content.add(fG1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnForm1MouseClicked

    private void btnFuerzayPresion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuerzayPresion1MouseClicked
        PresionFuerza pF = new PresionFuerza();
        pF.setSize(760,700);
        pF.setLocation(0,0);
        
        content.removeAll();
        content.add(pF, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnFuerzayPresion1MouseClicked

    private void btnForm2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForm2MouseClicked
        FormularioGeneral2  fG2 = new FormularioGeneral2(); 
        fG2.setSize(760,700);
        fG2.setLocation(0,0);
        
        content.removeAll();
        content.add(fG2, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnForm2MouseClicked

    private void btnIntegralMRUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntegralMRUMouseClicked
        IntegralMRU iMRU = new IntegralMRU ();
        iMRU.setSize(760,700);
        iMRU.setLocation(0,0);
        
        content.removeAll();
        content.add(iMRU, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnIntegralMRUMouseClicked

    private void btnTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrabajoMouseClicked
        FormulaTrabajo fT = new FormulaTrabajo();
        fT.setSize(760,700);
        fT.setLocation(0,0);
        
        content.removeAll();
        content.add(fT, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnTrabajoMouseClicked

    private void btnAreaSuperficieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAreaSuperficieMouseClicked
        AreaSuperficieRevolucion asr = new AreaSuperficieRevolucion();
        asr.setSize(760,700);
        asr.setLocation(0,0);
        
        content.removeAll();
        content.add(asr, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnAreaSuperficieMouseClicked

    private void btnVolumenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumenesMouseClicked
        Volumenes vol = new Volumenes();
        vol.setSize(760,700);
        vol.setLocation(0,0);
        
        content.removeAll();
        content.add(vol, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnVolumenesMouseClicked

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnAreaSuperficie;
    private javax.swing.JPanel btnCentrosMasaYCentroides;
    private javax.swing.JLabel btnClose;
    private javax.swing.JPanel btnForm1;
    private javax.swing.JPanel btnForm2;
    private javax.swing.JPanel btnFuerzayPresion1;
    private javax.swing.JPanel btnIntegracionPorSustitucion;
    private javax.swing.JPanel btnIntegralMRU;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JPanel btnTrabajo;
    private javax.swing.JPanel btnVolumenes;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JLabel txtCentrosMasayCentroides;
    private javax.swing.JLabel txtFuerzayPresion;
    private javax.swing.JLabel txtFuerzayPresion1;
    private javax.swing.JLabel txtFuerzayPresion2;
    private javax.swing.JLabel txtFuerzayPresion3;
    private javax.swing.JLabel txtFuerzayPresion4;
    private javax.swing.JLabel txtFuerzayPresion5;
    private javax.swing.JLabel txtFuerzayPresion6;
    private javax.swing.JLabel txtIntegracionPorSustitucion;
    // End of variables declaration//GEN-END:variables
}
