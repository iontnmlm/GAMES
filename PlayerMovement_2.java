package Game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement_2 implements KeyListener {

    private My_Image imageCar;

    public PlayerMovement_2(My_Image imageCar){
        this.imageCar = imageCar;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_RIGHT:
                this.imageCar.moveRight();
                break;
            case KeyEvent.VK_LEFT:
                this.imageCar.moveLeft();
                break;
            case KeyEvent.VK_UP:
                this.imageCar.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                this.imageCar.moveDown();
                break;
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
