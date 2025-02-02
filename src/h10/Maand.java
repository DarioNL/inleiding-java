package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Maand extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Label label2;
    String s, tekst, tekst2, s2;
    int maand,jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ het nummer van de maand en druk op enter");
        tekstvak2 = new TextField("jaar", 20);
        label2 = new Label("Typ het nummer van het jaar en druk op enter");
        tekstvak2.addActionListener(new TekstvakListener() );
        tekst2 = "";
        add(tekstvak2);
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 70 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            jaartal = Integer.parseInt( s2);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                maand = Integer.parseInt( s);
                switch(maand) {
                    case 1:
                        tekst = "januari heeft 31 dagen";
                        break;
                    case 2:
                        tekst = "feberuari heeft 29 dagen";
                        break;
                    case 3:
                        tekst = "maart heeft 31 dagen";
                        break;
                    case 4:
                        tekst = "april heeft 30 dagen";
                        break;
                    case 5:
                        tekst = "mei heeft 31 dagen";
                        break;
                    case 6:
                        tekst = "juni heeft 30 dagen";
                        break;
                    case 7:
                        tekst = "juli heeft 31 dagen";
                        break;
                    case 8:
                        tekst = "augustus heeft 31 dagen";
                        break;
                    case 9:
                        tekst = "sebtember heeft 30 dagen";
                        break;
                    case 10:
                        tekst = "oktober heeft 31 dagen";
                        break;
                    case 11:
                        tekst = "november heeft 30 dagen";
                        break;
                    case 12:
                        tekst = "december heeft 31 dagen";
                        break;
                    default:
                        tekst = "U hebt een verkeerd nummer ingetikt ..!";
                        break;
                }
                repaint();
            }
            else {
                maand = Integer.parseInt( s);
                switch(maand) {
                    case 1:
                        tekst = "januari heeft 31 dagen";
                        break;
                    case 2:
                        tekst = "feberuari heeft 28 dagen";
                        break;
                    case 3:
                        tekst = "maart heeft 31 dagen";
                        break;
                    case 4:
                        tekst = "april heeft 30 dagen";
                        break;
                    case 5:
                        tekst = "mei heeft 31 dagen";
                        break;
                    case 6:
                        tekst = "juni heeft 30 dagen";
                        break;
                    case 7:
                        tekst = "juli heeft 31 dagen";
                        break;
                    case 8:
                        tekst = "augustus heeft 31 dagen";
                        break;
                    case 9:
                        tekst = "sebtember heeft 30 dagen";
                        break;
                    case 10:
                        tekst = "oktober heeft 31 dagen";
                        break;
                    case 11:
                        tekst = "november heeft 30 dagen";
                        break;
                    case 12:
                        tekst = "december heeft 31 dagen";
                        break;
                    default:
                        tekst = "U hebt een verkeerd nummer ingetikt ..!";
                        break;
                }
                repaint(); }
        }
    }
}

