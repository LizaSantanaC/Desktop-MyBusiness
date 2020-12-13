/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.proveedor;

import modelo.Proveedor;
import static vista.clientes.VariablesCliente.r;
import static vista.proveedor.VariablesProveedores.pDAO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author liza
 */
public class VentanaProveedoresBajas extends javax.swing.JFrame {
     private Proveedor p;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaProveedoresBajas() {
        initComponents();
        setLocationRelativeTo(null);
        p = new Proveedor();
        r.mostrarTabla(tbProveedoresBajas, "SELECT * FROM Proveedores");
        r.ordenTabulacion(txtProveedorRfc, txtProveedorNombre, txtProveedorPrimerAp, txtProveedorSegundoAp, txtProveedorDireccion,txtProveedorTelefono, txtProveedorEmpresa);
                
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProveedorRfc = new com.icm.components.metro.TextFieldMetroICM();
        txtProveedorNombre = new com.icm.components.metro.TextFieldMetroICM();
        txtProveedorSegundoAp = new com.icm.components.metro.TextFieldMetroICM();
        txtProveedorPrimerAp = new com.icm.components.metro.TextFieldMetroICM();
        txtProveedorEmpresa = new com.icm.components.metro.TextFieldMetroICM();
        txtProveedorTelefono = new com.icm.components.metro.TextFieldMetroICM();
        txtProveedorDireccion = new com.icm.components.metro.TextFieldMetroICM();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnProveedorBuscar = new com.icm.components.metro.ButtonMetroICM();
        btnProveedorLimpiar = new com.icm.components.metro.ButtonMetroICM();
        btnProveedorCancelar = new com.icm.components.metro.ButtonMetroICM();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProveedoresBajas = new com.icm.components.metro.TableMetroICM();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnProveedorEliminar = new com.icm.components.metro.ButtonMetroICM();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proveedores  bajas");
        setSize(new java.awt.Dimension(860, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(31, 189, 190));

        jPanel4.setBackground(new java.awt.Color(31, 189, 190));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Proveedores Bajas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(208, 208, 208))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(31, 189, 190));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Ingresa los siguientes datos:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Rfc:");

        txtProveedorRfc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProveedorRfc.setDark(false);
        txtProveedorRfc.setDisabledTextColor(java.awt.Color.darkGray);
        txtProveedorRfc.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtProveedorRfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProveedorRfcKeyReleased(evt);
            }
        });

        txtProveedorNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProveedorNombre.setDisabledTextColor(java.awt.Color.darkGray);
        txtProveedorNombre.setEnabled(false);
        txtProveedorNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProveedorSegundoAp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProveedorSegundoAp.setDisabledTextColor(java.awt.Color.darkGray);
        txtProveedorSegundoAp.setEnabled(false);
        txtProveedorSegundoAp.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProveedorPrimerAp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProveedorPrimerAp.setDisabledTextColor(java.awt.Color.darkGray);
        txtProveedorPrimerAp.setEnabled(false);
        txtProveedorPrimerAp.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProveedorEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProveedorEmpresa.setDisabledTextColor(java.awt.Color.darkGray);
        txtProveedorEmpresa.setEnabled(false);
        txtProveedorEmpresa.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProveedorTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProveedorTelefono.setDisabledTextColor(java.awt.Color.darkGray);
        txtProveedorTelefono.setEnabled(false);
        txtProveedorTelefono.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProveedorDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProveedorDireccion.setDisabledTextColor(java.awt.Color.darkGray);
        txtProveedorDireccion.setEnabled(false);
        txtProveedorDireccion.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Primer apellido:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Segundo apellido:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Teléfono:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Nombre empresa:");

        btnProveedorBuscar.setBackground(new java.awt.Color(31, 189, 190));
        btnProveedorBuscar.setText("Buscar");
        btnProveedorBuscar.setEnabled(false);
        btnProveedorBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorBuscarActionPerformed(evt);
            }
        });
        btnProveedorBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnProveedorBuscarKeyReleased(evt);
            }
        });

        btnProveedorLimpiar.setBackground(new java.awt.Color(96, 169, 23));
        btnProveedorLimpiar.setText("Limpiar");
        btnProveedorLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorLimpiarActionPerformed(evt);
            }
        });

        btnProveedorCancelar.setBackground(new java.awt.Color(206, 53, 44));
        btnProveedorCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estetica/maty/iconos/boton_cancelar.png"))); // NOI18N
        btnProveedorCancelar.setText("Cancelar");
        btnProveedorCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorCancelarActionPerformed(evt);
            }
        });

        tbProveedoresBajas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbProveedoresBajas);

        jPanel3.setBackground(java.awt.Color.white);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Eliminar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Proveedores:");

        btnProveedorEliminar.setBackground(new java.awt.Color(250, 104, 0));
        btnProveedorEliminar.setText("Eliminar");
        btnProveedorEliminar.setEnabled(false);
        btnProveedorEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProveedorEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtProveedorTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProveedorDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProveedorSegundoAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProveedorPrimerAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProveedorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProveedorRfc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProveedorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProveedorLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProveedorCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProveedorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProveedorRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnProveedorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedorPrimerAp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedorSegundoAp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedorDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedorEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnProveedorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnProveedorLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnProveedorCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedorCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnProveedorCancelarActionPerformed

    private void txtProveedorRfcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorRfcKeyReleased
        // TODO add your handling code here:
        if (r.componentesVacios(txtProveedorRfc)) {
            btnProveedorBuscar.setEnabled(false);
        } else {
            btnProveedorBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_txtProveedorRfcKeyReleased

    private void btnProveedorBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProveedorBuscarKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnProveedorBuscarKeyReleased

    private void btnProveedorEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorEliminarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Esta realmente seguro de eliminar el cliente " + txtProveedorNombre.getText() + "?") == 0) {
            if (pDAO.eliminarProveedor(txtProveedorRfc.getText())) {
                r.mostrarNotificacionInfo("Proveedor Eliminado !!!", "Se ha eliminado el proveedor " + txtProveedorNombre.getText() + " de la base de datos.");
                r.habilitarComponentes(false, btnProveedorBuscar,btnProveedorEliminar);
                r.mostrarTabla(tbProveedoresBajas, "SELECT * FROM Proveedores");
                r.limpiar(txtProveedorRfc, txtProveedorNombre, txtProveedorPrimerAp, txtProveedorSegundoAp, txtProveedorDireccion,txtProveedorTelefono, txtProveedorEmpresa);
            }
        }
    }//GEN-LAST:event_btnProveedorEliminarActionPerformed

    private void btnProveedorLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorLimpiarActionPerformed
        // TODO add your handling code here:
         r.habilitarComponentes(false, btnProveedorBuscar,btnProveedorEliminar);
        r.mostrarTabla(tbProveedoresBajas, "SELECT * FROM Proveedores");
        r.limpiar(txtProveedorRfc, txtProveedorNombre, txtProveedorPrimerAp, txtProveedorSegundoAp, txtProveedorDireccion,txtProveedorTelefono, txtProveedorEmpresa);
    }//GEN-LAST:event_btnProveedorLimpiarActionPerformed

    private void btnProveedorBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorBuscarActionPerformed
        // TODO add your handling code here:
         if (r.componentesVacios(txtProveedorRfc)) {
            r.mostrarNotificacionError("Error", "Debes ingresar el RFC del proveedor...");
        } else {
            p = pDAO.consultaProveedor(txtProveedorRfc.getText());

            if (p == null) {
                r.mostrarNotificacionInfo("Proveedor no encontrado !!!", "Al parecer el proveedor no esta registrado en la base de datos.");
            } else {
                btnProveedorEliminar.setEnabled(true);
                txtProveedorNombre.setText(p.getNombre());
                txtProveedorPrimerAp.setText(p.getPrimerAp());
                txtProveedorSegundoAp.setText(p.getSegundoAp());
                txtProveedorDireccion.setText(p.getDireccion());
                txtProveedorTelefono.setText(p.getTelefono());
                txtProveedorEmpresa.setText(p.getTelefono());
                r.mostrarNotificacionExito("Proveedor encontrado", "Se ha encontrado el Proveedor " + txtProveedorNombre.getText() + " registrado en la base de datos.");
                r.mostrarTabla(tbProveedoresBajas, "SELECT * FROM Proveedores WHERE Rfc = '" + txtProveedorRfc.getText().toUpperCase() + "'");
            }
        }
    }//GEN-LAST:event_btnProveedorBuscarActionPerformed

    
    
    public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(197, 197, 197));
 }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(223,223,223));
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProveedoresBajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM btnProveedorBuscar;
    private com.icm.components.metro.ButtonMetroICM btnProveedorCancelar;
    private com.icm.components.metro.ButtonMetroICM btnProveedorEliminar;
    private com.icm.components.metro.ButtonMetroICM btnProveedorLimpiar;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.icm.components.metro.TableMetroICM tbProveedoresBajas;
    private com.icm.components.metro.TextFieldMetroICM txtProveedorDireccion;
    private com.icm.components.metro.TextFieldMetroICM txtProveedorEmpresa;
    private com.icm.components.metro.TextFieldMetroICM txtProveedorNombre;
    private com.icm.components.metro.TextFieldMetroICM txtProveedorPrimerAp;
    private com.icm.components.metro.TextFieldMetroICM txtProveedorRfc;
    private com.icm.components.metro.TextFieldMetroICM txtProveedorSegundoAp;
    private com.icm.components.metro.TextFieldMetroICM txtProveedorTelefono;
    // End of variables declaration//GEN-END:variables
}
