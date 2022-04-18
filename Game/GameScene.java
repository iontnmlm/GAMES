 package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameScene extends JPanel {

    private Rectangles BOARD;
    private Rectangles ROAD_1;
    private Rectangles ROAD_2;
    private Rectangles ROAD_3;
    private Rectangles FRAME_RIGHT;
    private Rectangles FRAME_LEFT;

    private Frame[] frames;
    private Rectangles[] rectangles;
    private My_Image[] obstacles;
    private ImageIcon cars;

    private Frame frame;
    private Rectangles rectangle;
    private My_Image imageCar;
    private ImageIcon image;


    public GameScene(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);

        this.BOARD = new Rectangles(0, -10000, width, 10000+height, Color.black);
        ROAD_1 = new Rectangles((width / 4), 0, 6, height, Color.white);
        ROAD_2 = new Rectangles((width / 2), 0, 6, height, Color.white);
        ROAD_3 = new Rectangles((width/4)*3, 0, 6, height, Color.white);
        FRAME_RIGHT = new Rectangles(width-4, 0, 4, height, Color.green);
        FRAME_LEFT = new Rectangles(0, 0, 4, height, Color.green);

        this.rectangle = new Rectangles(300, height-200, 58, 130, Color.WHITE);
        this.frame = new Frame(this.rectangle);
        this.image = new ImageIcon("C:\\Users\\ELI\\Desktop\\coding and cyber\\java\\ProgrammingWorkshop\\src\\Game\\myCar.jpg");
        this.imageCar = new My_Image(image, 300, height-200, frame);

        this.obstacles = new My_Image[100];
        this.frames = new Frame[100];
        this.rectangles = new Rectangles[100];
        Random random = new Random();

        for (int i = 0; i < this.obstacles.length; i++) {
            int X = random.nextInt(width - 100);
            int Y = random.nextInt(height - (-10000)) - 10000;
            rectangles[i] = new Rectangles(X, Y, 58, 130, Color.WHITE);
            obstacles[i] = new My_Image(
                    this.cars = new ImageIcon("C:\\Users\\ELI\\Desktop\\coding and cyber\\java\\ProgrammingWorkshop\\src\\Game\\cars.jpg"),
                    X,
                    Y,
                    this.frames[i] = new Frame(this.rectangles[i])
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
        this.frame.paint(g);

        for(int i = 0; i < this.obstacles.length; i++){
            obstacles[i].paint(g);
            this.frames[i].paint(g);
        }
      }

    public void mainGameLoop(){
        new Thread(()->{
            PlayerMovement_IMAGE_CAR board = new PlayerMovement_IMAGE_CAR(this.BOARD, this.imageCar, this.frame, this.obstacles, this.frames);
            this.setFocusable(true);
            this.requestFocus();
            this.addKeyListener(board);
            first:
            while(true){
                try {
                    for(int i = 0; i < this.obstacles.length; i++){
                        if(this.frame.checkCollision(frames[i])){
                            break first;
                        }
                    }
                    this.BOARD.moveDown();
                    for(int i = 0; i < this.obstacles.length; i++){
                        this.obstacles[i].moveCarsDown();
                        this.frames[i].moveDown();
                    }
                    Thread.sleep(9);
                    repaint();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

}
