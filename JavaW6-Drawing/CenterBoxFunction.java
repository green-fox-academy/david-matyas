import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void drawImage(Graphics graphics){
        // Create a function that takes 2 parameters and draws one square
        // Parameters: the square size and the graphics
        // The function shall draw a square of that size to the center of the canvas
        // Draw 3 squares with that function
        // (the squares should not be filled otherwise they will hide each other)
        // Avoid code duplication!
        for (int i = 0; i < 3; i++) {
            drawCenteredSquare(randomNumber((WIDTH/2)), graphics);
        }


    }
    public static void drawCenteredSquare(int size, Graphics graphics) {
        graphics.setColor(new Color(0, 0, 0, 255));
        graphics.drawRect(WIDTH/2,HEIGHT/2,size,size);
    }

    public static int randomNumber(int max) {
        return (int) (Math.random() * max);
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