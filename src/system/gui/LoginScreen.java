package system.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

/**
 * Finestra di login per l'applicazione.
 *
 * @author Manuel Gallina
 */
class LoginScreen {

    private static final Dimension FRAME_SIZE = new Dimension(960, 540);

    private JFrame frame;
    private Font text;
    private Font symbol;

    void build() {
        try {

            symbol = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Manuel Gallina\\IdeaProjects\\Gestionale BdC\\resources\\fonts\\Zetafonts - Antipasto Icons DemiBold.ttf"));
            text = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Manuel Gallina\\IdeaProjects\\Gestionale BdC\\resources\\fonts\\Zetafonts - Antipasto Pro DemiBold.ttf"));

            text = text.deriveFont(Font.PLAIN, 29);
            symbol = symbol.deriveFont(Font.PLAIN, 29);

        } catch (IOException|FontFormatException e) {
            e.printStackTrace();
        }

        try {
            frameInit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void frameInit() throws IOException {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setMinimumSize(FRAME_SIZE);
        frame.setPreferredSize(FRAME_SIZE);
        frame.setMaximumSize(FRAME_SIZE);

        frame.setResizable(false);
        frame.setUndecorated(true);

        frame.setLocationRelativeTo(null);

        BackgroundImagePanel background =
                new BackgroundImagePanel("C:\\Users\\Manuel Gallina\\IdeaProjects\\Gestionale BdC\\resources\\images\\BdC-Login.jpg");
        background.setBounds(0, 0, 960, 540);

        frame.add(background);
        frame.add(exitButtonInit());
        frame.add(textFieldInit());
        frame.add(passwordFieldInit());
        frame.add(nextButtonInit());

        frame.setVisible(true);
    }

    private JButton exitButtonInit() {
        JButton exit = new JButton();
        exit.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setCursor(Cursor.HAND_CURSOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                frame.setCursor(Cursor.DEFAULT_CURSOR);
            }
        });
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        exit.setBounds(920, 10, 30, 30);
        return exit;
    }

    private JButton nextButtonInit() {
        JButton next = new JButton();
        next.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
        next.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setCursor(Cursor.HAND_CURSOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                frame.setCursor(Cursor.DEFAULT_CURSOR);
            }
        });
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorderPainted(false);
        next.setBounds(736, 398, 130, 50);

        return next;
    }

    private JTextField textFieldInit() {
        JTextField textField = new JTextField(1);
        textField.setOpaque(true);
        textField.setBorder(null);
        textField.setBounds(390, 234, 465, 38);
        textField.setBackground(new Color(216,216,216));
        textField.setFont(text);
        textField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setCursor(Cursor.HAND_CURSOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                frame.setCursor(Cursor.DEFAULT_CURSOR);
            }
        });

        return textField;
    }

    private JPasswordField passwordFieldInit() {
        JPasswordField passwordField = new JPasswordField(1);
        passwordField.setOpaque(true);
        passwordField.setBorder(null);
        passwordField.setBounds(390, 335, 465, 38);
        passwordField.setBackground(new Color(216,216,216));
        passwordField.setFont(text);
        passwordField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setCursor(Cursor.HAND_CURSOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                frame.setCursor(Cursor.DEFAULT_CURSOR);
            }
        });

        return passwordField;
    }
}
