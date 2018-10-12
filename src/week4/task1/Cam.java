package week4.task1;

import java.io.*;

public class Cam extends HoaQua{
  private String type;
  private int giaBan;

  public String getName(){super.getName()}
  final public void setName(String id){super.setName("Cam");}

  public String getType(){return type;}
  public void setType(String id){type = id;}

  public Cam(String id, double a, int b){
    super("Cam", a);
    this.giaBan = b;
    this.type = id;
  }
  public int getGiaBan() {
    return giaBan;
  }

public void setGiaBan(int giaBan) {
    this.giaBan = giaBan;
  }

  public String toString(){
    return "Ten: " + super.getName() + "\nCan: " + super.getWeight() + "\nLoai: " + type;
  }
}
