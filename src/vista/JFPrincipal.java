/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import bean.Boleta;
import bean.Cliente;
import bean.Empleado;
import bean.Vehiculo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ArregloBoleta;

/**
 *
 * @author hoarlos
 */
public class JFPrincipal extends javax.swing.JFrame {

    static Vehiculo veh = null;
    ArregloBoleta listaBoleta = new ArregloBoleta();
    DefaultTableModel modelPedido;

    public JFPrincipal() {
        initComponents();
        modelPedido = (DefaultTableModel) tblVehiAgre.getModel();
        this.setLocationRelativeTo(null);
        Empleado emp = new Empleado();
        lblNombreEmp.setText(emp.getNombre());
        this.setTitle("SISTEMA DE ALQUILER DE VEHÍCULOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalBase = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBoleta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarCli = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblDniCli = new javax.swing.JLabel();
        lblNombreCli = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblNombreVehi = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblCostoVeh = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnBuscarVehi = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiAgre = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombreEmp = new javax.swing.JLabel();
        jdcFechIni = new com.toedter.calendar.JDateChooser();
        jdcFechFin = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        btnQuitarPedido = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtMontoFinal = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(1200, 600));

        jpPrincipalBase.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipalBase.setMinimumSize(new java.awt.Dimension(1200, 600));
        jpPrincipalBase.setPreferredSize(new java.awt.Dimension(1200, 600));
        jpPrincipalBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("N° DE BOLETA:");
        jpPrincipalBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 30));

        txtBoleta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBoleta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBoleta.setText("1");
        jpPrincipalBase.add(txtBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ELEGIR CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("D.N.I.:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 30));

        btnBuscarCli.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarCli.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCli.setText("BUSCAR");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("NOMBRE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 30));

        lblDniCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDniCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDniCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblDniCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 200, 30));

        lblNombreCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 200, 30));

        jpPrincipalBase.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 550, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ELEGIR VEHÍCULOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("VEHÍCULO:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 30));

        lblNombreVehi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreVehi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreVehi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblNombreVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("COSTO POR DÍA (S/):");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        lblCostoVeh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCostoVeh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostoVeh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblCostoVeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, 30));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("AGREGAR PEDIDO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 200, 30));

        btnBuscarVehi.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarVehi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarVehi.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVehi.setText("BUSCAR");
        btnBuscarVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 120, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 490, 10));

        jpPrincipalBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 550, 200));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblVehiAgre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblVehiAgre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VEHÍCULO", "PLACA", "FECH. INICIO", "FECH. FINAL", "TOT.DÍAS", "IMPORTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiAgre);

        jpPrincipalBase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 900, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("FECHA FINAL:");
        jpPrincipalBase.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ATENDIDO POR:");
        jpPrincipalBase.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("FECHA INICIO:");
        jpPrincipalBase.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 120, 30));

        lblNombreEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpPrincipalBase.add(lblNombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 350, 30));
        jpPrincipalBase.add(jdcFechIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 200, 30));
        jpPrincipalBase.add(jdcFechFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 200, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jpPrincipalBase.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 200, 40));

        btnQuitarPedido.setBackground(new java.awt.Color(255, 204, 51));
        btnQuitarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuitarPedido.setText("QUITAR PEDIDO");
        btnQuitarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarPedidoActionPerformed(evt);
            }
        });
        jpPrincipalBase.add(btnQuitarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, 200, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MONTO FINAL:");
        jpPrincipalBase.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 200, 30));

        txtMontoFinal.setBackground(new java.awt.Color(0, 0, 0));
        txtMontoFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMontoFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoFinal.setText("0");
        jpPrincipalBase.add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 430, 200, 40));

        jMenu1.setText("SISTEMA");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("MANTENIMIENTO");

        jMenuItem1.setText("VEHÍCULOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("CLIENTES");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("EMPLEADOS");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
        Cliente cc = new Cliente();
        lblNombreCli.setText(cc.getNombre());
        lblDniCli.setText(String.valueOf(cc.getDni()));
    }//GEN-LAST:event_btnBuscarCliActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarPedido();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiActionPerformed
        JFVehiculo jfv = new JFVehiculo();
        jfv.setVisible(true);
        JFVehiculo.jtpCRUDVehi.setSelectedIndex(1);
    }//GEN-LAST:event_btnBuscarVehiActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnQuitarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPedidoActionPerformed
        quitarPedido();
    }//GEN-LAST:event_btnQuitarPedidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFVehiculo jfv = new JFVehiculo();
        jfv.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnBuscarVehi;
    private javax.swing.JButton btnQuitarPedido;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdcFechFin;
    private com.toedter.calendar.JDateChooser jdcFechIni;
    private javax.swing.JPanel jpPrincipalBase;
    public static javax.swing.JLabel lblCostoVeh;
    private javax.swing.JLabel lblDniCli;
    private javax.swing.JLabel lblNombreCli;
    private javax.swing.JLabel lblNombreEmp;
    public static javax.swing.JLabel lblNombreVehi;
    private javax.swing.JTable tblVehiAgre;
    private javax.swing.JTextField txtBoleta;
    private javax.swing.JTextField txtMontoFinal;
    // End of variables declaration//GEN-END:variables

    private void registrar() {
        boolean validar = modelPedido.getRowCount()<= 0 || txtBoleta.getText().equals("") ||
                           lblNombreCli.getText().equals("") || lblDniCli.getText().equals("") ||
                            lblNombreEmp.getText().equals("");
        if (!validar) {
            try {
                Boleta b = new Boleta(codBoleta(), empleado(), cliente(), vehiculo(), fechaInicio(), fechaFinal(), monto());
                String respuesta = listaBoleta.adicionar(b);
                listaBoleta.grabar();
                JOptionPane.showMessageDialog(null, respuesta);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al guardar: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Le falto rellenar un campos o ingreso un dato errómeo.");
        }
    }
    
    private int codBoleta(){
        return Integer.parseInt(txtBoleta.getText());
    }
    private String empleado(){
        return lblNombreEmp.getText();
    }
    private String cliente(){
        return lblNombreCli.getText() + " " + lblDniCli.getText();
    }
    private String vehiculo(){
        int count = modelPedido.getRowCount();
        String vehiculos = "";
        if (count >= 1) {
            for (int i = 0; i < count; i++) {
                vehiculos += modelPedido.getValueAt(i, 0) + " " + 
                        modelPedido.getValueAt(i, 1) + "/";
            }
        }
        return vehiculos;
    }
    private String fechaInicio(){
        return fechaString(fechIni());
    }
    private String fechaFinal(){
        return fechaString(fechFin());
    }
    private double monto(){
        return Double.parseDouble(txtMontoFinal.getText());
    }
    /****/
    private Date fechIni() {
        return jdcFechIni.getDate();
    }

    private Date fechFin() {
        return jdcFechFin.getDate();
    }

    public static String fechaString(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
        return sdf.format(fecha);
    }

    private void agregarPedido() {

        boolean validar = lblNombreVehi.getText().equals("") || jdcFechFin.getDate() == null
                          || jdcFechIni.getDate() == null;
        if (!validar) {
            Object ar[] = new Object[6];
            ar[0] = lblNombreVehi.getText();
            ar[1] = veh.getPlaca();
            ar[2] = fechaInicio();
            ar[3] = fechaFinal();
            int dias = fechFin().getDate() - fechIni().getDate();
            ar[4] = String.valueOf(dias);
            double importe = veh.getCosto() * dias;
            ar[5] = String.format("%.2f", importe).replace(',', '.');
            modelPedido.addRow(ar);
            colocarMonto();
        } else {
            JOptionPane.showMessageDialog(null, "Relleno los campos restantes.");
        }

    }

    private void quitarPedido() {
        int fila = tblVehiAgre.getSelectedRow();
        if (fila >= 0) {
            int preg = JOptionPane.showConfirmDialog(null, "Seguro que quieres remover esta fila");
            if (preg == 0) {
                this.modelPedido.removeRow(fila);
                txtMontoFinal.requestFocus();
                colocarMonto();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila de la Tabla para eliminar");
        }
    }

    private void colocarMonto() {
        double monto = 0;
        int filas = tblVehiAgre.getRowCount();
        for (int i = 0; i < filas; i++) {
            monto += Double.parseDouble((String) modelPedido.getValueAt(i, 5));
        }
        txtMontoFinal.setText(String.valueOf(monto));
    }

}
