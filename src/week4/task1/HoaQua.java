package week4.task1;

import java.io.*;

public class HoaQua{
  private String name;
  private double weight;
  private boolean isFresh;

  public String getName(){return name;}
  public void setName(String id){name = id;}
  public double getWeight(){return weight;}
  public void setWeight(double a){weight = a;}
  public void setIsFresh(boolean a){isFresh = a;}
  public boolean getIsFresh(){return isFresh;}

  public void getDetail(){
    System.out.println("Ten: " + name + "\nCan nang: "+ weight + "\nTinh trang: " + isFresh);
  }

  public HoaQua(String id, double a){
    this.name = id;
    this.weight = a;
  }

  public void isEatable(){
    if(isFresh == true) System.out.println("YES");
    else System.out.println("NO");
  }

  public static void main(String[] args){
    HoaQua a = new HoaQua("Chuoi", 15.3);
    a.getDetail();
  }
}
