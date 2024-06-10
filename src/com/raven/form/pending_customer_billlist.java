package com.raven.form;

import com.raven.swing.QuantityColorCellRenderer;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;


import com.raven.swing.ScrollBar;
import java.awt.Component;
import java.awt.Dimension;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;

public class pending_customer_billlist extends javax.swing.JPanel {
//        QuantityColorCellRenderer q=new QuantityColorCellRenderer();
    private JButton refreshButton;
     
    public pending_customer_billlist() throws Exception {
         initComponents();
         
         refreshButton = new JButton("Refresh");
         refreshButton.setPreferredSize(new Dimension(80, 20));
         refreshButton.setFont(new java.awt.Font("Tahoma", 1, 14));
         refreshButton.setBackground(new java.awt.Color(255, 255, 255));
         refreshButton.addActionListener(e -> {
        try {
            refreshAction(); // Call your refresh method here
        } catch (Exception ex) {
            ex.printStackTrace(); // Handle the exception appropriately
        }
    });
        panel.add(refreshButton, "cell 0 0, align right, top,gapbottom 0,gaptop 0");
         
         spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setFocusable(true);
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
       
       showPendingBills();
        adjustColumnWidths(table);
            table.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
                // Check if a row is selected and if the event is not adjusting (to avoid double events)
                if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {
                    int selectedRow = table.getSelectedRow();
                    // Open a new frame or perform any action you want here
                    openNewFrame(selectedRow);
                }
         });

       
    }
   private void refreshAction() throws Exception {
    // Implement your refresh logic here
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);
    showPendingBills();
}
    private void openNewFrame(int selectedRow) {
        // Get the data from the selected row
        String billNo = table.getValueAt(selectedRow, 0).toString();
        String customerName = table.getValueAt(selectedRow, 1).toString();
        String custAddr = table.getValueAt(selectedRow, 2).toString();
        String contact = table.getValueAt(selectedRow, 3).toString();
        String totalAmount = table.getValueAt(selectedRow, 4).toString();
        String paid = table.getValueAt(selectedRow, 5).toString();
        String pending = table.getValueAt(selectedRow, 6).toString();
        String date = table.getValueAt(selectedRow, 7).toString();
//        
        update_pending_bill   newFrame = new update_pending_bill(billNo, customerName, custAddr, contact, totalAmount, paid, pending, date); 
        newFrame.setVisible(true);
//JOptionPane.showMessageDialog(this,+selectedRow+"row is selected");
    }
    public void showPendingBills() throws Exception {
    databaseCon db = new databaseCon();
    Connection con = db.getConnection();
    Statement st = con.createStatement();
                
    String q = "SELECT bill_no, customer_name, cust_addr, contact, total_amount, paid, pending, date FROM customer_pending_bills";
    ResultSet rs = st.executeQuery(q);
    ResultSetMetaData rsmd = rs.getMetaData();
     
    DefaultTableModel model = (DefaultTableModel) table.getModel();
      
    String billNo, customerName, custAddr, contact, totalAmount, paid, pending, date;
    while(rs.next()) {
        billNo = rs.getString("bill_no");
        customerName = rs.getString("customer_name");
        custAddr = rs.getString("cust_addr");
        contact = rs.getString("contact");
        totalAmount = rs.getString("total_amount");
        paid = rs.getString("paid");
        pending = rs.getString("pending");
        date = rs.getString("date");
            
        String[] row = {billNo, customerName, custAddr, contact, totalAmount, paid, pending, date};
        model.addRow(row);
    }
       
    st.close();
    con.close();   
}
    private void adjustColumnWidths(JTable table) {
        TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int maxWidth = 0;
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                Object value = table.getValueAt(row, column);
                Component cellComponent = cellRenderer.getTableCellRendererComponent(table, value, false, false, row, column);
                maxWidth = Math.max(maxWidth, cellComponent.getPreferredSize().width);
            }
            // Set the width of the column with some padding
            columnModel.getColumn(column).setPreferredWidth(maxWidth + 20); // Adjust padding as needed
        }
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

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));


        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Customer Pending bills");
        spTable.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); // Add horizontal scroll bar

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill NO","Customer name","Address","Contact no","Total Amount","Paid","Pending","date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false ,false ,false, false, false, false
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
        
        panel.setLayout(new MigLayout("fill", "10[]10[100%, fill]10", "10[fill, top]10"));
panel.add(panelBorder1, "grow, wrap"); // Add panelBorder1 to the panel


    }// </editor-fold>//GEN-END:initComponents


    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.raven.swing.PanelBorder panelBorder1;
    public javax.swing.JScrollPane spTable;
    public com.raven.swing.Table table;
    // End of variables declaration//GEN
    }

    