package week5_6;

import java.awt.*;
import java.awt.Point;

public class Square extends Rectangle{
	
	private double side;
	
	public Square(Color color, boolean filled, double side, Point a){
		super(color, filled, side, side, a);
		this.side = side;
	}
	
	public void draw(Graphics g){
		g.setColor(super.getColor());
        g.fillRect((int) super.getUpperCornerX(),(int) super.getUpperCornerY(),(int) this.side,(int) this.side);
	}
	
	public void move(int height, int width){
		System.out.println("Di chuyen hinh vuong");
	}
}
