import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {
        int step = 20;
        int totalXSteps = WIDTH / step;
        graphics.setColor(new Color(182, 74, 244));
        for (int i = 0; i < totalXSteps; i++) {
            graphics.drawLine(step * i, 0, WIDTH, step * i);
        }
        graphics.setColor(new Color(54, 213, 55));
        for (int i = 0; i < totalXSteps; i++) {
            graphics.drawLine(0, step * i, step * i, HEIGHT);
        }
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
        }
    }
}
