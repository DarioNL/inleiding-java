package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MethodeTwee extends Applet {
    public void init() {

        setSize(500,500);

    }

    public void paint(Graphics g) {
        tekenDriehoek(g, 10, 20, 100, 120, 150, 180);
    }

    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){

        g.drawLine(x1 ,y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

    }
}

