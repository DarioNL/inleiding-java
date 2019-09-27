package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PraktijkOpdrachtTwee extends Applet {
    int aantalVlagen = 23,
            aantalVlagenSpeler = 0,
            aantalVlagenComputer = 0;
    Label tekstvakLabel = new Label("typ 1,2 of 3");
    TextField tekstvak = new TextField("", 5);
    Button startKnop = new Button("Start spel"),
            speelKnop = new Button("Speel"),
            nieuwSpelKnop = new Button("Nieuw spel");
    String regel1 = "",
            regel2 = "",
            regel3 = "";

    private Image afbeelding;
    private Image afbeelding2;
    private Image afbeelding3;
    private Image afbeelding4;
    private URL pad;

    private AudioClip sound;
    private AudioClip sound2;

    public void init() {
        startKnop.addActionListener(new StartKnopListener());
        add(startKnop);

        afbeelding4 = getImage(pad, "start.jpg");

        pad = PraktijkOpdrachtTwee.class.getResource("/resources/");
        sound = getAudioClip(pad, "applaus.wav");
        sound2 = getAudioClip(pad, "boo.wav");
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 130;





            g.drawString(regel1, 10, 40);
        g.drawString(regel2, 10, 60);
        g.drawString(regel3, 10, 80);

        g.drawImage(afbeelding2, 130, 150, 150, 150, this);
        g.drawImage(afbeelding3, 130, 150, 150, 150, this);
        g.drawImage(afbeelding4, 10, 10, 300, 150, this);

        for (int i = 0; i < aantalVlagen; i++) {
            if (i % 4 == 0) {
                x = 10;
                y += 35;
            }
            g.drawImage(afbeelding, x, y, 30, 30, this);
            x += 35;
        }
    }


    class StartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            pad = PraktijkOpdrachtTwee.class.getResource("/resources/");
            afbeelding = getImage(pad, "23.jpg");


            remove(startKnop);

            afbeelding4 = getImage(pad, "");



            add(tekstvakLabel);
            add(tekstvak);


            speelKnop.addActionListener(new SpeelKnopListener());
            add(speelKnop);



            setSize(500, 400);
            setSize(500, 400);
        }
    }


    private void computerZet() {

        double RandomGetal = Math.random();
        int random = (int) (RandomGetal * 3 + 1);

        if (aantalVlagen > 21) {
            aantalVlagenComputer = aantalVlagen - 21;
        } else if (aantalVlagen == 21) {
            aantalVlagenComputer = random;
        } else if (aantalVlagen > 17) {
            aantalVlagenComputer = aantalVlagen -17;
        } else if (aantalVlagen == 17) {
            aantalVlagenComputer = random;
        } else if (aantalVlagen > 13) {
            aantalVlagenComputer = aantalVlagen -13;
        } else if (aantalVlagen == 13) {
            aantalVlagenComputer = random;
        }else if (aantalVlagen > 9) {
            aantalVlagenComputer = aantalVlagen -9;
        } else if (aantalVlagen == 9) {
            aantalVlagenComputer = random;
        }else if (aantalVlagen > 5) {
            aantalVlagenComputer = aantalVlagen -5;
        } else if (aantalVlagen == 5) {
            aantalVlagenComputer = random;
        }else if (aantalVlagen > 1) {
            aantalVlagenComputer = aantalVlagen -1;
        } else if (aantalVlagen == 1) {
            aantalVlagenComputer = random;
        }

        aantalVlagen = aantalVlagen - aantalVlagenComputer;
    }


    class SpeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            aantalVlagenSpeler = Integer.parseInt(tekstvak.getText());


            if (aantalVlagenSpeler > 0 && aantalVlagenSpeler < 4) {
                aantalVlagen = (aantalVlagen - aantalVlagenSpeler);

                if (aantalVlagen <= 0) {
                    regel1 = "Ha je hebt verloren!";
                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);
                    afbeelding2 = getImage(pad, "hahaha.jpg");
                    sound2.play();


                    nieuwSpelKnop.addActionListener(new NieuwSpelKnopListener());
                    add(nieuwSpelKnop);


                    setSize(400, 300);
                    setSize(400, 300);
                    regel2 = "";
                    regel3 = "";

                } else if (aantalVlagen == 1) {
                    regel1 = "Je hebt gewonnen";
                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);
                    afbeelding3 = getImage(pad, "win.jpg");
                    sound.play();



                    nieuwSpelKnop.addActionListener(new NieuwSpelKnopListener());
                    add(nieuwSpelKnop);



                    setSize(401, 300);
                    setSize(400, 300);
                    regel2 = "";
                    regel3 = "";
                } else {
                    computerZet();
                    regel1 = "De computer heeft " + aantalVlagenComputer + " vlag(gen) weggehaald.";
                    regel2 = "Aantal vlaggen: " + aantalVlagen + ". Jouw beurt.";
                    regel3 = "Je had hiervoor " + aantalVlagenSpeler + " vlag(gen) weggehaald";
                }
            }

            else {
                regel2 = "";
                regel3 = "";
                regel1 = "wat uw heeft getypt is niet geldig kies 1, 2 of 3 ";
            }
            repaint();
        }
    }


    class NieuwSpelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            regel1 = "";
            regel2 = "";
            regel3 = "";

            aantalVlagen = 23;

            add(tekstvakLabel);
            add(tekstvak);
            add(speelKnop);
            remove(nieuwSpelKnop);
            afbeelding2 = getImage(pad, "");
            afbeelding3 = getImage(pad, "");



            setSize(401, 300);
            setSize(400, 300);

            repaint();
        }
    }
}

