import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(1000, 1000);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Random r = new Random();


        int x1;
        int y1;

        int x2 = 500;
        int y2 = 400;

        int red = 127;
        int green = 127;
        int blue = 127;


        for (int a = 0;; a = a + 1) {


            int x = r.nextInt(3);
            x = x - 1;
            int y = r.nextInt(3);
            y = y - 1;

            red = red + r.nextInt(3) - 1;
            green = green + r.nextInt(3) - 1;
            blue = blue + r.nextInt(3) - 1;

            if (red < 0) red = 0;
            if (green < 0) green = 0;
            if (blue < 0) blue = 0;
            if (red > 255) red = 255;
            if (green > 255) green = 255;
            if (blue > 255) blue = 255;

            g.setColor(new Color(red, green, blue));


            x1 = x2;
            y1 = y2;
            x2 = x2 + x;
            y2 = y2 + y;
            if (x2 < 10) x2 = 10;
            if (y2 < 10) y2 = 10;
            if (x2 >= 1000) x2 = 999;
            if (y2 >= 1000) y2 = 999;
            g.drawLine(x1, y1, x2, y2);
        }
    }
}