package h13;

import h08.Knop2;
import h08.RekenMachine;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knop extends Applet {
    Button Knop;
    Button Knop2;


    public void init() {
        setSize(500,500);

        Knop = new Button();
        Knop.setLabel( "Baksteen" );
        Knop.knoplisterner kl = new knoplisterner();
        Knop.addActionListener( kl );
        add(Knop);

        Knop2 = new Button();
        Knop2.setLabel( "Betonblok" );
        Knop.knop2listerner kl2 = new knop2listerner();
        Knop2.addActionListener( kl2 );
        add(Knop2);
    }

    public void paint(Graphics g) {
        muurMetBaksteen(g, 10, 20, 200, 100, 20, 10);
    }

    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            muurMetBaksteen(getGraphics(), 10, 20, 200, 100, 20, 10);
            repaint();
        }
    }

    class knop2listerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    void muurMetBaksteen( Graphics g, int x1, int y1, int width, int heigth, int width2, int heigth2){
        int x2 = x1+20;
        int y2 = y1+10;

        g.drawRect(x1, y1, width, heigth);
        g.setColor(Color.black);
        g.drawRect(x1, y1, width2, heigth2);
        g.drawLine(x1, y2, x1+width, y2);
        g.setColor(Color.RED);
        g.fillRect(x1, y1, width, heigth);

        g.setColor(Color.BLACK);
        for (int kolom = 0; kolom < 9; kolom++){
            g.drawLine(x1, y2+heigth2*kolom, x1+width, y2+heigth2*kolom);
        }
        for (int kolom = 0; kolom < 10; kolom++){
            g.drawLine(x1+width2*kolom, y1, x1+width2*kolom, y1+heigth);
        }
    }
}

