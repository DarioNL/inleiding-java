package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TekstVak extends Applet {
    int getal;
    int getal2;
    double[] tabel;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    Label label;
    Label label2;
    Label label3;
    Label label4;
    Label label5;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener( new VakListener() );
        tekst = "";

        tekstvak3 = new TextField("", 5);
        tekstvak3.addActionListener( new VakListener() );
        tekst = "";

        tekstvak4 = new TextField("", 5);
        tekstvak4.addActionListener( new VakListener() );
        tekst = "";

        tekstvak5 = new TextField("", 5);
        tekstvak5.addActionListener( new VakListener() );
        tekst = "";

        label = new Label("" );
        label2 = new Label("" );
        label3 = new Label("" );
        label4 = new Label("" );
        label5 = new Label("" );

        add( label );
        add( tekstvak );
        add( label2 );
        add( tekstvak2 );
        add( label3 );
        add( tekstvak3 );
        add( label4 );
        add( tekstvak4 );
        add( label5 );
        add( tekstvak5 );
        getal2 = getal;
    }

    public void paint(Graphics g) {

        g.drawString(tekst, 50, 45 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;
            String s2;
            String s3;
            String s4;
            String s5;

            s = tekstvak.getText();
            s2 = tekstvak.getText();
            s3 = tekstvak.getText();
            s4 = tekstvak.getText();
            s5 = tekstvak.getText();
            getal = Integer.parseInt( s );
            getal = Integer.parseInt( s2 );
            getal = Integer.parseInt( s3 );
            getal = Integer.parseInt( s4 );
            getal = Integer.parseInt( s5 );
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

