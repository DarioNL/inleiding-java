package h06;

import java.applet.Applet;
import java.awt.*;

public class Tijd extends Applet {

    int seconden;
    int minuten;
    int uren;
    int dagen;
    int jaren;

    @Override
    public void init() {
        setBackground(Color.WHITE);
        seconden = 1;
        minuten = seconden * 60;
        uren = minuten * 60;
        dagen = uren * 24;
        jaren = dagen* 365;
    }




    @Override
    public void paint(Graphics g) {

        g.drawString("Het aantal seconde in een jaar is " + jaren , 20, 20);

    }
}
