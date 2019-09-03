package h02;

import java.applet.Applet;
import java.awt.*;

public class JoeyTest extends Applet {

    @Override
    public void init() {
        setBackground(Color.BLUE);
    }

    @Override
    public void paint(Graphics g) {
      g.setColor(Color.yellow);
      g.drawString("Dario", 50, 60);
      g.setColor(Color.RED);
      g.drawString("Ponzo", 50, 70);
    }
}
