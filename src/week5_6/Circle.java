package src;

import java.awt.*;
import java.awt.Point;
import java.util.Random;

public class Circle extends Shape {
    private int x;
    private int y;
    private int r;
    private int change_value1 = 10;
    private int change_value2 = 10;

    public Circle(Color color, boolean filled,int x, int y, int r){
        super(color, filled);
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public boolean isFilled(){
        return super.isFilled();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void draw(Graphics g) {
            g.setColor(super.getColor());
            g.fillOval((x-r), (y - r), (2*r), (2*r));
    }

    @Override
    public void move(int width, int height) {

        if(x<0 || x > width){
            change_value1 = -change_value1;
        }
        if(y<0 || y > height){
            change_value2 = -change_value2;
        }
        x+=change_value1;
        y+=change_value2;
    }



    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    public double getR() {
        return r;
    }

}
