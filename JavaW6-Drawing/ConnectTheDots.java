import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static java.awt.Color.BLACK;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] boxArray = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] otherArray = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        DrawConnection(boxArray, graphics);
        DrawConnection(otherArray, graphics);


    }

    public static void DrawConnection(int[][] toConnect, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < (toConnect.length) - 1; i++) {
            graphics.drawLine(toConnect[i][0], toConnect[i][1], toConnect[i + 1][0], toConnect[i + 1][1]);
            if (i == (toConnect.length) - 2) {
                graphics.drawLine(toConnect[i + 1][0], toConnect[i + 1][1], toConnect[0][0], toConnect[0][1]);
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
