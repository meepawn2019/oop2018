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
public class Circle extends Shape {
    final double PI=3.14;
    private double radius=1.0;
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius(){return radius;}
    public void setRadius(double a){radius = a;}
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public String toString(){
      return "radius: " + radius + "\ncolor: " + super.getColor() + "\nfilled: " + super.isFilled();
    }
    public static void main(String[] args){
      Circle a = new Circle();
      a.setRadius(5.0);
      System.out.println("Area: " + a.getArea() + "\nPerimeter: " + a.getPerimeter());
      System.out.println(a.toString());
      Circle b = new Circle(6.0);
      System.out.println("Area: " + b.getArea() + "\nPerimeter: " + b.getPerimeter());
      System.out.println(b.toString());
      Circle c = new Circle(6.0, "blue" , false);
      System.out.println("Area: " + c.getArea() + "\nPerimeter: " + c.getPerimeter());
      System.out.println(c.toString());
    }
}
