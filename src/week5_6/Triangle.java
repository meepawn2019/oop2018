package src;

import java.awt.*;
import java.util.Random;

public class Triangle extends  Shape{
    private Point side[] = new Point[3];

    Triangle(Color color, boolean filled, Point a, Point b, Point c){
        super(color, filled);
        side[0] = a;
        side[1] = b;
        side[2] = c;
    }



    @Override
    void draw(Graphics g) {
        g.setColor(super.getColor());
        if(isFilled()) g.fillPolygon(new int[]{(int) side[0].getX(), (int) side[1].getX(), (int) side[2].getX()} , new int[] {(int) side[0].getY(), (int) side[1].getY(), (int) side[2].getY()}, 3);
        else g.drawPolygon(new int[]{(int) side[0].getX(), (int) side[1].getX(), (int) side[2].getX()} , new int[] {(int) side[0].getY(), (int) side[1].getY(), (int) side[2].getY()}, 3);
    }

    @Override
    void move(int height, int width) {
        Random random = new Random();
    }
}
