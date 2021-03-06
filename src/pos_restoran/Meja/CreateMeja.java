/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_restoran.Meja;

import pos_restoran.Dishess.*;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import pos_restoran.Dashboard.*;
import pos_restoran.DbConnection;
import pos_restoran.MenuNavigation;


/**
 *
 * @author User
 */
public class CreateMeja extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    
    private Connection con;
    private Statement statment;
    private MenuNavigation menuNav;
    private int mejaId;

    public CreateMeja() {
        initComponents();
        
        // connection DB
        DbConnection DB = new DbConnection();
        DB.Connect();
        con = DB.conn;
        statment = DB.stmt;
        
        // init button group
        statusGroup.add(rdAvailable);
        statusGroup.add(rdUnAvailable);
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        
        // init class
        this.menuNav = new MenuNavigation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusGroup = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mnDashboard = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mnDishes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mnMeja = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mnDashboard2 = new javax.swing.JLabel();
        createTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        noMeja = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rdAvailable = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        rdUnAvailable = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(94, 43, 22));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(199, 139, 61));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_restoran/images/smol_logo.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_restoran/images/ic_home_blong.png"))); // NOI18N

        mnDashboard.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        mnDashboard.setText("Dashboard");
        mnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnDashboardMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_restoran/images/ic_order.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order List");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        mnDishes.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mnDishes.setForeground(new java.awt.Color(255, 255, 255));
        mnDishes.setText("Dishes List");
        mnDishes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnDishesMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_restoran/images/ic_serving-dish.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_restoran/images/table.png"))); // NOI18N

        mnMeja.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mnMeja.setForeground(new java.awt.Color(255, 255, 255));
        mnMeja.setText("Meja");
        mnMeja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnMejaMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_restoran/images/ic_logout.png"))); // NOI18N

        mnDashboard2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mnDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        mnDashboard2.setText("Logout");
        mnDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnDashboard2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mnMeja))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mnDashboard))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mnDishes))
                            .addComponent(logo)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(mnDashboard))
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(mnDishes))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(mnMeja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mnDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createTitle.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        createTitle.setText("Create Table");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Table > Create Table");

        noMeja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Table");

        rdAvailable.setText("Available");
        rdAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAvailableActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Status");

        rdUnAvailable.setText("Booked");
        rdUnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUnAvailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noMeja, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(rdAvailable)
                        .addGap(18, 18, 18)
                        .addComponent(rdUnAvailable)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noMeja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdAvailable)
                    .addComponent(jLabel16)
                    .addComponent(rdUnAvailable))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Action");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(btnCreate)
                    .addComponent(btnClear)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createTitle)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 238, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        create();
        // redirect to dish menu
        menuNav.mejaList(this);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void rdAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdAvailableActionPerformed

    private void rdUnAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUnAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdUnAvailableActionPerformed

    private void mnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDashboardMouseClicked
        
        menuNav.adminDashboard(this);
    }//GEN-LAST:event_mnDashboardMouseClicked

    private void mnDishesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDishesMouseClicked
        menuNav.dishList(this);
    }//GEN-LAST:event_mnDishesMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
        menuNav.mejaList(this);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Are you sure delete this data?");
        if (option == 0)
        {
            delete();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void mnMejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnMejaMouseClicked
        menuNav.mejaList(this);
    }//GEN-LAST:event_mnMejaMouseClicked

    private void mnDashboard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDashboard2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Logout Success");
        menuNav.loginPage(this);
    }//GEN-LAST:event_mnDashboard2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        menuNav.orderList(this);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(CreateMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateMeja().setVisible(true);
            }
        });
    }
    
    // process function
    
    public void setData(JTable menuTableList, int row)
    {
        mejaId = Integer.parseInt(menuTableList.getValueAt(row, 0).toString());
        
        noMeja.setText(menuTableList.getValueAt(row, 1).toString());
        
        String status = menuTableList.getValueAt(row, 2).toString();
        if (status.equals("available"))
        {
            rdAvailable.setSelected(true);
        }
        if (status.equals("booked"))
        {
            rdUnAvailable.setSelected(true);
        }
        
        btnUpdate.setVisible(true);
        btnDelete.setVisible(true);
        
        btnCreate.setVisible(false);
        btnClear.setVisible(false);
        createTitle.setText("Update Dish");
    }
    
    
    private void create()
    {
        try {
            rdAvailable.setActionCommand("available");
            rdUnAvailable.setActionCommand("booked");
            
            String status = statusGroup.getSelection().getActionCommand();

            String insertQuery = "INSERT INTO meja VALUES ('0','"
                    + noMeja.getText() + "','"
                    + status + "')";
            
            PreparedStatement prepare = con.prepareStatement(insertQuery);
            prepare.execute();
            JOptionPane.showMessageDialog(this, "Table Added");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            System.err.println(ex.getMessage());
        }
    }
    
    private void update()
    {
        try {
            rdAvailable.setActionCommand("available");
            rdUnAvailable.setActionCommand("booked");
            
            String status = statusGroup.getSelection().getActionCommand();

            String insertQuery = "UPDATE meja SET "
                    + "no_meja='" + noMeja.getText() + "',"
                    + "status='" + status + "'"
                    + "WHERE id_meja = '" + mejaId + "'";
            System.out.println("SQL QUERY : " + insertQuery);
            
            PreparedStatement prepare = con.prepareStatement(insertQuery);
            prepare.execute();
            JOptionPane.showMessageDialog(this, "Table Updated");
            
            System.out.println(insertQuery);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            System.err.println(ex.getMessage());
        }
    }
    
    private void delete()
    {
        try {

            String insertQuery = "DELETE from meja WHERE id_meja='" + mejaId + "'";
            
            PreparedStatement prepare = con.prepareStatement(insertQuery);
            prepare.execute();
            JOptionPane.showMessageDialog(this, "Delete Success");
            
            menuNav.dishList(this);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            System.err.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel createTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mnDashboard;
    private javax.swing.JLabel mnDashboard2;
    private javax.swing.JLabel mnDishes;
    private javax.swing.JLabel mnMeja;
    private javax.swing.JTextField noMeja;
    private javax.swing.JRadioButton rdAvailable;
    private javax.swing.JRadioButton rdUnAvailable;
    private javax.swing.ButtonGroup statusGroup;
    // End of variables declaration//GEN-END:variables
}
