package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PraktijkOpdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int tafel;
    int drie;
    int som;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("typ uw cijfer hier");
        add(tekstvak);
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        drie = 3;
    }

    public void paint(Graphics g)
    {
     g.drawString(tekst, x, y );
    }
    int teller = 1;
    int y = 0;
    int x = 10;
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
                tafel = Integer.parseInt( s);
                switch(tafel) {
                    case 1:
                        tekst = "slecht";
                        break;
                    case 2:
                        tekst = "slecht";
                        break;
                    case 3:
                        while(teller < 11) {
                            y += 20;
                            drie = 3 ;
                            som = drie*teller;
                           tekst= ("3x" + teller + "= " + som);


                            teller++;
                        }
                        break;
                    case 4:
                        tekst = "onvoldoende";
                        break;
                    case 5:
                        tekst = "matig";
                        break;
                    case 6:
                        tekst = "voldoende";
                        break;
                    case 7:
                        tekst = "voldoende";
                        break;
                    case 8:
                        tekst = "goed";
                        break;
                    case 9:
                        tekst = "goed";
                        break;
                    case 10:
                        tekst = "goed";
                        break;
                    default:
                        tekst = "U hebt een verkeerde tafel getypt kies een cijfer tussen de 1 en de 10 ..!";
                        break;
                }
                repaint();

        }
    }
}

