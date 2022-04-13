package Game;

import javax.swing.*;
import java.awt.*;

public class My_Image extends Component {

    private ImageIcon imageCar;
    private int x;
    private int y;

    public My_Image(ImageIcon imageCar, int x, int y ){
        this.imageCar = imageCar;
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g){
        this.imageCar.paintIcon(this, g, this.x, this.y);
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
