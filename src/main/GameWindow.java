package main;

import javax.swing.*;

public class GameWindow extends JFrame {
    private JFrame jframe;

    public GameWindow(MenuPanel menuPanel, GamePanel gamePanel) {
        jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.add(menuPanel);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
    }
}
