package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Index extends Applet {
    TextField tekstvak;
    int[] getallen = {55, 44, 58, 102, 23, 37, 31, 52, 17};
    double gezocht,getal;
    Button knop;
    Label label;
    String tekst;

    public void init() {
        setSize(500,500);

        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }


    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            int invoer = Integer.parseInt(tekstvak.getText());
            boolean isgevonden = false;
            int index = 0;
            for (int i = 0; i < getallen.length; i++){
                if (getallen[i] == invoer) {
                    isgevonden = true;
                    index = i;
                }


                if (isgevonden) {
                    tekst = "Is gevonden. Index is " + index;
                }
                else {
                    tekst = "Is niet gevonden";
                }
                repaint();
        }
    }


    }
}

