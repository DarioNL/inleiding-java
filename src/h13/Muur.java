package h13;

import java.applet.Applet;
import java.awt.*;


public class Muur extends Applet {
    public void init() {

        setSize(500,500);

    }

    public void paint(Graphics g) {
        muurMetBaksteen(g, 10, 20, 200, 100, 20, 10);
    }

    void muurMetBaksteen( Graphics g, int x1, int y1, int width, int heigth, int width2, int heigth2){
        int x2 = x1+20;
        int y2 = y1+10;

        g.drawRect(x1, y1, width, heigth);
        g.setColor(Color.WHITE);
        g.drawRect(x1, y1, width2, heigth2);
        g.drawLine(x2, y2, width2, heigth2);
        g.setColor(Color.RED);
        g.fillRect(x1, y1, width2, heigth2);
        g.fillRect(x2, y1, width2, heigth2);

    }
}

