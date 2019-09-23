package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class KaartenVerdelenTwee extends Applet {
    String[] kaartencijfer1;
    String[] kaartensoort1;
    Button Knoph14;
    Label schermtekst;
    String som;
    String deck[];
    





    private String deelkaart(){
        String kaart = deck[Math.random];
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

    deck = new String[52];

    int deckindex = 0;

    kaartencijfer1 = new String[14];
    kaartencijfer1[0] = "twee";
    kaartencijfer1[1] = "drie";
    kaartencijfer1[3] = "vier";
    kaartencijfer1[4] = "vijf";
    kaartencijfer1[5] = "zes";
    kaartencijfer1[6] = "zeven";
    kaartencijfer1[7] = "acht";
    kaartencijfer1[8] = "negen";
    kaartencijfer1[9] = "tien";
    kaartencijfer1[10] = "boer";
    kaartencijfer1[11] = "boer";
    kaartencijfer1[12] = "heer";
    kaartencijfer1[13] = "aas";

    kaartensoort1 = new String[4];
    kaartensoort1[0] = "schoppen ";
    kaartensoort1[1] = "ruiten";
    kaartensoort1[2] = "harten";
    kaartensoort1[3] = "klaver";


    for (int i = 0; i < kaartensoort1.length; i++) {
        String kaartensoort = kaartensoort1[i];
        for (int j = 0; j < kaartencijfer1.length; j++) {
        String kaartencijfer = kaartencijfer1[j];
            deck[deckindex] = kaartensoort + " " + kaartencijfer;
            deckindex++;
        }
    }

}


public void paint(Graphics g){
        g.drawString(""+som,50,60);
        }

class Knoph14listerner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {



    }
}


}

