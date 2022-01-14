import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void drawImage(Graphics graphics) {

        int totalRows = 8;
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalRows; j++) {
                if (i == 0) {
                    drawPatern(0, (WIDTH / totalRows) * j, WIDTH / totalRows, graphics);
                } else if (j == 0){
                    drawPatern((WIDTH / totalRows) * i, 0, WIDTH / totalRows, graphics);
                } else {
                    drawPatern((WIDTH / totalRows) * i, (WIDTH / totalRows) * j, WIDTH / totalRows, graphics);
                }
            }
        }
    }

    public static void drawPatern(int x, int y, int squareSide, Graphics graphics) {
        int step = squareSide / 20;
        int totalSteps = squareSide / step;
        graphics.setColor(new Color(182, 74, 244));
        for (int i = 0; i < totalSteps; i++) {
            graphics.drawLine(x + (step * i), y, x + squareSide, y + (step * i));
        }
        graphics.setColor(new Color(54, 213, 55));
        for (int i = 0; i < totalSteps; i++) {
            graphics.drawLine(x, y + (step * i), x + (step * i), y + squareSide);
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
