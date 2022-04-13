package Game;

import java.awt.*;

public class Car {

    private Rectangles Body;
    private Rectangles Front;

    public Car(){
        this.Body = new Rectangles(Window.WINDOW_WIDTH/2,
                                    Window.WINDOW_HEIGHT-250,
                                    80,
                                    100,
                                    Color.cyan);
        this.Front = new Rectangles(Window.WINDOW_WIDTH/2+10,
                                        Window.WINDOW_HEIGHT-280,
                                          60,
                                         30,
                                        Color.white);
    }

    public void paint(Graphics g){
        this.Front.paint(g);
        this.Body.paint(g);
    }

    public void moveRight(){
        this.Body.moveRight();
        this.Front.moveRight();
    }
    public void moveLeft(){
        this.Body.moveLeft();
        this.Front.moveLeft();
    }
    public void moveUp(){
        this.Body.moveUp();
        this.Front.moveUp();
    }
    public void moveDown(){
        this.Body.moveDown();
        this.Front.moveDown();
    }

}
