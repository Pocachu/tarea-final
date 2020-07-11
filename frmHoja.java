package sistemahojacostos;

//Autor: Roberto Colón
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmHoja extends javax.swing.JFrame {

    ArrayList<String> columnas = new ArrayList<>();
    DefaultComboBoxModel modeloUnidad = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloUnidades = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloTipo = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloTipos = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloInsumo = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloInsumos = new DefaultComboBoxModel();
    DefaultTableModel modeloInsumosxHoja = new DefaultTableModel();

    ResultSet rstUnidad = null;
    ResultSet rstTipo = null;
    ResultSet rstHoja = null;
    ResultSet rstInsumo = null;
    ResultSet rstInsumosxHoja = null;
    Unidades unidad = new Unidades();
    Tipos tipo = new Tipos();
    Hojas hoja = new Hojas();
    Insumos insumo = new Insumos();
    InsumosxHoja insumosxHoja = new InsumosxHoja();
    int columnasDeTabla, columna;
    boolean cargarUnidades = false;

    public frmHoja() {

        initComponents();

        //Llenando el cmbUnidades mediante un modelo
        try {
            rstUnidad = unidad.llenarUnidades();
            while (rstUnidad.next()) {
                modeloUnidad.addElement(rstUnidad.getString(2));
                modeloUnidades.addElement(rstUnidad.getString(1));
            }
            cmbUnidad.setModel(modeloUnidad);
            lblUnidad.setText(String.valueOf(modeloUnidades.getElementAt(0)));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        lblHoja = new javax.swing.JLabel();
        txtCodigoHoja = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblUnidades = new javax.swing.JLabel();
        cmbUnidad = new javax.swing.JComboBox();
        lblUnidad = new javax.swing.JLabel();
        lblInformacion = new javax.swing.JLabel();
        lblTipos = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        lblTipo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblInsumos = new javax.swing.JLabel();
        cmbInsumo = new javax.swing.JComboBox();
        lblInsumo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInsumosxHoja = new javax.swing.JTable();
        btnAgregarUnidad = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hoja de costos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/iconos/costos.png")).getImage());
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setText("Nueva Hoja");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lblHoja.setText("N° de hoja");
        getContentPane().add(lblHoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 64, 25));

        txtCodigoHoja.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtCodigoHoja.setEnabled(false);
        getContentPane().add(txtCodigoHoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, -1));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 42, 600, -1));

        jLabel2.setText("Descripción");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        lblUnidades.setText("Unidad de medida");
        getContentPane().add(lblUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        cmbUnidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUnidadItemStateChanged(evt);
            }
        });
        cmbUnidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbUnidadFocusGained(evt);
            }
        });
        getContentPane().add(cmbUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 73, 190, -1));

        lblUnidad.setText("    ");
        getContentPane().add(lblUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 170, 30));

        lblInformacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInformacion.setForeground(new java.awt.Color(255, 0, 51));
        lblInformacion.setText("Detalle de la hoja de costos");
        getContentPane().add(lblInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 20));

        lblTipos.setText("Tipo de insumo");
        getContentPane().add(lblTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 20));

        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        cmbTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbTipoFocusGained(evt);
            }
        });
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, -1));

        lblTipo.setText("     ");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 140, 20));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblInsumos.setText("Insumos");
        getContentPane().add(lblInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 90, 20));

        cmbInsumo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbInsumoItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 400, -1));

        lblInsumo.setText("   ");
        getContentPane().add(lblInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 100, -1));

        jLabel1.setText("Cantidad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 20));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 80, -1));

        btnAgregar.setText("Agregar insumo a la hoja");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        tblInsumosxHoja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblInsumosxHoja);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 710, 150));

        btnAgregarUnidad.setText("+");
        btnAgregarUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUnidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        btnBorrar.setText("Borrar Hoja");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Columnas() {
        columnas.clear();
        columnas.add("CÓdigo Hoja");
        columnas.add("CÓdigo Insumo");
        columnas.add("Descripcion");
        columnas.add("Precio Unitario");
        columnas.add("Cantidad");
        columnas.add("SubTotal");
    }

    private void bloquearHoja() {
        txtDescripcion.setEnabled(false);
        cmbUnidad.setEnabled(false);
        lblUnidad.setEnabled(false);
        btnGuardar.setEnabled(false);
    }

    private void desbloquearHoja() {
        txtDescripcion.setEnabled(true);
        cmbUnidad.setEnabled(true);
        lblUnidad.setEnabled(true);
        btnGuardar.setEnabled(true);
        //btnNuevo.setEnabled(false);
    }

    private void limpiarhojaeinsumo() {
        txtCodigoHoja.setText("");
        txtDescripcion.setText("");

        txtCantidad.setText("");
    }

    private void bloquearDetalle() {
        cmbTipo.setEnabled(false);
        lblTipo.setEnabled(false);
        cmbInsumo.setEnabled(false);
        lblInsumo.setEnabled(false);
        txtCantidad.setEnabled(false);
        btnAgregar.setEnabled(false);
    }

    private void desbloquearDetalle() {
        cmbTipo.setEnabled(true);
        lblTipo.setEnabled(true);
        cmbInsumo.setEnabled(true);
        lblInsumo.setEnabled(true);
        txtCantidad.setEnabled(true);
        btnAgregar.setEnabled(true);
    }

    private void cmbUnidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUnidadItemStateChanged
        int posicion = cmbUnidad.getSelectedIndex();
        lblUnidad.setText(String.valueOf(modeloUnidades.getElementAt(posicion)));
    }//GEN-LAST:event_cmbUnidadItemStateChanged

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        int posicion = cmbTipo.getSelectedIndex();
        lblTipo.setText(String.valueOf(modeloTipos.getElementAt(posicion)));

        //Llenando el cmbUnidades mediante un modelo
        modeloInsumo.removeAllElements();
        modeloInsumos.removeAllElements();
        try {
            rstInsumo = insumo.llenarInsumos(Integer.parseInt(lblTipo.getText()));
            while (rstInsumo.next()) {
                modeloInsumo.addElement(rstInsumo.getString(2));
                modeloInsumos.addElement(rstInsumo.getString(1));
            }
            cmbInsumo.setModel(modeloInsumo);
            lblInsumo.setText(String.valueOf(modeloInsumos.getElementAt(0)));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }

    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!txtDescripcion.getText().equals("")) {
            hoja.insertar(Integer.parseInt(txtCodigoHoja.getText()), txtDescripcion.getText(), lblUnidad.getText());
            //Llenando el cmbTipos mediante un modelo
            try {
                rstTipo = tipo.llenarTipos();
                while (rstTipo.next()) {
                    modeloTipo.addElement(rstTipo.getString(2));
                    modeloTipos.addElement(rstTipo.getString(1));
                }
                cmbTipo.setModel(modeloTipo);
                lblTipo.setText(String.valueOf(modeloTipos.getElementAt(0)));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
            }
            bloquearHoja();
            desbloquearDetalle();
            cmbTipo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Falta completar algunos campos");
            txtDescripcion.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarhojaeinsumo();
        if (txtCodigoHoja.getText().equals("")) {
            int cantidad, mayor = 0;
            rstHoja = hoja.contarRegistros();
            try {
                while (rstHoja.next()) {
                    cantidad = rstHoja.getInt(1);
                    if (cantidad != 0) {
                        rstHoja = null;
                        rstHoja = hoja.mayorRegistro();
                        while (rstHoja.next()) {
                            mayor = rstHoja.getInt(1) + 1;
                        }
                        txtCodigoHoja.setText(String.valueOf(mayor));
                    } else {
                        txtCodigoHoja.setText("1");
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
            }
            JOptionPane.showMessageDialog(null, "Hoja nueva agregada");
            desbloquearHoja();
            txtDescripcion.requestFocus();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (txtCodigoHoja.getText().equals("")) {
            bloquearHoja();
            bloquearDetalle();
        } else {
            desbloquearDetalle();
        }
    }//GEN-LAST:event_formWindowActivated

    private void cmbTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTipoFocusGained
        //Llenando el cmbUnidades mediante un modelo
        modeloInsumo.removeAllElements();
        modeloInsumos.removeAllElements();
        try {
            rstInsumo = insumo.llenarInsumos(Integer.parseInt(lblTipo.getText()));
            while (rstInsumo.next()) {
                modeloInsumo.addElement(rstInsumo.getString(2));
                modeloInsumos.addElement(rstInsumo.getString(1));
            }
            cmbInsumo.setModel(modeloInsumo);
            lblInsumo.setText(String.valueOf(modeloInsumos.getElementAt(0)));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_cmbTipoFocusGained

    private void cmbInsumoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbInsumoItemStateChanged
        int posicion = cmbInsumo.getSelectedIndex();
        lblInsumo.setText(String.valueOf(modeloInsumos.getElementAt(posicion)));
    }//GEN-LAST:event_cmbInsumoItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (!txtCantidad.getText().equals("")) {
            insumosxHoja.insertar(Integer.parseInt(txtCodigoHoja.getText()), Integer.parseInt(lblInsumo.getText()), Double.parseDouble(txtCantidad.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Falta ingresar cantidad");
            txtCantidad.requestFocus();
        }

        Columnas();

        modeloInsumosxHoja = new DefaultTableModel();
        tblInsumosxHoja.setModel(modeloInsumosxHoja);

        //segunda parte: mostrar
        rstInsumosxHoja = null;
        int codigoHoja;
        codigoHoja = Integer.parseInt(txtCodigoHoja.getText());
        rstInsumosxHoja = insumosxHoja.llenarTabla(codigoHoja);

        try {
            ResultSetMetaData rstInsumosxHojaMD = rstInsumosxHoja.getMetaData();
            columnasDeTabla = rstInsumosxHojaMD.getColumnCount();

            //para llenar la tablas
            for (columna = 0; columna < columnasDeTabla; columna++) {
                modeloInsumosxHoja.addColumn(columnas.get(columna));
            }

            while (rstInsumosxHoja.next()) {
                Object[] fila = new Object[columna];
                for (int campo = 0; campo < columnasDeTabla; campo++) {
                    fila[campo] = rstInsumosxHoja.getObject(campo + 1);
                }
                modeloInsumosxHoja.addRow(fila);
            }

            //finaliza llenado de tabla
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUnidadActionPerformed
        frmUnidad abrir = new frmUnidad();
        abrir.setVisible(true);
        cargarUnidades = true;
        //this.setVisible(false); POR SI QUEREMOS OCULTAR EL FORMULARIO PRINCIPAL
    }//GEN-LAST:event_btnAgregarUnidadActionPerformed

    private void cmbUnidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbUnidadFocusGained
        if (cargarUnidades == true) {
            //Llenando el cmbUnidades mediante un modelo
            try {
                rstUnidad = unidad.llenarUnidades();
                while (rstUnidad.next()) {
                    modeloUnidad.addElement(rstUnidad.getString(2));
                    modeloUnidades.addElement(rstUnidad.getString(1));
                }
                cmbUnidad.setModel(modeloUnidad);
                lblUnidad.setText(String.valueOf(modeloUnidades.getElementAt(0)));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
            }
            cargarUnidades = false;
        }
    }//GEN-LAST:event_cmbUnidadFocusGained

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        insumosxHoja.eliminar(txtCodigoHoja.getText());
        hoja.eliminar(txtCodigoHoja.getText());
        JOptionPane.showMessageDialog(null, "Borrado");
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmHoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarUnidad;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbInsumo;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JComboBox cmbUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoja;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblInsumo;
    private javax.swing.JLabel lblInsumos;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipos;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JLabel lblUnidades;
    private javax.swing.JTable tblInsumosxHoja;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoHoja;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
