package h11;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    int één;
    int twee;
    int drie;
    int vier;
    int vijf;
    int zes;
    int zeven;
    int acht;
    int negen;
    int tien;
    int som;
    String s1, s2, s3, s4, s5, s6, s7, s8, s9,s10;


    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;



        while(teller < 11) {
            y += 20;
            één = 1 ;
            som = één*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            twee = 2 ;
            som = twee*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            drie = 3 ;
            som = drie*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            vier = 4 ;
            som = vier*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            vijf = 5 ;
            som = vijf*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            zes = 6 ;
            som = drie*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            zeven = 7 ;
            som = zeven*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            acht = 8 ;
            som = acht*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            negen = 9 ;
            som = negen*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

        while(teller < 11) {
            y += 20;
            tien = 10 ;
            som = tien*teller;
            g.drawString("3x" + teller + "= " + som, 10, y );


            teller++;
        }

    }
}