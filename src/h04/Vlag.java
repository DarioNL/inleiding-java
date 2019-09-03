package h04;

import java.applet.Applet;
import java.awt.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setColor(Color.RED);
        g.fillRect(10, 10, 200, 50);
        g.setColor(Color.WHITE);
        g.fillRect(10, 60, 200, 50);
        g.setColor(Color.BLUE);
        g.fillRect(10, 110, 200, 50);
        g.setColor(Color.BLACK);
        g.fillRect(10, 10, 10, 300);
    }





}
