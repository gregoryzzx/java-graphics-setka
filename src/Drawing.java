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

        for (int x = 0; x < 1000; x = x + 200) {
            for (int y = 0; y < 1000; y = y + 200) {

                g.fillRect(x, y, 100, 100);
            }
        }
        for (int x = 100; x < 1000; x = x + 200) {
            for (int y = 100; y < 1000; y = y + 200) {

                g.fillRect(x, y, 100, 100);
            }
        }
    }

}