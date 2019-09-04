package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.black);
        g.fillRect(150,100, 100, 280);
        g.setColor(Color.RED);
        g.fillRoundRect(160, 110, 75, 75, 100, 200);
        g.setColor(Color.YELLOW);
        g.fillRoundRect(160, 195, 75, 75, 100, 200);
        g.setColor(Color.GREEN);
        g.fillRoundRect(160, 280, 75, 75, 100, 200);
    }





}
