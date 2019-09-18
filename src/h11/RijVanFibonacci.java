package h11;

import java.applet.Applet;
import java.awt.*;

public class RijVanFibonacci extends Applet {

    int i;
    int antwoordt;
    int antwoordt2;
    int som;
    int som2;


    public void init() {

    }

    public void paint(Graphics g) {
        antwoordt = 0;
        antwoordt2 = 1;
        som = antwoordt + antwoordt2;
        antwoordt = antwoordt2;
        antwoordt2 = som;
        som = antwoordt + antwoordt2;

        int y = 0;


        for ( i = 0; i < 20; i++) {

            y+=20;
            g.drawString("" + som, 10, y);
            antwoordt = antwoordt2;
            antwoordt2 = som;
            som = antwoordt + antwoordt2;
            i++;
        }
    }
}