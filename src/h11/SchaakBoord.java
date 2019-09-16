package h11;

import java.applet.Applet;
import java.awt.*;

public class SchaakBoord extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 50;
        int x = 50;
        int breedte = 30;
        int hoogte = 30;



        while (teller < 8) {
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                    g.drawRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                    g.setColor(Color.black);
                    g.drawRect(x, y, breedte, hoogte);

                }
                x += breedte;
                teller++;
            }

            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                    g.setColor(Color.black);
                    g.drawRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                    g.drawRect(x, y, breedte, hoogte);

                }
                x += breedte;
                teller++;


            }


        }
    }
}