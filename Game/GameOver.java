package Game;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameOver extends JFrame {

    public GameOver(int point) {

        // This creates a new window
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);


        //It adds an image to the window
        ImageIcon image = new ImageIcon("Game\\GameOver_Pic.png");
        JLabel label = new JLabel();
        label.setBounds(75, 25, 350, 273);
        label.setIcon(image);
        this.add(label);

        // to add points
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();


        label1.setText("Your points = " + point);
        label1.setForeground(Color.RED);
        label1.setFont(new Font("Toma", Font.PLAIN, 20));
        label1.setBounds(165, 285, 200, 100);
        this.add(label1);

        // It adds a button to the window
        JButton button = new JButton();
        label2.setText("Play Again");
        label2.setFont(new Font("Arial", Font.PLAIN, 35));
        button.add(label2);
        button.setBounds(150, 357, 200, 100);
        // When you press the button
        // [a] The Entrance Window is closed [b] It's open a Window Game

        button.addActionListener((event) -> {
            this.dispose();
            MainWindow.close();

                EntranceWindow entranceWindow = new EntranceWindow();

        });
        this.add(button);

        this.setVisible(true);
    }
}
