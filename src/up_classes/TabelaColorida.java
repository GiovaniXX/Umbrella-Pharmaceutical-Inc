package up_classes;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TabelaColorida {

    public static void destacarLinhas(JTable tabela) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                super.setValue(value);
                setBackground(getRowBackground(tabela.getSelectedRow()));
                setForeground(Color.WHITE);
            }
        };

        for (int i = 0; i < tabela.getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    private static Color getRowBackground(int row) {
        return row % 2 == 0 ? Color.BLACK : Color.BLUE;
    }
}
