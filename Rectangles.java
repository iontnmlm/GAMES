package Game;

import java.awt.*;

public class Rectangles {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Rectangles(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void paint(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

    public void moveRight(){
        this.x++;
    }
    public void moveLeft(){
        this.x--;
    }
    public void moveUp(){
        this.y--;
    }
    public void moveDown(){
        this.y++;
    }

}
