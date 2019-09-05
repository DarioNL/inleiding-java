package h06;

import java.applet.Applet;
import java.awt.*;

public class Rekenen extends Applet {

    int bedrag;
    int deel;
    int andtwoord;

    @Override
    public void init() {
        setBackground(Color.WHITE);
        bedrag = 113;
        deel = 4;
        andtwoord = bedrag/deel;
    }




    @Override
    public void paint(Graphics g) {

        g.drawString("Jan " + andtwoord,20, 20);

        g.drawString("Ali" + andtwoord, 20, 30);

        g.drawString("Jeannette " + andtwoord, 20, 40 );

        g.drawString("Dario " + andtwoord, 20, 50);

    }
}
