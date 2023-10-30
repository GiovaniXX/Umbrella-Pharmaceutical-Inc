package up_class_custom;

import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
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
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class ComboBox<E> extends JComboBox<E> {

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

    private String labelText = "Label";
    private Color lineColor = new Color(3, 155, 216);
    private boolean mouseOver;

    public ComboBox() {
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(15, 3, 5, 3));
        setUI(new ComboUI(this));
        setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean bln, boolean blnl) {
                Component com = super.getListCellRendererComponent(jlist, o, i, bln, blnl);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                if (bln) {
                    com.setBackground(new Color(240, 240, 240));
                }
                return com;
            }
        });
    }

    private static class ScrollBarCustom {

        private int unitIncrement;
        private Color foregroundColor;

        public ScrollBarCustom() {
            // Defina o valor padrão desejado
            this.unitIncrement = 0;
            // Defina a cor padrão desejada
            this.foregroundColor = Color.BLACK;
        }

        public int getUnitIncrement() {
            return unitIncrement;
        }

        private void setUnitIncrement(int unitIncrement) {
            this.unitIncrement = unitIncrement;
        }

        public Color getForegroundColor() {
            return foregroundColor;
        }

        private void setForeground(Color color) {
            this.foregroundColor = color;
        }
    }

    private class ComboUI extends BasicComboBoxUI {

        private final Animator animator;
        private boolean animateHinText = true;
        private float location;
        private boolean show;
        private final ComboBox combo;

        public ComboUI(ComboBox combo) {
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
                        showing(true);
                    } else {
                        showing(false);
                    }
                }
            });

            addPopupMenuListener(new PopupMenuListener() {
                @Override
                public void popupMenuWillBecomeInvisible(PopupMenuEvent pme) {
                    arrowButton.setBackground(new Color(200, 200, 200));
                }

                @Override
                public void popupMenuWillBecomeVisible(PopupMenuEvent pme) {
                    arrowButton.setBackground(new Color(150, 150, 150));
                }

                @Override
                public void popupMenuCanceled(PopupMenuEvent pme) {
                    arrowButton.setBackground(new Color(150, 150, 150));
                }
            });

            TimingTarget target = new TimingTargetAdapter() {
                @Override
                public void begin() {
                    animateHinText = getSelectedIndex() == - 1;
                }

                @Override
                public void timingEvent(float fraction) {
                    location = fraction;
                    repaint();
                }
            };
            animator = new Animator(300, target);
            animator.setResolution(0);
            animator.setAcceleration(0.5f);
            animator.setDeceleration(0.5f);
        }

        @Override
        public void paintCurrentValueBackground(Graphics grphcs, Rectangle rctngl, boolean bln) {
            //super.paintCurrentValueBackground(grphcs, rctngl, bln);
        }

        @Override
        protected JButton createArrowButton() {
            return new ArrowButton();
        }

        @Override
        protected ComboPopup createPopup() {
            BasicComboPopup pop = new BasicComboPopup(comboBox) {
                @Override
                protected JScrollPane createScroller() {
                    list.setFixedCellHeight(30);
                    JScrollPane scroll = new JScrollPane(list);
                    scroll.setBackground(Color.WHITE);
                    ScrollBarCustom sb = new ScrollBarCustom();
                    //Scrollbar sb = new Scrollbar();
                    sb.setUnitIncrement(30);
                    sb.setForeground(new Color(180, 180, 180));
                    //scroll.setVerticalScrollBar(sb);
                    return scroll;
                }
            };
            pop.setBorder(new LineBorder(new Color(200, 200, 200), 1));
            return pop;
        }

        @Override
        public void paint(Graphics grphcs, JComponent jc) {
            super.paint(grphcs, jc);
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR);

            int width = getWidth();
            int height = getHeight();

            if (mouseOver) {
                g2.setColor(lineColor);
            } else {
                g2.setColor(new Color(150, 150, 150));
            }

            g2.fillRect(2, height - 1, width - 4, 1);
            createHintText(g2);
            createLineStyle(g2);
            g2.dispose();
        }

        private void createHintText(Graphics2D g2) {
            Insets in = getInsets();
            g2.setColor(new Color(150, 150, 150));
            FontMetrics ft = g2.getFontMetrics();
            Rectangle2D r2 = ft.getStringBounds(combo.getLabelText(), g2);
            double height = getHeight() - in.top - in.bottom;
            double textY = (height - r2.getHeight()) / 2;
            double size;

            if (animateHinText) {
                if (show) {
                    size = 18 * (1 - location);
                } else {
                    size = 18 * location;
                }
            } else {
                size = 18;
            }
            g2.drawString(combo.getLabelText(), in.right, (int) (in.top + textY + ft.getAscent() - size));
        }

        private void createLineStyle(Graphics2D g2) {
            if (isFocusOwner()) {
                double width = getWidth() - 4;
                int height = getHeight();
                g2.setColor(lineColor);
                double size;

                if (show) {
                    size = width * (1 - location);
                } else {
                    size = width * location;
                }
                double x = (width - size) / 2;
                g2.fillRect((int) (x + 2), height - 2, (int) size, 2);
            }
        }

        private void showing(boolean action) {
            if (animator.isRunning()) {
                animator.stop();
            } else {
                location = 1;
            }
            animator.setStartFraction(1f - location);
            show = action;
            location = 1f - location;
            animator.start();
        }

        private class ArrowButton extends JButton {

            public ArrowButton() {
                setContentAreaFilled(false);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                setBackground(new Color(150, 150, 150));
            }

            @Override
            public void paint(Graphics grphcs) {
                super.paint(grphcs);
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                int width = getWidth();
                int height = getHeight();
                int size = 10;
                int x = (width - size) / 2;
                int y = (height - size) / 2 + 2;
                int px[] = {x, x + size, x + size / 2};
                int py[] = {y, y, y + size};
                g2.setColor(getBackground());
                g2.fillPolygon(px, py, px.length);
                g2.dispose();
            }
        }
    }
}
