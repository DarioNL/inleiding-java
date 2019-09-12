package h11;

import java.applet.Applet;
import java.awt.*;

public class Tien extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 20;
        int y = 20;


        while(teller > 9) {
            y += 20;
            g.drawString("" + teller, 10, y );

            teller--;
        }
    }
}