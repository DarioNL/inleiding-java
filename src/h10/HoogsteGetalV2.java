package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HoogsteGetalV2 extends Applet {
    int getal;
    int getal2;
    int getal3;
    int getal4;
    TextField tekstvak;
    Label label;
    String tekst;
    String tekst2;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
        tekst2 = "";

        label = new Label("Vul uw getal in" );

        add( label );
        add( tekstvak );
        getal2 = getal;
        getal3 = getal4;
    }

    public void paint(Graphics g)
    {
        g.drawString(tekst, 50, 45 );
        g.drawString(tekst2, 50, 65);
    }


    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            String s2;
            s2 = tekstvak.getText();
            getal3 = Integer.parseInt( s2 );

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






            if (getal3 < getal4) {
                getal4 = getal3;
            }


            if ( getal3 < getal4 ) {
                tekst2 = "" + getal3;
                repaint();
            }
            else {
                tekst2 = "" + getal4;
                repaint();
            }

        }
    }
}

