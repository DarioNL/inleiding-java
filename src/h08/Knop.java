package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knop extends Applet {
    Button Knop;
    TextField tekstvak;
    Label label;
    String s;
    double getal;
    String S;

    public void init() {
        tekstvak = new TextField("Typ iets in het tekstvakje", 20);
        label = new Label("Typ iets in het tekstvakje");
        add(label);
        add(tekstvak);
        s = "";

        Knop = new Button();
        Knop.setLabel( "ok" );
        knoplisterner kl = new knoplisterner();
        Knop.addActionListener( kl );
        add(Knop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("typ iets in het tekst vakje?", 50,60);
    }

    class TekstvakListerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String S = tekstvak.getText();
            getal = Double.parseDouble( s );
            s = tekstvak.getText();
            repaint();
        }
    }


    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("jammer, "+
                    "maar nu staat er iets anders");
            repaint();
        }
    }
}
