package h02;

import java.applet.Applet;
import java.awt.*;

public class JoeyTest extends Applet {

    @Override
    public void init() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
      g.setColor(Color.yellow);
      g.drawString("Welcome to java!!", 50, 60);
    }
}
