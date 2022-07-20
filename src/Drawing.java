import java.awt.*;
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
        int a=30;
        int r=0;
        for(; r<1000;) {

            g.drawArc(500-r, 500-r, r+r, r+r, a, 40);
            r=r+1;
            a=a+30;
        }
//        g.drawArc(500,500,101,101,30,30);
//        g.drawArc(500,500,102,102,60,30);
//        g.drawArc(500,500,103,103,90,30);
//        g.drawArc(500,500,104,104,120,30);
//        g.drawArc(500,500,105,105,150,30);
//        g.drawArc(500,500,106,106,180,30);
//        g.drawArc(500,500,107,107,210,30);
//        g.drawArc(500,500,108,108,240,30);
//        g.drawArc(500,500,109,109,270,30);
//        g.drawArc(500,500,110,110,300,30);
//        g.drawArc(500,500,111,111,330,30);
    }
}
