import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        for (int i = 0; i < 100; i++) {

            DrawStar((int) (Math.random() * WIDTH),(int) (Math.random() * HEIGHT),(int) (Math.random() * (HEIGHT/50)),(int) (Math.random() * 255),graphics);
        }
       

    }

    public static void DrawStar(int x,int y, int size, int rgb, Graphics graphics){
        graphics.setColor(new Color(rgb,rgb,rgb));
        graphics.fillRect(x,y,size,size);


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
            setBackground(Color.BLACK);
            drawImage(graphics);
        }
    }
}
