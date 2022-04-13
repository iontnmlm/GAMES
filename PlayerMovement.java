package Game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement implements KeyListener {

    private Car car;

    public PlayerMovement(Car car){
        this.car = car;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_RIGHT:
                this.car.moveRight();
                break;
            case KeyEvent.VK_LEFT:
                this.car.moveLeft();
                break;
            case KeyEvent.VK_UP:
                this.car.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                this.car.moveDown();
                break;
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
