package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Index extends Applet {
    TextField tekstvak;
    boolean gevonden;
    double[] waarde = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double gezocht,getal;
    Button knop;
    Label label;
    String tekst;

    public void init() {
        setSize(500,500);
        waarde = new double[5];
        waarde[0] = 100;
        waarde[1] = 200;
        waarde[2] = 300;
        waarde[3] = 400;
        waarde[4] = 500;

        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);

        gezocht = 400;
        gevonden = false;
        int teller = 0;
        while(teller < waarde.length) {
            if(waarde[teller] == gezocht) {
                gevonden = true;
            }
            teller ++;
        }
    }


    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s;
            s = tekstvak.getText();
            getal = Double.parseDouble( s );
            for (int i = 0; i<5; i++ ) {
                if (getal == waarde[i++]){
                tekst ="De waarde is" + waarde[i++];

                }else{
                    tekst = "De waarde is onjuist";
                }
            }


        }
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 20);
        repaint();
    }
}

