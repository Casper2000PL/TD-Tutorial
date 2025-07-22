package org.casper;

import org.casper.inputs.KeyboardListener;
import org.casper.inputs.MyMouseListener;
import org.casper.scenes.Menu;
import org.casper.scenes.Playing;
import org.casper.scenes.Settings;

import javax.swing.*;

public class Game extends JFrame implements Runnable {
    private GameScreen gameScreen;
    private Thread gameThread;

    private final double FPS_SET = 120.0; // Frames per second
    private final double UPS_SET = 60.0; // Updates per second

    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;

    // Classes
    private Render render;
    private Menu menu;
    private Playing playing;
    private Settings settings;

    public Game() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initClasses();

        add(gameScreen);
        pack();

        setVisible(true);
    }

    private void initClasses() {
        render = new Render(this);
        gameScreen = new GameScreen(this);

        menu = new Menu(this);
        playing = new Playing(this);
        settings = new Settings(this);


    }

    private void initInputs() {
        myMouseListener = new MyMouseListener();
        keyboardListener = new KeyboardListener();

        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
        addKeyListener(keyboardListener);

        requestFocus();
    }

    private void start() {
        gameThread = new Thread(this) {};

        gameThread.start();
    }

    private void updateGame() {
        // System.out.println("Game updated!");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.initInputs();
        game.start();
    }

    @Override
    public void run() {
        double timePerFrame = 1_000_000_000.0 / FPS_SET; // 120 FPS
        double timePerUpdate = 1_000_000_000.0 / UPS_SET; // 60 UPS

        long lastFrame = System.nanoTime();
        long lastUpdate = System.nanoTime();
        long lastTimeCheck = System.currentTimeMillis();

        int frames = 0;
        int updates = 0;
        long now;

        while (true) {
            // Render
            now = System.nanoTime();
            if (now - lastFrame >= timePerFrame) {
                repaint();
                lastFrame = System.nanoTime();
                frames++;
            }
            // Update
            if (now - lastUpdate >= timePerUpdate) {
                updateGame();
                lastUpdate = System.nanoTime();
                updates++;
            }
            // checking FPS and UPS
            if (System.currentTimeMillis() - lastTimeCheck >= 1000) {
                System.out.println("FPS: " + frames + " | Updates: " + updates);
                frames = 0;
                updates = 0;
                lastTimeCheck = System.currentTimeMillis();
            }
        }
    }

    // Getters and Setters
    public Render getRender() {
        return render;
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }

    public Menu getMenu() {
        return menu;
    }

    public Playing getPlaying() {
        return playing;
    }

    public Settings getSettings() {
        return settings;
    }
}
