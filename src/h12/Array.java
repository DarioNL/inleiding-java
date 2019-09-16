package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Array extends Applet {

    String[] namen = {"Valerie", "Jeroen", "Sander", "Frank"};
    Button knop;
    String s;
    Label label;

    double cijfer[];


    public void init() {
        for (int teller = 0; teller < 26; teller++)
        cijfer = new double [25];
        knop = new Button("ok");
        label = new Label("");
        add(knop);
        int teller = 0;
        cijfer[teller] = 0 * teller + 100;
        teller++;
    }


    @Override
    public void paint(Graphics g) {
        }
    }


