
package vista.productos;

import controlador.ProductoDAO;
import modelo.Producto;
import recursos.Recursos;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author liza
 */
public class VentanaProductosBajas extends javax.swing.JFrame {

    
    private Producto p;
    private ProductoDAO pDAO;
    Recursos r;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaProductosBajas() {
        initComponents();
        setLocationRelativeTo(null);
        p = new Producto();
        pDAO = new ProductoDAO();
        r = Recursos.getRecursos();
        r.ordenTabulacion(txtProductoCodigo, txtProductoNombre, txtProductoMarca, txtProductoPrecioCompra, txtProductoPrecioVenta, spStock, cbProductoProveedor);
        r.mostrarTabla(tbProductos, "SELECT * FROM Productos");
        r.llenarComboBox("Proveedores", cbProductoProveedor, 1);
        
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
        txtProductoCodigo = new com.icm.components.metro.TextFieldMetroICM();
        txtProductoNombre = new com.icm.components.metro.TextFieldMetroICM();
        txtProductoPrecioCompra = new com.icm.components.metro.TextFieldMetroICM();
        txtProductoMarca = new com.icm.components.metro.TextFieldMetroICM();
        txtProductoPrecioVenta = new com.icm.components.metro.TextFieldMetroICM();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnProductoBuscar = new com.icm.components.metro.ButtonMetroICM();
        btnProductoLimpiar = new com.icm.components.metro.ButtonMetroICM();
        btnProductoCancelar = new com.icm.components.metro.ButtonMetroICM();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new com.icm.components.metro.TableMetroICM();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnProductoEliminar = new com.icm.components.metro.ButtonMetroICM();
        cbProductoProveedor = new com.icm.components.metro.ComboboxMetroICM();
        spStock = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos bajas");
        setSize(new java.awt.Dimension(860, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(31, 189, 190));

        jPanel4.setBackground(new java.awt.Color(31, 189, 190));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Productos Bajas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(211, 211, 211))
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
            .addGap(0, 206, Short.MAX_VALUE)
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
        jLabel3.setText("Código:");

        txtProductoCodigo.setDark(false);
        txtProductoCodigo.setDisabledTextColor(java.awt.Color.darkGray);
        txtProductoCodigo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtProductoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductoCodigoKeyReleased(evt);
            }
        });

        txtProductoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProductoNombre.setDisabledTextColor(java.awt.Color.darkGray);
        txtProductoNombre.setEnabled(false);
        txtProductoNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProductoPrecioCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProductoPrecioCompra.setDisabledTextColor(java.awt.Color.darkGray);
        txtProductoPrecioCompra.setEnabled(false);
        txtProductoPrecioCompra.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProductoMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProductoMarca.setDisabledTextColor(java.awt.Color.darkGray);
        txtProductoMarca.setEnabled(false);
        txtProductoMarca.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txtProductoPrecioVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 0, 115)));
        txtProductoPrecioVenta.setDisabledTextColor(java.awt.Color.darkGray);
        txtProductoPrecioVenta.setEnabled(false);
        txtProductoPrecioVenta.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Precio compra:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Precio Venta:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Cantidad almecen:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Proveedor:");

        btnProductoBuscar.setText("Buscar");
        btnProductoBuscar.setEnabled(false);
        btnProductoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoBuscarActionPerformed(evt);
            }
        });

        btnProductoLimpiar.setBackground(new java.awt.Color(96, 169, 23));
        btnProductoLimpiar.setText("Limpiar");
        btnProductoLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoLimpiarActionPerformed(evt);
            }
        });

        btnProductoCancelar.setBackground(new java.awt.Color(206, 53, 44));
        btnProductoCancelar.setText("Cancelar");
        btnProductoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoCancelarActionPerformed(evt);
            }
        });

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbProductos);

        jPanel3.setBackground(java.awt.Color.white);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Eliminar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Productos:");

        btnProductoEliminar.setBackground(new java.awt.Color(250, 104, 0));
        btnProductoEliminar.setText("Eliminar");
        btnProductoEliminar.setEnabled(false);
        btnProductoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoEliminarActionPerformed(evt);
            }
        });

        cbProductoProveedor.setEnabled(false);
        cbProductoProveedor.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        spStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        spStock.setEnabled(false);
        spStock.setPreferredSize(new java.awt.Dimension(150, 35));

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
                            .addComponent(txtProductoPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtProductoPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProductoMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProductoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProductoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProductoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProductoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductoLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtProductoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnProductoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnProductoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnProductoLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnProductoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProductoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProductoPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProductoPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(spStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(cbProductoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
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

    private void btnProductoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnProductoCancelarActionPerformed

    private void txtProductoCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoCodigoKeyReleased
        // TODO add your handling code here:
        if(r.componentesVacios(txtProductoCodigo)){
            btnProductoBuscar.setEnabled(false);
        }else {
             btnProductoBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_txtProductoCodigoKeyReleased

    private void btnProductoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoBuscarActionPerformed
        // TODO add your handling code here:
        if (r.componentesVacios(txtProductoCodigo)) {
            r.mostrarNotificacionError("Falta informacion !!!", "Debes ingresar el codigo del producto...");
        } else {
            p = pDAO.consultaProducto(txtProductoCodigo.getText());

            if (p == null) {
                r.mostrarNotificacionInfo("Producto no encontrado !!!", "Al parecer el producto no esta registrado en la base de datos.");
            } else {
                btnProductoEliminar.setEnabled(true);
                btnProductoBuscar.setEnabled(false);
                txtProductoCodigo.setEnabled(false);
                txtProductoMarca.setText(p.getMarca());
                txtProductoNombre.setText(p.getNombre());
                txtProductoPrecioCompra.setText(p.getPrecioCompra()+"");
                txtProductoPrecioVenta.setText(p.getPrecioVenta()+"");
                spStock.setValue(p.getNumAlmacen());
                cbProductoProveedor.setSelectedItem(p.getProveedor());
                r.mostrarTabla(tbProductos, "SELECT * FROM Productos WHERE Codigo ='"+txtProductoCodigo.getText()+"'");
            }
        }
    }//GEN-LAST:event_btnProductoBuscarActionPerformed

    private void btnProductoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoEliminarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Esta realmente seguro de eliminar el producto?") == 0) {
            if (pDAO.eliminarProducto(txtProductoCodigo.getText())) {
                r.mostrarNotificacionInfo("Producto eliminado !!!", "Se ha eliminado el producto de la base de datos.");
                r.habilitarComponentes(false, btnProductoBuscar,btnProductoEliminar);
                txtProductoCodigo.setEnabled(true);
                r.mostrarTabla(tbProductos, "SELECT * FROM Productos");
                r.limpiar(txtProductoCodigo, txtProductoNombre, txtProductoMarca, txtProductoPrecioCompra, txtProductoPrecioVenta, spStock, cbProductoProveedor);
                txtProductoCodigo.requestFocus();
            }
        }

    }//GEN-LAST:event_btnProductoEliminarActionPerformed

    private void btnProductoLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoLimpiarActionPerformed
        // TODO add your handling code here:
       r.limpiar(txtProductoCodigo, txtProductoNombre, txtProductoMarca, txtProductoPrecioCompra, txtProductoPrecioVenta, spStock, cbProductoProveedor);
       r.habilitarComponentes(false, btnProductoBuscar,btnProductoEliminar);
       txtProductoCodigo.setEnabled(true);
       txtProductoCodigo.requestFocus();
       r.mostrarTabla(tbProductos, "SELECT * FROM Productos");
    }//GEN-LAST:event_btnProductoLimpiarActionPerformed

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
                new VentanaProductosBajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM btnProductoBuscar;
    private com.icm.components.metro.ButtonMetroICM btnProductoCancelar;
    private com.icm.components.metro.ButtonMetroICM btnProductoEliminar;
    private com.icm.components.metro.ButtonMetroICM btnProductoLimpiar;
    private com.icm.components.metro.ComboboxMetroICM cbProductoProveedor;
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
    private javax.swing.JSpinner spStock;
    private com.icm.components.metro.TableMetroICM tbProductos;
    private com.icm.components.metro.TextFieldMetroICM txtProductoCodigo;
    private com.icm.components.metro.TextFieldMetroICM txtProductoMarca;
    private com.icm.components.metro.TextFieldMetroICM txtProductoNombre;
    private com.icm.components.metro.TextFieldMetroICM txtProductoPrecioCompra;
    private com.icm.components.metro.TextFieldMetroICM txtProductoPrecioVenta;
    // End of variables declaration//GEN-END:variables
}