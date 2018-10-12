package week4.task1;

import java.io.*;

public class Tao extends HoaQua{

  public String getName(){return super.getName();}
  final public void setName(String id){super.setName("Tao");}

  public Tao(double a){
    super("Tao", a);
  }

  public String toString(){
    return "Ten: " + super.getName() + "\nCanNang: " + super.getWeight();
  }

  public static void main(String[] args){
    Tao a = new Tao(15000);
    System.out.println(a.toString());
    System.out.println(a.getName());
  }

}
