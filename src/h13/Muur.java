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
        g.setColor(Color.gray);
        g.drawRect(x1, y1, width2, heigth2);
        g.drawLine(x1, y2, x1+width, y2);
        g.setColor(Color.RED);
        g.fillRect(x1, y1, width, heigth);

        g.setColor(Color.gray);
        for (int kolom = 0; kolom < 9; kolom++){
            g.drawLine(x1, y2+heigth2*kolom, x1+width, y2+heigth2*kolom);
        }
        for (int kolom = 0; kolom < 10; kolom++){
            g.drawLine(x1+width2*kolom, y1, x1+width2*kolom, y1+heigth);
        }
    }
}

