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
        int a = 0;

        while (a < 500) {

            g.drawLine(a, a, 1000 - a, a);
            g.drawLine(1000 - a, a, 1000 - a, 1000 - a);
            g.drawLine(1000 - a, 1000 - a, a + 5, 1000 - a);
            g.drawLine(a + 5, 1000 - a, a + 5, a + 5);

            a = a + 5;
        }
    }
}
