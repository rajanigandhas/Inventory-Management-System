/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;


import java.awt.Dimension;
import java.util.ArrayList;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.JDesktopPane;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.PlainDocument;



public class emp_bill extends javax.swing.JInternalFrame {

    private  JDesktopPane desktopPane;
    private static int currentbillno;
    public Double totalprice;
    private boolean isFirstTime = true;
    int available_qty=0;
    double gst;
    public static double finalTotal;
    public static String final_Total;
    public static float totalPrice;
    int quantityForCalculation;
     double priceForCalculation;
    
    Double totalAmount=0.00;
    ArrayList<String> itemId = new ArrayList<>(); 
    ArrayList<String> itemName = new ArrayList<>(); 
    ArrayList<String> quantity  = new ArrayList<>();
    ArrayList<String> itemPrice=  new ArrayList<>();
    ArrayList<String> subtotal = new ArrayList<>();


     public emp_bill(JDesktopPane desktopPane, Dimension desktopPaneSize) throws Exception {
          super("Create Invoice", true, true, true, true);
        this.desktopPane = desktopPane;
//        pending_customer_bill pending=new pending_customer_bill(desktopPane,desktopPaneSize);
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        // Set the size of the internal frame to match the size of the desktop pane
        setSize(desktopPaneSize);
        
        // Set the internal frame's location to (0, 0) relative to the desktop pane
        setLocation(0, 0);
        Font headerFont = new Font("Tahoma", Font.BOLD, 14);
        jTable1.getTableHeader().setFont(headerFont);
        Font contentFont = new Font("Tahoma", Font.PLAIN, 14);
        jTable1.setFont(contentFont);
        bill_no.setEditable(false);
        
        sgst_txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculateGST();
                calculateFinalTotal();
                
                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calculateGST();
                calculateFinalTotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculateGST();
                calculateFinalTotal();
            }
    });
        txtitemprice.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
               calculateSubTotal();
               
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               calculateSubTotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculateSubTotal();
            }
    });
        
        total_amount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                getTotal();
                
                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                getTotal();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                getTotal();

            }
    });
        
//        txtquantity.getDocument().addDocumentListener(new DocumentListener() {
//            @Override
//            public void insertUpdate(DocumentEvent e) {
//                getQuantity();
//                
//                
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent e) {
//                getQuantity();
//
//            }
//
//            @Override
//            public void changedUpdate(DocumentEvent e) {
//                getQuantity();
//
//            }
//    });
        
//        currentbillno = retrieveCurrentBillNumberFromDatabase();
//                bill_no.setText(String.valueOf(currentbillno));
                
//                txtitemprice.setDocument(new PlainDocument());
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtitemid = new javax.swing.JTextField();
        txtitemname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtitemprice = new javax.swing.JTextField();
        txtsubtotal = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txttotalprice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bill_no = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        add_button1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        sgst_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gst_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        total_amount = new javax.swing.JTextField();
        sgst_valid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 244));

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Product ID");

        txtitemid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtitemid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtitemidFocusGained(evt);
            }
        });
        txtitemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemidActionPerformed(evt);
            }
        });

        txtitemname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");

        txtquantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sub total");

        txtitemprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtitemprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitempriceActionPerformed(evt);
            }
        });

        txtsubtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        add_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_button.setText("ADD");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total");

        txttotalprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Bill No. ");

        bill_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bill_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bill_noMouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product name", "Quantity", "Total"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Bill Generation");

        add_button1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_button1.setText("Receipt");
        add_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_button1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Payment");

        jRadioButton1.setBackground(new java.awt.Color(244, 244, 244));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Done");

        jRadioButton2.setBackground(new java.awt.Color(244, 244, 244));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Pending");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("SGST");

        sgst_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sgst_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sgst_txtFocusLost(evt);
            }
        });
        sgst_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgst_txtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("GST");

        gst_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gst_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gst_txtActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Total Amount");

        total_amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_amountActionPerformed(evt);
            }
        });

        sgst_valid.setForeground(new java.awt.Color(204, 0, 51));

        txtReceipt.setColumns(20);
        txtReceipt.setRows(5);
        jScrollPane2.setViewportView(txtReceipt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Bill Receipt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sgst_valid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addGap(36, 36, 36))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(add_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(17, 17, 17))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(sgst_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(gst_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton1)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jRadioButton2)))
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(246, 246, 246))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel8))
                                                    .addGap(9, 9, 9)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtquantity)
                                                                .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(17, 17, 17)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(374, 374, 374)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3))))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtitemname, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                .addComponent(txtitemprice)
                                                .addComponent(txttotalprice))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(153, 153, 153))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(txtitemprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addComponent(txttotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(25, 25, 25)
                        .addComponent(add_button)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(sgst_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(gst_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sgst_valid, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(add_button1)
                            .addComponent(jButton2))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemnameActionPerformed
   
    private void getTotal(){
    final_Total=total_amount.getText();
    }
//    private void getQuantity(){
//    quantityForCalculation=Integer.parseInt(txtquantity.getText());
//    System.out.println("Quantity:"+quantityForCalculation);
//    }
//    
//    private void getPrice(){
//    priceForCalculation=Double.parseDouble(txtitemprice.getText());
//    System.out.println("Price:"+priceForCalculation);
//    }
    private void calculateSubTotal(){
         try {
        quantityForCalculation = Integer.parseInt(txtquantity.getText());
    } catch (NumberFormatException ex) {
        // Handle the case where quantity is not a valid integer
        // You might display an error message or set a default value
        quantityForCalculation = 0; // Default to 0 for now
    }

    // Retrieve price
    try {
        // Parse price only if it's not empty
        String priceText = txtitemprice.getText();
        if (!priceText.isEmpty()) {
            priceForCalculation = Double.parseDouble(priceText);
        } else {
            priceForCalculation = 0.0; // Default to 0 if price is empty
        }
    } catch (NumberFormatException ex) {
        // Handle the case where price is not a valid double
        // You might display an error message or set a default value
        priceForCalculation = 0.0; // Default to 0 for now
    }
     double subTotal=quantityForCalculation*priceForCalculation;
     txtsubtotal.setText(String.valueOf(subTotal));
    }
    
    
    
    private void calculateGST(){
        double sgst= Double.parseDouble(sgst_txt.getText());
         gst=sgst*2;
        gst_txt.setText(String.valueOf(gst));
    }
     private void calculateFinalTotal(){
         double total= Double.parseDouble(txttotalprice.getText());
          finalTotal=total+gst;
         total_amount.setText(String.valueOf(finalTotal));
    
    }
    
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // TODO add your handling code here:
        itemId.add(txtitemid.getText());
        itemName.add(txtitemname.getText());
        quantity.add(txtquantity.getText());
        itemPrice.add(txtitemprice.getText());
        subtotal.add(txtsubtotal.getText());
        totalAmount=totalAmount + Double.valueOf(txtsubtotal.getText());
        txttotalprice.setText(totalAmount+"");
       
        int bill_number=Integer.parseInt(bill_no.getText());
        int productId=Integer.parseInt(txtitemid.getText());
        String productName = txtitemname.getText();
        int quantity1 = Integer.parseInt(txtquantity.getText());
        double product_price=Integer.parseInt(txtitemprice.getText());
        double price = Double.parseDouble(txtsubtotal.getText());
//        double price = Double.parseDouble(total_amount.getText());
        
        try {
            int availableQuantity = getQuantityFromDatabase(productName);
            
            if (quantity1 > availableQuantity) {
                JOptionPane.showMessageDialog(null, "Quantity exceeds available stock.");
                clear();
                txttotalprice.setText("");
                return; // Exit the method without proceeding further
            }
        } catch (Exception ex) {
            Logger.getLogger(emp_bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        
        model.addRow(new Object[]{productName , quantity1, price });
        
        substract_quantity(productName,quantity1);
        
        clear();
        
        
        storeDataInDatabase(bill_number,productId, productName, quantity1, product_price, price);
    }//GEN-LAST:event_add_buttonActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtitempriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitempriceActionPerformed

//        calculateTotalPrice();
        
    }//GEN-LAST:event_txtitempriceActionPerformed
    
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
        {   
            boolean complete = txtReceipt.print();
            if(complete)
            {
                
                currentbillno = retrieveCurrentBillNumberFromDatabase();
                bill_no.setText(String.valueOf(currentbillno));
                txtitemprice.setDocument(new PlainDocument());
                JOptionPane.showMessageDialog(null,"Done Printing","Information",JOptionPane.INFORMATION_MESSAGE);
                clearall();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Printing!!","Printer",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(PrinterException e)
        {
            JOptionPane.showMessageDialog(null,e);
        } catch (Exception ex) {
            Logger.getLogger(emp_bill.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bill_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_noMouseClicked
//        int counter = 0;
//        bill_no.setText(Integer.toString(++counter));
        
    }//GEN-LAST:event_bill_noMouseClicked

    private void add_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_button1ActionPerformed
        // TODO add your handling code here:
        int bill_number=Integer.parseInt(bill_no.getText());
        
       LocalDateTime currentDateTime = LocalDateTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       String formattedDateTime = currentDateTime.format(formatter);

        
        double amount = Double.parseDouble(txttotalprice.getText());
        double gstRate = Double.parseDouble(gst_txt.getText());
        double sgstRate = Double.parseDouble(sgst_txt.getText());
        double total_amt = Double.parseDouble(total_amount.getText());
//              
//        double gstAmount = amount * (gstRate / 100);
//        double totalAmount = amount + gstAmount;
//                
//        total_amount.setText(String.valueOf(totalAmount));
       
        
        StringBuilder billData = new StringBuilder();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Append header    private void add_button1ActionPerformed(java.awt.event.ActionEvent evt) {                                            

            billData.append(":\n   Item Name\t\tQuantity\tTotal\n");
    
    // Append data from table
    int count_quantity=0;
    for (int i = 0; i < model.getRowCount(); i++) {
        String tableitemName = model.getValueAt(i, 0).toString();
        String tablequantity = model.getValueAt(i, 1).toString();
//        substract_quantity(tableitemName,tablequantity);
        count_quantity=count_quantity+Integer.parseInt(tablequantity);
        String tabletotal = model.getValueAt(i, 2).toString();
        
        if (tableitemName.length() < 33) {
            String[] nameLines = splitProductName(tableitemName, 35); // Adjust the maximum width as needed
            // Format each line of the bill data
            for (int j = 0; j < nameLines.length; j++) {
                String productNameLine = j == 0 ? nameLines[j] : ""; // Display only the product name on the first line
                String formattedData = String.format("%-35s\t%-10s\t%-10s\n", productNameLine, j == 0 ? tablequantity : "", j == 0 ? tabletotal : "");
                billData.append(formattedData);
            }                 
        } else{
            String[] nameLines = splitProductName(tableitemName, 35); // Adjust the maximum width as needed
            // Format each line of the bill data
            for (int j = 0; j < nameLines.length; j++) {
                String productNameLine = j == 0 ? nameLines[j] : ""; // Display only the product name on the first line
                String formattedData = String.format("%-35s\n\t\t%-10s\t%-10s\n", productNameLine, j == 0 ? tablequantity : "", j == 0 ? tabletotal : "");
                billData.append(formattedData);
            }      
        }
    }
    
     JTextArea billTextArea = new JTextArea(billData.toString());
    billTextArea.setEditable(false);
    billTextArea.setLineWrap(true);
    billTextArea.setWrapStyleWord(true);
    String products=billTextArea.getText();  
     totalprice = Double.parseDouble(txttotalprice.getText());
     
        
 txtReceipt.setText("\t         TAX INVOICE\n" +
                    "______________________________________________\n"+
                   "\t          Electronics\n"+
                   "\t    No 0000 Address Line One\n" +
                   "\t   www.facebook.com/CodeGuid\n" +
                   "       \t         +9758645876\n" +
                   "______________________________________________\n\n" +
                   "DATE : "+formattedDateTime+"\n"+
                   "BILL NO :  "+bill_number+"\n"+
                   "================================================\n" +  
                   "ITEMS" + products + "\n" +
                   "______________________________________________\n\n" +
                   "\t\tQty :"+count_quantity +"\tTotal:" +totalprice + "\n\n" +
                   " *________________GST Details_______________*\n\n" +  
                   " SGST : "+sgstRate+"%"+"\tGST : "+gstRate+"%"+"\tTotal amount :  "+total_amt+"\n"+
                   "____________________________________________\n\n" +
                   "\tTHANK YOU COME AGAIN\n" +
                   "____________________________________________\n" +
                   "\tCONTACT  : contact@gmail.com       \n" +
                   "\t  POWERDED BY COLABVISION\n" );
 
    store_gst(bill_number,amount,total_amt);  
     
    }//GEN-LAST:event_add_button1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            try {
                pending_customer_bill pendingForm = new pending_customer_bill(desktopPane, desktopPane.getSize());
                desktopPane.add(pendingForm);
                pendingForm.setTotal(finalTotal);
                pendingForm.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(emp_bill.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtitemidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtitemidFocusGained
        try {
            if (isFirstTime) {
                    currentbillno = retrieveCurrentBillNumberFromDatabase();
                    isFirstTime = false;
                }
            
        } catch (Exception ex) {
            Logger.getLogger(emp_bill.class.getName()).log(Level.SEVERE, null, ex);
        }
                bill_no.setText(String.valueOf(currentbillno));
    }//GEN-LAST:event_txtitemidFocusGained

    private void sgst_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sgst_txtFocusLost
        // TODO add your handling code here:
        
        if(sgst_txt.equals("")) {
        // If empty or contains placeholder text, show error message
        sgst_valid.setText("Please enter SGST");
    }
    }//GEN-LAST:event_sgst_txtFocusLost

    private void sgst_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgst_txtActionPerformed
        // TODO add your handling code here:
//        double sgst= Double.parseDouble(sgst_txt.getText());
//        double gst=sgst*2;
//        gst_txt.setText(String.valueOf(gst));
        
    }//GEN-LAST:event_sgst_txtActionPerformed

    private void gst_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gst_txtActionPerformed
        // TODO add your handling code here:
         double amount = Double.parseDouble(txttotalprice.getText());
        double gstRate = Double.parseDouble(gst_txt.getText());
        double sgstRate = Double.parseDouble(sgst_txt.getText());
              
        double gstAmount = amount * (gstRate / 100);
        double totalAmount = amount + gstAmount;
                
        total_amount.setText(String.valueOf(totalAmount));
    }//GEN-LAST:event_gst_txtActionPerformed

    private void total_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_amountActionPerformed

    private void txtitemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemidActionPerformed
     private String[] splitProductName(String productName, int maxLength) {
    if (productName.length() <= maxLength) {
        return new String[]{productName};
    } else {
        List<String> lines = new ArrayList<>();
        int start = 0;
        while (start < productName.length()) {
            int end = Math.min(start + maxLength, productName.length());
            // Find the last space within the maximum length to break the line
            while (end > start && productName.charAt(end) != ' ') {
                end--;
            }
            lines.add(productName.substring(start, end));
            start = end < productName.length() ? end + 1 : end;
        }
        return lines.toArray(new String[0]);
    }
}
      private int getQuantityFromDatabase(String productName) throws Exception {
         //To change body of generated methods, choose Tools | Templates.
         try{
             
//             int available_qty=0;
            databaseCon db=new databaseCon();
            Connection con=db.getConnection();
            String query = "SELECT product_quantity FROM product_details WHERE product_name = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, productName);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                available_qty = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return available_qty;
    }
     
     public int getCurrentBillNumber() {
        return currentbillno;
    }
     public Double getTotalPriceText() {
        return totalAmount;
    }
//     public Double getTotalAmount() {
//        return totalAmount;
//    }
    public Double calculateTotalAmount() {
        // Calculate the total amount based on the data in the table
        double total = 0.0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            double price = Double.parseDouble(model.getValueAt(i, 2).toString());
            total += price;
        }
        return total;
    }
     private int retrieveCurrentBillNumberFromDatabase() throws Exception {
        int lastBillNumber = 0;
            try{
                databaseCon db=new databaseCon();
                Connection con=db.getConnection();
                 String query ="SELECT MAX(bill_number) FROM bills";
                 PreparedStatement stmt = con.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery();
             

            if (rs.next()) {
                lastBillNumber = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lastBillNumber + 1; // Increment the last bill number by 1
    }
      private void incrementBillNumber() throws Exception {
          currentbillno++;
          try{
               databaseCon db=new databaseCon();
               Connection con=db.getConnection();
               String query ="INSERT INTO bills (bill_number) VALUES (?)";
               PreparedStatement stmt = con.prepareStatement(query);
               stmt.setInt(1, currentbillno);
               stmt.executeUpdate();
          }catch(SQLException ex ){
              ex.printStackTrace();
              
          }
      
      }
    
    private void substract_quantity(String product_name, int product_quantity ){
        try {
//            int sub_quantity= Integer.parseInt(product_quantity);

            databaseCon db=new databaseCon();
            Connection con=db.getConnection();
            String query = "SELECT product_quantity FROM product_details WHERE product_name = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, product_name);
            ResultSet rs = stmt.executeQuery();
            
            int dbQuantity = 0;
            if (rs.next()) {
                dbQuantity = rs.getInt("product_quantity");
            }
             if (dbQuantity > 0) {
            int newQuantity = dbQuantity - product_quantity;

            // If the new quantity is not negative, update the database
            if (newQuantity >= 0) {
                String updateQuery = "UPDATE product_details SET product_quantity = ? WHERE product_name = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setInt(1, newQuantity);
                updateStmt.setString(2, product_name);
                updateStmt.executeUpdate();
                updateStmt.close();
            } else {
                // Display a message indicating that the product is out of stock
                JOptionPane.showMessageDialog(this, "Product '" + product_name + "' is out of stock.");
            }
        } else {
            // Display a message indicating that the product is out of stock
            JOptionPane.showMessageDialog(this, "Product '" + product_name + "' is out of stock.");
        }

//            // Subtract the quantity entered in the bill
//            int newQuantity = dbQuantity - product_quantity;
//
//            // Update the database with the new quantity
//            String updateQuery = "UPDATE product_details SET product_quantity = ? WHERE product_name = ?";
//            PreparedStatement updateStmt = con.prepareStatement(updateQuery);
//            updateStmt.setInt(1, newQuantity);
//            updateStmt.setString(2, product_name);
//            updateStmt.executeUpdate();
//            
            // Close the resources
            rs.close();
            stmt.close();
//            updateStmt.close();
        
        } catch (Exception ex) {
            Logger.getLogger(emp_bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void storeDataInDatabase(int bill_number,int itemId, String itemName, int quantity, double price, double subtotal) {
  
     try{
                Date currentDate = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = dateFormat.format(currentDate);
                
                databaseCon db=new databaseCon();
        
                Connection con=db.getConnection();
                
                String q="insert into bills(bill_number,product_id,product_name,quantity,price_per_quantity,total,date)values(?,?,?,?,?,?,?)";
                
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setInt(1,bill_number);
                pstmt.setInt(2,itemId);
                pstmt.setString(3,itemName);
                pstmt.setInt(4,quantity);
                

                pstmt.setDouble(5,price);
                pstmt.setDouble(6,subtotal);
                pstmt.setString(7,formattedDate);
               pstmt.executeUpdate();
                
//                JOptionPane.showMessageDialog(this, "Submitted Successfully");
                 System.out.println("Data Inserted");
                 con.close();
        
            
        }catch(Exception e){
             e.printStackTrace();
        
        }
}
    private void store_gst(int bill_no, double amt,double gst_amt){
         try{
                Date currentDate = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = dateFormat.format(currentDate);
                
                databaseCon db=new databaseCon();
        
                Connection con=db.getConnection();
                
                String q="insert into gst_bill(bill_no,total_amt,gst_amt,date)values(?,?,?,?)";
                
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setInt(1,bill_no);
                pstmt.setDouble(2,amt);
                pstmt.setDouble(3,gst_amt);
                pstmt.setString(4,formattedDate);
               pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Submitted Successfully");
                 System.out.println("Data Inserted");
                 con.close();
        
            
        }catch(Exception e){
             e.printStackTrace();
        
        }
        
    }
    private void calculateTotalPrice() {
        try {
            int quantity = Integer.parseInt(txtquantity.getText());
            double price = Double.parseDouble(txtitemprice.getText());
             //totalPrice = quantity * price;
           // txtsubtotal.setText(String.valueOf(totalPrice));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Please enter valid numbers for quantity and subtotal.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     private void clear(){
        txtitemid.setText("");
        txtitemname.setText("");
        txtquantity.setText("");
        txtitemprice.setText("");
        txtsubtotal.setText("");
    }
    private void clearall(){
//        bill_no.setText("");
        txttotalprice.setText("");
        txtReceipt.setText("");
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Set the row count to 0 to clear all rows
    
       
    }
     
     private String getTableData() {
    StringBuilder billData = new StringBuilder();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        String itemName = model.getValueAt(i, 0).toString();
        String quantity = model.getValueAt(i, 1).toString();
        String total = model.getValueAt(i, 2).toString();
        billData.append(itemName).append("\t\t").append(quantity).append("\t\t").append(total).append("\n");
    }
    return billData.toString();
    }
    
    private void printInvoice(String invoice) {


        try {
            // Prompt user to select a printer
            PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
            PrintService selectedPrinter = (PrintService) JOptionPane.showInputDialog(null, "Select Printer:",
                    "Printers", JOptionPane.QUESTION_MESSAGE, null, printServices, printServices[0]);

            if (selectedPrinter != null) {
                // Create a print job
                DocPrintJob printJob = selectedPrinter.createPrintJob();

                // Create a print request attribute set
                HashPrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
                attributeSet.add(new Copies(1));

                // Create a Doc with the invoice string
                Doc doc = new SimpleDoc(invoice.getBytes(), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);

                // Print the document
                printJob.print(doc, attributeSet);
            }
        } catch (PrintException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton add_button1;
    private javax.swing.JTextField bill_no;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField gst_txt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField sgst_txt;
    private javax.swing.JLabel sgst_valid;
    private javax.swing.JTextField total_amount;
    private javax.swing.JTextArea txtReceipt;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtitemname;
    private javax.swing.JTextField txtitemprice;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotalprice;
    // End of variables declaration//GEN-END:variables

   
}
