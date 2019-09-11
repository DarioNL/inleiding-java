package h11;

import java.applet.Applet;
import java.awt.*;

public class TafelVanDrie extends Applet {


    public void init() {
    int x;
    }

    public void paint(Graphics g) {
        int teller = 0;
        int y = 20;
        int teller2 = 1;
        int x = 1;


        while(teller < 30) {
            y += 20;
            g.drawString("3x" + teller2 + teller, 10, y );

            teller--;
        }

        while (teller2 < 11) {
            x += 10;

            teller++;
        }
    }
}