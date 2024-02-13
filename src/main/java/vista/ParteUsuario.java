/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author oli
 */
public class ParteUsuario extends javax.swing.JFrame {

    String[] receptor;
    String[] emisor;
    Producto product;

    public ParteUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrpContabilidad = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombreReceptor = new javax.swing.JTextField();
        txtApellidosReceptor = new javax.swing.JTextField();
        txtDireccionReceptor = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtNumeroFactura = new javax.swing.JTextField();
        txtAmbiente = new javax.swing.JTextField();
        txtTipoEmision = new javax.swing.JTextField();
        txtNombresApellidosEmisor = new javax.swing.JTextField();
        txtIdentificacionEmisor = new javax.swing.JTextField();
        txtEmailEmisor = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnContabilidadSi = new javax.swing.JRadioButton();
        btnContabilidadNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setText("Nombres:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Obligado a llevar contabilidad:");

        jLabel5.setText("R.U.C:");

        jLabel6.setText("Número de factura:");

        jLabel9.setText("Ambiente:");

        jLabel10.setText("Tipo de Emisión:");

        jLabel11.setText("Nombres y Apellidos del Emisor:");

        jLabel12.setText("Identificación del Emisor:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Datos del Emisor");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Datos del Receptor");

        jLabel20.setText("Email del Emisor:");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btgrpContabilidad.add(btnContabilidadSi);
        btnContabilidadSi.setText("Si");

        btgrpContabilidad.add(btnContabilidadNo);
        btnContabilidadNo.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroFactura)
                            .addComponent(txtAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtTipoEmision, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtNombresApellidosEmisor, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtIdentificacionEmisor, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtEmailEmisor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDireccionReceptor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosReceptor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreReceptor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnContabilidadSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnContabilidadNo)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguiente)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidosReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccionReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnContabilidadSi)
                            .addComponent(btnContabilidadNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTipoEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNombresApellidosEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdentificacionEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtEmailEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (!txtNombreReceptor.getText().isEmpty()
                && !txtApellidosReceptor.getText().isEmpty()
                && !txtDireccionReceptor.getText().isEmpty()
                && (btnContabilidadSi.isSelected() || btnContabilidadNo.isSelected())
                && !txtRuc.getText().isEmpty()
                && !txtNumeroFactura.getText().isEmpty()
                && !txtAmbiente.getText().isEmpty()
                && !txtTipoEmision.getText().isEmpty()
                && !txtNombresApellidosEmisor.getText().isEmpty()
                && !txtIdentificacionEmisor.getText().isEmpty()
                && !txtEmailEmisor.getText().isEmpty()) {

            //ALMACEN DE DATOS DE RECEPTOR
            receptor = new String[5];
            receptor[0] = txtNombreReceptor.getText();
            receptor[1] = txtApellidosReceptor.getText();
            receptor[2] = txtDireccionReceptor.getText();
            if (btnContabilidadSi.isSelected()) {
                receptor[3] = "si";
            } else if (btnContabilidadNo.isSelected()) {
                receptor[3] = "no";
            }
            receptor[4] = txtRuc.getText();

            //ALMACEN DE DATOS DEL EMISOR
            emisor = new String[6];
            emisor[0] = txtNumeroFactura.getText();
            emisor[1] = txtAmbiente.getText();
            emisor[2] = txtTipoEmision.getText();
            emisor[3] = txtNombresApellidosEmisor.getText();
            emisor[4] = txtIdentificacionEmisor.getText();
            emisor[5] = txtEmailEmisor.getText();

            txtNombreReceptor.setEnabled(false);
            txtApellidosReceptor.setEnabled(false);
            txtDireccionReceptor.setEnabled(false);
            btnContabilidadSi.setEnabled(false);
            btnContabilidadNo.setEnabled(false);
            txtRuc.setEnabled(false);
            txtNumeroFactura.setEnabled(false);
            txtAmbiente.setEnabled(false);
            txtTipoEmision.setEnabled(false);
            txtNombresApellidosEmisor.setEnabled(false);
            txtIdentificacionEmisor.setEnabled(false);
            txtEmailEmisor.setEnabled(false);
            
            product=new Producto();
            product.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los campos para continuar");
        }


    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombreReceptor.setEnabled(true);
        txtNombreReceptor.setText("");
        txtApellidosReceptor.setEnabled(true);
        txtApellidosReceptor.setText("");
        txtDireccionReceptor.setEnabled(true);
        txtDireccionReceptor.setText("");
        btnContabilidadSi.setEnabled(true);
        btnContabilidadNo.setEnabled(true);
        txtRuc.setEnabled(true);
        txtRuc.setText("");
        txtNumeroFactura.setEnabled(true);
        txtNumeroFactura.setText("");
        txtAmbiente.setEnabled(true);
        txtAmbiente.setText("");
        txtTipoEmision.setEnabled(true);
        txtTipoEmision.setText("");
        txtNombresApellidosEmisor.setEnabled(true);
        txtNombresApellidosEmisor.setText("");
        txtIdentificacionEmisor.setEnabled(true);
        txtIdentificacionEmisor.setText("");
        txtEmailEmisor.setEnabled(true);
        txtEmailEmisor.setText("");
        
        System.out.println(product.productos.toString());
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ParteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParteUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParteUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgrpContabilidad;
    private javax.swing.JRadioButton btnContabilidadNo;
    private javax.swing.JRadioButton btnContabilidadSi;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAmbiente;
    private javax.swing.JTextField txtApellidosReceptor;
    private javax.swing.JTextField txtDireccionReceptor;
    private javax.swing.JTextField txtEmailEmisor;
    private javax.swing.JTextField txtIdentificacionEmisor;
    private javax.swing.JTextField txtNombreReceptor;
    private javax.swing.JTextField txtNombresApellidosEmisor;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTipoEmision;
    // End of variables declaration//GEN-END:variables
}
