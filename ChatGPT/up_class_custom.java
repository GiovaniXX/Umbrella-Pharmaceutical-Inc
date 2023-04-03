package up_class_custom;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class ComboBox<E> extends JComboBox<E> {

    private static final long serialVersionUID = 1L;

    private String labelText = "Label";
    private Color lineColor = new Color(3, 155, 216);
    private boolean mouseOver;

    public ComboBox() {
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(15, 3, 5, 3));
        setUI(new ComboUI(this));
        setRenderer(new DefaultListCellRenderer() {
            private static final long serialVersionUID = 1L;

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                    boolean cellHasFocus) {
                Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                if (isSelected) {
                    component.setBackground(new Color(240, 240, 240));
                }
                return component;
            }
        });
    }

    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    private class ComboUI extends BasicComboBoxUI {

        private final Animator animator;
        private boolean animateHintText = true;
        private float location;
        private boolean show;
        private final ComboBox<E> combo;

        public ComboUI(ComboBox<E> combo) {
            this.combo = combo;
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent me) {
                    mouseOver = true;
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    mouseOver = false;
                    repaint();
                }
            });

            addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent fe) {
                    showing(true);
                }
            });

            addItemListener((ItemEvent ie) -> {
                if (!isFocusOwner()) {
                    if (getSelectedIndex() == -1) {
