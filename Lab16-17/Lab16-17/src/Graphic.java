import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Graphic extends JFrame {

    public Graphic() {
        super("XOR paint test");
        JPanel cp = new JPanel(new BorderLayout());
        cp.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                BorderFactory.createLineBorder(Color.blue)));
        cp.add(new DrawPanel());
        setContentPane(cp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Graphic().setVisible(true);
    }

    static class DrawPanel extends JPanel {

        private static final Color xorColor = Color.cyan;
        private static final Color paintColor = Color.gray;

        private int x1;
        private int y1;
        private int x2;
        private int y2;

        private java.util.List<Rectangle> rects;

        DrawPanel() {
            MouseHandler mh = new MouseHandler();
            addMouseListener(mh);
            addMouseMotionListener(mh);
            setBackground(Color.white);
            rects = new ArrayList<Rectangle>();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            Paint p = g2d.getPaint();
            g2d.setColor(paintColor);
            for (Rectangle rect : rects) {
                g2d.drawOval(rect.x, rect.y, rect.width, rect.height);
            }
            g2d.setPaint(p);
        }

        class MouseHandler extends MouseAdapter {

            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
                x2 = x1;
                y2 = y1;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int ltX = Math.min(x1, x2);
                int ltY = Math.min(y1, y2);
                int rbX = Math.max(x1, x2);
                int rbY = Math.max(y1, y2);
                rects.add(new Rectangle(ltX, ltY, rbX - ltX, rbY - ltY));
                repaint(0);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int ltX = Math.min(x1, x2);
                int ltY = Math.min(y1, y2);
                int rbX = Math.max(x1, x2);
                int rbY = Math.max(y1, y2);
                Graphics2D g2d = (Graphics2D) getGraphics();
                Paint p = g2d.getPaint();
                g2d.setXORMode(xorColor);
                g2d.drawOval(ltX, ltY, rbX - ltX, rbY - ltY);
                x2 = e.getX();
                y2 = e.getY();
                ltX = Math.min(x1, x2);
                ltY = Math.min(y1, y2);
                rbX = Math.max(x1, x2);
                rbY = Math.max(y1, y2);
                g2d.drawOval(ltX, ltY, rbX - ltX, rbY - ltY);
                g2d.setPaintMode();
                g2d.setPaint(p);
            }
        }
    }
}
