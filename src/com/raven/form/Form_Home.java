package com.raven.form;


import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.main.Main2;
import com.raven.model.ModelCard;
import com.raven.swing.QuantityColorCellRenderer;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Form_Home extends javax.swing.JPanel implements MouseListener {
         
    private static boolean isOptionPaneShown = false; 
         int total_product_count, total_vendors_count,total_employee_count,daily_total,monthly_total;

    public Form_Home() throws Exception {
        initComponents();
       // QuantityColorCellRenderer qr=new QuantityColorCellRenderer();
       card3.addMouseListener(this);
        setOpaque(false);
       
        initData();
        allStocks a=new allStocks();
         if (!isOptionPaneShown) {
         SwingUtilities.invokeLater(() -> {
             try {
                 for (int row = 0; row < a.table.getRowCount(); row++) {
                     int quantity = Integer.parseInt(a.table.getValueAt(row, 1).toString());
                     if(quantity < 50) {
                         JOptionPane.showMessageDialog(this, "You May Have New Messages! Check Notifications!! ", "New Notification", JOptionPane.INFORMATION_MESSAGE);
                         isOptionPaneShown = true;
                         break;
                     }
                 }} catch (Exception ex) {
                 Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
             }
        });}
         
          
     
    }

    private void initData() throws Exception {
        initCardData();
      
    }

    private void initCardData() throws Exception {
        
        Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        setCard();
        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.MONETIZATION_ON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.BUSINESS_CENTER, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        
        card1.setData(new ModelCard("Total Product",  total_product_count, 95, icon1));
        card2.setData(new ModelCard("Daily Revenue",  daily_total, 95, icon2));
        card3.setData(new ModelCard("Monthly Revenue", monthly_total, 95, icon3));
        card4.setData(new ModelCard("Total Vendors",  total_vendors_count, 95, icon4));
        card5.setData(new ModelCard("Total Employee",  total_employee_count, 95,icon1));
    }
     


    private void showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }
    
    private void setCard() throws Exception{
      databaseCon db=new databaseCon();
        
     Connection con=db.getConnection();
     Statement st=con.createStatement();
     
      String queryProducts = "SELECT COUNT(DISTINCT product_name) AS total_Products  FROM product_details";
      ResultSet rs=st.executeQuery(queryProducts);
      
            // Check if result set has data
            while (rs.next()) {
                total_product_count = rs.getInt("total_Products");
                System.out.println("Total unique products count: " + total_product_count);
            }
            
            
         String queryVendors = "SELECT COUNT(vendor_name) AS total_Vendors  FROM vendor_details";
            rs=st.executeQuery(queryVendors);
      
            // Check if result set has data
            while (rs.next()) {
                total_vendors_count = rs.getInt("total_Vendors");
                System.out.println("Total Vendors count: " + total_vendors_count);
            }
            
          String queryEmployees = "SELECT COUNT(name) AS total_Employees  FROM emp_details";
            rs=st.executeQuery(queryEmployees);
      
            // Check if result set has data
            while (rs.next()) {
                total_employee_count = rs.getInt("total_employees");
                System.out.println("Total Employee count: " + total_employee_count);
            }
            String queryDailyTotal = "SELECT SUM(gst_amt) AS total FROM gst_bill WHERE DATE(STR_TO_DATE(date, '%d-%m-%Y')) = CURDATE()";

             //String queryDailyTotal = "SELECT SUM(gst_amt) AS total FROM gst_bill WHERE DATE(date) = CURDATE()";
             try {
                    rs = st.executeQuery(queryDailyTotal);

                    while (rs.next()) {
                        daily_total = rs.getInt("total");
                        System.out.println("Daily Revenue: " + daily_total);
                    }
                } catch (Exception e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }
         String querymonthlyTotal = "SELECT SUM(gst_amt) AS total FROM gst_bill WHERE YEAR(STR_TO_DATE(date, '%d-%m-%Y')) = YEAR(CURDATE()) AND MONTH(STR_TO_DATE(date, '%d-%m-%Y')) = MONTH(CURDATE())";
         rs = st.executeQuery(querymonthlyTotal);
        
        if (rs.next()) {
            monthly_total= rs.getInt("total");
        }
            
        st.close();
        con.close();
            
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws Exception {
       //toDoList = new ToDoListApp();
        card1 = new com.raven.component.Card();
        jLabel1 = new javax.swing.JLabel();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        card4 = new com.raven.component.Card();
        card5 = new com.raven.component.Card();
        panelTransparent1 = new com.raven.swing.PanelTransparent();
        //jScrollPane1 = new javax.swing.JScrollPane();
        //table1 = new com.raven.swing.table.Table();
        jLabel5 = new javax.swing.JLabel();
        panelTransparent2 = new com.raven.swing.PanelTransparent();
       // noticeBoard = new com.raven.swing.noticeboard.NoticeBoard();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        
         Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
         card3.setCursor(cursor);
       
        //AppFrame frame=new AppFrame();
        toDoListFrame todo=new toDoListFrame();
        
        JPanel p=new JPanel();
       // p.setSize(400,300);
        p.setBounds(50, 200, 550, 400); 
        //p.setPreferredSize(new Dimension(getContentPane().getWidth(), 500));
        p.setBackground(Color.WHITE);
        p.setLayout(new BorderLayout());
       
       p.add(todo, BorderLayout.CENTER);
        
        add(p);
        
//        AppFrame appFrame = new AppFrame();
//        TitleBar titleBar = appFrame.getTitleBar();
//        Footer footer = appFrame.getFooter();
//        List list = appFrame.getList();

        card1.setBackground(new java.awt.Color(2,170,189));
        card1.setColorGradient(new java.awt.Color(102, 255, 204));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Dashboard / Home");

        card2.setBackground(new java.awt.Color(237, 85, 101));
        card2.setColorGradient(new java.awt.Color(184, 82, 118));

        card3.setBackground(new java.awt.Color(194, 85, 1));
        card3.setColorGradient(new java.awt.Color(255, 212, 99));

        card4.setBackground(new java.awt.Color(60, 195, 0));
        card4.setColorGradient(new java.awt.Color(208, 255, 90));
        
        card5.setBackground(new java.awt.Color(17,153,142));
        card5.setColorGradient(new java.awt.Color(22,94,49));

        
        
       
       // panelTransparent1.setTransparent(0.5F);
       


        jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 76, 76));
        jLabel5.setText("To do list");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

       // javax.swing.GroupLayout panelTransparent1Layout = new javax.swing.GroupLayout(panelTransparent1);
       // panelTransparent1.setLayout(panelTransparent1Layout);


        panelTransparent2.setTransparent(0.5F);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(105, 105, 105));
        jLabel3.setText("Simple Miglayout API Doc");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 76, 76));
        jLabel2.setText("Notice Board");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel4.setOpaque(true);
        
        
        
       
        javax.swing.GroupLayout panelTransparent2Layout = new javax.swing.GroupLayout(panelTransparent2);
        panelTransparent2.setLayout(panelTransparent2Layout);
      
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        //.addComponent(panelTransparent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTransparent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 //.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE) // Adjust size as needed
               
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTransparent2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    //.addComponent(panelTransparent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                // .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE) // Adjust size as needed

                    .addContainerGap())
        );
        
       
//       // javax.swing.GroupLayout panelTransparent1Layout = new javax.swing.GroupLayout(panelTransparent1);
//    panelTransparent1.setLayout(panelTransparent1Layout);
//    panelTransparent1Layout.setHorizontalGroup(
//    panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//    .addGroup(panelTransparent1Layout.createSequentialGroup()
//        .addContainerGap()
//        .addGroup(panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jLabel5)
//            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)) // Adjust size as needed
//        .addContainerGap())
//    );
//    panelTransparent1Layout.setVerticalGroup(
//    panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//    .addGroup(panelTransparent1Layout.createSequentialGroup()
//        .addContainerGap()
//        .addComponent(jLabel5)
//        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//        .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE) // Adjust size as needed
//        .addContainerGap())
//);
        
//     
//        panelTransparent1.setLayout(panelTransparent1Layout);
//        panelTransparent1Layout.setHorizontalGroup(
//            panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(panelTransparent1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(panelTransparent1Layout.createSequentialGroup()
//                        .addComponent(jLabel5)
//                    //.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                        .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                        .addComponent(panelTransparent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                 .addContainerGap())
//                );
//        panelTransparent1Layout.setVerticalGroup(
//            panelTransparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(panelTransparent1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jLabel5)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
//                .addContainerGap())
//        );
//        

        
        
    }// </editor-fold>//GEN-END:initComponents

    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private com.raven.component.Card card4;
    private com.raven.component.Card card5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
   private com.raven.swing.PanelTransparent panelTransparent1;
    private com.raven.swing.PanelTransparent panelTransparent2;

    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
         if (e.getSource() == card3) {
            // Perform action when card3 is clicked
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main2().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
            // You can add your logic here for what should happen when card3 is clicked
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
