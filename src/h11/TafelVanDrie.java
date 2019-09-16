package h11;

import java.applet.Applet;
import java.awt.*;

public class TafelVanDrie extends Applet {
    int drie;
    int som;

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;



        while(teller < 11) {
            y += 20;
            drie = 3 ;
            som = drie*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

    }

}