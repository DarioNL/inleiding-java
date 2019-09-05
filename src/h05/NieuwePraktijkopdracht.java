package h05;

import java.applet.Applet;
import java.awt.*;

public class NieuwePraktijkopdracht extends Applet {
    Color vulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;



    public void init() {
        vulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;

    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawRect(100,100, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawRoundRect(100,225, breedte, hoogte, 30, 30);

        g.setColor(vulkleur);
        g.fillRect(315,100, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawOval(315,100, breedte, hoogte);

        g.setColor(vulkleur);
        g.fillOval(315,225, breedte, hoogte);


        g.setColor(lijnkleur);
        g.drawArc(530,100, breedte, hoogte, 0, 360);

        g.setColor(vulkleur);
        g.fillArc(530, 100, breedte, hoogte, 0, 45);

        g.setColor(lijnkleur);
        g.drawRoundRect(580,215, hoogte, hoogte, 100,200);





    }





}
