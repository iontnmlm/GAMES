package Game;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Window extends JFrame {
    private static JFrame frame= new JFrame();;

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;

    //This constructor build a window.

    public void run(){
        frame.setVisible(true);
        frame.setSize(new Dimension (WINDOW_WIDTH , WINDOW_HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        //This constructor build a Panel on the window.
        GameScene gameScene = new GameScene(0, 0 , WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.add(gameScene);
    }
    public static void close(){
        frame.dispose();
        Window window = new Window();
    }

    public static class GameOver extends JFrame {

        public GameOver(int point) {

            // This creates a new window
            this.setSize(500, 500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setLayout(null);


            //It adds an image to the window
            ImageIcon image = new ImageIcon("Game\\gameOver.jpg");
            JLabel label = new JLabel();
            label.setBounds(75, 25, 350, 273);
            label.setIcon(image);
            this.add(label);

            // to add points
            JLabel label1 = new JLabel();
            JLabel label2 = new JLabel();


            label1.setText("This point is = " + point);
            label1.setForeground(Color.RED);
            label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
            label1.setBounds(150, 285, 200, 100);
            this.add(label1);




            // It adds a button to the window
            JButton button = new JButton();
            label2.setText("Play Again");
            label2.setFont(new Font("Tahoma", Font.PLAIN, 35));
            button.add(label2);
            button.setBounds(150, 357, 200, 100);
            // When you press the button
            // [a] The Entrance Window is closed [b] It's open a Window Game

            button.addActionListener((event) -> {
                this.dispose();
                close();
                EntranceWindow entraceWindow = new EntranceWindow();

            });
            this.add(button);


            this.setVisible(true);
        }
    }
}