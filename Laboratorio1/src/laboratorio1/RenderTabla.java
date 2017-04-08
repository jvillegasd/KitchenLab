/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Johnny
 */
public class RenderTabla extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        List tablal=MeserosTabla.mesa;
        if (column==1 && ((Mesas)tablal.geto(row)).dispo.equals("si")) {
            this.setOpaque(true);
            this.setBackground(Color.GREEN);
        }
        if (column==1 && ((Mesas)tablal.geto(row)).dispo.equals("no")) {
            this.setOpaque(true);
            this.setBackground(Color.RED);
        }
        if (column==2 && ((Mesas)tablal.geto(row)).estado.equals("noa")) {
            this.setOpaque(true);
            this.setBackground(Color.BLUE);
        }
        if (column==2 && ((Mesas)tablal.geto(row)).estado.equals("pro")) {
            this.setOpaque(true);
            this.setBackground(Color.YELLOW);
        }
        if (column==2 && ((Mesas)tablal.geto(row)).estado.equals("listo")) {
            this.setOpaque(true);
            this.setBackground(Color.LIGHT_GRAY);
        }
        if (column==0 || column==3) {
            this.setOpaque(true);
            this.setBackground(null);
        }
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }
}
