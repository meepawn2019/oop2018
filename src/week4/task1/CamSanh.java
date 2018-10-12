package week4.task1;

import java.io.*;

public class CamSanh extends Cam{

  public CamSanh(double a,int b){
    super("Cam Sanh", a, b);
    super.setType("Sanh");
  }
  final public String getType(){return "Sanh";}
  public String toString(){
    return "Ten: " + super.getName() + "\nLoai: " + super.getType() + "\nGia ban: " + super.getGiaBan();
  }

  public static void main(String[] args){
    CamSanh a = new CamSanh(2.7, 30000);
    System.out.println(a.toString());
  }
}
