/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.main;

import com.raven.chart.ModelChart;
import com.raven.form.databaseCon;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAVEN
 */
public class Main2 extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private Map<String, Double> monthWiseData = new HashMap<>();
    public Main2() throws Exception {
        initComponents();
        getContentPane().setBackground(new Color(28,181,224));
//        chart.addLegend("Income", new Color(245, 189, 135));
        chart.addLegend("Income", new Color(28,181,224));
////        chart.addLegend("Profit", new Color(189, 135, 245));
////        chart.addLegend("Cost", new Color(139, 229, 222));
//        chart.addData(new ModelChart("January", new double[]{500}));
//        chart.addData(new ModelChart("February", new double[]{600}));
//        chart.addData(new ModelChart("March", new double[]{200}));
//        chart.addData(new ModelChart("April", new double[]{480}));
//        chart.addData(new ModelChart("May", new double[]{350}));
//        chart.addData(new ModelChart("June", new double[]{190}));

        fetchAndPopulateData();
        populateChartWithData();
    }
    

    private void fetchAndPopulateData() throws Exception {
        try {
             databaseCon db=new databaseCon();
             Connection connection=db.getConnection();
            String query = "SELECT MONTH(STR_TO_DATE(date, '%d-%m-%Y')) AS month, SUM(gst_amt) AS total_amount FROM gst_bill GROUP BY MONTH(STR_TO_DATE(date, '%d-%m-%Y'))";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int month = resultSet.getInt("month");
                double totalAmount = resultSet.getDouble("total_amount");
                // Assuming month is represented as an integer (1 for January, 2 for February, etc.)
                // You can convert it to month names if necessary
                monthWiseData.put(getMonthName(month), totalAmount);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Populate chart with fetched data
    private void populateChartWithData() {
        for (Map.Entry<String, Double> entry : monthWiseData.entrySet()) {
            chart.addData(new ModelChart(entry.getKey(), new double[]{entry.getValue()}));
        }
    }

    // Utility method to get month name from month number
    private String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart = new com.raven.chart.Chart();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Month Wise Income");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main2().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.Chart chart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
