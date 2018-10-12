/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author thota
 */
public class Square extends Rectangle{
    private double side;
    public Square(){
        side =1.0;
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side,String color,boolean filled){
      super(side, side, color, filled);
        this.side=side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setLength(double side) {
        super.setLength(side); //To change body of generated methods, choose Tools | Templates.
    }
    public void setWidth(double side) {
        super.setWidth(side); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString(){
      return "side: " + side + "\ncolor: " + super.getColor() + "\nfilled: " + super.isFilled();
    }
    public static void main(String[] args){
      Square a = new Square();
      Square b = new Square(5.0);
      Square c = new Square(5.0, "Blue", false);
      a.setSide(5.0);
      a.setLength(5.0);
      a.setWidth(5.0);
      a.setFilled(true);
      System.out.println("DT: " + a.getArea() + "\tChu vi: " + a.getPerimeter());
      System.out.println(a.getLength() + "\n" + a.getWidth());
      System.out.println(a.toString() + "\n" + b.toString() + "\n" + c.toString());
    }
}
