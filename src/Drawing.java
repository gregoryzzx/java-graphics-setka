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

        float red = 127;
        float green = 127;
        float blue = 127;



        float  bx1;
        float  by1;

        float bx2 = 100;
        float by2 = 400;

        for (int a = 0;  ; a = a + 1) {


            int x = r.nextInt(3);
            x = x - 1;
            int y = r.nextInt(3);
            y = y - 1;



            red = red + r.nextFloat(-0.2f, +0.2f);
            green = green + r.nextFloat(-0.2f, +0.2f);
            blue = blue + r.nextFloat(-0.1f, +0.1f);

            if (red < 0) red = 0;
            if (green < 0) green = 0;
            if (blue < 0) blue = 0;
            if (red > 255) red = 255;
            if (green > 255) green = 255;
            if (blue > 255) blue = 255;

            g.setColor(new Color(red/255, green/255, blue/255));



            x1 = x2;
            y1 = y2;
            x2 = x2 + x;
            y2 = y2 + y;
            if (x2 < 0) x2 = 0;
            if (y2 < 0) y2 = 0;
            if (x2 >= 1600) x2 = 1599;
            if (y2 >= 1000) y2 = 999;

            float bx = r.nextFloat(-0.5f, +0.5f);
            float by = r.nextFloat(-0.5f, +0.5f);





            bx1 = bx2;
            by1 = by2;
            bx2 = bx2 + bx;
            by2 = by2 + by;
            if (bx2 < 0) bx2 = 0;
            if (by2 < 0) by2 = 0;
            if (bx2 >= 1600) bx2 = 1599;
            if (by2 >= 1000) by2 = 999;
            g.drawLine(x1,y1,Math.round(bx1),Math.round(by1));
        }
    }
}