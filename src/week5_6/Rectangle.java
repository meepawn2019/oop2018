package week5_6;

import java.awt.*;
import java.awt.Point;

public class Rectangle extends Shape{
	private double height;
	private double width;
	private Point upperCorner;
	
	public Rectangle(Color color, boolean filled, double height, double width, Point upperCorner){
		super(color, filled);
		this.height = height;
		this.width = width;
		this.upperCorner = upperCorner;
	}
	
	public double getUpperCornerX(){
		return this.upperCorner.getX();
	}
	public double getUpperCornerY(){
		return this.upperCorner.getY();
	}
	
	public void draw(Graphics g){
		g.setColor(super.getColor());
        g.fillRect((int) upperCorner.getX(),(int) upperCorner.getY(),(int) this.height,(int) this.width);
	}
	
	public void move(int width, int height){
		System.out.println("Di chuyen HCN");
	}
}