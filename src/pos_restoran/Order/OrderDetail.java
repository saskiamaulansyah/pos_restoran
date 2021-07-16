/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_restoran.Order;

import com.mysql.jdbc.StringUtils;
import pos_restoran.Dishess.*;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import pos_restoran.Dashboard.*;
import pos_restoran.DbConnection;
import pos_restoran.MenuNavigation;

/**
 *
 * @author User
 */
public class OrderDetail extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    private Connection con;
    private Statement statment;
    private MenuNavigation menuNav;
    private int sub_total, uang_bayar, kembalian;
    private String meja_id, NoPesan, atas_nama;
    private boolean isBayar;
    public OrderDetail(String NoPesanan) {
        initComponents();

        // connection DB
        DbConnection DB = new DbConnection();
        DB.Connect();
        con = DB.conn;
        statment = DB.stmt;

        // init button group\
        // init class
        this.menuNav = new MenuNavigation();
        NoPesananLabel.setText(NoPesanan);
        NoPesan = NoPesanan;
        buttonBayarVisible(false);
        setItem();
        LoadMenu();
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
        mnDashboard2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AtasNama = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NoMeja = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SubTotalLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        UangBayar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        KembalianLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        GrandTotalLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NoPesananLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BayarButton = new com.k33ptoo.components.KButton();
        CetakStrukButton = new com.k33ptoo.components.KButton();

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

        mnDashboard2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mnDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        mnDashboard2.setText("Logout");
        mnDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnDashboard2MouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos_restoran/images/ic_logout.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(logo))
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
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mnDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createTitle.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        createTitle.setText("Order Detail");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AtasNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nomor Meja");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Atas Nama");

        NoMeja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Menu", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MenuTable);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Menu");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Sub Total");

        SubTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SubTotalLabel.setText("Rp. 12,000");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Uang Bayar");

        UangBayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UangBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UangBayarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UangBayarKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Kembalian");

        KembalianLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        KembalianLabel.setText("Rp. 0,0");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Grand Total");

        GrandTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GrandTotalLabel.setText("Rp. 12,000");

        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("No Pesanan :");

        NoPesananLabel.setForeground(new java.awt.Color(255, 153, 0));
        NoPesananLabel.setText("019737292");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoPesananLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AtasNama, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoMeja, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(UangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(KembalianLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(GrandTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NoPesananLabel))
                        .addGap(18, 18, 18)))
                .addComponent(AtasNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoMeja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KembalianLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GrandTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Action");

        BayarButton.setText("Bayar");
        BayarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarButtonActionPerformed(evt);
            }
        });

        CetakStrukButton.setText("Cetak");
        CetakStrukButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakStrukButtonActionPerformed(evt);
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
                    .addComponent(BayarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CetakStrukButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(BayarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CetakStrukButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(0, 392, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDashboardMouseClicked

        menuNav.adminDashboard(this);
    }//GEN-LAST:event_mnDashboardMouseClicked

    private void mnDishesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDishesMouseClicked
        menuNav.dishList(this);
    }//GEN-LAST:event_mnDishesMouseClicked

    private void mnMejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnMejaMouseClicked
        menuNav.mejaList(this);
    }//GEN-LAST:event_mnMejaMouseClicked

    private void UangBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UangBayarKeyReleased
        // TODO add your handling code here:
        uang_bayar = Integer.parseInt(UangBayar.getText());
        kembalian = uang_bayar - sub_total;
        KembalianLabel.setText(String.valueOf(kembalian));
        if (kembalian < -0) {
            KembalianLabel.setText("Rp 0,0");
            isBayar = false;

        } else {
            isBayar = true;
        }
        buttonBayarVisible(isBayar);
    }//GEN-LAST:event_UangBayarKeyReleased
    
    private void buttonBayarVisible(boolean isBayar){
        BayarButton.setVisible(isBayar);
    }
    
    private void ButtonCetakVisible(boolean show){
        CetakStrukButton.setVisible(show);
    }
    
    private void BayarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarButtonActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
            // clear data
            int no = 1;
            model.setRowCount(0);
            String selectQuery = "UPDATE pembayaran SET uang_bayar = '" + UangBayar.getText()
                    + "', kembalian = '" + KembalianLabel.getText()
                    + "', sub_total = '" + sub_total
                    + "', grand_total = '" + GrandTotalLabel.getText()
                    + "', status = 'COMPLETE' where no_pesanan = '" + NoPesan + "'";
            
            PreparedStatement prepare = con.prepareStatement(selectQuery);
            prepare.execute();
            
            JOptionPane.showMessageDialog(this, "Sukses Input Pembayaran");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_BayarButtonActionPerformed

    private void CetakStrukButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakStrukButtonActionPerformed
        // TODO add your handling code here:
        try {
            String jrxmlFile = "./src/pos_restoran/Order/orderDetailReport.jrxml";
            HashMap param = new HashMap();
            param.put("NoPesanan", NoPesan);
            param.put("AtasNama", atas_nama);
            param.put("NoMeja", meja_id);
            param.put("UangBayar", String.valueOf(uang_bayar));
            param.put("SubTotal", String.valueOf(sub_total));
            param.put("Kembalian", String.valueOf(kembalian));
            param.put("GrandTotal", String.valueOf(sub_total));
            JasperReport jspR = JasperCompileManager.compileReport(jrxmlFile);
            JasperPrint jPrint = JasperFillManager.fillReport(jspR, param, con);
            JasperViewer.viewReport(jPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_CetakStrukButtonActionPerformed

    private void UangBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UangBayarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_UangBayarKeyPressed

    private void mnDashboard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDashboard2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Logout Berhasil");
        menuNav.loginPage(this);
    }//GEN-LAST:event_mnDashboard2MouseClicked

    private void setItem() {

        try {
            DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
            // clear data
            int no = 1;
            model.setRowCount(0);
            String selectQuery = "SELECT * FROM pembayaran where no_pesanan = '" + NoPesan + "'";
            ResultSet result = statment.executeQuery(selectQuery);
            if (result.next()) {
                atas_nama = result.getString("atas_nama");
                AtasNama.setText(atas_nama);
                AtasNama.setEditable(false);
                
                if (result.getString("uang_bayar") != null && !result.getString("uang_bayar").isEmpty()) {
                    uang_bayar = Integer.valueOf(result.getString("uang_bayar"));
                    UangBayar.setText(String.valueOf(uang_bayar));
                    UangBayar.setEditable(false);
                    
                    KembalianLabel.setText(result.getString("kembalian"));
                }

                meja_id = result.getString("id_meja");
                NoMeja.setText(meja_id);
                NoMeja.setEditable(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void LoadMenu() {
        sub_total = 0;
        try {
            DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
            // clear data
            int no = 1;
            model.setRowCount(0);
            String selectQuery = "SELECT menu.menu, menu.harga FROM detail_bayar JOIN menu ON detail_bayar.id_menu = menu.id_menu WHERE no_pesanan = '" + NoPesan + "'";
            ResultSet result = statment.executeQuery(selectQuery);
            while (result.next()) {
                model.addRow(new Object[]{
                    no++,
                    result.getString("Menu"),
                    result.getString("harga")
                });
                sub_total += Integer.parseInt(result.getString("harga"));
                MenuTable.setModel(model);
            }
            SubTotalLabel.setText(String.valueOf(sub_total));
            GrandTotalLabel.setText(String.valueOf(sub_total));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new OrderDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AtasNama;
    private com.k33ptoo.components.KButton BayarButton;
    private com.k33ptoo.components.KButton CetakStrukButton;
    private javax.swing.JLabel GrandTotalLabel;
    private javax.swing.JLabel KembalianLabel;
    private javax.swing.JTable MenuTable;
    private javax.swing.JTextField NoMeja;
    private javax.swing.JLabel NoPesananLabel;
    private javax.swing.JLabel SubTotalLabel;
    private javax.swing.JTextField UangBayar;
    private javax.swing.JLabel createTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mnDashboard;
    private javax.swing.JLabel mnDashboard2;
    private javax.swing.JLabel mnDishes;
    private javax.swing.JLabel mnMeja;
    private javax.swing.ButtonGroup statusGroup;
    // End of variables declaration//GEN-END:variables
}
