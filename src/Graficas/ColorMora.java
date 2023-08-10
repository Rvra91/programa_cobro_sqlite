/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import java.awt.Color;
import java.awt.Component;
import static javafx.scene.paint.Color.color;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Ramon
 */
public class ColorMora extends JTable {
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex) {
        Component componente = super.prepareRenderer(renderer, rowIndex, columnIndex);
        String columnName = getColumnName(columnIndex);
        if (columnName.equals("Mora") && getValueAt(rowIndex, columnIndex).getClass().equals(Integer.class)) {
            int valor = Integer.parseInt(getValueAt(rowIndex, columnIndex).toString());
            if (valor >= 1) {
                componente.setBackground(Color.red);
                componente.setForeground(Color.white);
            } else {
                componente.setBackground(Color.white);
                componente.setForeground(Color.black);
            }
        }
        return componente;
    }
}

