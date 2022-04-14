package Game;

import com.company.CustomRectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameScene extends JPanel {

    private Rectangles ROAD_1;
    private Rectangles ROAD_2;
    private Rectangles ROAD_3;
    private Rectangles FRAME_RIGHT;
    private Rectangles FRAME_LEFT;

    private Rectangles BOARD;
    private My_Image[] obstacles;
    private ImageIcon cars;
    private My_Image imageCar;
    private ImageIcon image;
 
    public GameScene(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.image = new ImageIcon("C:\\Users\\ELI\\Desktop\\coding and cyber\\java\\ProgrammingWorkshop\\src\\Game\\car.jpg");
        this.imageCar = new My_Image(image, 300, height-200);

        this.BOARD = new Rectangles(0, -10000, width, 10000+height, Color.black);
        ROAD_1 = new Rectangles((width / 4), 0, 6, height, Color.white);
        ROAD_2 = new Rectangles((width / 2), 0, 6, height, Color.white);
        ROAD_3 = new Rectangles((width/4)*3, 0, 6, height, Color.white);
        FRAME_RIGHT = new Rectangles(width-18, 0, 4, height, Color.green);
        FRAME_LEFT = new Rectangles(0, 0, 4, height, Color.green);


        this.obstacles = new My_Image[200];
        Random random = new Random();
        for(int i = 0; i < this.obstacles.length; i++){
            obstacles[i] = new My_Image(
                    this.cars = new ImageIcon("C:\\Users\\ELI\\Desktop\\coding and cyber\\java\\ProgrammingWorkshop\\src\\Game\\image_2.jpg"),
                    random.nextInt(width-100),
                    random.nextInt(height-(-10000)) -10000
            );
        }

        mainGameLoop();
     }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.BOARD.paint(g);
        this.ROAD_1.paint(g);
        this.ROAD_2.paint(g);
        this.ROAD_3.paint(g);
        this.FRAME_LEFT.paint(g);
        this.FRAME_RIGHT.paint(g);
        this.imageCar.paint(g);
        for(int i = 0; i < this.obstacles.length; i++){
            obstacles[i].paint(g);
        }
    }

    public void mainGameLoop(){
        new Thread(()->{
            PlayerMovement_IMAGE_CAR board = new PlayerMovement_IMAGE_CAR(this.BOARD, this.imageCar, this.obstacles);
            this.setFocusable(true);
            this.requestFocus();
            this.addKeyListener(board);
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
