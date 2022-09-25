/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Md Solaiman Khan
 */
public class DeleteProduct extends javax.swing.JFrame {

    /**
     * Creates new form DeleteProduct
     */
    public DeleteProduct() {
        initComponents();
        loadPid();
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
        jLabel2 = new javax.swing.JLabel();
        tfPname = new javax.swing.JTextField();
        tfBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCatagory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfUnit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfUnitPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cmbPid = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfRack = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 158, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Delete Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Product ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 133, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Product Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 133, -1));

        tfPname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tfPname, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 79, 173, -1));

        tfBrand.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tfBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 124, 173, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Brand :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 127, 133, -1));

        tfCatagory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tfCatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 169, 173, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Catagory :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 133, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Unit :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 217, 133, -1));

        tfUnit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tfUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 214, 173, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Unit Price :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 262, 133, -1));

        tfUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tfUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 259, 173, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Stock :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 307, 133, -1));

        tfStock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tfStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 304, 173, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 393, -1, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 393, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 393, -1, -1));

        cmbPid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cmbPid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPidItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 33, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Rack No :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 352, 133, -1));

        tfRack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(tfRack, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 349, 173, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    Connection con;
    PreparedStatement pst;
    
    String SqlUrl = "jdbc:mysql://localhost:3306/super_shop_management_dtbs";
    String SqlUser = "root";
    String SqlPass = "nclc123";
    DefaultTableModel dtm;
    
       public void loadPid(){
        
        try {
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT p_id FROM product_info");
            ResultSet rs = pst.executeQuery();
            
            String id;
            while (rs.next()) {
                id = rs.getString(1);
                cmbPid.addItem(id);                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
     
     }
   
    public void loadData(){

        try {
            
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("SELECT * FROM product_info WHERE p_id ="+cmbPid.getSelectedItem().toString());
            //pst.setInt(1, pid);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tfPname.setText(rs.getString(2));
                tfBrand.setText(rs.getString(3));
                tfCatagory.setText(rs.getString(4));
                tfUnit.setText(rs.getString(5));
                tfUnitPrice.setText(rs.getString(6));
                tfStock.setText(rs.getString(7));
                tfRack.setText(rs.getString(8));
                
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
     
     }
    
    
    public void delete(){
        
        int pid = Integer.parseInt((String)cmbPid.getSelectedItem());
        String id = cmbPid.getSelectedItem().toString();
        
        
        try {
            con = DriverManager.getConnection(SqlUrl,SqlUser,SqlPass);
            pst = con.prepareStatement("DELETE FROM product_info  WHERE p_id = ?");

            pst.setInt(1, pid);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Product DELETE Successfully!" );
           
            cmbPid.removeItem(id);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public void clear(){
        cmbPid.setSelectedIndex(0);

    }
    private void cmbPidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPidItemStateChanged
        loadData();
    }//GEN-LAST:event_cmbPidItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int q = JOptionPane.showConfirmDialog(rootPane, "Do you confirm to Update the Product!");
        if (q==0) {
           delete();
        } else {

        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new ProductManagement().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbPid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfBrand;
    private javax.swing.JTextField tfCatagory;
    private javax.swing.JTextField tfPname;
    private javax.swing.JTextField tfRack;
    private javax.swing.JTextField tfStock;
    private javax.swing.JTextField tfUnit;
    private javax.swing.JTextField tfUnitPrice;
    // End of variables declaration//GEN-END:variables
}
