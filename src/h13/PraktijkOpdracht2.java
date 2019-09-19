package h13;

import java.applet.Applet;
import java.awt.*;


public class PraktijkOpdracht2 extends Applet {
    public void init() {
        setSize(500,500);

    }

    public void paint(Graphics g) {

        tekenBoom(g, 50, 100, 50, 200, 20, 10);
    }

    void tekenBoom( Graphics g, int x1, int y1, int width, int heigth, int width2, int heigth2){
        int x2 = x1+310;
        int y2 = y1+310;
        for (int kolom = 0; kolom < 6; kolom++) {
            g.setColor(new Color(139, 69, 19));
            g.fillRect(x1+210*kolom, y1, width, heigth);
            g.setColor(Color.GREEN);
            g.fillArc(x1, x1 + 20+210*kolom, 100, 100, 0, 360);
            g.fillArc(x1 - 20+210*kolom, y1 - 10, 100, 100, 0, 360);
            g.fillArc(x1 - 40+210*kolom, y1 - 20, 100, 100, 0, 360);
        }

        for (int kolom = 0; kolom < 6; kolom++) {
            g.setColor(new Color(139, 69, 19));
            g.fillRect(x1+210*kolom, y2, width, heigth);
            g.setColor(Color.GREEN);
            g.fillArc(x1, x1 + 20+210*kolom, 100, 100, 0, 360);
            g.fillArc(x1 - 20+210*kolom, y2 - 10, 100, 100, 0, 360);
            g.fillArc(x1 - 40+210*kolom, y2 - 20, 100, 100, 0, 360);
        }
    }
}

