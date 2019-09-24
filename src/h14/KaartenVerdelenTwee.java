package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class KaartenVerdelenTwee extends Applet {
    String[] kaartencijfer1={"aas", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "heer", "vrouw"};
    String[] kaartensoort1={"klaver", "schoppen", "ruiten", "harten"};
    Button Knoph14;
    Label schermtekst;
    String som;
    String[] deck = new String[52];
    String[] speler1 = new String[13];
    String[] speler2 = new String[13];
    String[] speler3 = new String[13];
    String[] speler4 = new String[13];






    private String deelkaart(){
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];
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


    Knoph14 = new Button("deel kaart");
    Knoph14listerner kl = new Knoph14listerner();
    Knoph14.addActionListener(kl);
    add(Knoph14);


}


    public void paint(Graphics g) {
        for (int i = 0; i < speler1.length; i++) {
            g.drawString(speler1[i], 10, 20 * i + 20);
            g.drawString(speler2[i], 110, 20 * i + 20);
            g.drawString(speler3[i], 210, 20 * i + 20);
            g.drawString(speler4[i], 310, 20 * i + 20);
        }
    }




class Knoph14listerner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        deck = new String[52];

        int deckteller = 0;


        for (int i = 0; i < kaartensoort1.length; i++) {

            for (int j = 0; j < kaartencijfer1.length; j++) {
                if (deckteller < deck.length) {
                    deck[deckteller] = kaartensoort1[i] + kaartencijfer1[j];
                    deckteller++;
                }
            }
        }


        for (int k = 0; k < speler1.length; k++) {
            speler1[k] = deelkaart();
            speler2[k] = deelkaart();
            speler3[k] = deelkaart();
            speler4[k] = deelkaart();
        }
        repaint();
    }
}


}

