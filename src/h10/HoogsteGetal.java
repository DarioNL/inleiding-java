package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HoogsteGetal extends Applet {
    int getal;
    int getal2;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        label = new Label("Vul uw getal in" );

        add( label );
        add( tekstvak );
        getal2 = getal;
    }

    public void paint(Graphics g) {

        g.drawString(tekst, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if (getal>getal2) {
                getal2 = getal;
            }


            if ( getal > getal2 ) {
                tekst = "" + getal;
                repaint();
            }
            else {
                tekst = "" + getal2;
                repaint();
            }

        }
    }
}

