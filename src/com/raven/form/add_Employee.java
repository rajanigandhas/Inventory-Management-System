
package com.raven.form;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class add_Employee extends JPanel {

    private String name,phone,email,addr,pass,date;
    public add_Employee() {
        initComponents();
        jPanel1.setFocusable(true);
        emp_password.setEchoChar((char)0);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelGradiente1 = new com.raven.model.PanelGradiente();
        panelBorder1 = new com.raven.model.PanelBorder();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        emp_name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        emp_phn = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        emp_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        emp_DOB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emp_addr = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        emp_password = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradiente1.setColorPrimario(new java.awt.Color(244, 244, 244));
        panelGradiente1.setColorSecundario(new java.awt.Color(202, 220, 252));
        panelGradiente1.setGradiente(com.raven.model.PanelGradiente.Gradiente.ESQUINA_4);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setText("Employee Registration");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new username.png"))); // NOI18N

        emp_name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emp_name.setText("Enter Employee Name");
        emp_name.setBorder(null);
        emp_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emp_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emp_nameFocusLost(evt);
            }
        });
        emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_nameActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new phone.png"))); // NOI18N

        emp_phn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emp_phn.setText("Enter Phone no.");
        emp_phn.setBorder(null);
        emp_phn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emp_phnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emp_phnFocusLost(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new email.png"))); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        emp_email.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emp_email.setText("Enter Email Id");
        emp_email.setBorder(null);
        emp_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emp_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emp_emailFocusLost(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/calender.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        emp_DOB.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emp_DOB.setText("DD / MM / YYYY");
        emp_DOB.setBorder(null);
        emp_DOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emp_DOBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emp_DOBFocusLost(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new address.png"))); // NOI18N
        jLabel6.setText("jLabel5");

        emp_addr.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emp_addr.setText("Enter Address");
        emp_addr.setBorder(null);
        emp_addr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emp_addrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emp_addrFocusLost(evt);
            }
        });
        emp_addr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_addrActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/confirm pass.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        emp_password.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emp_password.setText("Create new password for employee");
        emp_password.setBorder(null);
        emp_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emp_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emp_passwordFocusLost(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(emp_email, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(emp_name, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(emp_phn)
                            .addComponent(emp_DOB)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator6)
                                .addComponent(emp_addr, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                                .addComponent(emp_password, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emp_phn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(emp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emp_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emp_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emp_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

//        pack();
//        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void emp_passwordFocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if (String.valueOf(emp_password.getPassword()).equals("Create new password for employee")) {
                    emp_password.setText("");
                    emp_password.setForeground(Color.BLACK);
                    emp_password.setEchoChar(' '); // Set the echo character to '' for password input
                }
    }                                        

    private void emp_passwordFocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if (String.valueOf(emp_password.getPassword()).isEmpty()) {
                    emp_password.setForeground(Color.GRAY);
                    emp_password.setText("Create new password for employee");
                    emp_password.setEchoChar((char)0); // Display characters instead of dots
                }
    }                                      

    private void emp_nameFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
         if(emp_name.getText().equals("Enter Employee Name"))
            {
               emp_name.setText(""); 
            }
    }                                    

    private void emp_nameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void emp_nameFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        if(emp_name.getText().equals(""))
            {
               emp_name.setText("Enter Employee Name"); 
            }
    }                                  

    private void emp_phnFocusGained(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
         if(emp_phn.getText().equals("Enter Phone no."))
            {
               emp_phn.setText(""); 
            }
    }                                   

    private void emp_phnFocusLost(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        if(emp_phn.getText().equals(""))
            {
               emp_phn.setText("Enter Phone no."); 
            }
    }                                 

    private void emp_emailFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        if(emp_email.getText().equals("Enter Email Id"))
            {
               emp_email.setText(""); 
            }
    }                                     

    private void emp_emailFocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(emp_email.getText().equals(""))
            {
               emp_email.setText("Enter Email Id"); 
            }
    }                                   

    private void emp_DOBFocusGained(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(emp_DOB.getText().equals("DD / MM / YYYY"))
            {
               emp_DOB.setText(""); 
            }
    }                                   

    private void emp_DOBFocusLost(java.awt.event.FocusEvent evt) {                                  
        // TODO add your handling code here:
        if(emp_DOB.getText().equals(""))
            {
               emp_DOB.setText("DD / MM / YYYY"); 
            }
    }                                 

    private void emp_addrFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if(emp_addr.getText().equals("Enter Address"))
            {
               emp_addr.setText(""); 
            }
    }                                    

    private void emp_addrActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void emp_addrFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        if(emp_addr.getText().equals(""))
            {
               emp_addr.setText("Enter Address"); 
            }
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        name=emp_name.getText();
        phone=emp_phn.getText();
        email=emp_email.getText();
        addr=emp_addr.getText();
        char[] passwordChars = emp_password.getPassword();
        pass=new String(passwordChars);
        date=emp_DOB.getText();
        insertData();
        } 
    
     public void insertData(){
    
        try{
                
                databaseCon db=new databaseCon();
        
                Connection con=db.getConnection();
                
                String q="insert into emp_details(name,phone,email,dob,address,password)values(?,?,?,?,?,?)";
                
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,name);
                pstmt.setString(2,phone);
                pstmt.setString(3,email);
                pstmt.setString(4,date);
                pstmt.setString(5,addr);
                pstmt.setString(6,pass);
               
               pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Submitted Successfully");
                 System.out.println("Data Inserted");
                 con.close();
        
            
        }catch(Exception e){
             e.printStackTrace();
        
        }
   }


    // Variables declaration - do not modify                     
    private javax.swing.JTextField emp_DOB;
    private javax.swing.JTextField emp_addr;
    private javax.swing.JTextField emp_email;
    private javax.swing.JTextField emp_name;
    private javax.swing.JPasswordField emp_password;
    private javax.swing.JTextField emp_phn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private com.raven.model.PanelBorder panelBorder1;
    private com.raven.model.PanelGradiente panelGradiente1;
    // End of variables declaration                   
}