package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.white);
        g.fillRect(150,100, 100, 100);
        g.setColor(Color.BLACK);
        g.drawRect(150, 100, 100, 100);
        g.fillRoundRect(165,115,20,20,20,20);
        g.fillRoundRect(165,170,20,20,20,20);
        g.fillRoundRect(215,115,20,20,20,20);
        g.fillRoundRect(215,170,20,20,20,20);

    }





}
