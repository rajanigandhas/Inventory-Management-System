/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.main;

import com.raven.form.databaseCon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */

 class otp_verify extends javax.swing.JFrame {

    private String expectedOTP, user_name, Phone_no, email_id, company_name, company_address, password;
    
    
    public otp_verify(String expectedOTP,String user_name,String Phone_no,String email_id,String company_name,String company_address,String password) {
        this.expectedOTP = expectedOTP;
        this.user_name=user_name;
        this.Phone_no=Phone_no;
        this.email_id=email_id;
        this.company_name=company_name;
        this.company_address=company_address;
        this.password=password;
        
                
//         

        panelGradiente1 = new com.raven.swing.PanelGradiente();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        otpField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        verifyButton = new javax.swing.JButton();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setSize(100, 100);
        panelGradiente1.setColorPrimario(new java.awt.Color(244, 244, 244));
        panelGradiente1.setColorSecundario(new java.awt.Color(202, 220, 252));
        panelGradiente1.setGradiente(com.raven.swing.PanelGradiente.Gradiente.ESQUINA_4);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel1.setText("OTP Verification");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/confirm pass.png"))); // NOI18N

        otpField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        otpField.setText("Enter OTP");
        otpField.setBorder(null);
        otpField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                otpFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                otpFieldFocusLost(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        verifyButton.setBackground(new java.awt.Color(0, 0, 0));
        verifyButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        verifyButton.setForeground(new java.awt.Color(255, 255, 255));
        verifyButton.setText("Verify");
        verifyButton.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otpField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(verifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(otpField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(verifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panelBorder1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        verifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handleVerifyButton();
                } catch (Exception ex) {
                    Logger.getLogger(otp_verify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }// </editor-fold>                        

                                        

    private void otpFieldFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if(otpField.getText().equals("Enter OTP"))
            {
               otpField.setText(""); 
            }
    }                                    

    private void otpFieldFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        if(otpField.getText().equals(""))
            {
               otpField.setText("Enter OTP"); 
            }
    }
    private  void insert(String user_name,String Phone_no,String email_id,String company_name,String company_address,String password ){
      try{
//                String status="free";
                Date currentDate = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = dateFormat.format(currentDate);
                
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(currentDate);
                calendar.add(Calendar.MONTH, 1);
                java.util.Date expirationDate = calendar.getTime();
                
                databaseCon db=new databaseCon();
                Connection con=db.getConnection();
                
                String q="insert into registration_info(username,Phone_no,email_id,company_name,company_address,create_password,date)values(?,?,?,?,?,?,?)";
                
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,user_name);
                pstmt.setString(2,Phone_no);
                pstmt.setString(3,email_id);
                

                pstmt.setString(4,company_name);
                pstmt.setString(5,company_address);
                pstmt.setString(6,password);
                pstmt.setString(7,formattedDate);
//                pstmt.setDate(8, new java.sql.Date(expirationDate.getTime()));
//                pstmt.setString(9,status);
               pstmt.executeUpdate();
               
                JOptionPane.showMessageDialog(this, "Submitted insert function");
                 System.out.println("Data Inserted");
                 con.close();
        
            
        }catch(Exception e){
             e.printStackTrace();
        
        }
    }
    private static boolean isMonthlyExpirationDateSet() throws Exception {
    try {
        databaseCon db = new databaseCon();
        Connection con = db.getConnection();

        // Check if the monthly expiration date is already set
        String query = "SELECT COUNT(*) FROM registration_info WHERE expire_date IS NOT NULL";
        PreparedStatement pstmt = con.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }

        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}
    private static void setInitialMonthlyExpirationDate() throws Exception {
    try {
        databaseCon db = new databaseCon();
        Connection con = db.getConnection();

        // Calculate initial monthly expiration date (e.g., one month from current date)
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1); // Add 1 month
        Date expirationDate = cal.getTime();

        // Update the monthly expiration date for all registered users
        String updateQuery = "UPDATE registration_info SET expire_date = ?";
        PreparedStatement pstmt = con.prepareStatement(updateQuery);
        pstmt.setDate(1, new java.sql.Date(expirationDate.getTime()));
        pstmt.executeUpdate();

        con.close();

        System.out.println("Initial monthly expiration date set successfully.");
    } catch (SQLException e) {
        e.printStackTrace();
        throw new Exception("Failed to set initial monthly expiration date.");
    }
}
     private static void update_registartion(String user_name,String Phone_no,String email_id,String company_name,String company_address,String password ) throws Exception {
    try {
        databaseCon db = new databaseCon();
        Connection con = db.getConnection();


        // Update the monthly expiration date for all registered users
        String updateQuery = "UPDATE registration_info SET username = ?,Phone_no = ? , email_id= ? , company_name = ?, company_address= ?,create_password=?";
        
        PreparedStatement pstmt = con.prepareStatement(updateQuery);
                pstmt.setString(1,user_name);
                pstmt.setString(2,Phone_no);
                pstmt.setString(3,email_id);
                

                pstmt.setString(4,company_name);
                pstmt.setString(5,company_address);
                pstmt.setString(6,password);
        pstmt.executeUpdate();

        con.close();

        System.out.println("successfully.");
    } catch (SQLException e) {
        e.printStackTrace();
        throw new Exception("Failedm");
    }
}
    
     private void handleVerifyButton() throws Exception {
        String enteredOTP = otpField.getText();
        if (enteredOTP.equals(expectedOTP)) {
            
//            new_register new_r=new new_register();
//            boolean registered = new_r.isRegistered();
//                if(!registered){
                    insert(user_name, Phone_no, email_id, company_name, company_address, password);
//                }else{                
//                    update_registartion(user_name, Phone_no, email_id, company_name, company_address, password);
//                 }
            
            
             if (!isMonthlyExpirationDateSet()) {
            // Set the monthly expiration date if it's not already set
                setInitialMonthlyExpirationDate();
            }
//            setMonthlyExpirationDate();
//            new_register n= new new_register();
//            
//            n.insertData();
//            JOptionPane.showMessageDialog(this, "OTP Verified Successfully!");
            // TODO: Add your logic after successful OTP verification
            // For example, open another frame or perform some action
            this.dispose(); // Close the verification frame
           new_userlogin login=new new_userlogin();
                login.setVisible(true);
           
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect OTP. Please try again.");
        }
    }
  

    // Variables declaration - do not modify                     
 private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField otpField;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelGradiente panelGradiente1;
    private javax.swing.JButton verifyButton;
    // End of variables declaration                   
}



