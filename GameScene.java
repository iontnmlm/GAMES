package Game;

import javax.swing.*;
import java.awt.*;

public class GameScene extends JPanel {

    private Rectangles ROAD_1;
    private Rectangles ROAD_2;
    private Rectangles ROAD_3;
    private Rectangles FRAME_RIGHT;
    private Rectangles FRAME_LEFT;

    private My_Image imageCar;
    private ImageIcon image;

    public GameScene(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(Color.black);


        this.image = new ImageIcon("C:\\Users\\ELI\\Desktop\\coding and cyber\\java\\ProgrammingWorkshop\\src\\Game\\car.jpg");
        this.imageCar = new My_Image(image, 300, height-200);

        ROAD_1 = new Rectangles((width / 4), 0, 6, height, Color.white);
        ROAD_2 = new Rectangles((width / 2), 0, 6, height, Color.white);
        ROAD_3 = new Rectangles((width/4)*3, 0, 6, height, Color.white);
        FRAME_RIGHT = new Rectangles(width-18, 0, 4, height, Color.green);
        FRAME_LEFT = new Rectangles(0, 0, 4, height, Color.green);

        mainGameLoop();
     }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.ROAD_1.paint(g);
        this.ROAD_2.paint(g);
        this.ROAD_3.paint(g);
        this.FRAME_LEFT.paint(g);
        this.FRAME_RIGHT.paint(g);
//        this.player.paint(g);
        this.imageCar.paint(g);
    }


    public void mainGameLoop(){
        new Thread(()->{
//            PlayerMovement playerMovement = new PlayerMovement(this.player);
            PlayerMovement_2 playerMovement3 = new PlayerMovement_2(this.imageCar);

            this.setFocusable(true);
            this.requestFocus();
            this.addKeyListener(playerMovement3);
            while(true){
                repaint();
                try {
                    Thread.sleep(0);
                    repaint();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
