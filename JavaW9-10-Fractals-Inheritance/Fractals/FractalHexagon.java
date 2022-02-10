import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalHexagon {
    public static void drawImage(Graphics graphics) {
        int size = WIDTH / 2;
        int x = WIDTH / 2;
        int y = HEIGHT / 2;
        DrawHexagon(x, y, size, graphics);
    }

    public static void DrawHexagon(int x, int y, int size, Graphics graphics) {
        if (size < 5) {
            return;
        }
        int xPointOut[] = new int[6];
        int yPointOut[] = new int[6];
        int xPoint[] = new int[6];
        int yPoint[] = new int[6];
        int angle = 0;
        for (int i = 0; i < xPoint.length; i++, angle += 360 / 6) {
            xPointOut[i] = x + (int) (size * Math.cos(Math.toRadians(angle))); // point X
            yPointOut[i] = y + (int) (size * Math.sin(Math.toRadians(angle))); // point Y
            xPoint[i] = x - (int) ((size / 1.5) * Math.cos(Math.toRadians(angle)));
            yPoint[i] = y - (int) ((size / 1.5) * Math.sin(Math.toRadians(angle)));
            DrawHexagon(xPoint[i], yPoint[i], size / 3, graphics);


        }
        graphics.setColor(Color.BLACK);
        graphics.drawPolygon(xPointOut, yPointOut, xPoint.length);
    }


    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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
