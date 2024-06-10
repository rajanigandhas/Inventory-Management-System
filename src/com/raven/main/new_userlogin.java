
package com.raven.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.raven.form.databaseCon;
import com.raven.form.emp_dashboard;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.krlvm.swingacrylic.SwingAcrylic;


public class new_userlogin extends javax.swing.JFrame {
    public String enteredUsername,enteredPassword;
    String attendanceStatus;
    
    public new_userlogin() {
       
        initComponents();
         
         jPanel1.setFocusable(true);
         setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelGradiente1 = new com.raven.swing.PanelGradiente();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        Log_in = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradiente1.setColorPrimario(new java.awt.Color(244, 244, 244));
        panelGradiente1.setColorSecundario(new java.awt.Color(202, 220, 252));
        panelGradiente1.setGradiente(com.raven.swing.PanelGradiente.Gradiente.ESQUINA_4);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Login Here");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new username.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/confirm pass.png"))); // NOI18N

        username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        username.setText("Enter Username");
        username.setBorder(null);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password.setText("password");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        Log_in.setBackground(new java.awt.Color(0, 0, 0));
        Log_in.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Log_in.setForeground(new java.awt.Color(255, 255, 255));
        Log_in.setText("Log In");
        Log_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_inActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(Log_in, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(Log_in)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panelBorder1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
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
    }// </editor-fold>                        

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if(username.getText().equals("Enter Username"))
            {
               username.setText(""); 
            }
    }                                    

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        if(username.getText().equals(""))
            {
               username.setText("Enter Username"); 
               password.setEchoChar('*');
            }
    }                                  

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
       char[] password1 = password.getPassword();
                if (password1.length > 0 && new String(password1).equals("password")) {
                    password.setText(""); // Clear text
                  password.setEchoChar('*'); // Reset to password mode
                }
    }                                    

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        char[] password1 = password.getPassword();
                if (password1.length == 0) {
                    password.setEchoChar((char)0); // Display characters in plain text
                    password.setText("password");
                }
    }                                  
public String getEnteredUsername() {
    String enteredUser=username.getText();
        return enteredUser;
    }
    private void Log_inActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        enteredUsername = username.getText();
        
        char[] password1 = password.getPassword();
        String passwordString = new String(password1);
        enteredPassword = passwordString;
        check_login();
    }                                      

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    public void check_login()
    {
        try {
            
            databaseCon db=new databaseCon();
            Connection con=db.getConnection();
            String sql = "SELECT * FROM registration_info WHERE username = ? AND create_password = ?";
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, enteredUsername);
                statement.setString(2, enteredPassword);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                         JOptionPane.showMessageDialog(this, "Submitted Successfully");
                         dispose();
                         java.awt.EventQueue.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    SwingAcrylic.prepareSwing();
                                    Main frame = new Main();
                                    frame.setVisible(true);
                                    SwingAcrylic.processFrame(frame);
                                } catch (Exception ex) {
                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                        
                    } else {
                 
                        
                        sql = "SELECT * FROM emp_details WHERE name = ? AND password = ?";
                        
                        LocalTime currentTime = LocalTime.now();
                        LocalDate currentDate=LocalDate.now();
        
       
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                        String login_time = currentTime.format(formatter);
                    
                    
                        PreparedStatement statement2 = con.prepareStatement(sql);
                        statement2.setString(1, enteredUsername);
                        statement2.setString(2, enteredPassword);
                        ResultSet resultSet2 = statement2.executeQuery();
                        
                        if (resultSet2.next()) { 
                             
                            if (login_time != null && login_time.compareTo("24:00:00") <= 0) {
                                
                               JOptionPane.showMessageDialog(this, "Employee login successful");
//                               java.awt.EventQueue.invokeLater(new Runnable() {
//                            @Override
//                            public void run() {
//                                try {
//                                    SwingAcrylic.prepareSwing();
                                    emp_dashboard frame1 = new emp_dashboard();
                                    this.dispose();
                                    frame1.setVisible(true);
//                                    SwingAcrylic.processFrame(frame1);
//                                } catch (Exception ex) {
//                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                            }
//                        });
                               
                               attendanceStatus = "Present";
                               insertAttendance();

                           }
                            else{
                                 
                                attendanceStatus="Absent";
                                
                                insertAttendance();
                            }
                        }
                        else{
                         //attendanceStatus="Absent";
                         JOptionPane.showMessageDialog(this, "Invalid username or password");
                            }
                        
                    }
                    
                    
                    
                    
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(new_userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  

    public void insertAttendance(){
    
          try{
                
                databaseCon db=new databaseCon();
        
                Connection con=db.getConnection();
                Date currentDate = new Date();

        
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = dateFormat.format(currentDate);
         
         
                String checkAttendanceQuery = "SELECT COUNT(*) FROM emp_attendance WHERE name = ? AND date = ?";
                PreparedStatement checkAttendanceStmt = con.prepareStatement(checkAttendanceQuery);
                checkAttendanceStmt.setString(1, enteredUsername);
                checkAttendanceStmt.setString(2, formattedDate);
                ResultSet resultSet = checkAttendanceStmt.executeQuery();
                resultSet.next();
                int attendanceCount = resultSet.getInt(1);

                if (attendanceCount == 0) {
         
                    String q="insert into emp_attendance(name,date,status)values(?,?,?)";

                    PreparedStatement pstmt=con.prepareStatement(q);
                    pstmt.setString(1,enteredUsername);
                    pstmt.setString(2,formattedDate);
                    pstmt.setString(3,attendanceStatus);


                    pstmt.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Submitted Successfully");
                    System.out.println("Data Inserted");
                }
         
                else {
                    JOptionPane.showMessageDialog(this, "Attendance already marked for today.");
                 }
                
                 con.close();
        
            
        }catch(Exception e){
             e.printStackTrace();
        
        }
        
    }

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
            java.util.logging.Logger.getLogger(new_userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_userlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Log_in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelGradiente panelGradiente1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration                   
}
