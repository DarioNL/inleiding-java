package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RekenMachine extends Applet {
    Button Knop;
    Button Knop2;
    Button Knop3;
    Button Knop4;
    TextField tekstvak;
    TextField tekstvak2;
    Label label2;
    Label label;
    String s;
    double getal, getal2, antwoord;
    String s2;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("");
        tekstvak.addActionListener(new Tekstvaklisterner() );
        add(label);
        add(tekstvak);

        tekstvak2 = new TextField("", 20);
        label2 = new Label("");
        tekstvak2.addActionListener(new Tekstvaklisterner() );
        add(label2);
        add(tekstvak2);


        Knop = new Button();
        Knop.setLabel( "*" );
        knoplisterner kl = new knoplisterner();
        Knop.addActionListener( kl );
        add(Knop);

        Knop2 = new Button();
        Knop2.setLabel( "/" );
        knoplisterner2 kl2 = new knoplisterner2();
        Knop2.addActionListener( kl2 );
        add(Knop2);

        Knop3 = new Button();
        Knop3.setLabel( "+" );
        knoplisterner3 kl3 = new knoplisterner3();
        Knop3.addActionListener( kl2 );
        add(Knop3);

        Knop4 = new Button();
        Knop4.setLabel( "-" );
        knoplisterner4 kl4 = new knoplisterner4();
        Knop4.addActionListener( kl4 );
        add(Knop4);
    }

    @Override
    public void paint(Graphics g)
    {
        g.drawString("= "+ antwoord, 500,60);
    }

    class Tekstvaklisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            s2 = tekstvak.getText();
        }
    }

    class Tekstvaklisterner2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s2 = tekstvak.getText();
        }
    }


    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal = Double.parseDouble( s );
            getal2 = Double.parseDouble( s2 );
            antwoord = getal*getal2;
            repaint();
        }
    }
    class knoplisterner2 implements  ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal = Double.parseDouble( s );
            getal2 = Double.parseDouble( s2 );
            antwoord = getal/getal2;
            repaint();
        }
    }

    class knoplisterner3 implements  ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal = Double.parseDouble( s );
            getal2 = Double.parseDouble( s2 );
            antwoord = getal+getal2;
            repaint();
        }
    }

    class knoplisterner4 implements  ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            getal = Double.parseDouble( s );
            getal2 = Double.parseDouble( s2 );
            antwoord = getal-getal2;
            repaint();
        }
    }
}

