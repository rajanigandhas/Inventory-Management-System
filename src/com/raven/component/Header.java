package com.raven.component;


import com.raven.form.MainForm;

import com.raven.form.allStocks;
import com.raven.form.databaseCon;


import com.raven.swing.PanelTransparent;
import com.raven.swing.QuantityColorCellRenderer;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Header extends PanelTransparent {
    public String formattedDate;
     private MainForm main;
    public Header() throws Exception {
     
        initComponents();
         updateLabel(jLabel1);
         getUserName();
        setTransparent(0.5f);
    }
    
    private void updateLabel(JLabel label){
     Date currentDate = new Date();

        // Format the date as a string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         formattedDate = dateFormat.format(currentDate);

        // Set the formatted date string as the text of the label
        label.setText("Date:"+formattedDate);
       
        
    }
    
    private void getUserName() throws Exception{
         databaseCon db=new databaseCon();
        
     Connection con=db.getConnection();
     Statement st=con.createStatement();
      
     
      String userNameQuery = "SELECT username FROM registration_info";
      ResultSet rs=st.executeQuery(userNameQuery);
      
       if (rs.next()) {
                // Assuming you have a label named "companyLabel" defined elsewhere
                String userName = rs.getString("username");
                lbUserName.setText(userName); // Set the company name to the label
            }
    }


    public void addMenuEvent(ActionListener event) {
        //cmdMenu.addActionListener(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMenu = new com.raven.swing.Button();
        lbUserName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(202, 220, 252));

        cmdMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N

        lbUserName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(127, 127, 127));
        lbUserName.setText("User Name");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/notification.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUserName))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        try {
           StringBuilder msg =null;
//            StringBuilder msg = nul;
            QuantityColorCellRenderer c=new QuantityColorCellRenderer();
            allStocks a=new allStocks();
              msg=new StringBuilder();
            for (int row = 0; row < a.table.getRowCount(); row++) {
            int quantity = Integer.parseInt(a.table.getValueAt(row, 1).toString());
           
              
            if (quantity < 50) {
             c.showAlertIfNeeded(a.table, row);
              for(String s:c.alertMessages){
                  String str = msg.toString();
                  if(!str.contains(s)){
                 msg.append(s).append("\n");
              }
              
              }
//               
            }
            }
           System.out.println(""+msg);
            JOptionPane.showMessageDialog(null, msg, "Alert", JOptionPane.WARNING_MESSAGE);
        
               
        } catch (Exception ex) {
            Logger.getLogger(Header.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button cmdMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbUserName;
    // End of variables declaration//GEN-END:variables
}
