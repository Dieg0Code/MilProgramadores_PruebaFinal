/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegoobando_prueba6;

import Models.AccesoCategorias;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Categoria extends javax.swing.JInternalFrame {
    
    AccesoCategorias biblioteca = new AccesoCategorias();
    DefaultTableModel tm;
    int fila;
    

    /**
     * Creates new form Categoria
     */
    public Categoria() {
        initComponents();
        actualizarTabla();
        cargarTabla();
        
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
        jLabel1 = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionCategoria = new javax.swing.JTextField();
        tblCategoria = new javax.swing.JScrollPane();
        tblCategoria1 = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("ID Categoria");

        jLabel2.setText("Nombre Categoria");

        jLabel3.setText("Descripcion Categoria");

        tblCategoria1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Categoria", "Nombre Categoria", "Descripcion Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoria1MouseClicked(evt);
            }
        });
        tblCategoria.setViewportView(tblCategoria1);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txtIdCategoria)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(tblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)))
                        .addGap(21, 21, 21)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿seguro que desea agregar una nueva Categoria?");
        if (resp == 0) {

            tm = (DefaultTableModel) tblCategoria1.getModel();

            int idCategoria = Integer.parseInt(txtIdCategoria.getText());
            String nombreCategoria = String.valueOf(txtNombreCategoria.getText());
            String descripcionCategoria = String.valueOf(txtDescripcionCategoria.getText());

            try {
                biblioteca.ingresar(idCategoria, nombreCategoria, descripcionCategoria);
                limpiarTabla();
            } catch (Exception e) {
            }
            Limpiar();

        }else{
            JOptionPane.showMessageDialog(null,"No ingresado", "Ingreso Biblioteca", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed

        tm = (DefaultTableModel) tblCategoria1.getModel();
        int idCategoria = Integer.parseInt(txtIdCategoria.getText());
        tm.setValueAt(idCategoria, fila, 0);
        String nombreCategoria = txtNombreCategoria.getText();
        tm.setValueAt(nombreCategoria, fila, 1);
        String descripcionCategoria =  txtDescripcionCategoria.getText();
        tm.setValueAt(descripcionCategoria, fila, 2);
  
        biblioteca.actualizar(idCategoria, nombreCategoria, descripcionCategoria);
        tblCategoria1.setModel(tm);
        JOptionPane.showMessageDialog(null,"Actualizado con Exito", "Ingresar Categoria", JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }//GEN-LAST:event_bntEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        tm = (DefaultTableModel) tblCategoria1.getModel();
        int idCategoria = (int) tm.getValueAt(fila, 0);
        biblioteca.eliminar(idCategoria);
        tm.removeRow(fila);
        JOptionPane.showMessageDialog(null,"Eliminado con Exito", "Ingreso Categoria", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblCategoria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoria1MouseClicked
         fila = tblCategoria1.getSelectedRow();
        tm = (DefaultTableModel) tblCategoria1.getModel();
        String idCategoria = String.valueOf(tm.getValueAt(fila, 0));
        txtIdCategoria.setText(idCategoria);
        
        String nombreCategoria = String.valueOf(tm.getValueAt(fila, 1));
        txtNombreCategoria.setText(nombreCategoria);
        String descripcionCategoria =  String.valueOf(tm.getValueAt(fila, 2));
        txtDescripcionCategoria.setText(descripcionCategoria);
    }//GEN-LAST:event_tblCategoria1MouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
        limpiarTabla();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void cargarTabla(){
            ResultSet rs = biblioteca.listar();
            tm = (DefaultTableModel) tblCategoria1.getModel();
            try {
                while (rs.next()) {
                    int idCategoria = rs.getInt("idCategoria");
                    String nombreCategoria = rs.getString("nombreCategoria");
                    String descripcionCategoria = rs.getString("descripcionCategoria");
                    
                    
                    tm.addRow(new Object[]{idCategoria, nombreCategoria, descripcionCategoria});
                    
                            
                }
                tblCategoria1.setModel(tm);
            } catch (Exception ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
         
    
    
              public void Limpiar(){
        txtIdCategoria.setText("");
        txtNombreCategoria.setText("");
        txtDescripcionCategoria.setText("");
      
        
        
        
    }
              
        public void limpiarTabla(){
        tm = (DefaultTableModel) tblCategoria1.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblCategoria1.setModel(tm);
        cargarTabla();
    }
        public void actualizarTabla(){
        tm = (DefaultTableModel) tblCategoria1.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblCategoria1.setModel(tm);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tblCategoria;
    private javax.swing.JTable tblCategoria1;
    private javax.swing.JTextField txtDescripcionCategoria;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
