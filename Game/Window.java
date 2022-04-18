package Game;

import com.company.PlayerMovement;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Window  extends JFrame {

    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 600;

    //This constractur build a window.
    public Window() {
        this.setVisible(true);
        this.setSize(WINDOW_WIDTH , WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
    //This constractur build a Panel on the window.
        GameScene gameScene = new GameScene(0, 0 , WINDOW_WIDTH-200, WINDOW_HEIGHT);
        this.add(gameScene);


    }


    public static void main (String[]args){
            Window window = new Window();

    }
}
