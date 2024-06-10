/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import com.raven.form.databaseCon;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.SwingUtilities;

/**
 *
 * @author rbsal
 */
public class new_register extends javax.swing.JFrame {
    
    private String generatedOTP;
    private String  user_name,Phone_no,email_id,company_name,company_address,password;
    public new_register() {
        initComponents();
        jPanel1.setFocusable(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        
        new_pass.setText("Create password");
        new_pass.setEchoChar((char) 0);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        comp_addr = new javax.swing.JTextArea();
        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        phone_no = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        emailField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        comp_name = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        confirm_pass = new javax.swing.JPasswordField();
        
//        new_pass = new javax.swing.JTextField();
        new_pass = new javax.swing.JPasswordField();
        
        jSeparator5 = new javax.swing.JSeparator();
        valid_username = new javax.swing.JLabel();
        valid_phn = new javax.swing.JLabel();
        valid_email = new javax.swing.JLabel();
        valid_comp_name = new javax.swing.JLabel();
        valid_addr = new javax.swing.JLabel();
        valid_pass = new javax.swing.JLabel();
        valid_pass2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradiente1.setColorPrimario(new java.awt.Color(244, 244, 244));
        panelGradiente1.setColorSecundario(new java.awt.Color(202, 220, 252));
        panelGradiente1.setGradiente(com.raven.swing.PanelGradiente.Gradiente.ESQUINA_4);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabel1.setText("CREATE ACCOUNT");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new username.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new phone.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new email.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/building.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new address.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/new lock.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/confirm pass.png"))); // NOI18N

        signin.setBackground(new java.awt.Color(0, 0, 0));
        signin.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });

        comp_addr.setColumns(20);
        comp_addr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comp_addr.setRows(5);
        comp_addr.setText("Enter Your Company Address");
        comp_addr.setBorder(null);
        comp_addr.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        comp_addr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comp_addrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                comp_addrFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(comp_addr);

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 30));

        phone_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone_no.setText("Enter Phone Number");
        phone_no.setBorder(null);
        phone_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phone_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phone_noFocusLost(evt);
            }
        });
        phone_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_noActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 30));

        emailField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailField.setText("Enter Email ID");
        emailField.setBorder(null);
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setMinimumSize(new java.awt.Dimension(50, 30));

        comp_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comp_name.setText("Enter Company Name");
        comp_name.setBorder(null);
        comp_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comp_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                comp_nameFocusLost(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setMinimumSize(new java.awt.Dimension(50, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setMinimumSize(new java.awt.Dimension(50, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setMinimumSize(new java.awt.Dimension(50, 30));

        confirm_pass.setText("Enter password");
        confirm_pass.setBorder(null);
        confirm_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirm_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirm_passFocusLost(evt);
            }
        });

        new_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        new_pass.setText("Create Password");
        new_pass.setBorder(null);
        new_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                new_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_passFocusLost(evt);
            }
        });
        

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        valid_username.setBackground(new java.awt.Color(204, 0, 0));
        valid_username.setForeground(new java.awt.Color(204, 0, 0));

        valid_phn.setBackground(new java.awt.Color(204, 0, 0));
        valid_phn.setForeground(new java.awt.Color(204, 0, 0));

        valid_email.setForeground(new java.awt.Color(204, 0, 0));

        valid_comp_name.setForeground(new java.awt.Color(204, 0, 0));

        valid_addr.setForeground(new java.awt.Color(204, 0, 0));

        valid_pass.setForeground(new java.awt.Color(204, 0, 0));

        valid_pass2.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valid_email, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(valid_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                            .addComponent(phone_no)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(confirm_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(valid_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(valid_comp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(comp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(valid_phn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valid_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                        .addComponent(valid_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 64, Short.MAX_VALUE))))
            .addComponent(jSeparator5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(154, 154, 154))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(phone_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valid_phn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valid_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valid_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valid_comp_name)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(valid_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(confirm_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valid_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valid_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(signin)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
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
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
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

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
//        user_name = username.getText();
//        Phone_no = phone_no.getText();
//        email_id = emailField.getText();
//        company_name = comp_name.getText();
//        company_address = comp_addr.getText();
//        password  = new_pass.getText();
        
//        insertData();
        handleNextButton();
    }                                      

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void phone_noActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        
    
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
            }
         if(username.getText().equals("") || username.getText().equals("Enter Username")) {
        // If empty or contains placeholder text, show error message
        valid_username.setText("Please enter a username");
    } else {
        // Otherwise, clear the error message
        valid_username.setText("");
         }

    }                                  

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
         if(emailField.getText().equals("Enter Email ID"))
            {
               emailField.setText(""); 
            }
        
    }                                      

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if(emailField.getText().equals(""))
            {
               emailField.setText("Enter Email ID"); 
            }
        String email = emailField.getText().trim();
    if(email.equals("") || email.equals("Enter Email")) {
        // If empty or contains placeholder text, show error message
        valid_email.setText("Please enter an email address");
    } else {
        // Otherwise, clear the error message
        valid_email.setText("");
        // Now you can add further validation logic for email, if needed
        // For example, you can check if the email is in the correct format
        if (!email.matches("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}")) {
            valid_email.setText("Please enter a valid email address");
        } else {
            valid_email.setText("");
        }
    }
    }                                    

    private void phone_noFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        if(phone_no.getText().equals("Enter Phone Number"))
            {
               phone_no.setText(""); 
            }
       
    }                                    

    private void phone_noFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        if(phone_no.getText().equals(""))
            {
               phone_no.setText("Enter Phone Number"); 
            }
        String phoneNumberText = phone_no.getText().trim();
    if(phoneNumberText.equals("") || phoneNumberText.equals("Enter Phone Number")) {
        // If empty or contains placeholder text, show error message
        valid_phn.setText("Please enter a phone number");
    } else {
        // Otherwise, clear the error message
        valid_phn.setText("");
        // Now you can convert the phone number text to an integer and check its length
        try {
            long phoneNumber = Long.parseLong(phoneNumberText);
            if (String.valueOf(phoneNumber).length() != 10) {
                // If phone number is not 10 digits, show error message
                valid_phn.setText("Please enter 10-digit phone number");
            }
        } catch (NumberFormatException ex) {
            // If phone number cannot be parsed as a long, show error message
            valid_phn.setText("Please enter a valid phone number");
        }
    }
    }                                  

    private void comp_nameFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
       if(comp_name.getText().equals("Enter Company Name"))
            {
               comp_name.setText(""); 
            } 
    }                                     

    private void comp_nameFocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(comp_name.getText().equals(""))
            {
               comp_name.setText("Enter Company Name"); 
            }
        if(comp_name.getText().equals("") || comp_name.getText().equals("Enter Company Name")) {
        // If empty or contains placeholder text, show error message
        valid_comp_name.setText("Please enter company Name");
        } else {
        // Otherwise, clear the error message
            valid_comp_name.setText("");
         }
    }                                   

    private void comp_addrFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        if(comp_addr.getText().equals("Enter Your Company Address"))
            {
               comp_addr.setText(""); 
            }
         
    }                                     

    private void comp_addrFocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(comp_addr.getText().equals(""))
            {
               comp_addr.setText("Enter Your Company Address"); 
            }
        if(comp_addr.getText().equals("") || comp_addr.getText().equals("Enter Your Company Address")) {
        // If empty or contains placeholder text, show error message
        valid_addr.setText("Please enter a Company Address");
        } else {
        // Otherwise, clear the error message
            valid_addr.setText("");
         }
    }                                   

//    private void new_passFocusGained(java.awt.event.FocusEvent evt) {                                     
//        // TODO add your handling code here:
//        if(new_pass.getText().equals("Create Password"))
//            {
//               new_pass.setText(""); 
//               confirm_pass.setEchoChar('*');
//            }
//    }                                    
//
//    private void new_passActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
//    }                                        
//
//    private void new_passFocusLost(java.awt.event.FocusEvent evt) {                                   
//        // TODO add your handling code here:
//        if(new_pass.getText().equals(""))
//            {
//               new_pass.setText("Create Password"); 
//            }
//        
//        if(new_pass.getText().isEmpty() || new_pass.getText().equals("Create Password")) {
//        // If empty or contains placeholder text, show error message
//        valid_addr.setText("Please enter a Password");
//        } else {
//        // Otherwise, clear the error message
//            valid_addr.setText("");
//         }
//    } 
    private void new_passFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
         char[] password = new_pass.getPassword();
                if (password.length > 0 && new String(password).equals("Create password")) {
                    new_pass.setText(""); // Clear text
                    new_pass.setEchoChar('*'); // Reset to password mode
                }
    }                                    

    private void new_passFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
        char[] password = new_pass.getPassword();
                if (password.length == 0) {
                    new_pass.setEchoChar((char)0); // Display characters in plain text
                    new_pass.setText("Create password");
        String confirmPasswordText;
        confirmPasswordText = new String(password).trim();
        if (confirmPasswordText.isEmpty() || confirmPasswordText.equals("Create password")) {
        // If empty or contains placeholder text, show error message
        valid_pass.setText("Please Enter your password");
    } else {
        // Otherwise, clear the error message
        valid_pass.setText("");
        // Now you can add further validation logic for confirmed password, if needed
        }    
                }
    } 
    

    private void confirm_passFocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        char[] password = confirm_pass.getPassword();
                if (password.length > 0 && new String(password).equals("Enter password")) {
                    confirm_pass.setText(""); // Clear text
                    confirm_pass.setEchoChar('*'); // Reset to password mode
                }
    }                                        

    private void confirm_passFocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        char[] password = confirm_pass.getPassword();
                if (password.length == 0) {
                    confirm_pass.setEchoChar((char)0); // Display characters in plain text
                    confirm_pass.setText("Enter password");
        String confirmPasswordText;
        confirmPasswordText = new String(password).trim();
        if (confirmPasswordText.isEmpty() || confirmPasswordText.equals("Enter password")) {
        // If empty or contains placeholder text, show error message
        valid_pass2.setText("Please confirm your password");
    } else {
        // Otherwise, clear the error message
        valid_pass2.setText("");
        // Now you can add further validation logic for confirmed password, if needed
        }    
                }
    }                                      
    
   
    
    
// method for calling generate otp
    
    private void handleNextButton() {
        String username1 = username.getText().trim();
        String phoneNumber = phone_no.getText().trim();
        String email = emailField.getText().trim();
        String companyName = comp_name.getText().trim();
        String address = comp_addr.getText().trim();
        
//        String password1 = new String(new_pass.getText()).trim();
        String password1 = new String(new_pass.getPassword()).trim();
        
        String Password2 = new String(confirm_pass.getPassword()).trim();
    
    // Check if any of the required fields are empty
    if (username1.isEmpty() || username1.equals("Enter Username") ||
        phoneNumber.isEmpty() || phoneNumber.equals("Enter Phone Number") ||
        email.isEmpty() || email.equals("Enter Email") ||
        companyName.isEmpty() || companyName.equals("Enter Company Name") ||
        address.isEmpty() || address.equals("Enter Your Company Address") ||
        password1.isEmpty() || password1.equals("Create Password") ||
        Password2.isEmpty() || Password2.equals("Enter password")) {
        // If any required field is empty, display an error message
        JOptionPane.showMessageDialog(this,"Please fill in all required fields");
    } else if (!password1.equals(Password2)) {
        // If passwords don't match, display an error message
        valid_pass2.setText("Passwords do not match");
    } else {
        // If all fields are filled and passwords match, clear the error message and proceed with sign-in logic
        valid_pass2.setText("");
//        insertData();
         generatedOTP = generateOTP(6);

        // Send the generatedOTP to the email
        sendOTPEmail(email,"salokherajanigandha@gmail.com" ,generatedOTP);
        
         user_name = username.getText();
        Phone_no = phone_no.getText();
        email_id = emailField.getText();
        company_name = comp_name.getText();
        company_address = comp_addr.getText();
        password  = new_pass.getText();
        // Open the OTP verification frame
        otp_verify verify = new otp_verify(generatedOTP,user_name,Phone_no,email_id,company_name,company_address,password);
        verify.setVisible(true);
        this.dispose(); // Close the current frame
        // Add your sign-in logic here, e.g., authenticate user, navigate to next screen, etc.
    }
        
//        String email = emailField.getText();
//        if (email.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Please enter an email address.");
//            return;
//        }
        
        
        
        if (!password1.equals(Password2)) {
        // If passwords don't match, display an error message
        valid_pass2.setText("Passwords do not match");
    } else {
        // If passwords match, clear the error message and proceed with sign-in logic
        valid_pass2.setText("");
       
        // Add your sign-in logic here, e.g., authenticate user, navigate to next screen, etc.
    }
         
    }
//method that send otp to mail
   private void sendOTPEmail(String fromEmail,String toEmail, String otp) {
        // Replace with your email and password
//        String fromEmail = "salokherajanigandha@gmail.com";
//        String passsword = "vprj wwmm ndgd irbv";
        String password = "sfzr odfj afzw nwqi";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Your OTP");
            message.setText("Hello, your OTP is " + otp);

            Transport.send(message);
            Transport t = session.getTransport("smtp");
            t.connect(fromEmail, password);
            t.sendMessage(message, message.getAllRecipients());
            t.close();

            JOptionPane.showMessageDialog(this, "OTP sent to the email address");
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(this, "Error sending email: " + e.getMessage());
        }
    }



    private String generateOTP(int length) {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            otp.append(random.nextInt(10));
        }
        return otp.toString();
    }
    
    
    
//    public void insertData(){
//        
//    
//        try{
//                
//                databaseCon db=new databaseCon();
//        
//                Connection con=db.getConnection();
//                
//                String q="insert into registration_info(username,Phone_no,email_id,company_name,company_address,create_password)values(?,?,?,?,?,?)";
//                
//                PreparedStatement pstmt=con.prepareStatement(q);
//                pstmt.setString(1,user_name);
//                pstmt.setString(2,Phone_no);
//                pstmt.setString(3,email_id);
//                
//
//                pstmt.setString(4,company_name);
//                pstmt.setString(5,company_address);
//                pstmt.setString(6,password);
//               pstmt.executeUpdate();
//               
//                JOptionPane.showMessageDialog(this, "Submitted insert function");
//                 System.out.println("Data Inserted");
//                 con.close();
//        
//            
//        }catch(Exception e){
//             e.printStackTrace();
//        
//        }
//    }
      public static boolean isRegistered() throws Exception {
        try{
             databaseCon db=new databaseCon();
        
               Connection con=db.getConnection();
            String query = "SELECT COUNT(*) FROM registration_info";
            try (PreparedStatement statement = con.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
       
   private static boolean isSubscriptionValid() throws Exception {
    try {
        databaseCon db = new databaseCon();
        Connection con = db.getConnection();

        String query = "SELECT expire_date FROM registration_info";
        PreparedStatement pstmt = con.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            Object expireDateObj = rs.getObject("expire_date");
            if (expireDateObj instanceof Date) {
                
            Date expirationDate = rs.getDate("expire_date");
            Date currentDate = new Date(); // Current date

            // Check if the subscription has expired
            if (currentDate.after(expirationDate)) {
                // Subscription has expired
                System.out.println("Monthly subscription has expired.");

                // Automatically apply a 1-year subscription for subsequent registrations
                applyOneYearSubscription(); // Apply 1-year subscription

                deleteRecord(); // Delete the expired subscription record

                con.close();
                return false;
            }

            con.close();
            return true; // Subscription is still valid
        }
        }else {
            // No subscription data found
            System.out.println("No subscription data found.");

            con.close();
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
        return false;
        
}

   private static void applyOneYearSubscription() throws SQLException, Exception {
    try {
        databaseCon db = new databaseCon();
        Connection con = db.getConnection();
        // Calculate one year from the current date
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1); // Add 1 year
        Date oneYearLater = cal.getTime();

        // Update the subscription expiry date for subsequent registrations
        String updateQuery = "UPDATE registration_info SET expire_date = ? ";
        PreparedStatement pstmt = con.prepareStatement(updateQuery);
        pstmt.setDate(1, new java.sql.Date(oneYearLater.getTime()));
        pstmt.executeUpdate();
        

        System.out.println("Applied 1-year subscription for subsequent registrations.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
   
   private static boolean isYearlySubscriptionValid() throws SQLException, Exception {
    databaseCon db = new databaseCon();
    Connection con = db.getConnection();

    String query = "SELECT expire_date FROM registration_info";
    PreparedStatement pstmt = con.prepareStatement(query);

    ResultSet rs = pstmt.executeQuery();
    
   if (rs.next()) {
            Object expireDateObj = rs.getObject("expire_date");
            if (expireDateObj instanceof Date) {
                
            Date yearlyExpirationDate = rs.getDate("expire_date");
            Date currentDate = new Date(); // Current date

        // Check if the current date is before the yearly expiration date
        if (currentDate.after(yearlyExpirationDate)) {
                // Subscription has expired
                System.out.println("yearly subscription has expired.");

                // Automatically apply a 1-year subscription for subsequent registrations
                applyOneYearSubscription(); // Apply 1-year subscription

//                deleteRecord(); // Delete the expired subscription record

                con.close();
                return false;
            }

            con.close();
            return true; // Subscription is still valid
    } 
}else {
        System.out.println("No yearly subscription data found for the user.");
        con.close();
        return false;
    }
        return false;
}


  
   private static void deleteRecord() throws Exception {
    try {
        databaseCon db = new databaseCon();
        Connection con = db.getConnection();
        
        // Construct the SQL DELETE statement
        String query = "DELETE FROM registration_info ";
        PreparedStatement pstmt = con.prepareStatement(query);
        
        // Set your condition for deleting the row. For example, if you want to delete by ID:
        // pstmt.setInt(1, id); // Assuming there's a column like ID that uniquely identifies the row
        
        int rowsDeleted = pstmt.executeUpdate();
        
        if (rowsDeleted > 0) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("Failed to delete record.");
        }
        
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

//       private static void createAndShowGUI() throws Exception {
//                     
//           
//           
//           
//        try {
//        if (!isRegistered()) {
//            // If not registered, open registration form
//            new new_register().setVisible(true);
//        } else {
//            // If registered, check subscription validity
//            if (isSubscriptionValid()) {
//                // If subscription is valid, open login form
//                System.out.print("free subscription");
//                new new_userlogin().setVisible(true);
//            } else {
//                // If subscription has expired, open registration form again
//                deleteRecord();
//                new new_register().setVisible(true);
//            }
//        }
//    } catch (Exception ex) {
//        Logger.getLogger(new_register.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    }
   
   
     private static void createAndShowGUI() throws Exception {
    try {
        if (!isRegistered()) {
            // If not registered, open registration form
            new_register registrationForm = new new_register();
            registrationForm.setVisible(true);

            // After registration, check subscription validity
            if (isSubscriptionValid()) {
                // If subscription is valid, open login form
                System.out.println("Monthly subscription is valid. Opening login form...");
               SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new new_userlogin().setVisible(true);
            }
        });
            } else {
                // If subscription has expired, prompt user to renew subscription
                System.out.println("Monthly subscription has expired. Please renew subscription.");
                registrationForm.setVisible(true); // Display registration form for renewal
            }
        } else {
            // User is already registered, check subscription validity
            if (isSubscriptionValid()) {
                // If subscription is valid, open login form
                System.out.println("Monthly subscription is valid. Opening login form...");
                new new_userlogin().setVisible(true);
            } 
            else {
                
                if(isYearlySubscriptionValid()){
                    System.out.println("Monthly subscription has expired. Automatically applying 1-year subscription.");
                applyOneYearSubscription();

                // Open registration form for subsequent registrations
                new_register registrationForm = new new_register();
                registrationForm.setVisible(true);   
                     
                 
                }
                else{
                   System.out.println("yerly subscription is valid. Opening login form...");
                new new_userlogin().setVisible(true);
                }
                // If subscription has expired, apply 1-year subscription for subsequent registrations
                
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

      public static void main(String args[]) {
          
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try { 
                    createAndShowGUI();

                } catch (Exception ex) {
                    Logger.getLogger(new_register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea comp_addr;
    private javax.swing.JTextField comp_name;
    private javax.swing.JPasswordField confirm_pass;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    
//    private javax.swing.JTextField new_pass;
    private javax.swing.JPasswordField new_pass;
    
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelGradiente panelGradiente1;
    private javax.swing.JTextField phone_no;
    private javax.swing.JButton signin;
    private javax.swing.JTextField username;
    private javax.swing.JLabel valid_addr;
    private javax.swing.JLabel valid_comp_name;
    private javax.swing.JLabel valid_email;
    private javax.swing.JLabel valid_pass;
    private javax.swing.JLabel valid_pass2;
    private javax.swing.JLabel valid_phn;
    private javax.swing.JLabel valid_username;
    // End of variables declaration                   
}

//
// class otp_verify extends javax.swing.JFrame {
//
//    private String expectedOTP, user_name, Phone_no, email_id, company_name, company_address, password;
//    
//    
//    public otp_verify(String expectedOTP,String user_name,String Phone_no,String email_id,String company_name,String company_address,String password) {
//        this.expectedOTP = expectedOTP;
//        this.user_name=user_name;
//        this.Phone_no=Phone_no;
//        this.email_id=email_id;
//        this.company_name=company_name;
//        this.company_address=company_address;
//        this.password=password;
//        
//                
////         
//
//        panelGradiente1 = new com.raven.swing.PanelGradiente();
//        panelBorder1 = new com.raven.swing.PanelBorder();
//        jPanel1 = new javax.swing.JPanel();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        otpField = new javax.swing.JTextField();
//        jSeparator1 = new javax.swing.JSeparator();
//        verifyButton = new javax.swing.JButton();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        
//        panelGradiente1.setColorPrimario(new java.awt.Color(244, 244, 244));
//        panelGradiente1.setColorSecundario(new java.awt.Color(202, 220, 252));
//        panelGradiente1.setGradiente(com.raven.swing.PanelGradiente.Gradiente.ESQUINA_4);
//
//        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
//
//        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
//
//        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
//        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
//        jLabel1.setText("OTP Verification");
//
//        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/confirm pass.png"))); // NOI18N
//
//        otpField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
//        otpField.setText("Enter OTP");
//        otpField.setBorder(null);
//        otpField.addFocusListener(new java.awt.event.FocusAdapter() {
//            public void focusGained(java.awt.event.FocusEvent evt) {
//                otpFieldFocusGained(evt);
//            }
//            public void focusLost(java.awt.event.FocusEvent evt) {
//                otpFieldFocusLost(evt);
//            }
//        });
//
//        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
//
//        verifyButton.setBackground(new java.awt.Color(0, 0, 0));
//        verifyButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
//        verifyButton.setForeground(new java.awt.Color(255, 255, 255));
//        verifyButton.setText("Verify");
//        verifyButton.setBorder(new javax.swing.border.MatteBorder(null));
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGap(123, 123, 123)
//                .addComponent(jLabel2)
//                .addGap(29, 29, 29)
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(otpField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addContainerGap(73, Short.MAX_VALUE))
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
//                        .addComponent(jLabel1)
//                        .addGap(75, 75, 75))
//                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
//                        .addComponent(verifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(141, 141, 141))))
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGap(32, 32, 32)
//                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(53, 53, 53)
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addComponent(otpField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addGap(27, 27, 27)
//                .addComponent(verifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(38, Short.MAX_VALUE))
//        );
//
//        panelBorder1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
//
//        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
//        panelBorder1.setLayout(panelBorder1Layout);
//        panelBorder1Layout.setHorizontalGroup(
//            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(panelBorder1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addContainerGap())
//        );
//        panelBorder1Layout.setVerticalGroup(
//            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(panelBorder1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);
//
//        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
//        panelGradiente1.setLayout(panelGradiente1Layout);
//        panelGradiente1Layout.setHorizontalGroup(
//            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
//                .addContainerGap(144, Short.MAX_VALUE)
//                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(175, Short.MAX_VALUE))
//        );
//        panelGradiente1Layout.setVerticalGroup(
//            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
//                .addContainerGap(151, Short.MAX_VALUE)
//                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(210, Short.MAX_VALUE))
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//
//        pack();
//        setLocationRelativeTo(null);
//        verifyButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    handleVerifyButton();
//                } catch (Exception ex) {
//                    Logger.getLogger(otp_verify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }// </editor-fold>                        
//
//                                        
//
//    private void otpFieldFocusGained(java.awt.event.FocusEvent evt) {                                     
//        // TODO add your handling code here:
//        if(otpField.getText().equals("Enter OTP"))
//            {
//               otpField.setText(""); 
//            }
//    }                                    
//
//    private void otpFieldFocusLost(java.awt.event.FocusEvent evt) {                                   
//        // TODO add your handling code here:
//        if(otpField.getText().equals(""))
//            {
//               otpField.setText("Enter OTP"); 
//            }
//    }
//    private  void insert(String user_name,String Phone_no,String email_id,String company_name,String company_address,String password ){
//      try{
////                String status="free";
//                Date currentDate = new Date();
//                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                String formattedDate = dateFormat.format(currentDate);
//                
//                Calendar calendar = Calendar.getInstance();
//                calendar.setTime(currentDate);
//                calendar.add(Calendar.MONTH, 1);
//                java.util.Date expirationDate = calendar.getTime();
//                
//                databaseCon db=new databaseCon();
//                Connection con=db.getConnection();
//                
//                String q="insert into registration_info(username,Phone_no,email_id,company_name,company_address,create_password,date)values(?,?,?,?,?,?,?)";
//                
//                PreparedStatement pstmt=con.prepareStatement(q);
//                pstmt.setString(1,user_name);
//                pstmt.setString(2,Phone_no);
//                pstmt.setString(3,email_id);
//                
//
//                pstmt.setString(4,company_name);
//                pstmt.setString(5,company_address);
//                pstmt.setString(6,password);
//                pstmt.setString(7,formattedDate);
////                pstmt.setDate(8, new java.sql.Date(expirationDate.getTime()));
////                pstmt.setString(9,status);
//               pstmt.executeUpdate();
//               
//                JOptionPane.showMessageDialog(this, "Submitted insert function");
//                 System.out.println("Data Inserted");
//                 con.close();
//        
//            
//        }catch(Exception e){
//             e.printStackTrace();
//        
//        }
//    }
//    private static boolean isMonthlyExpirationDateSet() throws Exception {
//    try {
//        databaseCon db = new databaseCon();
//        Connection con = db.getConnection();
//
//        // Check if the monthly expiration date is already set
//        String query = "SELECT COUNT(*) FROM registration_info WHERE expire_date IS NOT NULL";
//        PreparedStatement pstmt = con.prepareStatement(query);
//        ResultSet rs = pstmt.executeQuery();
//
//        if (rs.next()) {
//            int count = rs.getInt(1);
//            return count > 0;
//        }
//
//        con.close();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//
//    return false;
//}
//    private static void setInitialMonthlyExpirationDate() throws Exception {
//    try {
//        databaseCon db = new databaseCon();
//        Connection con = db.getConnection();
//
//        // Calculate initial monthly expiration date (e.g., one month from current date)
//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.MONTH, 1); // Add 1 month
//        Date expirationDate = cal.getTime();
//
//        // Update the monthly expiration date for all registered users
//        String updateQuery = "UPDATE registration_info SET expire_date = ?";
//        PreparedStatement pstmt = con.prepareStatement(updateQuery);
//        pstmt.setDate(1, new java.sql.Date(expirationDate.getTime()));
//        pstmt.executeUpdate();
//
//        con.close();
//
//        System.out.println("Initial monthly expiration date set successfully.");
//    } catch (SQLException e) {
//        e.printStackTrace();
//        throw new Exception("Failed to set initial monthly expiration date.");
//    }
//}
//     private static void update_registartion(String user_name,String Phone_no,String email_id,String company_name,String company_address,String password ) throws Exception {
//    try {
//        databaseCon db = new databaseCon();
//        Connection con = db.getConnection();
//
//
//        // Update the monthly expiration date for all registered users
//        String updateQuery = "UPDATE registration_info SET username = ?,Phone_no = ? , email_id= ? , company_name = ?, company_address= ?,create_password=?";
//        
//        PreparedStatement pstmt = con.prepareStatement(updateQuery);
//                pstmt.setString(1,user_name);
//                pstmt.setString(2,Phone_no);
//                pstmt.setString(3,email_id);
//                
//
//                pstmt.setString(4,company_name);
//                pstmt.setString(5,company_address);
//                pstmt.setString(6,password);
//        pstmt.executeUpdate();
//
//        con.close();
//
//        System.out.println("successfully.");
//    } catch (SQLException e) {
//        e.printStackTrace();
//        throw new Exception("Failedm");
//    }
//}
//    
//     private void handleVerifyButton() throws Exception {
//        String enteredOTP = otpField.getText();
//        if (enteredOTP.equals(expectedOTP)) {
//            
////            new_register new_r=new new_register();
////            boolean registered = new_r.isRegistered();
////                if(!registered){
//                    insert(user_name, Phone_no, email_id, company_name, company_address, password);
////                }else{                
////                    update_registartion(user_name, Phone_no, email_id, company_name, company_address, password);
////                 }
//            
//            
//             if (!isMonthlyExpirationDateSet()) {
//            // Set the monthly expiration date if it's not already set
//                setInitialMonthlyExpirationDate();
//            }
////            setMonthlyExpirationDate();
////            new_register n= new new_register();
////            
////            n.insertData();
////            JOptionPane.showMessageDialog(this, "OTP Verified Successfully!");
//            // TODO: Add your logic after successful OTP verification
//            // For example, open another frame or perform some action
//            this.dispose(); // Close the verification frame
//           new_userlogin login=new new_userlogin();
//                login.setVisible(true);
//           
//        } else {
//            JOptionPane.showMessageDialog(this, "Incorrect OTP. Please try again.");
//        }
//    }
//  
//
//    // Variables declaration - do not modify                     
// private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JSeparator jSeparator1;
//    private javax.swing.JTextField otpField;
//    private com.raven.swing.PanelBorder panelBorder1;
//    private com.raven.swing.PanelGradiente panelGradiente1;
//    private javax.swing.JButton verifyButton;
//    // End of variables declaration                   
//}
//
//
