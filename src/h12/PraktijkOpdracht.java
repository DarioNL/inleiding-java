package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class PraktijkOpdracht extends Applet {
    Label label;
    TextField tekstvakNaam;
    TextField tekstvakTelefoon;
    int[] getallen;
    Button knop;
    Label naam;
    Label telefoon;
    String[] naam2;
    String naam3, nummer;
    boolean eisen;
    int j;

    public void init() {

        setSize(500,500);
        tekstvakNaam =new TextField(20);
        tekstvakTelefoon = new TextField("" + 20);

        naam = new Label("vul hier de naam in");
        telefoon = new Label("vul hier het telefoon nummer in");

        knop = new Button("ok");
        knoplisterner kl = new knoplisterner();
        knop.addActionListener( kl );
        add(knop);
        tekstvakNaam.addActionListener(kl);
        tekstvakTelefoon.addActionListener(kl);
        int j;




        naam2 = new String[10];








    }

    public void paint(Graphics g) {

        g.drawString("", 50, 45 );
    }




    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            naam3 = tekstvakNaam.getText().toLowerCase();
            nummer = tekstvakTelefoon.getText();


            if (j < naam2.length) {
                naam2[j] ="Naam" + naam3 +     "Telefoon Nummer: " + nummer;
                j++;

                if (j == naam2.length) {
                    eisen = true;
                }
            }



            if (eisen) {
            Arrays.sort(naam2);
            repaint();
        }


        }
    }
}

