import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void drawImage(Graphics graphics) {
            // Reproduce this:
            // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

            drawPurpleCascade (10,6,10, graphics);


    }
    public static void drawPurpleCascade (int size,int count,int grow, Graphics graphics)
    {

        for (int i = 0, newXY = 0; i < count; i++) {
            graphics.setColor(new Color(177,69,243));
            graphics.fillRect(newXY, newXY,size+(grow*i),size+(grow*i));
            graphics.setColor(new Color(0, 0, 0));
            graphics.drawRect(newXY,newXY,size+(grow*i),size+(grow*i));
            newXY += size+(grow*i);
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

