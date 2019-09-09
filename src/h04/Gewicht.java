package h04;

import java.applet.Applet;
import java.awt.*;

public class Gewicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setColor(Color.BLACK);
        g.drawString("Jeroen", 10, 130 );
        g.drawString("Hans", 70, 130 );
        g.drawString("Valerie", 130, 130 );
        g.fillRect(10, 10, 50, 100);
        g.setColor(Color.WHITE);
        g.fillRect(70, 30, 50, 80);
        g.setColor(Color.RED);
        g.fillRect(130, 70, 50, 40);

    }





}
