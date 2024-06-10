package com.raven.form;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import com.raven.swing.ScrollBar;
import com.raven.swing.StatusCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;

public class Form1 extends javax.swing.JPanel {
    JButton b;
    public static String productId,productName,productQuantity,date,totalPrice, price,paidAmount,status,pendingAmount,vendor ;
    public Form1() throws Exception {
        initComponents();
         b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    refreshTable();
                } catch (Exception ex) {
                    Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
         table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                         productId = table.getValueAt(selectedRow, 0).toString();
                         productName = table.getValueAt(selectedRow, 1).toString();
                         date = table.getValueAt(selectedRow, 2).toString();
                         productQuantity = table.getValueAt(selectedRow, 3).toString();
                         totalPrice=table.getValueAt(selectedRow, 5).toString();
                         price = table.getValueAt(selectedRow, 4).toString();
                         paidAmount = table.getValueAt(selectedRow, 6).toString();
                         status = table.getValueAt(selectedRow, 7).toString();
                         pendingAmount = table.getValueAt(selectedRow, 8).toString();
                         vendor = table.getValueAt(selectedRow, 9).toString();
                         if(status.equals("Done")|| Float.parseFloat(pendingAmount)==0.0){
                            JOptionPane.showMessageDialog(Form1.this, "Payment is already done");
                         }
                         else{
                            update_pending_bill_vendor vendor_bill;
                           try {
                               vendor_bill = new update_pending_bill_vendor();
                               vendor_bill.setVisible(true);
                           } catch (Exception ex) {
                               Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
                           }
                         } 
                    }
                }
            }
        });
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
//       insertIntoTable();
       table.getColumnModel().getColumn(7).setCellRenderer(new StatusCellRenderer());
        refreshTable();
       
       
    }
    
    
    private void refreshTable() {
        try {
            // Clear the existing data from the table
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear all rows

            // Reload the updated data from the database
            insertIntoTable();
        } catch (Exception ex) {
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void insertIntoTable() throws Exception{
     databaseCon db=new databaseCon();
        
     Connection con=db.getConnection();
     Statement st=con.createStatement();
                
     String q="select * from product_details";
     ResultSet rs=st.executeQuery(q);
     ResultSetMetaData rsmd=rs.getMetaData();
     
      DefaultTableModel model=(DefaultTableModel) table.getModel();
      
     
        String product_id,product_name,product_price,date,totalAmt,product_quantity,status,pendingAmt,paidamt,vendor;
        while(rs.next()){
            product_id=rs.getString(1);
            product_name=rs.getString(2);
            date=rs.getString(3);
            product_quantity=rs.getString(4);
            totalAmt=rs.getString(6);
            product_price=rs.getString(5);
            paidamt=rs.getString(7);
            status=rs.getString(8);
            pendingAmt=rs.getString(9);
            vendor=rs.getString(10);
            String []row={product_id,product_name,date,product_quantity,product_price,totalAmt,paidamt,status,pendingAmt,vendor};
            model.addRow(row);
        }
        
         
        st.close();
        con.close();
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        // card1 = new com.raven.component.Card();
        // card2 = new com.raven.component.Card();
        // card3 = new com.raven.component.Card();
        // card4 = new com.raven.component.Card();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        // ImageIcon icon = new ImageIcon("path/to/your/image.png");
        b=new JButton(" ");
        
       // b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/refresh.png")));
        panel.add(b,"cell 0 0, align right,top, gapbottom 0,gaptop 0");
        
        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));


        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Product List");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date", "Quantity","Price", "Total","Paid amount","Status","Pending Amount","Vendor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false,false,false,false,false,false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spTable))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        
        panel.setLayout(new MigLayout("fill", "10[]10[100%, fill]10", "[]10[fill, top]10")); // Removed the gap above the component

//        panel.setLayout(new MigLayout("fill", "10[]10[100%, fill]10", "10[fill, top]10"));
panel.add(panelBorder1, "grow, wrap"); // Add panelBorder1 to the panel

    }// </editor-fold>//GEN-END:initComponents


    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN
    }

    