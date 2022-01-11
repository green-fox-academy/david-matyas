import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.RED;
import static java.awt.Color.decode;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        squareColor(70, "#000000", graphics);
    }

    public static void squareColor(int size, String color, Graphics graphics) {

        ArrayList<String> colors= new ArrayList<String>();
        colors.add("#FF0000"); // Red
        colors.add("#FFA500"); // Orange
        colors.add("#FFFF00"); // Yellow
        colors.add("#00FF00"); // Green
        colors.add("#0000FF"); // Blue
        colors.add("#4B0082"); // Indigo
        colors.add("#8F00FF"); // Violet
         for (int i = 0; i < colors.size(); i++) {
            graphics.setColor(Color.decode(colors.get(i)));
              graphics.fillRect((((WIDTH/2)-(size/2))+(size/colors.size())*i),(HEIGHT/2)-(size/2),size/colors.size(),size);
        }
        graphics.setColor(Color.decode(color));
        graphics.drawRect((WIDTH/2)-(size/2),(HEIGHT/2)-(size/2),size,size);

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