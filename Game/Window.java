package Game;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Window  extends JFrame {

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;

    //This constructor build a window.
    public Window() {
        this.setVisible(true);
        this.setSize(WINDOW_WIDTH , WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
    //This constructor build a Panel on the window.
        GameScene gameScene = new GameScene(0, 0 , WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameScene);
    }
}
