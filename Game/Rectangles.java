package Game;

import com.company.CustomRectangle;

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


    public boolean checkCollision(Rectangles other){
        boolean collision = false;
        Rectangle thisRectangle = new Rectangle(this.x, this.y, this.width, this.height);
        Rectangle otherRectangle = new Rectangle(other.x, other.y, other.width, other.height);
        if(thisRectangle.intersects(otherRectangle)){
            collision = true;
        }

        return collision;
    }

}
