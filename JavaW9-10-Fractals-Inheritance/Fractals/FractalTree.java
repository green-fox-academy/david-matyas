import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalTree {
    public static void drawImage(Graphics graphics) {
        int size = 60;
        int x = WIDTH / 2;
        int y = HEIGHT;
        int angle = 180;
        graphics.setColor(Color.GREEN);
        graphics.drawLine(x, y, x, y - size); // draw tree root
        DrawTree(x, y - size, size, angle, graphics);
    }

    public static void DrawTree(int x, int y, int size, int angle, Graphics graphics) {
        if (size < 10) {
            return;
        }
        int x1;
        int y1;
        for (int i = -20; i <= 20; i += 20) { //angle <= (270 + (i * 15))
            x1 = (int) (x + size * Math.sin(Math.toRadians(angle + i)));
            y1 = (int) (y + size * Math.cos(Math.toRadians(angle + i)));
            graphics.drawLine(x, y, x1, y1);

//            if (size < 20) { // Apple tree :-)
//                graphics.setColor(Color.RED);
//                graphics.drawOval(x1, y1, 2, 2);
//            }
//            graphics.setColor(Color.GREEN);
            DrawTree(x1, y1, (int) (size / 1.2), angle + i, graphics);

        }


    }


    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FractalTree.ImagePanel panel = new FractalTree.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                jFrame.repaint(5L);
//            }
//        };
//
//        var timer = new Timer();
//        timer.scheduleAtFixedRate(timerTask, 100, 1);
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
