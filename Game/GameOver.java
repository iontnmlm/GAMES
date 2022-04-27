package Game;

import javax.swing.*;
import java.awt.*;

public class GameOver extends JFrame {

    public GameOver(int point) {

        // This creates a new window
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);


        //It adds an image to the window
        ImageIcon image = new ImageIcon("C:\\Users\\Eliyahu toronto\\Game_Shai\\Game\\gameOver.jpg");
        JLabel label = new JLabel();
        label.setBounds(50, 50, 400, 300);
        label.setIcon(image);
        this.add(label);

        // to add points
        JLabel label1 = new JLabel();


        label1.setText("this point is = " + point);
        label1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label1.setBounds(200, 300, 200, 200);
        this.add(label1);


        this.setVisible(true);
    }
}
