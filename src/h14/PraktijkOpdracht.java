package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PraktijkOpdracht extends Applet {
    Button Knoph14, startknop;
    String som, tekst, tekst2;
    TextField tekstvak;
    int aantalVlaggen, aantalvlaggencomputer, getal, aantalVlaggen2;
    private Image afbeelding;
    private URL pad;

    public void init() {
        setSize(500, 400);
        aantalVlaggen = 23;
        aantalVlaggen2 = 23;
        tekstvak = new TextField("typ 1, 2 of 3");
        Knoph14 = new Button("speel");
        Knoph14listerner kl = new Knoph14listerner();

        startknop = new Button("start spel");
        startknoplisterner kl2 = new startknoplisterner();
        startknop.addActionListener(kl2);
        add(startknop);

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 60;
        int y2 = 100;
        int x2 = 0;
        g.drawString("De computer heeft " + som + " vlaggen weggehaalt", x, y);
        g.drawString("aantal resterende vlaggen: " + aantalVlaggen + " Jouw beurt", x, y + 20);
        g.drawString(tekst, y, x-10);
        g.drawString(tekst2, y, x);
        for (int i = 0; i < aantalVlaggen; i++) {
            if (i % 4 == 0) {
                x2 = 40;
                y2 += 40;
            }
            g.drawImage(afbeelding, x2, y2, 40, 30, this);
            x2 += 50;
        }
    }

    class startknoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            pad = PraktijkOpdracht.class.getResource("/resources/");
            afbeelding = getImage(pad, "23.jpg");

            remove(startknop);

            add(tekstvak);


            Knoph14.addActionListener(new Knoph14listerner());
            add(Knoph14);

            setSize(501, 400);
            setSize(500, 400);
        }
    }


    class Knoph14listerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double RandomGetal = Math.random();
            int random = (int) (RandomGetal * 3 + 1);
            String s;

            s = tekstvak.getText();

            getal = Integer.parseInt( s );

            if (getal > 3) {
                tekst = "wat u heeft getypt is niet geldig";
                repaint();
            }
            else {
                tekst = "";
                repaint();
            }
                if (0 > getal) {
                    tekst = "wat u heeft getypt is niet geldig";
                    repaint();
                }
                else {
                    tekst = "";
                    repaint();
                }


                    if (getal < 4) {
                        if (getal > 0) {


                            if (aantalVlaggen < 1) {
                                tekst2 = "je hebt gewonnen";
                                repaint();
                            } else {
                                if (aantalVlaggen == 1) {
                                    tekst2 = "Je hebt veloren.";
                                    repaint();
                                } else {
                                    aantalVlaggen = aantalVlaggen - getal;
                                    if (aantalVlaggen > 21) {
                                        aantalvlaggencomputer = aantalVlaggen - 21;
                                    } else if (aantalVlaggen == 21) {
                                        aantalvlaggencomputer = random;
                                    } else if (aantalVlaggen > 17) {
                                        aantalvlaggencomputer = aantalVlaggen - 17;
                                    } else if (aantalVlaggen == 17) {
                                        aantalvlaggencomputer = random;
                                    } else if (aantalVlaggen > 13) {
                                        aantalvlaggencomputer = aantalVlaggen - 13;
                                    } else if (aantalVlaggen == 13) {
                                        aantalvlaggencomputer = random;
                                    } else if (aantalVlaggen > 9) {
                                        aantalvlaggencomputer = aantalVlaggen - 9;
                                    } else if (aantalVlaggen == 9) {
                                        aantalvlaggencomputer = random;
                                    } else if (aantalVlaggen > 5) {
                                        aantalvlaggencomputer = aantalVlaggen - 5;
                                    } else if (aantalVlaggen == 5) {
                                        aantalvlaggencomputer = random;
                                    } else if (aantalVlaggen > 1) {
                                        aantalvlaggencomputer = aantalVlaggen - 1;
                                    } else if (aantalVlaggen == 1) {
                                        aantalvlaggencomputer = random;

                                        repaint();
                                    }
                                    repaint();
                                }
                            }
                        }



                }
                repaint();











            aantalVlaggen= aantalVlaggen-aantalvlaggencomputer;
            repaint();











        }
    }


}

