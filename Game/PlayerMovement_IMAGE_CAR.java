package Game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement_IMAGE_CAR implements KeyListener {

    private My_Image imageCar;
    private Rectangles Board;
    private My_Image[] obstacles;

    public PlayerMovement_IMAGE_CAR(Rectangles board, My_Image imageCar, My_Image[] obstacles){
        this.imageCar = imageCar;
        this.Board = board;
        this.obstacles = obstacles;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(this.imageCar.getX() >= Window.WINDOW_WIDTH-100){
            this.imageCar.moveLeft();
        }
        if(this.imageCar.getX() <= 0){
            this.imageCar.moveRight();
        }
        switch (key){
            case KeyEvent.VK_RIGHT:
                this.imageCar.moveRight();
                this.Board.moveDown();
                for(int i = 0; i < this.obstacles.length; i++){
                    obstacles[i].moveDown();
                }
                break;
            case KeyEvent.VK_LEFT:
                this.imageCar.moveLeft();
                this.Board.moveDown();
                for(int i = 0; i < this.obstacles.length; i++){
                    obstacles[i].moveDown();
                }
                break;
            case KeyEvent.VK_UP:
                this.Board.moveDown();
                for(int i = 0; i < this.obstacles.length; i++){
                    obstacles[i].moveDown();
                }
                break;
            case KeyEvent.VK_DOWN:
                break;
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
