package com.raven.form;

import com.raven.swing.QuantityColorCellRenderer;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;


import com.raven.swing.ScrollBar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;

public class allStocks extends javax.swing.JPanel {
        QuantityColorCellRenderer q=new QuantityColorCellRenderer();
     
    public allStocks() throws Exception {
         initComponents();
         spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
       
       showStocks();
        
      TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setCellRenderer(new QuantityColorCellRenderer());
            
        }
       
    }
   
    
    public void showStocks() throws Exception{
     databaseCon db=new databaseCon();
        
     Connection con=db.getConnection();
     Statement st=con.createStatement();
                
     
     String q="SELECT product_name, SUM(product_quantity) AS total_quantity, SUM(product_quantity * product_price) AS total_price FROM product_details GROUP BY product_name";
     ResultSet rs=st.executeQuery(q);
     ResultSetMetaData rsmd=rs.getMetaData();
     
      DefaultTableModel model=(DefaultTableModel) table.getModel();
      
     
        String productName,totalQuantity,totalPrice;
        while(rs.next()){
            productName=rs.getString("product_name");
            totalQuantity=rs.getString("total_quantity");
            totalPrice=rs.getString("total_price");
            
            String []row={productName,totalQuantity,totalPrice};
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

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));


        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("All Stocks");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name","Quantity","Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
                .addGap(2, 2, 2)
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

    