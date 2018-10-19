package src;


import java.awt.*;

abstract class Shape{
    private Color color;
    private boolean filled;

    public Shape(Color color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public Shape() {

    }




    public void setColor(Color color){
        this.color=color;
    }
    public Color getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }

    abstract  void draw(Graphics g);
    abstract void move(int weight, int height);
}