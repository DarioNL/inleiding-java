package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    double gemiddelde1, gemiddelde2, gemiddelde3, deel, andtwoord1, antwoord2, antwoord3, antwoord4;
    int antwoordint;

    @Override
    public void init() {
        gemiddelde1 = 5.9;
        gemiddelde2 = 6.3;
        gemiddelde3 = 6.9;

        deel=3;

        andtwoord1 = (gemiddelde1 + gemiddelde2 + gemiddelde3)/deel;
        antwoord2 = (andtwoord1 * 10);

        antwoordint = (int) antwoord2;
        antwoord3 = antwoordint;

        antwoord4 = antwoord3 /10;



    }




    @Override
    public void paint(Graphics g) {
        g.drawString("het gemiddelde is " + antwoord4 , 20, 20);


    }
}
