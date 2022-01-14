import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void drawImage(Graphics graphics) {
        int size = 15;
        int x = 100;
        int y = 100;
        int rotation = 0; // in degree
        int[][] xyPoint = HexagonPoints(x, y, size, rotation);
        int[] columnCount = {4, 5, 6, 7, 6, 5, 4};
        graphics.setColor(Color.BLACK);
        DrawHexagon(xyPoint, graphics);
        int moveX = (xyPoint[0][0] - xyPoint[2][0]);
        int moveY = (xyPoint[1][1] - xyPoint[5][1]);
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < columnCount.length; i++) {
            for (int j = 0; j < columnCount[i]; j++) {
                DrawHexagon(HexagonPoints(x, y + moveY * j, size, rotation), graphics);
            }
            x += moveX;
            if (i == columnCount.length - 1) {
                y -= moveY / 2;
            } else {
                if (columnCount[i] < columnCount[i + 1]) {
                    y -= moveY / 2;
                } else {
                    y += moveY / 2;
                }
            }
        }
    }

    public static int[][] HexagonPoints(int x, int y, int size, int rotation) {
        int[][] xyPoint = new int[7][2];

        for (int i = 0, angle = 0 + rotation; i < xyPoint.length - 1; i++, angle += 60) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    xyPoint[i][j] = x + (int) (size * Math.cos(Math.toRadians(angle))); // point X
                } else {
                    xyPoint[i][j] = y + (int) (size * Math.sin(Math.toRadians(angle))); // point Y
                }
            }
        }
        xyPoint[6][0] = xyPoint[0][0]; // connect last x and first x point
        xyPoint[6][1] = xyPoint[0][1]; // connect last y and first y point
        return xyPoint;
    }

    public static void DrawHexagon(int[][] xyPoint, Graphics graphics) {

        for (int i = 0; i < xyPoint.length - 1; i++) {
            for (int j = 0; j < 2; j++) { // j = 0 is  x point, j = 1 is y point
                if (j == 0) {
                    graphics.drawLine(xyPoint[i][j], xyPoint[i][j + 1], xyPoint[i + 1][j], xyPoint[i + 1][j + 1]);
                } else {
                    graphics.drawLine(xyPoint[i][j - 1], xyPoint[i][j], xyPoint[i + 1][j - 1], xyPoint[i + 1][j]);
                }
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
