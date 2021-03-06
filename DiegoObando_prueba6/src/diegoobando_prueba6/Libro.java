/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegoobando_prueba6;

import Models.AccesoCategorias;
import Models.AccesoLibros;
import Models.ComboBox;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Libro extends javax.swing.JInternalFrame {
    
    AccesoLibros biblioteca = new AccesoLibros();
    DefaultTableModel tm;
    int fila;
    

    /**
     * Creates new form Libro
     */
    public Libro() {
        initComponents();
        actualizarTabla();
        cargarComboBox();
        cargarTabla();
        txtIdCategoria.setEditable(false);
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
        txtIdLibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutorLibro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEjemplares = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibro = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("ID Libro");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nombre Libro");

        jLabel3.setText("Autor Libro");

        jLabel4.setText("Editorial");

        jLabel5.setText("Ejemplares");

        tblLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Libro", "Nombre Libro", "Autor Libro", "Editorial", "Ejemplares", "ID Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLibro);

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

        jLabel6.setText("ID Categoria");

        cmbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriaItemStateChanged(evt);
            }
        });

        jLabel7.setText("Categoria");

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
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreLibro)
                                    .addComponent(txtEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAutorLibro)
                                        .addComponent(txtEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIdCategoria))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                            .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
        int resp = JOptionPane.showConfirmDialog(null, "¿seguro que desea agregar un nuevo libro?");
        if (resp == 0) {

            tm = (DefaultTableModel) tblLibro.getModel();

            int idLibro  = Integer.parseInt(txtIdLibro.getText());
            String nombreLibro = String.valueOf(txtNombreLibro.getText());
            String autorLibro = String.valueOf(txtAutorLibro.getText());
            String editorial = String.valueOf(txtEditorial.getText());
            int ejemplares = Integer.parseInt(txtEjemplares.getText());
            int categoria_id = Integer.parseInt(txtIdCategoria.getText());

            try {
                biblioteca.ingresar(idLibro, nombreLibro, autorLibro, editorial, ejemplares, categoria_id);
                limpiarTabla();
            } catch (Exception e) {
            }
            Limpiar();

        }else{
            JOptionPane.showMessageDialog(null,"No ingresado", "Ingreso Libros", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed

        tm = (DefaultTableModel) tblLibro.getModel();
        int idLibro = Integer.parseInt(txtIdLibro.getText());
        tm.setValueAt(idLibro, fila, 0);
        String nombreLibro = txtNombreLibro.getText();
        tm.setValueAt(nombreLibro, fila, 1);
        String autorLibro =  txtAutorLibro.getText();
        tm.setValueAt(autorLibro, fila, 2);
        String editorial = txtEditorial.getText();
        tm.setValueAt(editorial, fila, 3);
        int ejemplares = Integer.parseInt(txtEjemplares.getText());
        tm.setValueAt(ejemplares, fila, 4);
        int categoria_id = Integer.parseInt(txtIdCategoria.getText());
        tm.setValueAt(categoria_id, fila, 5);
        biblioteca.actualizar(idLibro, nombreLibro, autorLibro, editorial, ejemplares, categoria_id);
        tblLibro.setModel(tm);
        JOptionPane.showMessageDialog(null,"Actualizado con Exito", "Ingresar Estacion", JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }//GEN-LAST:event_bntEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        tm = (DefaultTableModel) tblLibro.getModel();
        int idLibro = (int) tm.getValueAt(fila, 0);
        biblioteca.eliminar(idLibro);
        tm.removeRow(fila);
        JOptionPane.showMessageDialog(null,"Eliminado con Exito", "Ingreso Estudiante", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged
        ComboBox cmb = (ComboBox) cmbCategoria.getSelectedItem();
        txtIdCategoria.setText(String.valueOf(cmb.getId()));
    }//GEN-LAST:event_cmbCategoriaItemStateChanged

    private void tblLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibroMouseClicked
        fila = tblLibro.getSelectedRow();
        tm = (DefaultTableModel) tblLibro.getModel();
        String idLibro = String.valueOf(tm.getValueAt(fila, 0));
        txtIdLibro.setText(idLibro);
        
        String nombreLibro = String.valueOf(tm.getValueAt(fila, 1));
        txtNombreLibro.setText(nombreLibro);
        String autorLibro =  String.valueOf(tm.getValueAt(fila, 2));
        txtAutorLibro.setText(autorLibro);
        String editorial = String.valueOf(tm.getValueAt(fila, 3));
        txtEditorial.setText(editorial);
        String ejemplares = String.valueOf(tm.getValueAt(fila, 4));
        txtEjemplares.setText(ejemplares);
        String categoria_id = String.valueOf(tm.getValueAt(fila, 5));
        txtIdCategoria.setText(categoria_id);
    }//GEN-LAST:event_tblLibroMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
        limpiarTabla();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
     public void cargarTabla(){
            ResultSet rs = biblioteca.listar();
            tm = (DefaultTableModel) tblLibro.getModel();
            try {
                while (rs.next()) {
                    int idLibro = rs.getInt("idLibro");
                    String nombreLibro = rs.getString("nombreLibro");
                    String autorLibro = rs.getString("autorLibro");
                    String editorial = rs.getString("editorial");
                    int ejemplares = rs.getInt("ejemplares");
                    int categoria_id = rs.getInt("categoria_id");
                    
                    
                    tm.addRow(new Object[]{idLibro, nombreLibro, autorLibro, editorial, ejemplares, categoria_id});
                    
                            
                }
                tblLibro.setModel(tm);
            } catch (Exception ex) {
                Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
         
    
    
              public void Limpiar(){
        txtIdLibro.setText("");
        txtNombreLibro.setText("");
        txtAutorLibro.setText("");
        txtEditorial.setText("");
        txtEjemplares.setText("");
        txtIdCategoria.setText("");
      
        
        
        
    }
              
               public void cargarComboBox(){
           AccesoCategorias categoria = new AccesoCategorias();
           ResultSet rs = categoria.listar();
           
           try {
               while(rs.next()){
               cmbCategoria.addItem(new ComboBox(rs.getInt("idCategoria"), rs.getString("nombreCategoria")));
               }
           } catch (Exception e) {
           }
       }
               
       public void limpiarTabla(){
        tm = (DefaultTableModel) tblLibro.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblLibro.setModel(tm);
        cargarTabla();
    }
       
        public void actualizarTabla(){
        tm = (DefaultTableModel) tblLibro.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblLibro.setModel(tm);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Object> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLibro;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
