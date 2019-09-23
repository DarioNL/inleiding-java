package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class KaartenVerdelen extends Applet {
    String kaartencijfer[];
    String kaartensoort[];
    Button Knoph14;
    Label schermtekst;
    String som;
    String kaarten[];



    private String deelkaart(){
        String[] som;
        String kaart = som[random];
        int random = new Random().nextInt(deck.length);
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;

        return kaart;

    }



public void init() {

    schermtekst = new Label("Kaart");
    Knoph14 = new Button("deel kaart");
    Knoph14listerner kl = new Knoph14listerner();
    Knoph14.addActionListener(kl);
    add(Knoph14);
    kaarten = new String[53];
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
    kaartensoort[0] = "schoppen ";
    kaartensoort[1] = "ruiten";
    kaartensoort[2] = "harten";
    kaartensoort[3] = "klaver";
    for (int teller = 0; teller < 53; teller++) {
        kaarten = new String[53];
        kaarten[teller] = "" + kaartensoort[0] + "" + kaartencijfer[0];
        kaarten[teller] = "" + kaartensoort[0] + "" + kaartencijfer[1];
        kaarten[2] = "" + kaartensoort[0] + "" + kaartencijfer[2];
        kaarten[3] = "" + kaartensoort[0] + "" + kaartencijfer[3];
        kaarten[4] = "" + kaartensoort[0] + "" + kaartencijfer[4];
        kaarten[5] = "" + kaartensoort[0] + "" + kaartencijfer[5];
        kaarten[6] = "" + kaartensoort[0] + "" + kaartencijfer[6];
        kaarten[7] = "" + kaartensoort[0] + "" + kaartencijfer[7];
        kaarten[8] = "" + kaartensoort[0] + "" + kaartencijfer[8];
        kaarten[9] = "" + kaartensoort[0] + "" + kaartencijfer[9];
        kaarten[10] = "" + kaartensoort[0] + "" + kaartencijfer[10];
        kaarten[11] = "" + kaartensoort[0] + "" + kaartencijfer[11];
        kaarten[12] = "" + kaartensoort[0] + "" + kaartencijfer[12];
        kaarten[14] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[15] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[16] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[17] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[18] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[19] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[20] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[21] = "" + kaartensoort[1] + "" + kaartencijfer[13];
        kaarten[22] = "" + kaartensoort[1] + "" + kaartencijfer[13];
    }

}


public void paint(Graphics g){
        g.drawString(""+som,50,60);
        }

class Knoph14listerner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        //TODO maak twee random getal tussen 0 en 4 (excl 4) en 0 en 13 en haal daarmee een kaart uit "kaartensoort"


        int randomSoort = (int) (Math.random() * 4 + 0);
        int randomCijfer = (int) (Math.random() * 13 + 0);
        ;

        String soort = kaartensoort[randomSoort];
        String cijfer = kaartencijfer[randomCijfer];
        som = soort + " " + cijfer;
        repaint();

    }
}

    }
}

