package main;
import inputs.KeyboardInputs;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GamePanel extends JPanel {

    public GamePanel () {
        addKeyListener(new KeyboardInputs());
        addMouseListener(null);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100,100,40,40);
    }
}
