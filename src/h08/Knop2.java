package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knop2 extends Applet {
    Button Knop;
    Button Knop2;
    TextField tekstvak;
    Label label;
    String s;
    double getal;
    String s2;

    public void init() {
        tekstvak = new TextField("Typ iets in het tekstvakje", 20);
        label = new Label("Typ iets in het tekstvakje");
        tekstvak.addActionListener(new Tekstvaklisterner() );
        add(label);
        add(tekstvak);
        s = "";
        s2 =""+Knop;

        Knop = new Button();
        Knop.setLabel( "ok" );
        knoplisterner kl = new knoplisterner();
        Knop.addActionListener( kl );
        add(Knop);

        Knop2 = new Button();
        Knop2.setLabel( "reset" );
        knoplisterner2 kl2 = new knoplisterner2();
        Knop2.addActionListener( kl2 );
        add(Knop2);
    }

    @Override
    public void paint(Graphics g)
    {
        g.drawString(""+ s, 50,60);
        g.drawString(""+ s2, 50, 80);
    }

    class Tekstvaklisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s2 = tekstvak.getText();
        }
    }


    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Knop.toString();
            repaint();
        }
    }
    class knoplisterner2 implements  ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}

