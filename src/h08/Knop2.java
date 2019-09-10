package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knop2 extends Applet {
    Button Knop;
    Button Knop2;
    Button Knop3;
    Button Knop4;
    double getal, getal2, getal3, getal4, antwoord, antwoord2, antwoord3;
    String s;
    String s2;
    String s3;

    public void init() {
        s = ""+Knop;
        s2 = ""+Knop;
        s3 = ""+Knop;
        getal = 0;
        getal2 = 4;
        getal3 = 2;
        getal4 = 1;

        Knop = new Button();
        Knop.setLabel( "+4" );
        knoplisterner kl = new knoplisterner();
        Knop.addActionListener( kl );
        add(Knop);

        Knop2 = new Button();
        Knop2.setLabel( "+2" );
        knoplisterner2 kl2 = new knoplisterner2();
        Knop2.addActionListener( kl2 );
        add(Knop2);

        Knop3 = new Button();
        Knop3.setLabel( "vrouw +1" );
        knoplisterner3 kl3 = new knoplisterner3();
        Knop3.addActionListener( kl3 );
        add(Knop3);

        Knop4 = new Button();
        Knop4.setLabel( "man +1" );
        knoplisterner4 kl4 = new knoplisterner4();
        Knop4.addActionListener( kl4 );
        add(Knop4);
    }

    @Override
    public void paint(Graphics g)
    {
        g.drawString("iedereen "+ antwoord, 50,60);
        g.drawString("vrouwen "+ antwoord2, 50,80);
        g.drawString("mannen "+antwoord3, 50, 100);
    }

    class Tekstvaklisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Knop.equals( antwoord2= antwoord2 + getal2 );
            Knop.equals( antwoord3= antwoord3 + getal2 );
            Knop.equals( antwoord= antwoord2 + antwoord3 );
            repaint();
        }
    }
    class knoplisterner2 implements  ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            Knop2.equals( antwoord2= antwoord2 + getal3 );
            Knop2.equals( antwoord3= antwoord3 + getal3 );
            Knop2.equals( antwoord= antwoord2 + antwoord3 );
            repaint();
        }
    }
    class knoplisterner3 implements  ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            Knop3.equals(antwoord = antwoord + getal4);
            Knop3.equals( antwoord2= antwoord2 + getal4 );
            Knop3.equals( antwoord= antwoord2 + antwoord3 );
            repaint();
        }
    }

    class knoplisterner4 implements  ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            Knop4.equals(antwoord = antwoord + getal4);
            Knop4.equals( antwoord3= antwoord3 + getal4 );
            Knop4.equals( antwoord= antwoord2 + antwoord3 );
            repaint();
        }
    }
}

