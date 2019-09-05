package h06;

import java.applet.Applet;
import java.awt.*;

public class NegatieveGetallen extends Applet {

    int positief1;
    int positief2;
    int negatiefAndwoordt;

    @Override
    public void init() {
        setBackground(Color.WHITE);
        positief1 = 1;
        positief2 = 2;
        negatiefAndwoordt = positief1 - positief2;
    }




    @Override
    public void paint(Graphics g) {

        g.drawString("Het andtwoord is " + negatiefAndwoordt , 20, 20);

    }
}
