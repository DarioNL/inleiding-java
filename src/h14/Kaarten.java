package h14;
import h08.Knop;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Kaarten extends Applet {
    double r;
    int worp;
    String kaartencijfer[];
    String kaartensoort[];
    Button Knoph14;
    Label schermtekst;
    String som;

    public void init() {

        schermtekst = new Label("Kaart");
        Knoph14 = new Button("deel kaart");
        Knoph14listerner kl = new Knoph14listerner();
        Knoph14.addActionListener(kl);
       add(Knoph14);
        kaartencijfer = new String[14];
        kaartencijfer[0] = "twee";
        kaartencijfer[1] = "drie";
        kaartencijfer[3] = "vier";
        kaartencijfer[4] = "vijf";
        kaartencijfer[5] = "zes";
        kaartencijfer[6] = "zeven";
        kaartencijfer[7] = "acht";
        kaartencijfer[8] = "negen";
        kaartencijfer[9] = "tien";
        kaartencijfer[10] = "boer";
        kaartencijfer[11] = "boer";
        kaartencijfer[12] = "heer";
        kaartencijfer[13] = "aas";

        kaartensoort = new String[4];
        kaartensoort[0] = "schoppen";
        kaartensoort[1] = "ruiten";
        kaartensoort[2] = "harten";
        kaartensoort[3] = "klaver";

        }


    public void paint(Graphics g) {
    g.drawString("" + som, 50, 60);
    }

    class Knoph14listerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            //TODO maak twee random getal tussen 0 en 4 (excl 4) en 0 en 13 en haal daarmee een kaart uit "kaartensoort"



            int randomSoort = (int)(Math.random() *4+0);
            int randomCijfer = (int)(Math.random() *13+0);;

            String soort = kaartensoort[randomSoort];
            String cijfer = kaartencijfer[randomCijfer];
            som = soort + " " + cijfer;
            repaint();

        }
    }


}

