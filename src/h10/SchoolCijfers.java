package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SchoolCijfers extends Applet {
    double gemiddelde1, gemiddelde2, gemiddelde3, deel, andtwoord1, antwoord2, antwoord3, antwoord4;
    int antwoordint;
    TextField tekstvak;
    Label label;
    String s, tekst, tekst2;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ je cijfer hier en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);

        andtwoord1 = (cijfer);
        antwoord2 = (andtwoord1 * 10);

        antwoordint = (int) antwoord2;
        antwoord3 = antwoordint;

        antwoord4 = antwoord3 /10;

    }

    public void paint(Graphics g)
    {
        g.drawString(tekst, 50, 70 );
        g.drawString(tekst2, 50,90);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s);
            andtwoord1 = (cijfer);
            antwoord2 = (andtwoord1 * 10);

            antwoordint = (int) antwoord2;
            antwoord3 = antwoordint;

            antwoord4 = antwoord3 /10;

            if ( antwoord4 > 5.5 ) {
                tekst2 = antwoord4 + " Je hebt een voldoende";
                repaint();
            }
            else {
                tekst2 = antwoord4 + " Je hebt een onvoldoende";
                repaint();
            }

        }
    }
}

