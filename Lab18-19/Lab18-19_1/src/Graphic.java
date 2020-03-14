import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Graphic extends JFrame {

    private static final long serialVersionUID = 1L;

    public Graphic() {

        setSize(new Dimension(450, 450));
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                Shape rect = new Rectangle(50, 50, 340, 310);
                Shape rect_1 = new RoundRectangle2D.Double(67, 74, 300, 250, 5, 25);
                Shape rect_2 = new RoundRectangle2D.Double(97, 104, 240, 180, 5, 25);
                g2.draw(rect);
                g2.draw(rect_1);
                g2.draw(rect_2);
            }
        };
        setTitle("My Shapes");
        this.getContentPane().add(p);
    }

    public static void main(String arg[]) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //TODO Auto-generated method stub
                new Graphic();
            }
        });
    }

}