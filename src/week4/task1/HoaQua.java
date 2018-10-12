package week4.task1;

import java.io.*;

public class HoaQua{
  private String name;
  private float weight;
  private boolean isFresh;
  private int price;

  public String getName(){return name;}
  public void setName(String id){name = id;}
  public float getWeight(){return weight;}
  public void setWeight(float a){weight = a;}
  public void setIsFresh(boolean a){isFresh = a;}
  public boolean getIsFresh(){return isFresh;}
  public int getPrice(return price);
  public void setPrice(int a){price = a;}

  public void getDetail(){
    System.out.println("Ten: " + name + "\nCan nang: "+ weight);
  }

  public HoaQua(String id, float a){
    this.name = id;
    this.weight = a;
  }

  public void isEatable(){
    if(isFresh == true) System.out.println("YES");
    else System.out.println("NO");
  }
}
