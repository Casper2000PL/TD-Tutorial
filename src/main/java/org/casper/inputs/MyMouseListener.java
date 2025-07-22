package org.casper.inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyMouseListener implements MouseListener, MouseMotionListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            System.out.println("Left mouse button clicked at: " + e.getX() + ", " + e.getY());
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println("Right mouse button clicked at: " + e.getX() + ", " + e.getY());
        } else if (e.getButton() == MouseEvent.BUTTON2) {
            System.out.println("Middle mouse button clicked at: " + e.getX() + ", " + e.getY());
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
