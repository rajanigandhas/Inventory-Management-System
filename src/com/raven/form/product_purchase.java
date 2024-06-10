
package com.raven.form;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class product_purchase extends javax.swing.JPanel {

     private String date,amountPending;
     public static String productId,name,vendorName,quantity,price;
     public String paid,stat;
     public static float total;
   
    public product_purchase() {
        initComponents();
        
        priceField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculateTotal();
                getPrice();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calculateTotal();
                getPrice();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculateTotal();
                getPrice();
            }
    });
         productIdField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                getProductID();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                getProductID();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                getProductID();
            }
    });
        
         nameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                getProductName();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                getProductName();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                getProductName();
            }
    });
         
         vendorNameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                getVendorName();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                getVendorName();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                getVendorName();
            }
    });
            quantityField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                getQuantity();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                getQuantity();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                getQuantity();
            }
    });
         
         
        
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
    }
    
    public void getPrice(){
    price=priceField.getText();
    }
    public void getQuantity(){
    quantity=quantityField.getText();
    }
    public void getProductName(){
        name=nameField.getText();
    }

     public void getVendorName(){
        vendorName=vendorNameField.getText();
    }
     
     public void getProductID(){
     productId=productIdField.getText();
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        vendorNameField = new javax.swing.JTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Product Prucahse Details");

        productIdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIdFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Product ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Product Name");

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Product Price");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Date");

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        quantityField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Product Quantity");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Payment Status");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setText("Done");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setText("Pending");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Total Price");

        totalPrice.setFont(new java.awt.Font("Segoe UI", 0, 14));
        totalPrice.setEditable(false);
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Vendor Name");

        vendorNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vendorNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(quantityField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendorNameField)
                                    .addComponent(priceField))))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(totalPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(vendorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nameFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    
    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
       // jPanel3.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                productId = productIdField.getText();
                 name = nameField.getText();
                 price = priceField.getText();
                 date = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
                 quantity = quantityField.getText();
                 vendorName=vendorNameField.getText();
                  Date currentDate = new Date();

        // Format the date as a string
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
               String  curdate = dateFormat.format(currentDate);
                
                    if(jRadioButton1.isSelected()){
                        amountPending="0";
                        paid=String.valueOf(total);
                        stat="Done";
                        
                     }
                 
                 insertData(amountPending,paid,stat,curdate,String.valueOf(total),price);
                 clearFields();
                 
    }//GEN-LAST:event_jButton1ActionPerformed
 private void clearFields() {
    productIdField.setText("");
    nameField.setText("");
    priceField.setText("");
    quantityField.setText("");
    vendorNameField.setText("");
    totalPrice.setText("");
    jDateChooser1.setDate(null);
    buttonGroup1.clearSelection(); 
//    if(jRadioButton1.isSelected()){
//                       jRadioButton1.setSelected(false);
//                        
//                     }
//    else{
//    jRadioButton2.setSelected(false);
//    }
}
//    private void calculateTotal(){
//    
//     float price=Float.parseFloat(priceField.getText().trim());
//        int quantity=Integer.parseInt(quantityField.getText().trim());
//         total=price*quantity;
//       totalPrice.setText(String.valueOf(total));
//    }
 
 private void calculateTotal(){
    if (!priceField.getText().trim().isEmpty() &&!quantityField.getText().trim().isEmpty()) {
        float price=Float.parseFloat(priceField.getText());
        int quantity=Integer.parseInt(quantityField.getText());
        total=price*quantity;
        totalPrice.setText(String.valueOf(total));
    } else {
        totalPrice.setText("");
    }
}
    
   
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
       // jPanel3.setVisible(true);
       if (jRadioButton2.isSelected()) {
            try {
                pending_vendor_bill pending = new pending_vendor_bill();
                pending.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(emp_bill.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed

    private void vendorNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorNameFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_vendorNameFieldActionPerformed

    
    public void insertData(String pending,String paid,String status,String date,String total,String price){
    
        try{
                
                databaseCon db=new databaseCon();
        
                Connection con=db.getConnection();
                
                 PreparedStatement checkStmt = con.prepareStatement("SELECT * FROM product_details WHERE product_name = ?");
                 checkStmt.setString(1, name);
                 ResultSet resultSet = checkStmt.executeQuery();
                 
                  if (resultSet.next()) {
                // If the product exists, update its quantity
                int existingQuantity = resultSet.getInt("product_quantity");
                int newQuantity = existingQuantity + Integer.parseInt(quantity);

                PreparedStatement updateStmt = con.prepareStatement("UPDATE product_details SET product_quantity = ? WHERE product_name = ?");
                updateStmt.setInt(1, newQuantity);
                updateStmt.setString(2, name);
                updateStmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated Successfully");
                System.out.println("Product updated successfully");
                  }
                  
                else{
                String q="insert into product_details(product_id,product_name,date,product_quantity,product_price,total_price,paid_amount,status,pending_amount,vendor_name)values(?,?,?,?,?,?,?,?,?,?)";
                
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,productId);
                pstmt.setString(2,name);
                pstmt.setString(3,date);
                pstmt.setString(4,quantity);
                pstmt.setString(5,price);
                pstmt.setString(6, total);
                pstmt.setString(7, paid);
                pstmt.setString(8, status);
                pstmt.setString(9,pending);
                pstmt.setString(10,vendorName);

               pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Submitted Successfully");
                 System.out.println("Data Inserted");
                 
                  }
                 con.close();
        
            
        }catch(Exception e){
             e.printStackTrace();
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField productIdField;
    private javax.swing.JTextField quantityField;
    private javax.swing.JTextField totalPrice;
    private javax.swing.JTextField vendorNameField;
    // End of variables declaration//GEN-END:variables
}
