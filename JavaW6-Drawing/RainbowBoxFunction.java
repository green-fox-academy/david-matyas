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
        squareColor(10, 255, graphics);
//        graphics.setColor(new Color(255,0,0));
//        graphics.fillRect(10,10,150 ,150);
    }

    public static void squareColor(int size, int color, Graphics graphics) {
        ArrayList<String> colors= new ArrayList<String>();
        colors.add("bax");
     //   graphics.setColor(new Color(255,255,255));


        for (int i = 0; i < colors.size(); i++) {
            graphics.setColor(new Color(255,0,0));
  //          graphics.setColor(Color.decode("RED"));
            graphics.fillRect(10,10,size,size);
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