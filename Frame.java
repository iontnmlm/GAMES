package Game;

import java.awt.*;

public class Frame {

    private Rectangles frame;

    public Frame(Rectangles frame){
        this.frame = frame;
    }

    public void paint(Graphics g){
        g.setColor(frame.getColor());
        g.drawRect(this.frame.getX(), this.frame.getY(), this.frame.getWidth(), this.frame.getHeight());
    }

    public void moveRight(){
        frame.moveRight();
    }
    public void moveLeft(){
        frame.moveLeft();
    }
    public void moveUp(){
        frame.moveUp();
    }
    public void moveDown() {
        frame.moveDown();
    }
    public int getX(){
        return this.frame.getX();
    }
    public int getY(){
        return this.frame.getY();
    }

    public boolean checkCollision(Frame other){
        boolean collision = false;
        if((this.frame.getX() <= other.getX()    &&
            this.frame.getX() + this.frame.getWidth() >= other.getX())
                                &&
           ((this.frame.getY() <= other.frame.getY()+150   &&
             this.frame.getY() >= other.frame.getY())
                                ||
            (this.frame.getY()+150 >= other.frame.getY()    &&
            this.frame.getY()+150 <= other.frame.getY() +150))
                //So far it has covered an accident from the left
                                ||
                //From here onwards it will cover on accidents from the right
           (this.frame.getX() >= other.frame.getX()    &&
            this.frame.getX() - this.frame.getWidth() <= other.frame.getX())
                                &&
            ((this.frame.getY() <= other.frame.getY()+150    &&
             this.frame.getY() >= other.frame.getY())
                                ||
             (this.frame.getY()+150 >= other.frame.getY()    &&
              this.frame.getY()+150 <= other.frame.getY() +150))){
            collision = true;
        }
        return collision;
    }

}