
package com.raven.swing;

import java.awt.Color;
import java.awt.Component;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import javax.swing.JTable;


import javax.swing.table.DefaultTableCellRenderer;


public class QuantityColorCellRenderer extends DefaultTableCellRenderer {
    
    
   public static String alertMsg;
   public String[] msg;
   public JFrame f;
   
   public final List<String> alertMessages = new ArrayList<>();
   public Object productName;
   public JTable table1;
   public StringBuilder message=null;
   public int quantity;
   
   public static final Map<Object, Boolean> alertedProducts = new HashMap<>();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // Get the value of the quantity column
         quantity = Integer.parseInt(table.getValueAt(row, 1).toString()); // Assuming quantity is in the second column (index 1)
        
        // Check if alert has been shown for this product
        Object productName = table.getValueAt(row, 0);
        if (quantity < 50) {
            cellComponent.setBackground(new Color(251, 207, 205));
            try {
                showAlertIfNeeded(table, row);
//                for(String s:alertMessages){
//              message.append(s).append("\n");
//              }
                
            } catch (Exception ex) {    
                Logger.getLogger(QuantityColorCellRenderer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (quantity < 100) {
            
            cellComponent.setBackground(new Color(255, 255, 194));
            
        } else {
            cellComponent.setBackground(new Color(219, 249, 219));
        }
        
      
        
        return cellComponent;
    }
    
    public void showAlertIfNeeded(JTable table, int row) throws Exception {
    // Check if alert has been shown for this product
    productName = table.getValueAt(row, 0);
    if (!alertedProducts.containsKey(productName)) {
        alertMsg = productName.toString() + " Stock less than 50!!";
        alertMessages.add(alertMsg);
        alertedProducts.put(productName, true);
    }
}

  
}
   

    
   
