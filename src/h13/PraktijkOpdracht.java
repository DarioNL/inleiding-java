package h13;

import java.applet.Applet;
import java.awt.*;


public class PraktijkOpdracht extends Applet {
    public void init() {
        setSize(500,500);

    }

    public void paint(Graphics g) {

        tekenBoom(g, 100, 200, 50, 200, 20, 10);
    }

    void tekenBoom( Graphics g, int x1, int y1, int width, int heigth, int width2, int heigth2){
        int x2 = x1+20;
        int y2 = y1+10;
        g.setColor(new Color(139,69,19));
        g.fillRect(x1, y1, width, heigth);
        g.setColor(Color.GREEN);
        g.fillArc(x1, x1+20, 125, 100, 0, 360);
        g.fillArc(x1-20, x1+10, 125, 125, 0, 360);
        g.fillArc(x1-40, x1+10, 125, 125, 0, 360);

    }
}

