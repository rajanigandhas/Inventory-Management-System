/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.main.new_userlogin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 
 * @author rbsal
 *//**
 *
 * @author rbsal
 */
public class emp_dashboard extends javax.swing.JFrame {


    
    public emp_dashboard() throws Exception {

        
//        new_userlogin login = new new_userlogin();
//        String username = login.getEnteredUsername();
//         if (username != null && !username.isEmpty()) {
//            username_label.setText(username);
//        }
        
        initComponents();
        getCompanyName();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
         updateDateLabel(date);
         Timer timer = new Timer(1000, e -> updateDateLabel(date));
         timer.start();
         openInvoice();
        
    }
    
    private void getCompanyName() throws Exception{
    databaseCon db=new databaseCon();
        
     Connection con=db.getConnection();
     Statement st=con.createStatement();
      
     
      String companyNameQuery = "SELECT company_name FROM registration_info";
      ResultSet rs=st.executeQuery(companyNameQuery);
      
       if (rs.next()) {
                // Assuming you have a label named "companyLabel" defined elsewhere
                String companyName = rs.getString("company_name");
                jLabel4.setText(companyName); // Set the company name to the label
            }
    }
    
    public void openInvoice() throws Exception{
//    create_invoice menu1= new create_invoice(jDesktopPane1, jDesktopPane1.getSize());
     emp_bill menu1= new emp_bill(jDesktopPane1, jDesktopPane1.getSize());
      jDesktopPane1.add(menu1);
      try {
            menu1.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
        menu1.setVisible(true); 
    }

   private static void updateDateLabel(JLabel label) {
        // Get the current system date
        Date currentDate = new Date();

        // Format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(currentDate);

        // Set the formatted date to the label
        label.setText("Date: " + formattedDate);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        username_label = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panelGradiente1 = new com.raven.model.PanelGradiente();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menu1 = new javax.swing.JLabel();
        menu2 = new javax.swing.JLabel();
        menu3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(202, 220, 252));

        username_label.setBackground(new java.awt.Color(153, 153, 153));
        username_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        date.setBackground(new java.awt.Color(204, 204, 204));
        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setText("Date :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                .addComponent(username_label)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(723, 515));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelGradiente1.setForeground(new java.awt.Color(255, 255, 255));
        panelGradiente1.setColorPrimario(new java.awt.Color(28, 181, 224));
        panelGradiente1.setColorSecundario(new java.awt.Color(0, 0, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Collab Vision Infosolution");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Powered By");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/dashboard.png")));
        jLabel2.setText("Dashboard");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        menu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menu1.setForeground(new java.awt.Color(255, 255, 255));
        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/3.png")));
        menu1.setText("Create Invoice");
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
        });

        menu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menu2.setForeground(new java.awt.Color(255, 255, 255));
        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/3.png")));
        menu2.setText("Stock Details");
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2MouseClicked(evt);
            }
        });

        menu3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menu3.setForeground(new java.awt.Color(255, 255, 255));
        menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/3.png")));
        menu3.setText("Pending Bills");
        menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu3MouseClicked(evt);
            }
        });

        panelGradiente1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(menu1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(menu2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(menu3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addGroup(panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGradiente1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGradiente1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menu3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
        emp_bill menu1;
        try {
            menu1 = new emp_bill(jDesktopPane1, jDesktopPane1.getSize());
             jDesktopPane1.removeAll();
                jDesktopPane1.add(menu1).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(emp_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
       
  
    }//GEN-LAST:event_menu1MouseClicked

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
                             
//    stock_remains menu2 = new stock_remains(jDesktopPane1, jDesktopPane1.getSize());
//emp_stocks menu2= new emp_stocks();
allStocks menu2;
        try {
            menu2 = new allStocks();
            JInternalFrame internalFrame = new JInternalFrame("menu2", true, true, true, true);
            internalFrame.getContentPane().add(menu2);
            internalFrame.setSize(jDesktopPane1.getSize());
            jDesktopPane1.removeAll();
            internalFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
            BasicInternalFrameUI ui =(BasicInternalFrameUI)internalFrame.getUI();
            ui.setNorthPane(null);
            internalFrame.setVisible(true);
            
            jDesktopPane1.add(internalFrame);
            } catch (Exception ex) {
                Logger.getLogger(emp_dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }

        // Create internal frame to contain the panel
       



//    jDesktopPane1.removeAll();
//    jDesktopPane1.add(menu2).setVisible(true);
    }//GEN-LAST:event_menu2MouseClicked

    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        // TODO add your handling code here:
        pending_customer_billlist menu3;
        try {
            menu3 = new pending_customer_billlist();
            JInternalFrame internalFrame = new JInternalFrame("menu3", true, true, true, true);
            internalFrame.getContentPane().add(menu3);
            internalFrame.setSize(jDesktopPane1.getSize());
            jDesktopPane1.removeAll();
            internalFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
            BasicInternalFrameUI ui =(BasicInternalFrameUI)internalFrame.getUI();
            ui.setNorthPane(null);
            internalFrame.setVisible(true);
            jDesktopPane1.add(internalFrame);
            } catch (Exception ex) {
                Logger.getLogger(emp_dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_menu3MouseClicked

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
            java.util.logging.Logger.getLogger(emp_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new emp_dashboard() .setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(emp_dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel menu2;
    private javax.swing.JLabel menu3;
    private com.raven.model.PanelGradiente panelGradiente1;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
