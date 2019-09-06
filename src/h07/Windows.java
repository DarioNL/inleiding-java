package h07;

import java.applet.Applet;
import java.awt.*;

public class Windows extends Applet {

    @Override
    public void init() {
       Dimension dim =  new Dimension(400,300);
        this.setSize(dim);

    }

    @Override
    public void paint(Graphics g) {
      g.drawString("Welcome to java", 50, 60);
    }
}
