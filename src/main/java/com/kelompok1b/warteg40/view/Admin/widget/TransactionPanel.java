/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.view.Admin.widget;

import com.kelompok1b.warteg40.controller.CartController;
import com.kelompok1b.warteg40.controller.TransactionController;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhda
 */
public class TransactionPanel extends javax.swing.JPanel {
    private CartController cartController;
    private TransactionController transactionController;
    /**
     * Creates new form MenuPanel
     */
    public TransactionPanel() {
        initComponents();
        cartController = CartController.getInstance();
        transactionController = TransactionController.getInstance(cartController);
        tampilData();
    }
    
    public void tampilData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Tanggal");
        model.addColumn("Bayar");
        model.addColumn("Kembalian");
        model.addColumn("Jml Item");
        
        //menampilkan data database kedalam tabel
        try {
//            Iterator transactions = transactionController.getTransactions().iterator();
//            while(transactions.hasNext()){
//                Transaction transaction = (Transaction) transactions.next();
//                model.addRow(new Object[]{
//                    transaction.getIdTransaction(),
//                    transaction.getCustomerName(),
//                    transaction.getDate(),
//                    transaction.getPaidMoney(),
//                    transaction.getChangeMoney(),
//                    transaction.getCountOrderedItem()
//                });
//            }
             transactionController.getTransactions().forEach(transaction -> {
                 model.addRow(new Object[]{
                    transaction.getIdTransaction(),
                    transaction.getCustomerName(),
                    transaction.getDate(),
                    transaction.getPaidMoney(),
                    transaction.getChangeMoney(),
                    transaction.getCountOrderedItem()
                });
             });
            table_transactions.setModel(model);
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu1 = new java.awt.Panel();
        cmb_filter = new javax.swing.JComboBox<>();
        textfield_find = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_transactions = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        panel_menu1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        cmb_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Nama", "Kategori", "Harga" }));
        cmb_filter.setMinimumSize(new java.awt.Dimension(120, 40));
        cmb_filter.setPreferredSize(new java.awt.Dimension(100, 40));
        cmb_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_filterActionPerformed(evt);
            }
        });
        panel_menu1.add(cmb_filter);

        textfield_find.setText("Ketik yang Ingin Dicari");
        textfield_find.setMinimumSize(new java.awt.Dimension(240, 40));
        textfield_find.setPreferredSize(new java.awt.Dimension(240, 40));
        textfield_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_findActionPerformed(evt);
            }
        });
        panel_menu1.add(textfield_find);

        btn_find.setText("Cari");
        btn_find.setMaximumSize(new java.awt.Dimension(80, 40));
        btn_find.setMinimumSize(new java.awt.Dimension(80, 40));
        btn_find.setPreferredSize(new java.awt.Dimension(80, 40));
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        panel_menu1.add(btn_find);

        add(panel_menu1);

        table_transactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Tanggal", "Bayar", "Kembalian", "Jml Pesanan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_transactions);
        if (table_transactions.getColumnModel().getColumnCount() > 0) {
            table_transactions.getColumnModel().getColumn(0).setHeaderValue("ID");
            table_transactions.getColumnModel().getColumn(1).setHeaderValue("Nama");
            table_transactions.getColumnModel().getColumn(2).setHeaderValue("Tanggal");
            table_transactions.getColumnModel().getColumn(3).setHeaderValue("Bayar");
            table_transactions.getColumnModel().getColumn(4).setHeaderValue("Kembalian");
            table_transactions.getColumnModel().getColumn(5).setHeaderValue("Jml Pesanan");
        }

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_filterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_filterActionPerformed

    private void textfield_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_findActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_findActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_find;
    private javax.swing.JComboBox<String> cmb_filter;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel_menu1;
    private javax.swing.JTable table_transactions;
    private javax.swing.JTextField textfield_find;
    // End of variables declaration//GEN-END:variables
}
