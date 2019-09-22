package h12;

import java.applet.Applet;
import java.awt.*;
import java.util.stream.*;

public class Gemiddelde extends Applet {

    int[] getal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int antwoord = IntStream.of(getal).sum();
    double[] cijfer;



    public void init() {
        cijfer = new double[10];
        cijfer[0] = 1;
        cijfer[1] = 2;
        cijfer[2] = 3;
        cijfer[3] = 4;
        cijfer[4] = 5;
        cijfer[5] = 6;
        cijfer[6] = 7;
        cijfer[7] = 8;
        cijfer[8] = 9;
        cijfer[9] = 10;

        antwoord= antwoord/10;

    }


    @Override
    public void paint(Graphics g) {
        int i;
        int x=50;
        int xplus = 50;
        for ( i = 0; i < 10; i++) {
            g.drawString(cijfer[i] + "",  x+xplus*i, 20);
        }
        g.drawString("het gemiddelde is " + antwoord, 550, 60);
    }
    }


