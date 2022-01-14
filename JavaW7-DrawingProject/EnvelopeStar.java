import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void drawImage(Graphics graphics) {
        int x = 0;
        int y = 0;
        int squareSide = WIDTH;

        drawEnvelopeStar(x, y, squareSide, graphics);
    }

    public static void drawEnvelopeStar(int x, int y, int squareSide, Graphics graphics) {
        int middlePoint = squareSide / 2;
        int step = middlePoint / 20;
        int totalSteps = middlePoint / step;

        graphics.setColor(new Color(54, 213, 55));
        for (int i = 0; i < totalSteps; i++) {
            graphics.drawLine(x + (step * i), middlePoint, middlePoint, middlePoint - (step * i));     //A1 left top
            graphics.drawLine(squareSide - (step * i), middlePoint, middlePoint, middlePoint - (step * i));     //A2 right top
            graphics.drawLine(middlePoint, middlePoint + (step * i), x + (step * i), middlePoint);//B1 left bottom
            graphics.drawLine(middlePoint, middlePoint + (step * i), squareSide - (step * i), y + middlePoint);//B2 right bottom
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

