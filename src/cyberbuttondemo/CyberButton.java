package cyberbuttondemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;

//==> DEV .: Giovani Chaves
//==> Date.: 19/05/2026

public class CyberButton extends JButton {

    // Propriedades visuais
    private Color colorBackground1 = new Color(37, 52, 68);
    private Color colorBackground2 = new Color(41, 63, 86);
    private Color colorPen = new Color(29, 200, 238);
    private final Color foreColor = new Color(245, 245, 245);
    private int borderRadius = 70;
    private int penWidth = 4;
    private float alpha = 0.8f; // Transparência (0.0f a 1.0f)

    // Animações
    private final Timer glowTimer;
    private float glowAlpha = 0.0f;
    private boolean glowIncreasing = true;

    // Construtor padrão (obrigatório para o GUI Builder)
    public CyberButton() {
        this("CyberButton");
    }

    public CyberButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setFont(new Font("Arial", Font.PLAIN, 14));
        setForeground(foreColor);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Timer para efeito de "glow" pulsante
        glowTimer = new Timer(50, (ActionEvent e) -> {
            if (glowIncreasing) {
                glowAlpha += 0.02f;
                if (glowAlpha >= 0.4f) {
                    glowIncreasing = false;
                }
            } else {
                glowAlpha -= 0.02f;
                if (glowAlpha <= 0.0f) {
                    glowIncreasing = true;
                }
            }
            repaint();
        });
        glowTimer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

        int width = getWidth();
        int height = getHeight();

        // Fundo com gradiente
        GradientPaint gp = new GradientPaint(0, 0, colorBackground1, 0, height, colorBackground2);
        g2.setPaint(gp);
        g2.fill(new RoundRectangle2D.Float(0, 0, width - 1, height - 1, borderRadius, borderRadius));

        // Borda "neon"
        g2.setColor(new Color(colorPen.getRed(), colorPen.getGreen(), colorPen.getBlue(), (int) (glowAlpha * 255)));
        g2.setStroke(new BasicStroke(penWidth));
        g2.draw(new RoundRectangle2D.Float(penWidth / 2, penWidth / 2, width - penWidth - 1, height - penWidth - 1, borderRadius, borderRadius));

        // Transparência
        
        // Texto
        super.paintComponent(g);
        g2.dispose();
    }

    // Métodos para customizar as propriedades
    public void setColorBackground1(Color c) {
        this.colorBackground1 = c;
        repaint();
    }

    public void setColorBackground2(Color c) {
        this.colorBackground2 = c;
        repaint();
    }

    public void setColorPen(Color c) {
        this.colorPen = c;
        repaint();
    }

    public void setBorderRadius(int r) {
        this.borderRadius = r;
        repaint();
    }

    public void setPenWidth(int w) {
        this.penWidth = w;
        repaint();
    }

    public void setAlpha(float a) {
        this.alpha = a;
        repaint();
    }
}
