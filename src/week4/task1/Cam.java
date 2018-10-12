package week4.task1;

import java.io.*;

public class Cam extends HoaQua{
  private String type;
  private float giaBan;

  public String getName(){return "Cam";}
  final public void setName(String id){super.setName("Cam");}

  public String getType(){return type;}
  public void setType(String id){type = id;}

  public Cam(String id, float a){
    super("Cam", a);
    this.type = id;
  }
  public float getGiaBan() {
    return giaBan;
  }

public void setGiaBan(float giaBan) {
    this.giaBan = giaBan;
  }

  public String toString(){
    return "Ten: " + super.getName() + "\nCan: " + super.getWeight() + "\nLoai: " + type;
  }
}
