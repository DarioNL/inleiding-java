package h12;

import h08.Knop;

import java.applet.Applet;
import java.awt.*;
import java.util.*;
import  java.awt.event.*;

public class Array extends Applet {

    String[] namen = { "Valerie", "Jeroen", "Sander", "Frank"};
    Button knop;
    Label label;

    public void init() {
        Arrays.sort(namen);
        add(label);
        label = new Label("Typ iets in het tekstvakje");
        knop = new Button();
        knop.setLabel( "ok" );
        add(knop);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < 26; teller ++) {
            g.drawString("" + knop, 50, 20 * teller + 20);
        }
    }
}
