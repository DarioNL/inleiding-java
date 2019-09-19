package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class KnopTwee extends Applet {
    Button Knop;
    Button Knop2;


    public void init() {
        setSize(500,500);

        Knop = new Button();
        Knop.setLabel( "Baksteen" );
        KnopTwee.knoplisterner kl = new knoplisterner();
        Knop.addActionListener( kl );
        add(Knop);

        Knop2 = new Button();
        Knop2.setLabel( "Betonblok" );
        KnopTwee.knop2listerner kl2 = new knop2listerner();
        Knop2.addActionListener( kl2 );
        add(Knop2);
    }

    public void paint(Graphics g) {

    }

    class knoplisterner implements ActionListener {

        public void actionPerformed(ActionEvent e ) {

            tekenMuurMetBaksteen(getGraphics(),  30, 50, 200, 100, 20, 10);
        }
    }

    class knop2listerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            tekenMuurMetBetonblok(getGraphics(),  30, 50, 200, 100, 20, 30);
        }
    }

    void tekenMuurMetBaksteen( Graphics g, int x1, int y1, int width, int heigth, int width2, int heigth2){
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

    void tekenMuurMetBetonblok( Graphics g, int x1, int y1, int width, int heigth, int width2, int heigth2){
        int x2 = x1+20;
        int y2 = y1+10;

        g.drawRect(x1, y1, width, heigth);
        g.setColor(Color.black);
        g.drawRect(x1, y1, width2, heigth2);
        g.drawLine(x1, y2, x1+width, y2);
        g.setColor(Color.gray);
        g.fillRect(x1, y1, width, heigth);

        g.setColor(Color.black);
        for (int kolom = 0; kolom < 4; kolom++){
            g.drawLine(x1, y2+heigth2*kolom, x1+width, y2+heigth2*kolom);
        }
        for (int kolom = 0; kolom < 10; kolom++){
            g.drawLine(x1+width2*kolom, y1, x1+width2*kolom, y1+heigth);
        }
    }
}

