package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setColor(Color.WHITE);
        g.fillRect(100, 80, 200, 200);
        g.drawRect(100, 80, 200, 200);
        g.setColor(Color.BLACK);
        g.drawRect(110, 120, 75, 75);
        g.fillRect(200, 181, 50, 100);
        g.setColor(Color.RED);
        g.fillPolygon(new int[] {316, 200, 80}, new int[] {90, 20, 90}, 3);
    }





}
