package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Maand extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case januari:
                    tekst = "januari";
                    break;
                case feberuari:
                    tekst = "maandag";
                    break;
                case maart:
                    tekst = "dinsdag";
                    break;
                case april:
                    tekst = "woensdag";
                    break;
                case mei:
                    tekst = "donderdag";
                    break;
                case juni:
                    tekst = "vrijdag";
                    break;
                case juli:
                    tekst = "zaterdag";
                    break;
                case augustus:
                    tekst = "zaterdag";
                    break;
                case september:
                    tekst = "zaterdag";
                    break;
                case oktober:
                    tekst = "zaterdag";
                    break;
                case november:
                    tekst = "zaterdag";
                    break;
                case december:
                    tekst = "zaterdag";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}

