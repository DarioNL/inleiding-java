package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PraktijkOpdracht extends Applet {
    Button Knoph14;
    String som, tekst;
    TextField tekstvak;
    int aantalVlaggen, aantalvlaggencomputer, getal, win;
    private Image afbeelding;
    private URL pad;

    public void init() {
        setSize(400, 400);
        aantalVlaggen = 23;
        pad = PraktijkOpdracht.class.getResource("/resources/");
        afbeelding = getImage(pad, "23.jpg");
        tekstvak = new TextField("typ 1, 2 of 3");
        add(tekstvak);
        Knoph14 = new Button("speel");
        Knoph14listerner kl = new Knoph14listerner();
        Knoph14.addActionListener(kl);
        add(Knoph14);

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 60;
        int y2 = 100;
        int x2 = 0;
        g.drawString("De computer heeft " + som + " vlaggen weggehaalt", x, y);
        g.drawString("aantal resterende vlaggen: " + aantalVlaggen + " Jouw beurt", x, y + 20);
        g.drawString(tekst, y, x);
        for (int i = 0; i < aantalVlaggen; i++) {
            if (i % 4 == 0) {
                x2 = 40;
                y2 += 40;
            }
            g.drawImage(afbeelding, x2, y2, 40, 30, this);
            x2 += 50;
        }
    }

    class Knoph14listerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double RandomGetal = Math.random();
            int random = (int) (RandomGetal * 3 + 1);
            String s;
            //wat heeft gebruiker ingevuld?
            s = tekstvak.getText();
            // converteer naar int
            getal = Integer.parseInt( s );
            //check of invoer geldig is (1, 2, of 3)
            if (getal < 4 ) {
                aantalVlaggen = aantalVlaggen-getal;
                repaint();
            }
            else {
                 tekst = "wat u heeft getypt is niet geldig";
                repaint();
            }

            if ( getal < 1 ) {
                tekst = "wat u heeft getypt is niet geldig.";
                repaint();
            }


            if (aantalVlaggen==1) {
                tekst = "je hebt gewonnen";
                repaint();
            }
            if ( aantalVlaggen < 1 ) {
                tekst = "Je hebt veloren.";
                repaint();
            }
            else {
                tekst = "";
                repaint();
            }


            if (aantalVlaggen > 21) {
                aantalvlaggencomputer = aantalVlaggen - 21;
            } else if (aantalVlaggen == 21) {
                aantalvlaggencomputer = random;
            } else if (aantalVlaggen > 17) {
                aantalvlaggencomputer = aantalVlaggen -17;
            } else if (aantalVlaggen == 17) {
                aantalvlaggencomputer = random;
            } else if (aantalVlaggen > 13) {
                aantalvlaggencomputer = aantalVlaggen -13;
            } else if (aantalVlaggen == 13) {
                aantalvlaggencomputer = random;
            }else if (aantalVlaggen > 9) {
                aantalvlaggencomputer = aantalVlaggen -9;
            } else if (aantalVlaggen == 9) {
                aantalvlaggencomputer = random;
            }else if (aantalVlaggen > 5) {
                aantalvlaggencomputer = aantalVlaggen -5;
            } else if (aantalVlaggen == 5) {
                aantalvlaggencomputer = random;
            }else if (aantalVlaggen > 1) {
                aantalvlaggencomputer = aantalVlaggen -1;
            } else if (aantalVlaggen == 1) {
                aantalvlaggencomputer = random;
            }

            aantalVlaggen= aantalVlaggen-aantalvlaggencomputer;
            repaint();






            // Als geldig

            // trek invoer van aantal vlaggen af

            // check of gebruiker gewonnen heeft

            // check of gebruiker verloren

            // beurt computer





        }
    }


}

