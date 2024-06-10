
package com.raven.swing;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class StatusCellRenderer extends DefaultTableCellRenderer {
    

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        cellComponent.setBackground(Color.WHITE);
        // Assuming the status column is the last column in the table
        int statusColumnIndex = table.getColumnCount() - 3;
        Object statusValue = table.getValueAt(row, statusColumnIndex);
        System.out.println("Status Value: " + statusValue);

        if (statusValue != null && statusValue.toString().equalsIgnoreCase("Done")) {
            cellComponent.setBackground(new Color(219, 249, 219)); // Light green
            cellComponent.setForeground(new Color(0, 0, 0)); // Dark green
        } else {
            cellComponent.setBackground(new Color(251, 207, 205)); // Light red
            cellComponent.setForeground(new Color(0, 0, 0)); // Dark red
        }

        return cellComponent;
    }
}

