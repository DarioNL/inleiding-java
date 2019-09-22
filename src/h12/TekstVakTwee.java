package h12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class TekstVakTwee extends Applet {
    Label label;
    TextField[] tekstvakken;
    int[] getallen;
    Button knop;

    public void init() {

        setSize(500,500);
        tekstvakken = new TextField[5];
        getallen = new int[5];
        knop = new Button("ok");
        knoplisterner kl = new knoplisterner();
        knop.addActionListener( kl );
        add(knop);




        label = new Label("");






        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField("",7);
            add(tekstvakken[i]);
        }

    }

    public void paint(Graphics g) {

        g.drawString("", 50, 45 );
    }




    class knoplisterner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            for (int j = 0; j < getallen.length; j++) {
                getallen[j] = Integer.parseInt(tekstvakken[j].getText());
            }


            Arrays.sort(getallen);


            for (int i = 0; i < tekstvakken.length; i++) {
                tekstvakken[i].setText("" + (getallen[i]));
            }

        }
    }
}

