import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Converter extends JFrame {
    public final static int HEIGHT = 400;
    public final static int WIDTH = 450;
    public final static String TITLE = "Temperature Converter";

    public Converter () {
        this.setTitle(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(new Color(2, 24, 245));
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(193, 201, 201));

        JTextField celsToFahr = new JTextField("", 5);
        JTextField fahrToCels = new JTextField("", 5);
        JTextField celsToKel = new JTextField("", 5);
        JTextField kelToCels = new JTextField("", 5);
        JTextField fahrToKel = new JTextField("", 5);
        JTextField kelToFahr = new JTextField("", 5);
        JLabel equalSign1 = new JLabel("=");
        JLabel equalSign2 = new JLabel("=");
        JLabel equalSign3 = new JLabel("=");
        JLabel cels1 = new JLabel("°C");
        JLabel cels2 = new JLabel("°C");
        JLabel fahr1 = new JLabel("°F");
        JLabel fahr2 = new JLabel("°F");
        JLabel kel1 = new JLabel("K");
        JLabel kel2 = new JLabel("K");
        JLabel error = new JLabel("Something went wrong!");

        Font font = new Font("Futura", Font.PLAIN, 35);

        celsToFahr.setFont(font);
        fahrToCels.setFont(font);
        celsToKel.setFont(font);
        kelToCels.setFont(font);
        fahrToKel.setFont(font);
        kelToFahr.setFont(font);
        equalSign1.setFont(font);
        equalSign2.setFont(font);
        equalSign3.setFont(font);
        cels1.setFont(font);
        cels2.setFont(font);
        fahr1.setFont(font);
        fahr2.setFont(font);
        kel1.setFont(font);
        kel2.setFont(font);
        error.setFont(font);

        error.setVisible(false);

        celsToFahr.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = celsToFahr.getText();
                if (text.isEmpty()) {
                    fahrToCels.setText("");
                    return;
                }
                try {
                    Scanner sc = new Scanner(text);
                    double temp = sc.nextDouble();
                    fahrToCels.setText(String.format("%.2f", (temp * 1.8) + 32));
                    error.setVisible(false);
                }
                catch (Exception _) {
                    error.setVisible(true);
                    fahrToCels.setText("");
                }
            }
        });
        fahrToCels.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = fahrToCels.getText();
                if (text.isEmpty()) {
                    celsToFahr.setText("");
                    return;
                }
                try {
                    Scanner sc = new Scanner(text);
                    double temp = sc.nextDouble();
                    celsToFahr.setText(String.format("%.2f", (temp - 32) / 1.8));
                    error.setVisible(false);
                }
                catch (Exception _) {
                    error.setVisible(true);
                    celsToFahr.setText("");
                }
            }
        });
        celsToKel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = celsToKel.getText();
                if (text.isEmpty()) {
                    kelToCels.setText("");
                    return;
                }
                try {
                    Scanner sc = new Scanner(text);
                    double temp = sc.nextDouble();
                    kelToCels.setText(String.format("%.2f", temp + 273.15));
                    error.setVisible(false);
                }
                catch (Exception _) {
                    error.setVisible(true);
                    kelToCels.setText("");
                }
            }
        });
        kelToCels.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = kelToCels.getText();
                if (text.isEmpty()) {
                    celsToKel.setText("");
                    return;
                }
                try {
                    Scanner sc = new Scanner(text);
                    double temp = sc.nextDouble();
                    celsToKel.setText(String.format("%.2f", temp - 273.15));
                    error.setVisible(false);
                }
                catch (Exception _) {
                    error.setVisible(true);
                    celsToKel.setText("");
                }
            }
        });
        fahrToKel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = fahrToKel.getText();
                if (text.isEmpty()) {
                    kelToFahr.setText("");
                    return;
                }
                try {
                    Scanner sc = new Scanner(text);
                    double temp = sc.nextDouble();
                    kelToFahr.setText(String.format("%.2f", (temp - 32) / 1.8 + 273.15));
                    error.setVisible(false);
                }
                catch (Exception _) {
                    error.setVisible(true);
                    kelToFahr.setText("");
                }
            }
        });
        kelToFahr.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = kelToFahr.getText();
                if (text.isEmpty()) {
                    fahrToKel.setText("");
                    return;
                }
                try {
                    Scanner sc = new Scanner(text);
                    double temp = sc.nextDouble();
                    fahrToKel.setText(String.format("%.2f", (temp - 273.15) * 1.8 + 32));
                    error.setVisible(false);
                }
                catch (Exception _) {
                    error.setVisible(true);
                    fahrToKel.setText("");
                }
            }
        });

        panel.add(celsToFahr);
        panel.add(cels1);
        panel.add(equalSign1);
        panel.add(fahrToCels);
        panel.add(fahr1);

        panel.add(celsToKel);
        panel.add(cels2);
        panel.add(equalSign2);
        panel.add(kelToCels);
        panel.add(kel1);

        panel.add(fahrToKel);
        panel.add(fahr2);
        panel.add(equalSign3);
        panel.add(kelToFahr);
        panel.add(kel2);
        panel.add(error);
        this.add(panel);
    }

    public void main(String[] args) {
        this.setVisible(true);
    }
}