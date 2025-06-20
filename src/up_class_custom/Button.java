package up_class_custom;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public final class Button extends JButton {

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Button() {
        setColor(Color.WHITE);
        colorOver = new Color(0, 107, 161);
        colorClick = new Color(0, 107, 161);
        borderColor = new Color(0, 107, 161);
        setContentAreaFilled(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
        });
    }

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}

//package up_class_custom;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import javax.swing.JButton;
//
//public final class Button extends JButton {
//
//    private boolean over = false;
//    private Color color = Color.WHITE;
//    private Color colorOver = new Color(0, 107, 161);
//    private Color colorClick = new Color(0, 107, 161);
//    private Color borderColor = new Color(0, 107, 161);
//    private int radius = 0;
//
//    public Button() {
//        setBackground(color);
//        setContentAreaFilled(false);
//        setFocusPainted(false);
//
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent me) {
//                setBackground(colorOver);
//                over = true;
//            }
//
//            @Override
//            public void mouseExited(MouseEvent me) {
//                setBackground(color);
//                over = false;
//            }
//
//            @Override
//            public void mousePressed(MouseEvent me) {
//                setBackground(colorClick);
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent me) {
//                setBackground(over ? colorOver : color);
//            }
//        });
//    }
//
//    public boolean isOver() {
//        return over;
//    }
//
//    public void setOver(boolean over) {
//        this.over = over;
//    }
//
//    public Color getColor() {
//        return color;
//    }
//
//    public void setColor(Color color) {
//        this.color = color;
//        setBackground(color);
//        repaint();
//    }
//
//    public Color getColorOver() {
//        return colorOver;
//    }
//
//    public void setColorOver(Color colorOver) {
//        this.colorOver = colorOver;
//        repaint();
//    }
//
//    public Color getColorClick() {
//        return colorClick;
//    }
//
//    public void setColorClick(Color colorClick) {
//        this.colorClick = colorClick;
//        repaint();
//    }
//
//    public Color getBorderColor() {
//        return borderColor;
//    }
//
//    public void setBorderColor(Color borderColor) {
//        this.borderColor = borderColor;
//        repaint();
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//        repaint();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g.create();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//        // Desenha a borda
//        g2.setColor(borderColor);
//        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
//
//        // Desenha o fundo
//        g2.setColor(getBackground());
//        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
//
//        g2.dispose();
//
//        // Desenha o texto e ícones normalmente
//        super.paintComponent(g);
//    }
//
//    @Override
//    protected void paintBorder(Graphics g) {
//        // Opcional: pode customizar a borda aqui se quiser
//    }
//}