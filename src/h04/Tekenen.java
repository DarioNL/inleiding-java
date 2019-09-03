package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRoundRect(20, 20, 100, 50, 10, 10);
        g.fillRect(20, 80, 100, 50);
    }
}
