package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.setColor(Color.magenta);
        g.fillRect(170,80, 100, 50);
        g.fillOval(170,150,100,70);
        g.fillArc(290,80,100,50,0,45);

        g.setColor(Color.BLACK);
        g.drawLine(50, 20, 150, 20);
        g.drawRoundRect(50, 150, 100, 70, 30, 30);
        g.drawRect(50, 80, 100, 50);
        g.drawArc(170,80,100,50, 0,360);
        g.drawArc(290, 80, 100, 50, 0, 360);
        g.drawRoundRect(300, 150, 75, 75, 100, 200);


    }





}
