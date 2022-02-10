import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTriangles {
    public static void drawImage(Graphics graphics) {
        int size = 100;
        int x = (WIDTH / 2);
        int y = (HEIGHT / 2);
        DrawBackground(x, y, size, graphics);
        DrawTriangles(x, y, size, graphics);
    }

    public static void DrawBackground(int x, int y, int size, Graphics graphics) {
        int[] xPointBg = new int[3];
        int[] yPointBg = new int[3];
        graphics.setColor(Color.WHITE);
        for (int i = 0, angles = 60; i < xPointBg.length; i++, angles += 120) {
            xPointBg[i] = x - (int) ((size * 2) * Math.sin(Math.toRadians(angles)));
            yPointBg[i] = y - (int) ((size * 2) * Math.cos(Math.toRadians(angles)));
        }
        graphics.fillPolygon(xPointBg, yPointBg, xPointBg.length);
        graphics.setColor(Color.BLACK);
        graphics.drawPolygon(xPointBg, yPointBg, xPointBg.length);
    }

    public static void DrawTriangles(int x, int y, int size, Graphics graphics) {
        if (size < 5) {
            return;
        }
        int[] xPointOut = new int[3];
        int[] yPointOut = new int[3];
        int angle = 0;
        for (int i = 0; i < xPointOut.length; i++, angle += 120) {
            double vY = y - (size * Math.cos(Math.toRadians(angle)));
            xPointOut[i] = (int) (x - size * Math.sin(Math.toRadians(angle)));
            yPointOut[i] = (int) (y - size * Math.cos(Math.toRadians(angle)));
            DrawTriangles(x - (int) (size * Math.sin(Math.toRadians(angle + 60))),
                    y - (int) (size * Math.cos(Math.toRadians(angle + 60))),
                    size / 2, graphics);
        }
        graphics.setColor(new Color((int)Math.floor(Math.random()*(256)), (int)Math.floor(Math.random()*(256)), (int)Math.floor(Math.random()*(256))));
        graphics.drawPolygon(xPointOut, yPointOut, xPointOut.length);
        graphics.fillPolygon(xPointOut, yPointOut, xPointOut.length);

    }


    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
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
            drawImage(graphics);
        }
    }
}
