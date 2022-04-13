package Game;

import com.company.PlayerMovement;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Window  extends JFrame {

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;

    public Window() {
        this.setVisible(true);
        this.setSize(WINDOW_WIDTH , WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);

        GameScene gameScene = new GameScene(0, 0 , WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameScene);

//        this.setTitle("GAME WINDOW");
//        this.getContentPane().setBackground(new Color(123, 213,234));//Numbers between 0-255
//        this.getContentPane().setBackground(new Color(0x123456));
//        ImageIcon image = new ImageIcon("src/Game/img.png");
//        this.setIconImage(image.getImage());

//        JLabel jLabel = new JLabel();
//        jLabel.setText("Hello");
//        jLabel.setBounds(0,0, 100, 100);
//        Font font = new Font("Arial", Font.PLAIN, 30);
//        jLabel.setFont(font);
//        jLabel.setBackground(Color.gray);
//        jLabel.setForeground(Color.WHITE);
//        jLabel.setOpaque(true);
//        jLabel.setBorder(BorderFactory.createLineBorder(Color.cyan, 3));
//        this.add(jLabel);


    }


    public static void main (String[]args){
            Window window = new Window();

    }
}
