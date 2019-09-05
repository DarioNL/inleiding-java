package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    double gemiddelde1, gemiddelde2, gemiddelde3, deel, andtwoord;

    @Override
    public void init() {
        gemiddelde1= 5.9;
        gemiddelde2= 6.3;
        gemiddelde3= 6.9;
        deel=3;
        andtwoord = (gemiddelde1 + gemiddelde2 + gemiddelde3)/deel;
        
    }




    @Override
    public void paint(Graphics g) {
        g.drawString("het gemiddelde is " + andtwoord , 20, 20);


    }
}
