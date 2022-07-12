import java.awt.Canvas;
import java.awt.Graphics;
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
        g.drawLine(1,1000,1,0);
        g.drawLine(100,1000,100,0);
        g.drawLine(200,1000,200,0);
        g.drawLine(300,1000,300,0);
        g.drawLine(400,1000,400,0);
        g.drawLine(500,1000,500,0);

        g.drawLine(700,1000,700,0);
        g.drawLine(800,1000,800,0);
        g.drawLine(900,1000,900,0);

        g.drawLine(1000,1,0,1);
        g.drawLine(1000,100,0,100);
        g.drawLine(1000,200,0,200);
        g.drawLine(1000,300,0,300);
        g.drawLine(1000,400,0,400);
        g.drawLine(1000,500,0,500);
        g.drawLine(1000,600,0,600);
        g.drawLine(1000,700,0,700);
        g.drawLine(1000,800,0,800);
        g.drawLine(1000,900,0,900);



    }


}