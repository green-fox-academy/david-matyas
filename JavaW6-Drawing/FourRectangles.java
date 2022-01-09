import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!

        for (int i = 0; i < 4; i++) {
            graphics.setColor(new Color(randomNumber(255),randomNumber(255),randomNumber(255)));
            graphics.drawRect(randomNumber(WIDTH),randomNumber(HEIGHT),randomNumber(WIDTH),randomNumber(HEIGHT));
        }


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

