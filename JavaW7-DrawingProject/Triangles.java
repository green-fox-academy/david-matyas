import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {
        int x = 1;
        int y = HEIGHT;
        int size = 33;
        int angle = 60;
        int counter = WIDTH / size;
        int rows = 0;
        while (counter > 0) {
            for (int i = 0; i < counter; i++) {
                DrawTriangles(x, y, size, graphics);
                x += size;
            }
            rows++;
            counter = counter - 1;
            x = (size / 2) * rows;
            y = y - (int) (size * Math.sin(Math.toRadians(angle)));
        }
    }

    public static void DrawTriangles(int x, int y, int size, Graphics graphics) {
        int[] xPoint = new int[3];
        int[] yPoint = new int[3];
        int angle = 60;
        xPoint[0] = x;
        yPoint[0] = y;
        xPoint[1] = x + size;
        yPoint[1] = y;
        xPoint[2] = x + (size) / 2;
        yPoint[2] = y - (int) (size * Math.sin(Math.toRadians(angle)));
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < (xPoint.length); i++) {
            if (i == (xPoint.length) - 1) {
                graphics.drawLine(xPoint[i], yPoint[i], xPoint[0], yPoint[0]);
            } else {
                graphics.drawLine(xPoint[i], yPoint[i], xPoint[i + 1], yPoint[i + 1]);
            }
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
