import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern
        DrawCheckerboard(20, graphics);

    }
    public static void DrawCheckerboard(int size, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        int y = 0;
        for (int j = 0; j < ((HEIGHT / size)); j++) { // loop for row
            int x = 0;
            if ((j % 2) == 0) {
                for (int i = 0; i < ((WIDTH / size) / 2); i++) { // loop column- in each loop is created black and white square
                    graphics.drawRect(x, y, size, size);
                    x += size;
                    graphics.fillRect(x, y, size, size);
                    x += size;
                }
            } else {
                for (int i = 0; i < ((WIDTH / size) / 2); i++) {
                    graphics.fillRect(x, y, size, size);
                    x += size;
                    graphics.drawRect(x, y, size, size);
                    x += size;
                }
            }
            y += size;
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
