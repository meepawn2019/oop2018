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
public class Shape {
    private String color="red";
    private boolean filled=false;
    /**
    * Ham khoi tao 1 doi tuong Shape voi color = 0, filled = false
    * @return tra ve 1 doi tuong Shape
    */
    public Shape(){
        color="0";
        filled = false;
    }
    /**
    * Ham khoi tao 1 doi tuong Shape
    * @param color Mau cua doi tuong
    * @param filled Trang thai cua filled
    */
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    /**
    * Dat color la mau cua doi tuong
    * @param color Mau cua doi tuong
    */
    public void setColor(String color){
        this.color=color;
    }
    /**
    * Lay gia tri mau cua doi tuong
    8 @return mau cua doi tuong
    */
    public String getColor(){
        return color;
    }
    /**
    * Lay trang thai filled cua doi tuong
    * @return trang thai filled
    */
    public boolean isFilled(){
        return filled;
    }
    /**
    * Dat trang thai filled cho doi tuong
    * @param filled Trang thai muon dat cho doi tuong
    */
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    /**
    * Chuyen Shape thanh toString
    * @return Dang String cua Shape
    */
    public String toString(){
      return "color: " + color + "filled: " + filled;
    }

    public static void main(String[] args){
      Shape a = new Shape();
      a.setColor("Green");
      a.setFilled(false);
      System.out.println(a.toString());
      Shape b = new Shape("Green", true);
      System.out.println(b.toString());
    }

}
