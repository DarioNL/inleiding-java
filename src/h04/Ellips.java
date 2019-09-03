package h04;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setColor(Color.BLACK);
        g.fillRect(10, 10, 50, 100);
        g.setColor(Color.WHITE);
        g.fillRect(70, 30, 50, 80);
        g.setColor(Color.RED);
        g.fillRect(130, 70, 50, 40);


    }





}
