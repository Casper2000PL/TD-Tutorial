package org.casper.inputs;

import org.casper.GameStates;
import org.casper.scenes.Menu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static org.casper.GameStates.*;

public class KeyboardListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("A key pressed");
            GameStates.gameState = MENU;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("s key pressed");
            GameStates.gameState = PLAYING;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            System.out.println("d key pressed");
            GameStates.gameState = SETTINGS;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
