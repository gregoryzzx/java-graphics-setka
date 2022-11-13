import java.awt.*;
import java.time.Instant;
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

    float clamp(float c) {
        return Math.max(0, Math.min(c, 1));
    }

    Color lerp(float d, float a, float b, float red1, float green1, float blue1, float red2, float green2, float blue2) {
        d = (d - a) / (b - a);
        return new Color(
                clamp(red1 * (1 - d) + red2 * d),
                clamp(green1 * (1 - d) + green2 * d),
                clamp(blue1 * (1 - d) + blue2 * d));
    }

    public void paint(Graphics g) {
        OpenSimplexNoise r = new OpenSimplexNoise(Instant.now().getEpochSecond());

        for (int y = 0; y < 1000; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {

                float t = (float) (
                        r.eval(x / 1000f, y / 1000f) +
                                r.eval(x / 100f, y / 100f) * 0.3 +
                                r.eval(x / 10f, y / 10f) * 0.03);

                t = t / 1.33f;

                Color color = Color.black;

                if (t < -0.2f) {
                    color = lerp(t, -1, -0.2f, 0, 0, 0, 0, 0, 1);
                } else if (t < 0.1) {
                    color = lerp(t, -0.2f, 0.1f, 1, 1, 0, 0, 0.5f, 0.5f);
                } else if (t < 0.2) {
                    color = lerp(t, 0.1f, 0.2f, 0, 0.5f, 0.5f, 0, 1, 0);
                } else if (t < 0.5) {
                    color = lerp(t, 0.2f, 0.5f, 0, 1, 0, 1, 0.5f, 0.5f);
                } else {
                    color = lerp(t, 0.5f, 0.6f, 1, 0.5f, 0.5f, 1, 1, 1);
                }

                g.setColor(color);
                g.drawLine(x, y, x, y);
            }
        }

    }
}
