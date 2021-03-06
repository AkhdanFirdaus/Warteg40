/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.view.Admin.widget;

import com.kelompok1b.warteg40.controller.MenuController;
import com.kelompok1b.warteg40.controller.Searching;
import com.kelompok1b.warteg40.model.Item;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhda
 */
public class MenuPanel extends javax.swing.JPanel {
    private MenuController menuController;
    private DefaultTableModel table_model = new DefaultTableModel();

    /**
     * Creates new form MenuPanel
     */
    public MenuPanel() {
        initComponents();
        menuController = MenuController.getInstance();
        table_model.addColumn("ID");
        table_model.addColumn("Nama");
        table_model.addColumn("Kategori");
        table_model.addColumn("Harga");
        tampilData();
    }
    
    public void tampilData() {
        try {
             menuController.getMenus().forEach(menu -> {
                 table_model.addRow(new Object[] {
                    menu.getId()+1,
                    menu.getItemName(),
                    menu.getNameCategory(),
                    menu.getPrice()
                 });
             });
            table_menu.setModel(table_model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal Load Tabel");
        }
    }
    
    int getCategoryFromId(String value) {
        switch (value) {
            case "Makanan":
                return 1;
            case "Minuman":
                return 2;
            case "Tambahan":
                return 3;
            default:
                return -1;
        }
    }
    
    public void clearForm() {
        id_field.setText(null);
        name_field.setText(null);
        category_combo_box.setSelectedIndex(0);
        price_field.setText(null);
        table_menu.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        category_combo_box = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        price_field = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_add_menu = new javax.swing.JButton();
        btn_edit_menu = new javax.swing.JButton();
        btn_clear_menu = new javax.swing.JButton();
        btn_delete_menu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        panel_menu1 = new java.awt.Panel();
        cmb_filter = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        textfield_find = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_find = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_menu = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        form_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Form Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        form_panel.setLayout(new javax.swing.BoxLayout(form_panel, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(4, 2, 0, 8));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Id");
        jPanel1.add(jLabel3);

        id_field.setEditable(false);
        jPanel1.add(id_field);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jPanel1.add(name_field);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kategori");
        jPanel1.add(jLabel2);

        category_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Tambahan" }));
        jPanel1.add(category_combo_box);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Harga");
        jPanel1.add(jLabel4);
        jPanel1.add(price_field);

        form_panel.add(jPanel1);
        form_panel.add(jPanel6);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 4, 0));

        btn_add_menu.setText("Add");
        btn_add_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_menuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add_menu);

        btn_edit_menu.setText("Edit");
        btn_edit_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_menuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit_menu);

        btn_clear_menu.setText("Clear");
        btn_clear_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_menuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear_menu);

        btn_delete_menu.setText("Delete");
        btn_delete_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_menuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete_menu);

        form_panel.add(jPanel2);

        add(form_panel);
        add(jPanel5);

        panel_menu1.setLayout(new javax.swing.BoxLayout(panel_menu1, javax.swing.BoxLayout.LINE_AXIS));

        cmb_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Nama", "Kategori", "Harga" }));
        cmb_filter.setMinimumSize(new java.awt.Dimension(120, 40));
        cmb_filter.setPreferredSize(new java.awt.Dimension(100, 40));
        cmb_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_filterActionPerformed(evt);
            }
        });
        panel_menu1.add(cmb_filter);
        panel_menu1.add(jPanel4);

        textfield_find.setText("Ketik yang Ingin Dicari");
        textfield_find.setMinimumSize(new java.awt.Dimension(240, 40));
        textfield_find.setPreferredSize(new java.awt.Dimension(240, 40));
        panel_menu1.add(textfield_find);
        panel_menu1.add(jPanel3);

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
        add(jPanel7);

        table_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Kategori", "Quantity", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_menu);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_filterActionPerformed
        int type = cmb_filter.getSelectedIndex();
        table_model.setRowCount(0);
        menuController.sort(type);
        table_menu.repaint();
        table_model.fireTableDataChanged();
        tampilData();
    }//GEN-LAST:event_cmb_filterActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        if (btn_find.getText().equals("Clear")) {
            btn_find.setText("Cari");
            textfield_find.setText(null);
            table_model.setRowCount(0);
            tampilData();
        } else {
            Searching search = new Searching();
            String keyword = textfield_find.getText();
            Item found = search.cariMenu(keyword, menuController.getMenus());
            if (found != null) {
                btn_find.setText("Clear");
                table_model.setRowCount(0);
                table_model.addRow(new Object[] {
                    found.getId()+1,
                    found.getItemName(),
                    found.getNameCategory(),
                    found.getPrice()
                });
                table_menu.repaint();
                table_model.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(this, "Tidak Ditemukan");
            }
        }
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_add_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_menuActionPerformed
        String name = name_field.getText();
        int category = category_combo_box.getSelectedIndex() + 1;
        float price = Float.parseFloat(price_field.getText());

        boolean res = menuController.addMenu(name, category, price);
        if (res) {
            JOptionPane.showMessageDialog(this, "Sukses");
            table_menu.repaint();
            table_model.fireTableDataChanged();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal");
        }
    }//GEN-LAST:event_btn_add_menuActionPerformed

    private void table_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_menuMouseClicked
        int baris = table_menu.rowAtPoint(evt.getPoint());
        String id = table_menu.getValueAt(baris, 0).toString();
        String nama = table_menu.getValueAt(baris, 1).toString();
        int kategori = getCategoryFromId(table_menu.getValueAt(baris, 2).toString());
        String price = table_menu.getValueAt(baris, 3).toString();
        id_field.setText(id);
        name_field.setText(nama);
        category_combo_box.setSelectedIndex(kategori-1);
        price_field.setText(price);
    }//GEN-LAST:event_table_menuMouseClicked

    private void btn_edit_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_menuActionPerformed
        int id = Integer.parseInt(id_field.getText());
        String name = name_field.getText();
        int category = category_combo_box.getSelectedIndex() + 1;
        float price = Float.parseFloat(price_field.getText());
        boolean res = menuController.editMenu(id, name, category, price);
        if (res) {
            JOptionPane.showMessageDialog(this, "Sukses Edit");
            table_menu.repaint();
            table_model.fireTableDataChanged();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal");
        }
    }//GEN-LAST:event_btn_edit_menuActionPerformed

    private void btn_clear_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_menuActionPerformed
        clearForm();
    }//GEN-LAST:event_btn_clear_menuActionPerformed

    private void btn_delete_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_menuActionPerformed
        int id = Integer.parseInt(id_field.getText());
        menuController.deleteMenu(id);
    }//GEN-LAST:event_btn_delete_menuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_menu;
    private javax.swing.JButton btn_clear_menu;
    private javax.swing.JButton btn_delete_menu;
    private javax.swing.JButton btn_edit_menu;
    private javax.swing.JButton btn_find;
    private javax.swing.JComboBox<String> category_combo_box;
    private javax.swing.JComboBox<String> cmb_filter;
    private javax.swing.JPanel form_panel;
    private javax.swing.JTextField id_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_field;
    private java.awt.Panel panel_menu1;
    private javax.swing.JTextField price_field;
    private javax.swing.JTable table_menu;
    private javax.swing.JTextField textfield_find;
    // End of variables declaration//GEN-END:variables
}
