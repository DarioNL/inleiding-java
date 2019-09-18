package h12;

import com.sun.prism.PixelFormat;

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



    public void init() {

        for (int teller = 0; teller < 26; teller++){
            knop = new Button("ok");
        label = new Label("");
        add(knop);
        }

    }


    @Override
    public void paint(Graphics g) {


    }
    }


