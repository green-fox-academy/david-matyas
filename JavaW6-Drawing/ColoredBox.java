import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);

            graphics.setColor(Color.BLUE);
            graphics.drawLine(10,10,10,200);
            graphics.setColor(Color.RED);
            graphics.drawLine(10,200,200,200);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(200,200,200,10);
            graphics.setColor(Color.BLACK);
            graphics.drawLine(200,10,10,10);

        }
    }
}