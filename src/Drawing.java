import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(1600, 1000);
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



        int bx1;
        int by1;

        int bx2 = 100;
        int by2 = 400;

        int bred = 127;
        int bgreen = 127;
        int bblue = 127;


        for (int a = 0;    ; a = a + 1) {


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
            if (x2 < 0) x2 = 0;
            if (y2 < 0) y2 = 0;
            if (x2 >= 1600) x2 = 1599;
            if (y2 >= 1000) y2 = 999;
            g.drawLine(x1, y1, x2, y2);



            int bx = r.nextInt(3);
            bx = bx - 1;
            int by = r.nextInt(3);
            by = by - 1;

            bred = bred + r.nextInt(3) - 1;
            bgreen = bgreen + r.nextInt(3) - 1;
            bblue = bblue + r.nextInt(3) - 1;

            if (bred < 0) bred = 0;
            if (bgreen < 0) bgreen = 0;
            if (bblue < 0) bblue = 0;
            if (bred > 255) bred = 255;
            if (bgreen > 255) bgreen = 255;
            if (bblue > 255) bblue = 255;
            g.setColor(new Color(bred, bgreen, bblue));



            bx1 = bx2;
            by1 = by2;
            bx2 = bx2 + bx;
            by2 = by2 + by;
            if (bx2 < 0) bx2 = 0;
            if (by2 < 0) by2 = 0;
            if (bx2 >= 1600) bx2 = 1599;
            if (by2 >= 1000) by2 = 999;
            g.drawLine(bx1, by1, bx2, by2);
            g.drawLine(x1,y1,bx1,by1);
        }
    }
}