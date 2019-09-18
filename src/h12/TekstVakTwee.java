package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TekstVakTwee extends Applet {
    double[] volgorde;
    TextField tekstvak;
    Label label;
    String tekst;
    String tekst2;
    String tekst3;
    String tekst4;
    String tekst5;
    String tekst6;
    String tekst7;
    String tekst8;
    String tekst9;
    String tekst10;
    Button knop;
    double getal, getal2, getal3, getal4, getal5, antwoord;

    public void init() {

        setSize(500,500);
        for (int teller = 0; teller < 5; teller++){
        tekstvak = new TextField("", 5);
        tekst = ""+tekst;




        label = new Label("");

        add( label );
        add( tekstvak );
        getal2 = getal;
        }
        knop = new Button("ok");
        label = new Label("");
        add(knop);





        volgorde = new double[5];
        volgorde[0] = getal;
        volgorde[1] = getal2;
        volgorde[2] = getal3;
        volgorde[3] = getal4;
        volgorde[4] = getal5;

    }

    public void paint(Graphics g) {

        g.drawString("", 50, 45 );
    }

    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            getal = Double.parseDouble( s );

            if (getal>getal2){
                getal = getal2;
            }
            if (getal2>getal3){
                getal2 = getal3;
            }
            if (getal3>getal4){
                getal3 = getal4;
            }
            if (getal4>getal5){
                getal4 = getal5;
            }
            repaint();
        }
    }
}

