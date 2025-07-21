package org.casper;

import javax.swing.*;

public class Game extends JFrame {
    public Game() {
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        System.out.println("Start of my TD Tutorial!");
        Game game = new Game();


    }
}
