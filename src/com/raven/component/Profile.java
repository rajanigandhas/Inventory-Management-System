package com.raven.component;

import com.raven.form.databaseCon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Profile extends javax.swing.JPanel {

    public Profile() {
        initComponents();
        setOpaque(false);
        try {
            getCompanyName();
        } catch (Exception ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
                jLabel1.setText(companyName); // Set the company name to the label
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logo.png"))); // NOI18N
        jLabel1.setText(" Inventory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
