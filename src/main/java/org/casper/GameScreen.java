package org.casper;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel {
    private Random random;
    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>();

    public GameScreen(BufferedImage img) {
        this.img = img;
        loadSprites();

        random = new Random();
    }

    private void loadSprites() {
        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                BufferedImage sprite = img.getSubimage(32 * x, 32 * y, 32, 32);
                sprites.add(sprite);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

//        g.drawImage(sprites.get(19),0,0,null);
//        g.drawImage(img.getSubimage(32 * 9, 32, 32, 32), 0, 0, null);

        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                g.drawImage(sprites.get(getRandInt()), x * 32, y * 32, null);
            }
        }
    }

    private int getRandInt() {
        return random.nextInt(100);
    }

    private Color getRandomColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        return new Color(r, g, b);
    }
}