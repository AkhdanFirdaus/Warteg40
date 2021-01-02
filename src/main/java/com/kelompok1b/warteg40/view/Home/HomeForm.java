/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.view.Home;

import com.kelompok1b.warteg40.controller.CartController;
import com.kelompok1b.warteg40.controller.MenuController;
import com.kelompok1b.warteg40.controller.UserController;
import com.kelompok1b.warteg40.model.Item;
import com.kelompok1b.warteg40.view.Auth.LoginForm;
import com.kelompok1b.warteg40.view.Home.Widget.GridMenu;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

/**
 *
 * @author akhda
 */
public class HomeForm extends javax.swing.JFrame {
    UserController userController;
    MenuController menuController;
    CartController cartController;
    /**
     * Creates new form Home
     */
    public HomeForm() {
        initComponents();
        userController = UserController.getInstance();
        cartController = CartController.getInstance();
        
        if (userController.getLoggedInUser() == null) {
            btn_logout.setText("Login");
        } else {
            label_name.setText("Welcome " + userController.getLoggedInUser().getName());
        }
        
        panel_menu.setLayout(new GridLayout(3, 3));
        menuController = MenuController.getInstance();
        for (Item item : menuController.getMenus())
            panel_menu.add(new GridMenu(item, cartController));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_sidebar = new java.awt.Panel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        label_name = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        panel_content = new javax.swing.JPanel();
        panel_menu1 = new java.awt.Panel();
        cmb_filter = new javax.swing.JComboBox<>();
        textfield_find = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        btn_cart = new javax.swing.JButton();
        scroll_menu = new javax.swing.JScrollPane();
        panel_menu = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panel_sidebar.setPreferredSize(new java.awt.Dimension(150, 600));
        panel_sidebar.setLayout(new javax.swing.BoxLayout(panel_sidebar, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 200, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Warteg 40");

        btn_logout.setText("Log Out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        label_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name.setText("Welcome!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout)
                .addContainerGap())
        );

        label_name.getAccessibleContext().setAccessibleName("label_name");

        panel_sidebar.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 200, 200));
        jPanel4.setPreferredSize(new java.awt.Dimension(340, 600));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu");

        jButton6.setText("Makanan");
        jButton6.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("Minuman");
        jButton9.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Tambahan");
        jButton10.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        panel_sidebar.add(jPanel4);

        getContentPane().add(panel_sidebar);

        panel_content.setPreferredSize(new java.awt.Dimension(510, 600));
        panel_content.setLayout(new javax.swing.BoxLayout(panel_content, javax.swing.BoxLayout.Y_AXIS));

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

        btn_cart.setText("Keranjang");
        btn_cart.setPreferredSize(new java.awt.Dimension(80, 40));
        btn_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cartActionPerformed(evt);
            }
        });
        panel_menu1.add(btn_cart);

        panel_content.add(panel_menu1);

        panel_menu.setPreferredSize(new java.awt.Dimension(590, 600));
        panel_menu.setLayout(new java.awt.GridBagLayout());
        scroll_menu.setViewportView(panel_menu);

        panel_content.add(scroll_menu);

        getContentPane().add(panel_content);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        userController.logout();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_filterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_filterActionPerformed

    private void btn_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cartActionPerformed
        CartForm cartForm = new CartForm(cartController);
        cartForm.setVisible(true);
    }//GEN-LAST:event_btn_cartActionPerformed

    private void textfield_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_findActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_findActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cart;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_logout;
    private javax.swing.JComboBox<String> cmb_filter;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label_name;
    private javax.swing.JPanel panel_content;
    private java.awt.Panel panel_menu;
    private java.awt.Panel panel_menu1;
    private java.awt.Panel panel_sidebar;
    private javax.swing.JScrollPane scroll_menu;
    private javax.swing.JTextField textfield_find;
    // End of variables declaration//GEN-END:variables
}
