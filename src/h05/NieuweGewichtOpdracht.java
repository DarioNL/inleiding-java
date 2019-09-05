package h05;

import java.applet.Applet;
import java.awt.*;

public class NieuweGewichtOpdracht extends Applet {

    Color tekskleur;

    Color Valeriekleur;

    Color Jeroenkleur;

    Color Hanskleur;

    int breedte;

    int gewichtValerie;

    int gewichtJeroen;

    int gewichtHans;



    public void init() {

        Jeroenkleur = Color.MAGENTA;

        Valeriekleur = Color.RED;

        Hanskleur = Color.BLUE;

        breedte = 100;

        gewichtJeroen = 100;

        gewichtHans = 80;

        gewichtValerie = 40;

        tekskleur = Color.BLACK;

    }

    public void paint(Graphics g) {

        g.setColor(Jeroenkleur);
        g.fillRect(10,10, breedte, gewichtJeroen);

        g.setColor(Hanskleur);
        g.fillRect(125,30, breedte, gewichtHans);

        g.setColor(Valeriekleur);
        g.fillRect(250,70, breedte, gewichtValerie);

        g.setColor(tekskleur);
        g.drawString("Jeroen", 10,120);

        g.setColor(tekskleur);
        g.drawString("Hans",125,120);

        g.setColor(tekskleur);
        g.drawString("Valerie", 250, 120);




    }





}
