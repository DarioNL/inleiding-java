package h11;

import java.applet.Applet;
import java.awt.*;

public class Lijnen extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 20;


        for (teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(y, 0, y, 100);
        }
    }
}