package org.casper.scenes;

import org.casper.Game;

import java.awt.*;

public class Playing extends GameScene implements SceneMethods {
    public Playing(Game game) {
        super(game);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 640, 640);
    }

    @Override
    public void callMe() {

    }
}
