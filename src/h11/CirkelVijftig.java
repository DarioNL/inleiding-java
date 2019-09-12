package h11;

import java.applet.Applet;
import java.awt.*;

public class CirkelVijftig extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 300;
        int x = 300;
        int y2 = 10;
        int x2 = 10;



        while(teller < 51) {
            y -= 5;
            x -= 5;
            y2 += 10;
            x2 += 10;
            g.drawOval(x, y, y2, x2);


            teller++;
        }

    }
}