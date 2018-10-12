package week4.task1;

import java.io.*;

public class CamThanhPhong extends Cam{

  public CamThanhPhong(double a,int b){
    super("Cam Thanh Phong", a, b);
    super.setType("ThanhPhong");
  }
  final public String getType(){return "ThanhPhong";}
  public String toString(){
    return "Ten: " + super.getName() + "\nLoai: " + super.getType() + "\nGia ban: " + super.getGiaBan();
  }

  public static void main(String[] args){
    CamThanhPhong a = new CamThanhPhong(15, 15000);
    System.out.println(a.toString());
  }
}
