package org.casper.scenes;

import org.casper.Game;

import java.awt.*;

public class Settings extends GameScene implements SceneMethods {
    public Settings(Game game) {
        super(game);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 640, 640);
    }

    @Override
    public void callMe() {

    }
}
